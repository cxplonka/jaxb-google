//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2015.09.16 um 09:40:42 AM CEST 
//


package com.google.georesponsev1.jaxb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse f�r anonymous complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}southwest"/>
 *         &lt;element ref="{}northeast"/>
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
    "southwest",
    "northeast"
})
@XmlRootElement(name = "viewport")
public class Viewport {

    @XmlElement(required = true)
    protected Southwest southwest;
    @XmlElement(required = true)
    protected Northeast northeast;

    /**
     * Ruft den Wert der southwest-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Southwest }
     *     
     */
    public Southwest getSouthwest() {
        return southwest;
    }

    /**
     * Legt den Wert der southwest-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Southwest }
     *     
     */
    public void setSouthwest(Southwest value) {
        this.southwest = value;
    }

    /**
     * Ruft den Wert der northeast-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Northeast }
     *     
     */
    public Northeast getNortheast() {
        return northeast;
    }

    /**
     * Legt den Wert der northeast-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Northeast }
     *     
     */
    public void setNortheast(Northeast value) {
        this.northeast = value;
    }

}
