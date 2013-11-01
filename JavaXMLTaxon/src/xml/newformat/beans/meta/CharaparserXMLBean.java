/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package xml.newformat.beans.meta;

import common.xml.XMLWritable;
import java.io.IOException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

/**
 *
 * @author iychoi
 */
public class CharaparserXMLBean extends XMLWritable {

    private String charaparser_version;
    private String charaparser_user;
    private String glossary_name;
    private String glossary_version;
    
    public CharaparserXMLBean() {
        
    }
    
    public void setCharaparserVersion(String charaparser_version) {
        this.charaparser_version = charaparser_version;
    }
    
    public String getCharaparserVersion() {
        return this.charaparser_version;
    }
    
    public void setCharaparserUser(String charaparser_user) {
        this.charaparser_user = charaparser_user;
    }
    
    public String getCharaparserUser() {
        return this.charaparser_user;
    }
    
    public void setGlossaryName(String glossary_name) {
        this.glossary_name = glossary_name;
    }
    
    public String getGlossaryName() {
        return this.glossary_name;
    }
    
    public void setGlossaryVersion(String glossary_version) {
        this.glossary_version = glossary_version;
    }
    
    public String getGlossaryVersion() {
        return this.glossary_version;
    }
    
    @Override
    public void toXML(Document doc, Element parent) throws IOException {
        Element charaparserElem = doc.createElement("charaparser");
        parent.appendChild(charaparserElem);
        
        // check mandatory fields
        if(this.charaparser_version == null) {
            throw new IOException("charaparser_version is not declared");
        }
        if(this.glossary_name == null) {
            throw new IOException("glossary_name is not declared");
        }
        if(this.glossary_version == null) {
            throw new IOException("glossary_version is not declared");
        }
        
        if(this.charaparser_version != null) {
            Element charaparserVersionElem = doc.createElement("charaparser_version");
            charaparserElem.appendChild(charaparserVersionElem);
            charaparserVersionElem.setTextContent(this.charaparser_version);
        }
        
        if(this.charaparser_user != null) {
            Element charaparserUserElem = doc.createElement("charaparser_user");
            charaparserElem.appendChild(charaparserUserElem);
            charaparserUserElem.setTextContent(this.charaparser_user);
        }
        
        if(this.glossary_name != null) {
            Element glossaryNameElem = doc.createElement("glossary_name");
            charaparserElem.appendChild(glossaryNameElem);
            glossaryNameElem.setTextContent(this.glossary_name);
        }
        
        if(this.glossary_version != null) {
            Element glossaryVersionElem = doc.createElement("glossary_version");
            charaparserElem.appendChild(glossaryVersionElem);
            glossaryVersionElem.setTextContent(this.glossary_version);
        }
    }
    
}
