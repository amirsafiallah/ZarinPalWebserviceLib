/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aramischart.zarinpalws;

import com.aramischart.zarinpalws.response.PaymentRequestResponse;
import com.aramischart.zarinpalws.response.RefreshAuthorityResponse;
import com.aramischart.zarinpalws.response.PaymentVerificationResponse;
import com.aramischart.zarinpalws.response.UnverifiedTransactionsResponse;
import com.aramischart.zarinpalws.request.PaymentVerification;
import com.aramischart.zarinpalws.request.RefreshAuthority;
import com.aramischart.zarinpalws.request.UnverifiedTransactions;
import com.aramischart.zarinpalws.request.PaymentRequest;
import com.aramischart.zarinpalws.request.Request;
import com.google.gson.Gson;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.http.HttpResponse;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

/**
 *
 * @author amirsafiallah
 */
public class Zarinpal {

    private String url = "https://www.zarinpal.com/pg/rest/WebGate/";

    private final String MerchantID;

    public Zarinpal(String MerchantID) {
        this.MerchantID = MerchantID;
    }

    private String execute(String method, String entity) throws UnsupportedEncodingException, IOException, ZarinException {
        RequestConfig config = RequestConfig.custom()
                .setSocketTimeout(30 * 1000)
                .setConnectTimeout(30 * 1000)
                .setConnectionRequestTimeout(30 * 1000)
                .build();

        try (CloseableHttpClient httpClient = HttpClients.custom().setDefaultRequestConfig(config).build()) {
            HttpPost postRequest = new HttpPost(url + method + ".json");
            postRequest.addHeader("Cache-Control", "no-cache");
            StringEntity input = new StringEntity(entity, Charset.forName("UTF-8"));
            input.setContentType("application/json");
            postRequest.setEntity(input);

            HttpResponse response = httpClient.execute(postRequest);

            if (response.getStatusLine().getStatusCode() != 200) {
                throw new ZarinException(response.getStatusLine().getReasonPhrase());
            }
            String result = EntityUtils.toString(response.getEntity(), "UTF-8");
            return result;
        }
    }

    private <T extends Response> T doRequest(Request request, Class<T> response) throws ZarinException {
        try {
            if (request.getMerchantID() == null) {
                request.setMerchantID(MerchantID);
            }
            Gson gson = new Gson();
            String json = gson.toJson(request, request.getClass());
            String execute = execute(request.getClass().getSimpleName(), json);
            return gson.fromJson(execute, response);
        } catch (ZarinException ex) {
            throw ex;
        } catch (IOException ex) {
            Logger.getLogger(Zarinpal.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    public PaymentRequestResponse PaymentRequest(PaymentRequest request) throws ZarinException {
        return doRequest(request, PaymentRequestResponse.class);
    }

    public PaymentVerificationResponse PaymentVerification(PaymentVerification request) throws ZarinException {
        return doRequest(request, PaymentVerificationResponse.class);
    }

    public UnverifiedTransactionsResponse UnverifiedTransactions(UnverifiedTransactions request) throws ZarinException {
        return doRequest(request, UnverifiedTransactionsResponse.class);
    }

    public RefreshAuthorityResponse RefreshAuthorityResponse(RefreshAuthority request) throws ZarinException {
        return doRequest(request, RefreshAuthorityResponse.class);
    }
}
