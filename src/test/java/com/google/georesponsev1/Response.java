/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.google.georesponsev1;

import com.google.georesponsev1.jaxb.AddressComponent;
import com.google.georesponsev1.jaxb.GeocodeResponse;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import org.junit.Test;

/**
 *
 * @author cplonka
 */
public class Response {

    @Test
    public void testResponse() throws JAXBException {
        JAXBContext jc = JAXBContext.newInstance("com.google.georesponsev1.jaxb");
        Unmarshaller unmarshaller = jc.createUnmarshaller();
        
        GeocodeResponse model = (GeocodeResponse) unmarshaller.unmarshal(
                Response.class.getResource("geocoderesponse.xml"));

        System.out.println(model.getStatus());
        for (AddressComponent adr : model.getResult().getAddressComponent()) {
            System.out.println(adr.getLongName());
        }
    }
}
