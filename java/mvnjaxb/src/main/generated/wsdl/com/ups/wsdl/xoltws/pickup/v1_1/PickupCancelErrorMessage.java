
package com.ups.wsdl.xoltws.pickup.v1_1;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.3.3
 * 2013-09-10T13:02:05.866+02:00
 * Generated source version: 2.3.3
 * 
 */

@WebFault(name = "Errors", targetNamespace = "http://www.ups.com/XMLSchema/XOLTWS/Error/v1.1")
public class PickupCancelErrorMessage extends Exception {
    public static final long serialVersionUID = 20130910130205L;
    
    private com.ups.xmlschema.xoltws.error.v1.Errors errors;

    public PickupCancelErrorMessage() {
        super();
    }
    
    public PickupCancelErrorMessage(String message) {
        super(message);
    }
    
    public PickupCancelErrorMessage(String message, Throwable cause) {
        super(message, cause);
    }

    public PickupCancelErrorMessage(String message, com.ups.xmlschema.xoltws.error.v1.Errors errors) {
        super(message);
        this.errors = errors;
    }

    public PickupCancelErrorMessage(String message, com.ups.xmlschema.xoltws.error.v1.Errors errors, Throwable cause) {
        super(message, cause);
        this.errors = errors;
    }

    public com.ups.xmlschema.xoltws.error.v1.Errors getFaultInfo() {
        return this.errors;
    }
}