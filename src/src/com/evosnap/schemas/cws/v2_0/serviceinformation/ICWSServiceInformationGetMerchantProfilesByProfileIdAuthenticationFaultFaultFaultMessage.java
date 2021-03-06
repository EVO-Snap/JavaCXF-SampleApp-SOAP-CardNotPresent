
package com.evosnap.schemas.cws.v2_0.serviceinformation;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.7.7
 * 2013-11-21T11:20:06.603-07:00
 * Generated source version: 2.7.7
 */

@WebFault(name = "AuthenticationFault", targetNamespace = "http://schemas.evosnap.com/Identity/1.0/")
public class ICWSServiceInformationGetMerchantProfilesByProfileIdAuthenticationFaultFaultFaultMessage extends Exception {
    
    private com.evosnap.schemas.identity._1.AuthenticationFault authenticationFault;

    public ICWSServiceInformationGetMerchantProfilesByProfileIdAuthenticationFaultFaultFaultMessage() {
        super();
    }
    
    public ICWSServiceInformationGetMerchantProfilesByProfileIdAuthenticationFaultFaultFaultMessage(String message) {
        super(message);
    }
    
    public ICWSServiceInformationGetMerchantProfilesByProfileIdAuthenticationFaultFaultFaultMessage(String message, Throwable cause) {
        super(message, cause);
    }

    public ICWSServiceInformationGetMerchantProfilesByProfileIdAuthenticationFaultFaultFaultMessage(String message, com.evosnap.schemas.identity._1.AuthenticationFault authenticationFault) {
        super(message);
        this.authenticationFault = authenticationFault;
    }

    public ICWSServiceInformationGetMerchantProfilesByProfileIdAuthenticationFaultFaultFaultMessage(String message, com.evosnap.schemas.identity._1.AuthenticationFault authenticationFault, Throwable cause) {
        super(message, cause);
        this.authenticationFault = authenticationFault;
    }

    public com.evosnap.schemas.identity._1.AuthenticationFault getFaultInfo() {
        return this.authenticationFault;
    }
}
