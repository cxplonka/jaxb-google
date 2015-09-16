//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// �nderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2015.09.16 um 09:40:42 AM CEST 
//


package com.google.georesponsev1.jaxb;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.google.georesponsev1 package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _FormattedAddress_QNAME = new QName("", "formatted_address");
    private final static QName _Lng_QNAME = new QName("", "lng");
    private final static QName _ShortName_QNAME = new QName("", "short_name");
    private final static QName _Type_QNAME = new QName("", "type");
    private final static QName _Lat_QNAME = new QName("", "lat");
    private final static QName _LongName_QNAME = new QName("", "long_name");
    private final static QName _LocationType_QNAME = new QName("", "location_type");
    private final static QName _Status_QNAME = new QName("", "status");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.google.georesponsev1
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Southwest }
     * 
     */
    public Southwest createSouthwest() {
        return new Southwest();
    }

    /**
     * Create an instance of {@link Northeast }
     * 
     */
    public Northeast createNortheast() {
        return new Northeast();
    }

    /**
     * Create an instance of {@link AddressComponent }
     * 
     */
    public AddressComponent createAddressComponent() {
        return new AddressComponent();
    }

    /**
     * Create an instance of {@link Result }
     * 
     */
    public Result createResult() {
        return new Result();
    }

    /**
     * Create an instance of {@link Geometry }
     * 
     */
    public Geometry createGeometry() {
        return new Geometry();
    }

    /**
     * Create an instance of {@link Location }
     * 
     */
    public Location createLocation() {
        return new Location();
    }

    /**
     * Create an instance of {@link Viewport }
     * 
     */
    public Viewport createViewport() {
        return new Viewport();
    }

    /**
     * Create an instance of {@link GeocodeResponse }
     * 
     */
    public GeocodeResponse createGeocodeResponse() {
        return new GeocodeResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "formatted_address")
    public JAXBElement<String> createFormattedAddress(String value) {
        return new JAXBElement<String>(_FormattedAddress_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "lng")
    public JAXBElement<BigDecimal> createLng(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_Lng_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "short_name")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createShortName(String value) {
        return new JAXBElement<String>(_ShortName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "type")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createType(String value) {
        return new JAXBElement<String>(_Type_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "lat")
    public JAXBElement<BigDecimal> createLat(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_Lat_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "long_name")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createLongName(String value) {
        return new JAXBElement<String>(_LongName_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "location_type")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createLocationType(String value) {
        return new JAXBElement<String>(_LocationType_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "", name = "status")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    public JAXBElement<String> createStatus(String value) {
        return new JAXBElement<String>(_Status_QNAME, String.class, null, value);
    }

}
