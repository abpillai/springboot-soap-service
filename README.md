# springboot-soap-service

SOAP service running on spring boot


# HOW TO BUILD SOAP SERVICE:

use java version 21

mvn clean install

mvn spring-boot:run


# REQUEST 

curl -X POST \
   -H "Content-Type: text/xml;charset=UTF-8" \
   -H "SOAPAction: \"\"" \
   --data @request.xml \
   http://localhost:9090/HelloSoapService
   
# request.xml contents are as follows:

<soapenv:Envelope xmlns:soapenv="http://schemas.xmlsoap.org/soap/envelope/"
                  xmlns:hel="http://www.flydubai.com/HelloSoap"><soapenv:Header/><soapenv:Body><hel:HelloSoap><ClientName>Test Client</ClientName></hel:HelloSoap></soapenv:Body>
</soapenv:Envelope>   
   
   
# RESPONSE

<SOAP-ENV:Envelope xmlns:SOAP-ENV="http://schemas.xmlsoap.org/soap/envelope/"><SOAP-ENV:Header/><SOAP-ENV:Body><ns2:HelloSoapResponse xmlns:ns2="http://www.flydubai.com/HelloSoap">
    <Response>Welcome Test Client</Response>
</ns2:HelloSoapResponse></SOAP-ENV:Body></SOAP-ENV:Envelope> 
