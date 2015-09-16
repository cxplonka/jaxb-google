/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.google.georesponsev1;

import com.google.georesponsev1.jaxb.GeocodeResponse;
import java.io.IOException;
import java.net.URL;
import java.net.URLEncoder;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

/**
 *
 * @author cplonka
 */
public class GeoCoder {

    private static final String SERVICE = "http://maps.googleapis.com/maps/api/geocode/xml?address=%s&sensor=false";
    private static GeoCoder instance;
    private Unmarshaller unmarshaller;

    public synchronized static GeoCoder instance() {
        if (instance == null) {
            instance = new GeoCoder();
        }
        return instance;
    }

    private GeoCoder() {
    }

    public GeocodeResponse resolve(String placeName) throws IOException {
        try {
            if (unmarshaller == null) {
                JAXBContext jc = JAXBContext.newInstance("com.google.georesponsev1.jaxb");
                unmarshaller = jc.createUnmarshaller();
            }
            /* */
            GeocodeResponse response = (GeocodeResponse) unmarshaller.unmarshal(
                    new URL(String.format(SERVICE, URLEncoder.encode(placeName, "UTF-8"))));

            switch (response.getStatus().toUpperCase()) {
                case "ZERO_RESULTS":
                    throw new IOException("No Results found.");
                case "OVER_QUERY_LIMIT":
                    throw new IOException("You are over the Query limit.");
                case "REQUEST_DENIED":
                    throw new IOException("Request denied.");
                case "INVALID_REQUEST":
                    throw new IOException("Invalid request.");
            }
            return response;
        } catch (JAXBException | IOException ex) {
            throw new IOException(ex);
        }
    }
}