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
public class PaymentRequest extends Request{

    private int Amount;
    private String CallbackURL;
    private String Description;
    private String Email;
    private String Mobile;

    public PaymentRequest(String MerchantID, int Amount, String CallbackURL, String Description, String Email, String Mobile) {
        super(MerchantID);
        this.Amount = Amount;
        this.CallbackURL = CallbackURL;
        this.Description = Description;
        this.Email = Email;
        this.Mobile = Mobile;
    }

    public PaymentRequest(int Amount, String CallbackURL, String Description, String Email, String Mobile) {
        super(null);
        this.Amount = Amount;
        this.CallbackURL = CallbackURL;
        this.Description = Description;
        this.Email = Email;
        this.Mobile = Mobile;
    }

    public int getAmount() {
        return Amount;
    }

    public void setAmount(int Amount) {
        this.Amount = Amount;
    }

    public String getCallbackURL() {
        return CallbackURL;
    }

    public void setCallbackURL(String CallbackURL) {
        this.CallbackURL = CallbackURL;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getMobile() {
        return Mobile;
    }

    public void setMobile(String Mobile) {
        this.Mobile = Mobile;
    }
    
}
