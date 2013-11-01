/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package xml.newformat.beans.meta;

import common.xml.XMLWritable;
import java.io.IOException;
import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

/**
 *
 * @author iychoi
 */
public class ProcessorXMLBean extends XMLWritable {

    private String processor;
    private String process_type;
    
    public ProcessorXMLBean() {
        
    }
    
    public void setProcessor(String processor) {
        this.processor = processor;
    }
    
    public String getProcessor() {
        return this.processor;
    }
    
    public void setProcessType(String process_type) {
        this.process_type = process_type;
    }
    
    public String getProcessType() {
        return this.process_type;
    }
    
    @Override
    public void toXML(Document doc, Element parent) throws IOException {
        Element processorElem = doc.createElement("processor");
        parent.appendChild(processorElem);
        
        // check mandatory fields
        if(this.process_type == null) {
            throw new IOException("process_type is not declared");
        }
        
        if(this.processor == null) {
            throw new IOException("processor is not declared");
        }
        
        if(this.process_type != null) {
            Attr processTypeAttr = doc.createAttribute("process_type");
            processorElem.setAttributeNode(processTypeAttr);
            processTypeAttr.setValue(this.process_type);
        }
        
        if(this.processor != null) {
            processorElem.setTextContent(this.processor);
        }
    }
    
}
