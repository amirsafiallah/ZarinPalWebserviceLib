/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aramischart.zarinpalws.response;

import com.aramischart.zarinpalws.Response;

/**
 *
 * @author amirsafiallah
 */
public class PaymentRequestResponse extends Response {

    private String Authority;

    public PaymentRequestResponse(int Status, String Authority) {
        super(Status);
        this.Authority = Authority;
    }

    public String getAuthority() {
        return Authority;
    }

    public String paymentUrl() {
        return "https://www.zarinpal.com/pg/StartPay/" + Authority;
    }
}
