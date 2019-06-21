/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.aramischart.zarinpalws;

/**
 *
 * @author amirsafiallah
 */
public class Response {
    protected int Status;

    public Response(int status) {
        this.Status = status;
    }

    public int getStatus() {
        return Status;
    }

    public void setStatus(int status) {
        this.Status = status;
    }
    
}
