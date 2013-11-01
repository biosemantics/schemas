/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package xml.newformat.beans;

import xml.newformat.beans.meta.ProcessedByXMLBean;
import common.xml.XMLWritable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

/**
 *
 * @author iychoi
 */
public class MetaXMLBean extends XMLWritable {
    private String source;
    private ProcessedByXMLBean processed_by;
    private List<String> other_info_on_metas;

    public MetaXMLBean() {
        this.other_info_on_metas = new ArrayList<String>();
    }
    
    public void setSource(String source) {
        this.source = source;
    }
    
    public String getSource() {
        return this.source;
    }
    
    public void setProcessedBy(ProcessedByXMLBean processedBy) {
        this.processed_by = processedBy;
    }
    
    public ProcessedByXMLBean getProcessedBy() {
        return this.processed_by;
    }
    
    public void addOtherInfo(String otherInfo) {
        this.other_info_on_metas.add(otherInfo);
    }
    
    public List<String> getOtherInfos() {
        return this.other_info_on_metas;
    }
    
    @Override
    public void toXML(Document doc, Element parent) throws IOException {
        
        Element metaElem = doc.createElement("meta");
        parent.appendChild(metaElem);
        
        // check mandatory fields
        if(this.source == null) {
            throw new IOException("source is not declared");
        }
        
        if(this.source != null) {
            Element sourceElem = doc.createElement("source");
            metaElem.appendChild(sourceElem);
            sourceElem.setTextContent(this.source);
        }
        
        if(this.processed_by != null) {
            this.processed_by.toXML(doc, metaElem);
        }
        
        if(this.other_info_on_metas != null) {
            for(String other_info : this.other_info_on_metas) {
                Element otherInfoElem = doc.createElement("other_info_on_meta");
                metaElem.appendChild(otherInfoElem);
                otherInfoElem.setTextContent(other_info);
            }
        }
    }
    
}
