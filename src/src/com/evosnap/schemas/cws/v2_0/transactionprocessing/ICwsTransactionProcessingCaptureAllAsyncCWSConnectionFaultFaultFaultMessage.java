
package com.evosnap.schemas.cws.v2_0.transactionprocessing;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.7.7
 * 2013-11-22T08:57:23.489-07:00
 * Generated source version: 2.7.7
 */

@WebFault(name = "CWSConnectionFault", targetNamespace = "http://schemas.evosnap.com/CWS/v2.0/Transactions/Faults")
public class ICwsTransactionProcessingCaptureAllAsyncCWSConnectionFaultFaultFaultMessage extends Exception {
    
    private com.evosnap.schemas.cws.v2_0.transactions.faults.CWSConnectionFault cwsConnectionFault;

    public ICwsTransactionProcessingCaptureAllAsyncCWSConnectionFaultFaultFaultMessage() {
        super();
    }
    
    public ICwsTransactionProcessingCaptureAllAsyncCWSConnectionFaultFaultFaultMessage(String message) {
        super(message);
    }
    
    public ICwsTransactionProcessingCaptureAllAsyncCWSConnectionFaultFaultFaultMessage(String message, Throwable cause) {
        super(message, cause);
    }

    public ICwsTransactionProcessingCaptureAllAsyncCWSConnectionFaultFaultFaultMessage(String message, com.evosnap.schemas.cws.v2_0.transactions.faults.CWSConnectionFault cwsConnectionFault) {
        super(message);
        this.cwsConnectionFault = cwsConnectionFault;
    }

    public ICwsTransactionProcessingCaptureAllAsyncCWSConnectionFaultFaultFaultMessage(String message, com.evosnap.schemas.cws.v2_0.transactions.faults.CWSConnectionFault cwsConnectionFault, Throwable cause) {
        super(message, cause);
        this.cwsConnectionFault = cwsConnectionFault;
    }

    public com.evosnap.schemas.cws.v2_0.transactions.faults.CWSConnectionFault getFaultInfo() {
        return this.cwsConnectionFault;
    }
}