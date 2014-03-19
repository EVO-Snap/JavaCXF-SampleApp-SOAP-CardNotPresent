
package com.evosnap.schemas.cws.v2_0.serviceinformation;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.7.7
 * 2013-11-21T11:20:06.482-07:00
 * Generated source version: 2.7.7
 */

@WebFault(name = "InvalidTokenFault", targetNamespace = "http://schemas.evosnap.com/Identity/1.0/")
public class ICWSServiceInformationDeleteMerchantProfileInvalidTokenFaultFaultFaultMessage extends Exception {
    
    private com.evosnap.schemas.identity._1.InvalidTokenFault invalidTokenFault;

    public ICWSServiceInformationDeleteMerchantProfileInvalidTokenFaultFaultFaultMessage() {
        super();
    }
    
    public ICWSServiceInformationDeleteMerchantProfileInvalidTokenFaultFaultFaultMessage(String message) {
        super(message);
    }
    
    public ICWSServiceInformationDeleteMerchantProfileInvalidTokenFaultFaultFaultMessage(String message, Throwable cause) {
        super(message, cause);
    }

    public ICWSServiceInformationDeleteMerchantProfileInvalidTokenFaultFaultFaultMessage(String message, com.evosnap.schemas.identity._1.InvalidTokenFault invalidTokenFault) {
        super(message);
        this.invalidTokenFault = invalidTokenFault;
    }

    public ICWSServiceInformationDeleteMerchantProfileInvalidTokenFaultFaultFaultMessage(String message, com.evosnap.schemas.identity._1.InvalidTokenFault invalidTokenFault, Throwable cause) {
        super(message, cause);
        this.invalidTokenFault = invalidTokenFault;
    }

    public com.evosnap.schemas.identity._1.InvalidTokenFault getFaultInfo() {
        return this.invalidTokenFault;
    }
}