package com.example.soap.routes;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.dataformat.JaxbDataFormat;
import org.springframework.stereotype.Component;
import com.example.soap.model.HelloSoapRequest;
import com.example.soap.model.HelloSoapResponse;

@Component
public class HelloSoapServiceRoute extends RouteBuilder {

	@Override
    public void configure() throws Exception {
        // ✅ Correctly initialize JAXB DataFormat
        JaxbDataFormat jaxb = new JaxbDataFormat();
        jaxb.setContextPath("com.example.soap.model");

        // ✅ Ensure the Camel route references the correct endpoint mapping
        from("spring-ws:rootqname:{http://www.flydubai.com/HelloSoap}HelloSoap?endpointMapping=#endpointMapping")
            .unmarshal(jaxb) // Convert XML to Java Object
            .process(exchange -> {
                HelloSoapRequest request = exchange.getIn().getBody(HelloSoapRequest.class);
                HelloSoapResponse response = new HelloSoapResponse();
                System.out.println(request.getClientName());
                response.setResponse("Welcome " + request.getClientName());
                System.out.println("hello ,....");
                System.out.println("rsp soap:"+response.getResponse());
                exchange.getMessage().setBody(response);
            })
            .marshal(jaxb); // Convert Java Object back to XML
    }
}
