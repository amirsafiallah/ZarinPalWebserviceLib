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
public class PaymentVerificationResponse extends Response {

    private String RefID;

    public PaymentVerificationResponse(int status, String RefID) {
        super(status);
        this.RefID = RefID;
    }

    public String getRefID() {
        return RefID;
    }

}
