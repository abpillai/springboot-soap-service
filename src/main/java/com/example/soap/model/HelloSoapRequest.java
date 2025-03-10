package com.example.soap.model;

import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "HelloSoap", namespace = "http://www.flydubai.com/HelloSoap")
public class HelloSoapRequest {
    private String clientName;

    @XmlElement(name = "ClientName")
    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }
}
