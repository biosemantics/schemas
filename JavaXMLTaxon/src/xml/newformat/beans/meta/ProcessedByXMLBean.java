/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package xml.newformat.beans.meta;

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
public class ProcessedByXMLBean extends XMLWritable {
    private List<ProcessorXMLBean> processors;
    private List<CharaparserXMLBean> charaparsers;
    
    public ProcessedByXMLBean() {
        this.processors = new ArrayList<ProcessorXMLBean>();
        this.charaparsers = new ArrayList<CharaparserXMLBean>();
    }
    
    public void addProcessor(ProcessorXMLBean processor) {
        this.processors.add(processor);
    }
    
    public List<ProcessorXMLBean> getProcessors() {
        return this.processors;
    }
    
    public void addCharaparser(CharaparserXMLBean charaparser) {
        this.charaparsers.add(charaparser);
    }
    
    public List<CharaparserXMLBean> getCharaparsers() {
        return this.charaparsers;
    }

    @Override
    public void toXML(Document doc, Element parent) throws IOException {
        Element processedbyElem = doc.createElement("processed_by");
        parent.appendChild(processedbyElem);
        
        if(this.processors != null) {
            for(ProcessorXMLBean processor : this.processors) {
                processor.toXML(doc, processedbyElem);
            }
        }
        
        if(this.charaparsers != null) {
            for(CharaparserXMLBean charaparser : this.charaparsers) {
                charaparser.toXML(doc, processedbyElem);
            }
        }
    }
}
