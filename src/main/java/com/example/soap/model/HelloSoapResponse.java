package com.example.soap.model;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "HelloSoapResponse", namespace = "http://www.flydubai.com/HelloSoap")
public class HelloSoapResponse {
    private String response;

    @XmlElement(name = "Response")
    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }
}