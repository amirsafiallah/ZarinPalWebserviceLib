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
public class PaymentVerification extends Request{

    private int Amount;
    private String Authority;

    public PaymentVerification(String MerchantID, int Amount, String Authority) {
        super(MerchantID);
        this.Amount = Amount;
        this.Authority = Authority;
    }

    public PaymentVerification(int Amount, String Authority) {
        super(null);
        this.Amount = Amount;
        this.Authority = Authority;
    }

    public int getAmount() {
        return Amount;
    }

    public void setAmount(int Amount) {
        this.Amount = Amount;
    }

    public String getAuthority() {
        return Authority;
    }

    public void setAuthority(String Authority) {
        this.Authority = Authority;
    }
    
}
