
package com.evosnap.schemas.cws.v2_0.transactionprocessing;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import com.evosnap.schemas.cws.v2_0.transactions.Response;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ReturnByIdResult" type="{http://schemas.evosnap.com/CWS/v2.0/Transactions}Response" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "returnByIdResult"
})
@XmlRootElement(name = "ReturnByIdResponse")
public class ReturnByIdResponse {

    @XmlElement(name = "ReturnByIdResult", nillable = true)
    protected Response returnByIdResult;

    /**
     * Gets the value of the returnByIdResult property.
     * 
     * @return
     *     possible object is
     *     {@link Response }
     *     
     */
    public Response getReturnByIdResult() {
        return returnByIdResult;
    }

    /**
     * Sets the value of the returnByIdResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link Response }
     *     
     */
    public void setReturnByIdResult(Response value) {
        this.returnByIdResult = value;
    }

}
