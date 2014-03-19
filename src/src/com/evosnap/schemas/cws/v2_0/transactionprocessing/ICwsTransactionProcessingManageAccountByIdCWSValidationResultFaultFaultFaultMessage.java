
package com.evosnap.schemas.cws.v2_0.transactionprocessing;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.7.7
 * 2013-11-22T08:57:22.680-07:00
 * Generated source version: 2.7.7
 */

@WebFault(name = "CWSValidationResultFault", targetNamespace = "http://schemas.evosnap.com/CWS/v2.0/Transactions/Faults")
public class ICwsTransactionProcessingManageAccountByIdCWSValidationResultFaultFaultFaultMessage extends Exception {
    
    private com.evosnap.schemas.cws.v2_0.transactions.faults.CWSValidationResultFault cwsValidationResultFault;

    public ICwsTransactionProcessingManageAccountByIdCWSValidationResultFaultFaultFaultMessage() {
        super();
    }
    
    public ICwsTransactionProcessingManageAccountByIdCWSValidationResultFaultFaultFaultMessage(String message) {
        super(message);
    }
    
    public ICwsTransactionProcessingManageAccountByIdCWSValidationResultFaultFaultFaultMessage(String message, Throwable cause) {
        super(message, cause);
    }

    public ICwsTransactionProcessingManageAccountByIdCWSValidationResultFaultFaultFaultMessage(String message, com.evosnap.schemas.cws.v2_0.transactions.faults.CWSValidationResultFault cwsValidationResultFault) {
        super(message);
        this.cwsValidationResultFault = cwsValidationResultFault;
    }

    public ICwsTransactionProcessingManageAccountByIdCWSValidationResultFaultFaultFaultMessage(String message, com.evosnap.schemas.cws.v2_0.transactions.faults.CWSValidationResultFault cwsValidationResultFault, Throwable cause) {
        super(message, cause);
        this.cwsValidationResultFault = cwsValidationResultFault;
    }

    public com.evosnap.schemas.cws.v2_0.transactions.faults.CWSValidationResultFault getFaultInfo() {
        return this.cwsValidationResultFault;
    }
}