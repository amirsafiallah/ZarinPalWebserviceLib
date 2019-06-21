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
public class RefreshAuthority extends Request{
    private String Authority;
    private int ExpireIn;

    public RefreshAuthority(String MerchantID,String Authority, int ExpireIn) {
        super(MerchantID);
        this.Authority = Authority;
        this.ExpireIn = ExpireIn;
    }

    public RefreshAuthority(String Authority, int ExpireIn) {
        super(null);
        this.Authority = Authority;
        this.ExpireIn = ExpireIn;
    }

    public String getAuthority() {
        return Authority;
    }

    public void setAuthority(String Authority) {
        this.Authority = Authority;
    }

    public int getExpireIn() {
        return ExpireIn;
    }

    public void setExpireIn(int ExpireIn) {
        this.ExpireIn = ExpireIn;
    }
    
}
