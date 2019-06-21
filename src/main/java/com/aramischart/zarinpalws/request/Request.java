/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aramischart.zarinpalws.request;

/**
 *
 * @author amirsafiallah
 */
public class Request {

    protected String MerchantID;

    public String getMerchantID() {
        return MerchantID;
    }

    public void setMerchantID(String MerchantID) {
        this.MerchantID = MerchantID;
    }

    public Request(String MerchantID) {
        this.MerchantID = MerchantID;
    }
    
    
}
