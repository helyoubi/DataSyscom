//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.10.03 at 09:17:53 AM CEST 
//


package fr.datasyscom.iom.submit;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for SubmitCards complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="SubmitCards">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SubmitCard" type="{http://www.datasyscom.fr/iom/submit}SubmitCard"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SubmitCards", propOrder = {
    "submitCard"
})
public class SubmitCards {

    @XmlElement(name = "SubmitCard", required = true)
    protected SubmitCard submitCard;

    /**
     * Gets the value of the submitCard property.
     * 
     * @return
     *     possible object is
     *     {@link SubmitCard }
     *     
     */
    public SubmitCard getSubmitCard() {
        return submitCard;
    }

    /**
     * Sets the value of the submitCard property.
     * 
     * @param value
     *     allowed object is
     *     {@link SubmitCard }
     *     
     */
    public void setSubmitCard(SubmitCard value) {
        this.submitCard = value;
    }

}
