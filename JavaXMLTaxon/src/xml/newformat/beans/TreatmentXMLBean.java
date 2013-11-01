/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package xml.newformat.beans;

import common.xml.XMLWritable;
import java.io.File;
import java.io.IOException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Document;
import org.w3c.dom.Element;


/**
 *
 * @author iychoi
 */
public class TreatmentXMLBean extends XMLWritable {
    public static final String XSINS = "http://www.w3.org/2001/XMLSchema-instance";
    public static final String SCHEMA_LOCATION = "https://raw.github.com/biosemantics/schemas/master/textTreatment.xsd";
    
    private MetaXMLBean meta;
    private TaxonIdentificationXMLBean taxon_identification;
    private String description;
    
    public TreatmentXMLBean() {
        
    }
    
    public void setMeta(MetaXMLBean meta) {
        this.meta = meta;
    }
    
    public MetaXMLBean getMeta() {
        return this.meta;
    }
    
    public void setTaxonIdentification(TaxonIdentificationXMLBean taxon_identification) {
        this.taxon_identification = taxon_identification;
    }
    
    public TaxonIdentificationXMLBean getTaxonIdentification() {
        return this.taxon_identification;
    }
    
    public void toXML(File file) throws Exception {
        DocumentBuilderFactory docFactory = DocumentBuilderFactory.newInstance();
        docFactory.setNamespaceAware(true);
        
        DocumentBuilder docBuilder = docFactory.newDocumentBuilder();
        Document doc = docBuilder.newDocument();

        toXML(doc);
        
        // write xml to file    
        TransformerFactory transformerFactory = TransformerFactory.newInstance();
        Transformer transformer = transformerFactory.newTransformer();
        transformer.setOutputProperty(OutputKeys.INDENT, "yes");
        transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount","4");
        DOMSource source = new DOMSource(doc);
        StreamResult result = new StreamResult(file);
        transformer.transform(source, result);
    }
    
    public void toXML(Document doc) throws IOException {
        toXML(doc, (Element) doc);
    }

    @Override
    public void toXML(Document doc, Element parent) throws IOException {
        Element treatmentElem = doc.createElement("treatment");
        treatmentElem.setAttributeNS(XSINS, "xsi:noNamespaceSchemaLocation", SCHEMA_LOCATION);
        parent.appendChild(treatmentElem);
        
        // check mandatory fields
        if(this.meta == null) {
            throw new IOException("meta is not declared");
        }
        if(this.taxon_identification == null) {
            throw new IOException("taxon_identification is not declared");
        }
        
        if(this.meta != null) {
            this.meta.toXML(doc, treatmentElem);
        }
        
        if(this.taxon_identification != null) {
            this.taxon_identification.toXML(doc, treatmentElem);
        }
        
        if(this.description != null) {
            Element descriptionElem = doc.createElement("description");
            treatmentElem.appendChild(descriptionElem);
            descriptionElem.setTextContent(this.description);
        }
    }
}
