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
public class UnverifiedTransactions extends Request{

    public UnverifiedTransactions(String MerchantID) {
        super(MerchantID);
    }

    public UnverifiedTransactions() {
        super(null);
    }
    
}
