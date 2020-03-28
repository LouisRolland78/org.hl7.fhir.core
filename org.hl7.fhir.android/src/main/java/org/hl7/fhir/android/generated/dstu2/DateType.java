/*
Copyright (c) 2011+, HL7, Inc
All rights reserved.

Redistribution and use in source and binary forms, with or without modification, 
are permitted provided that the following conditions are met:

 * Redistributions of source code must retain the above copyright notice, this 
   list of conditions and the following disclaimer.
 * Redistributions in binary form must reproduce the above copyright notice, 
   this list of conditions and the following disclaimer in the documentation 
   and/or other materials provided with the distribution.
 * Neither the name of HL7 nor the names of its contributors may be used to 
   endorse or promote products derived from this software without specific 
   prior written permission.

THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND 
ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED 
WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. 
IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, 
INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT 
NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR 
PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, 
WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) 
ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE 
POSSIBILITY OF SUCH DAMAGE.

*/
package org.hl7.fhir.android.generated.dstu2;

import java.util.Date;
import java.util.TimeZone;
import ca.uhn.fhir.model.api.TemporalPrecisionEnum;

/*-
 * #%L
 * org.hl7.fhir.dstu2
 * %%
 * Copyright (C) 2014 - 2019 Health Level 7
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */
/**
 * Primitive type "date" in FHIR: any day in a gregorian calendar
 */
/**
 * Represents a FHIR date datatype. Valid precisions values for this type are:
 * <ul>
 * <li>{@link ca.uhn.fhir.model.api.TemporalPrecisionEnum#YEAR}
 * <li>{@link ca.uhn.fhir.model.api.TemporalPrecisionEnum#MONTH}
 * <li>{@link ca.uhn.fhir.model.api.TemporalPrecisionEnum#DAY}
 * </ul>
 */
public class DateType extends BaseDateTimeType {

    private static final long serialVersionUID = 3L;

    /**
     * The default precision for this type
     */
    public static final TemporalPrecisionEnum DEFAULT_PRECISION = TemporalPrecisionEnum.DAY;

    /**
     * Constructor
     */
    public DateType() {
        super();
    }

    /**
     * Constructor which accepts a date value and uses the {@link #DEFAULT_PRECISION} for this type
     */
    public DateType(Date theDate) {
        super(theDate, DEFAULT_PRECISION);
    }

    /**
     * Constructor which accepts a date value and a precision value. Valid precisions values for this type are:
     * <ul>
     * <li>{@link ca.uhn.fhir.model.api.TemporalPrecisionEnum#YEAR}
     * <li>{@link ca.uhn.fhir.model.api.TemporalPrecisionEnum#MONTH}
     * <li>{@link ca.uhn.fhir.model.api.TemporalPrecisionEnum#DAY}
     * </ul>
     *
     * @throws ca.uhn.fhir.parser.DataFormatException
     *             If the specified precision is not allowed for this type
     */
    public DateType(Date theDate, TemporalPrecisionEnum thePrecision) {
        super(theDate, thePrecision);
    }

    /**
     * Constructor which accepts a date as a string in FHIR format
     *
     * @throws ca.uhn.fhir.parser.DataFormatException
     *             If the precision in the date string is not allowed for this type
     */
    public DateType(String theDate) {
        super(theDate);
    }

    boolean isPrecisionAllowed(TemporalPrecisionEnum thePrecision) {
        switch(thePrecision) {
            case YEAR:
            case MONTH:
            case DAY:
                return true;
            default:
                return false;
        }
    }

    /**
     * Returns the default precision for this datatype
     *
     * @see #DEFAULT_PRECISION
     */
    protected TemporalPrecisionEnum getDefaultPrecisionForDatatype() {
        return DEFAULT_PRECISION;
    }

    public DateType copy() {
        return new DateType(getValue());
    }

    public static InstantType today() {
        return new InstantType(new Date(), TemporalPrecisionEnum.DAY, TimeZone.getDefault());
    }

    /**
     * Creates a new instance by parsing an HL7 v3 format date time string
     */
    public static DateType parseV3(String theV3String) {
        DateType retVal = new DateType();
        retVal.setValueAsV3String(theV3String);
        return retVal;
    }

    public String fhirType() {
        return "date";
    }
}
