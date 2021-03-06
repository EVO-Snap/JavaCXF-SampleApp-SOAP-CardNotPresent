
package com.evosnap.schemas.cws.v2_0.serviceinformation;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.7.7
 * 2013-11-21T11:20:06.713-07:00
 * Generated source version: 2.7.7
 */

@WebFault(name = "UserNotFoundFault", targetNamespace = "http://schemas.evosnap.com/Identity/1.0/")
public class ICWSServiceInformationChangeUsernameForServiceKeyUserNotFoundFaultFaultFaultMessage extends Exception {
    
    private com.evosnap.schemas.identity._1.UserNotFoundFault userNotFoundFault;

    public ICWSServiceInformationChangeUsernameForServiceKeyUserNotFoundFaultFaultFaultMessage() {
        super();
    }
    
    public ICWSServiceInformationChangeUsernameForServiceKeyUserNotFoundFaultFaultFaultMessage(String message) {
        super(message);
    }
    
    public ICWSServiceInformationChangeUsernameForServiceKeyUserNotFoundFaultFaultFaultMessage(String message, Throwable cause) {
        super(message, cause);
    }

    public ICWSServiceInformationChangeUsernameForServiceKeyUserNotFoundFaultFaultFaultMessage(String message, com.evosnap.schemas.identity._1.UserNotFoundFault userNotFoundFault) {
        super(message);
        this.userNotFoundFault = userNotFoundFault;
    }

    public ICWSServiceInformationChangeUsernameForServiceKeyUserNotFoundFaultFaultFaultMessage(String message, com.evosnap.schemas.identity._1.UserNotFoundFault userNotFoundFault, Throwable cause) {
        super(message, cause);
        this.userNotFoundFault = userNotFoundFault;
    }

    public com.evosnap.schemas.identity._1.UserNotFoundFault getFaultInfo() {
        return this.userNotFoundFault;
    }
}
