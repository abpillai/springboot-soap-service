package com.example.soap.model;

import jakarta.xml.bind.annotation.XmlRegistry;

@XmlRegistry
public class ObjectFactory {
    public ObjectFactory() {}

    public HelloSoapRequest createHelloSoapRequest() {
        return new HelloSoapRequest();
    }

    public HelloSoapResponse createHelloSoapResponse() {
        return new HelloSoapResponse();
    }
}
