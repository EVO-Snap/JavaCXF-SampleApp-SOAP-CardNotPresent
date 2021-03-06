
package com.evosnap.schemas.cws.v2_0.serviceinformation;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfBankcardService complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfBankcardService">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BankcardService" type="{http://schemas.evosnap.com/CWS/v2.0/ServiceInformation}BankcardService" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfBankcardService", propOrder = {
    "bankcardService"
})
public class ArrayOfBankcardService {

    @XmlElement(name = "BankcardService", nillable = true)
    protected List<BankcardService> bankcardService;

    /**
     * Gets the value of the bankcardService property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bankcardService property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBankcardService().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BankcardService }
     * 
     * 
     */
    public List<BankcardService> getBankcardService() {
        if (bankcardService == null) {
            bankcardService = new ArrayList<BankcardService>();
        }
        return this.bankcardService;
    }

}
