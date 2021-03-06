
package com.evosnap.schemas.cws.v2_0.serviceinformation;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.7.7
 * 2013-11-21T11:20:06.755-07:00
 * Generated source version: 2.7.7
 */

@WebFault(name = "STSUnavailableFault", targetNamespace = "http://schemas.evosnap.com/Identity/1.0/")
public class ICWSServiceInformationChangePasswordForServiceKeySTSUnavailableFaultFaultFaultMessage extends Exception {
    
    private com.evosnap.schemas.identity._1.STSUnavailableFault stsUnavailableFault;

    public ICWSServiceInformationChangePasswordForServiceKeySTSUnavailableFaultFaultFaultMessage() {
        super();
    }
    
    public ICWSServiceInformationChangePasswordForServiceKeySTSUnavailableFaultFaultFaultMessage(String message) {
        super(message);
    }
    
    public ICWSServiceInformationChangePasswordForServiceKeySTSUnavailableFaultFaultFaultMessage(String message, Throwable cause) {
        super(message, cause);
    }

    public ICWSServiceInformationChangePasswordForServiceKeySTSUnavailableFaultFaultFaultMessage(String message, com.evosnap.schemas.identity._1.STSUnavailableFault stsUnavailableFault) {
        super(message);
        this.stsUnavailableFault = stsUnavailableFault;
    }

    public ICWSServiceInformationChangePasswordForServiceKeySTSUnavailableFaultFaultFaultMessage(String message, com.evosnap.schemas.identity._1.STSUnavailableFault stsUnavailableFault, Throwable cause) {
        super(message, cause);
        this.stsUnavailableFault = stsUnavailableFault;
    }

    public com.evosnap.schemas.identity._1.STSUnavailableFault getFaultInfo() {
        return this.stsUnavailableFault;
    }
}
