package org.hl7.fhir.android.generated.dstu2.AddressEnum;

import org.hl7.fhir.exceptions.FHIRException;

public enum AddressType {

    /**
     * Mailing addresses - PO Boxes and care-of addresses.
     */
    POSTAL,
    /**
     * A physical address that can be visited.
     */
    PHYSICAL,
    /**
     * An address that is both physical and postal.
     */
    BOTH,
    /**
     * added to help the parsers
     */
    NULL;

    public static AddressType fromCode(String codeString) throws FHIRException {
        if (codeString == null || "".equals(codeString))
            return null;
        if ("postal".equals(codeString))
            return POSTAL;
        if ("physical".equals(codeString))
            return PHYSICAL;
        if ("both".equals(codeString))
            return BOTH;
        throw new FHIRException("Unknown AddressType code '" + codeString + "'");
    }

    public String toCode() {
        switch(this) {
            case POSTAL:
                return "postal";
            case PHYSICAL:
                return "physical";
            case BOTH:
                return "both";
            default:
                return "?";
        }
    }

    public String getSystem() {
        switch(this) {
            case POSTAL:
                return "http://hl7.org/fhir/address-type";
            case PHYSICAL:
                return "http://hl7.org/fhir/address-type";
            case BOTH:
                return "http://hl7.org/fhir/address-type";
            default:
                return "?";
        }
    }

    public String getDefinition() {
        switch(this) {
            case POSTAL:
                return "Mailing addresses - PO Boxes and care-of addresses.";
            case PHYSICAL:
                return "A physical address that can be visited.";
            case BOTH:
                return "An address that is both physical and postal.";
            default:
                return "?";
        }
    }

    public String getDisplay() {
        switch(this) {
            case POSTAL:
                return "Postal";
            case PHYSICAL:
                return "Physical";
            case BOTH:
                return "Postal & Physical";
            default:
                return "?";
        }
    }
}
