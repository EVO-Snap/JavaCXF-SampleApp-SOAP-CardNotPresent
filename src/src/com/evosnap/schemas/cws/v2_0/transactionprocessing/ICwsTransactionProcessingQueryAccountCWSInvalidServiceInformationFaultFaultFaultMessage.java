
package com.evosnap.schemas.cws.v2_0.transactionprocessing;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.7.7
 * 2013-11-22T08:57:23.324-07:00
 * Generated source version: 2.7.7
 */

@WebFault(name = "CWSInvalidServiceInformationFault", targetNamespace = "http://schemas.evosnap.com/CWS/v2.0/Transactions/Faults")
public class ICwsTransactionProcessingQueryAccountCWSInvalidServiceInformationFaultFaultFaultMessage extends Exception {
    
    private com.evosnap.schemas.cws.v2_0.transactions.faults.CWSInvalidServiceInformationFault cwsInvalidServiceInformationFault;

    public ICwsTransactionProcessingQueryAccountCWSInvalidServiceInformationFaultFaultFaultMessage() {
        super();
    }
    
    public ICwsTransactionProcessingQueryAccountCWSInvalidServiceInformationFaultFaultFaultMessage(String message) {
        super(message);
    }
    
    public ICwsTransactionProcessingQueryAccountCWSInvalidServiceInformationFaultFaultFaultMessage(String message, Throwable cause) {
        super(message, cause);
    }

    public ICwsTransactionProcessingQueryAccountCWSInvalidServiceInformationFaultFaultFaultMessage(String message, com.evosnap.schemas.cws.v2_0.transactions.faults.CWSInvalidServiceInformationFault cwsInvalidServiceInformationFault) {
        super(message);
        this.cwsInvalidServiceInformationFault = cwsInvalidServiceInformationFault;
    }

    public ICwsTransactionProcessingQueryAccountCWSInvalidServiceInformationFaultFaultFaultMessage(String message, com.evosnap.schemas.cws.v2_0.transactions.faults.CWSInvalidServiceInformationFault cwsInvalidServiceInformationFault, Throwable cause) {
        super(message, cause);
        this.cwsInvalidServiceInformationFault = cwsInvalidServiceInformationFault;
    }

    public com.evosnap.schemas.cws.v2_0.transactions.faults.CWSInvalidServiceInformationFault getFaultInfo() {
        return this.cwsInvalidServiceInformationFault;
    }
}
