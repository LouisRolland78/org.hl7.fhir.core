package org.hl7.fhir.android.generated.dstu2;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.hl7.fhir.instance.model.api.IBaseBackboneElement;
import org.hl7.fhir.exceptions.FHIRException;
import org.hl7.fhir.utilities.Utilities;

public class LegalLanguageComponent extends BackboneElement implements IBaseBackboneElement {

    /**
     * Contract legal text in human renderable form.
     */
    protected Type content;

    private static final long serialVersionUID = -1763459053L;

    /*
     * Constructor
     */
    public LegalLanguageComponent() {
        super();
    }

    /*
     * Constructor
     */
    public LegalLanguageComponent(Type content) {
        super();
        this.content = content;
    }

    /**
     * @return {@link #content} (Contract legal text in human renderable form.)
     */
    public Type getContent() {
        return this.content;
    }

    /**
     * @return {@link #content} (Contract legal text in human renderable form.)
     */
    public Attachment getContentAttachment() throws FHIRException {
        if (!(this.content instanceof Attachment))
            throw new FHIRException("Type mismatch: the type Attachment was expected, but " + this.content.getClass().getName() + " was encountered");
        return (Attachment) this.content;
    }

    public boolean hasContentAttachment() {
        return this.content instanceof Attachment;
    }

    /**
     * @return {@link #content} (Contract legal text in human renderable form.)
     */
    public Reference getContentReference() throws FHIRException {
        if (!(this.content instanceof Reference))
            throw new FHIRException("Type mismatch: the type Reference was expected, but " + this.content.getClass().getName() + " was encountered");
        return (Reference) this.content;
    }

    public boolean hasContentReference() {
        return this.content instanceof Reference;
    }

    public boolean hasContent() {
        return this.content != null && !this.content.isEmpty();
    }

    /**
     * @param value {@link #content} (Contract legal text in human renderable form.)
     */
    public LegalLanguageComponent setContent(Type value) {
        this.content = value;
        return this;
    }

    protected void listChildren(List<Property> childrenList) {
        super.listChildren(childrenList);
        childrenList.add(new Property("content[x]", "Attachment|Reference(Composition|DocumentReference|QuestionnaireResponse)", "Contract legal text in human renderable form.", 0, java.lang.Integer.MAX_VALUE, content));
    }

    public void setProperty(String name, Base value) throws FHIRException {
        if (name.equals("content[x]"))
            // Type
            this.content = (Type) value;
        else
            super.setProperty(name, value);
    }

    public Base addChild(String name) throws FHIRException {
        if (name.equals("contentAttachment")) {
            this.content = new Attachment();
            return this.content;
        } else if (name.equals("contentReference")) {
            this.content = new Reference();
            return this.content;
        } else
            return super.addChild(name);
    }

    public LegalLanguageComponent copy() {
        LegalLanguageComponent dst = new LegalLanguageComponent();
        copyValues(dst);
        dst.content = content == null ? null : content.copy();
        return dst;
    }

    public boolean equalsDeep(Base other) {
        if (!super.equalsDeep(other))
            return false;
        if (!(other instanceof LegalLanguageComponent))
            return false;
        LegalLanguageComponent o = (LegalLanguageComponent) other;
        return compareDeep(content, o.content, true);
    }

    public boolean equalsShallow(Base other) {
        if (!super.equalsShallow(other))
            return false;
        if (!(other instanceof LegalLanguageComponent))
            return false;
        LegalLanguageComponent o = (LegalLanguageComponent) other;
        return true;
    }

    public boolean isEmpty() {
        return super.isEmpty() && (content == null || content.isEmpty());
    }

    public String fhirType() {
        return "Contract.legal";
    }
}
