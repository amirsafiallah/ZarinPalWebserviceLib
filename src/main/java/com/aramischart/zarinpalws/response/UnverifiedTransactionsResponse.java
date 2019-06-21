/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aramischart.zarinpalws.response;

import com.aramischart.zarinpalws.Response;
import com.aramischart.zarinpalws.UnverifiedAuthority;

/**
 *
 * @author amirsafiallah
 */
public class UnverifiedTransactionsResponse extends Response {

    private UnverifiedAuthority[] Authorities;

    public UnverifiedTransactionsResponse(int status, UnverifiedAuthority[] Authorities) {
        super(status);
        this.Authorities = Authorities;
    }

    public UnverifiedAuthority[] getAuthorities() {
        return Authorities;
    }
}
