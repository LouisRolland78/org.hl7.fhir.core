package org.hl7.fhir.convertors.conv40_50.resources40_50;

import org.hl7.fhir.convertors.VersionConvertor_40_50_Context;
import org.hl7.fhir.convertors.conv40_50.datatypes40_50.general40_50.CodeableConcept40_50;
import org.hl7.fhir.convertors.conv40_50.datatypes40_50.general40_50.Identifier40_50;
import org.hl7.fhir.convertors.conv40_50.datatypes40_50.primitive40_50.DateTime40_50;
import org.hl7.fhir.convertors.conv40_50.datatypes40_50.primitive40_50.String40_50;
import org.hl7.fhir.convertors.conv40_50.datatypes40_50.primitive40_50.Uri40_50;
import org.hl7.fhir.convertors.conv40_50.datatypes40_50.special40_50.Reference40_50;
import org.hl7.fhir.exceptions.FHIRException;

/*
  Copyright (c) 2011+, HL7, Inc.
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
// Generated on Sun, Feb 24, 2019 11:37+1100 for FHIR v4.0.0
public class DocumentManifest40_50 {

  public static org.hl7.fhir.r5.model.DocumentManifest convertDocumentManifest(org.hl7.fhir.r4.model.DocumentManifest src) throws FHIRException {
    if (src == null)
      return null;
    org.hl7.fhir.r5.model.DocumentManifest tgt = new org.hl7.fhir.r5.model.DocumentManifest();
    VersionConvertor_40_50_Context.INSTANCE.getVersionConvertor_40_50_a().copyDomainResource(src, tgt);
    if (src.hasMasterIdentifier())
      tgt.setMasterIdentifier(Identifier40_50.convertIdentifier(src.getMasterIdentifier()));
    for (org.hl7.fhir.r4.model.Identifier t : src.getIdentifier())
      tgt.addIdentifier(Identifier40_50.convertIdentifier(t));
    if (src.hasStatus())
      tgt.setStatusElement(Enumerations40_50.convertDocumentReferenceStatus(src.getStatusElement()));
    if (src.hasType())
      tgt.setType(CodeableConcept40_50.convertCodeableConcept(src.getType()));
    if (src.hasSubject())
      tgt.setSubject(Reference40_50.convertReference(src.getSubject()));
    if (src.hasCreated())
      tgt.setCreatedElement(DateTime40_50.convertDateTime(src.getCreatedElement()));
    for (org.hl7.fhir.r4.model.Reference t : src.getAuthor()) tgt.addAuthor(Reference40_50.convertReference(t));
    for (org.hl7.fhir.r4.model.Reference t : src.getRecipient()) tgt.addRecipient(Reference40_50.convertReference(t));
    if (src.hasSource())
      tgt.setSourceElement(Uri40_50.convertUri(src.getSourceElement()));
    if (src.hasDescription())
      tgt.setDescriptionElement(String40_50.convertString(src.getDescriptionElement()));
    for (org.hl7.fhir.r4.model.Reference t : src.getContent()) tgt.addContent(Reference40_50.convertReference(t));
    for (org.hl7.fhir.r4.model.DocumentManifest.DocumentManifestRelatedComponent t : src.getRelated())
      tgt.addRelated(convertDocumentManifestRelatedComponent(t));
    return tgt;
  }

  public static org.hl7.fhir.r4.model.DocumentManifest convertDocumentManifest(org.hl7.fhir.r5.model.DocumentManifest src) throws FHIRException {
    if (src == null)
      return null;
    org.hl7.fhir.r4.model.DocumentManifest tgt = new org.hl7.fhir.r4.model.DocumentManifest();
    VersionConvertor_40_50_Context.INSTANCE.getVersionConvertor_40_50_a().copyDomainResource(src, tgt);
    if (src.hasMasterIdentifier())
      tgt.setMasterIdentifier(Identifier40_50.convertIdentifier(src.getMasterIdentifier()));
    for (org.hl7.fhir.r5.model.Identifier t : src.getIdentifier())
      tgt.addIdentifier(Identifier40_50.convertIdentifier(t));
    if (src.hasStatus())
      tgt.setStatusElement(Enumerations40_50.convertDocumentReferenceStatus(src.getStatusElement()));
    if (src.hasType())
      tgt.setType(CodeableConcept40_50.convertCodeableConcept(src.getType()));
    if (src.hasSubject())
      tgt.setSubject(Reference40_50.convertReference(src.getSubject()));
    if (src.hasCreated())
      tgt.setCreatedElement(DateTime40_50.convertDateTime(src.getCreatedElement()));
    for (org.hl7.fhir.r5.model.Reference t : src.getAuthor()) tgt.addAuthor(Reference40_50.convertReference(t));
    for (org.hl7.fhir.r5.model.Reference t : src.getRecipient()) tgt.addRecipient(Reference40_50.convertReference(t));
    if (src.hasSource())
      tgt.setSourceElement(Uri40_50.convertUri(src.getSourceElement()));
    if (src.hasDescription())
      tgt.setDescriptionElement(String40_50.convertString(src.getDescriptionElement()));
    for (org.hl7.fhir.r5.model.Reference t : src.getContent()) tgt.addContent(Reference40_50.convertReference(t));
    for (org.hl7.fhir.r5.model.DocumentManifest.DocumentManifestRelatedComponent t : src.getRelated())
      tgt.addRelated(convertDocumentManifestRelatedComponent(t));
    return tgt;
  }

  public static org.hl7.fhir.r5.model.DocumentManifest.DocumentManifestRelatedComponent convertDocumentManifestRelatedComponent(org.hl7.fhir.r4.model.DocumentManifest.DocumentManifestRelatedComponent src) throws FHIRException {
    if (src == null)
      return null;
    org.hl7.fhir.r5.model.DocumentManifest.DocumentManifestRelatedComponent tgt = new org.hl7.fhir.r5.model.DocumentManifest.DocumentManifestRelatedComponent();
    VersionConvertor_40_50_Context.INSTANCE.getVersionConvertor_40_50_a().copyElement(src, tgt);
    if (src.hasIdentifier())
      tgt.setIdentifier(Identifier40_50.convertIdentifier(src.getIdentifier()));
    if (src.hasRef())
      tgt.setRef(Reference40_50.convertReference(src.getRef()));
    return tgt;
  }

  public static org.hl7.fhir.r4.model.DocumentManifest.DocumentManifestRelatedComponent convertDocumentManifestRelatedComponent(org.hl7.fhir.r5.model.DocumentManifest.DocumentManifestRelatedComponent src) throws FHIRException {
    if (src == null)
      return null;
    org.hl7.fhir.r4.model.DocumentManifest.DocumentManifestRelatedComponent tgt = new org.hl7.fhir.r4.model.DocumentManifest.DocumentManifestRelatedComponent();
    VersionConvertor_40_50_Context.INSTANCE.getVersionConvertor_40_50_a().copyElement(src, tgt);
    if (src.hasIdentifier())
      tgt.setIdentifier(Identifier40_50.convertIdentifier(src.getIdentifier()));
    if (src.hasRef())
      tgt.setRef(Reference40_50.convertReference(src.getRef()));
    return tgt;
  }
}