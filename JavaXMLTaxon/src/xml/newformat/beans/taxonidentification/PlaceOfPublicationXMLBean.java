/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package xml.newformat.beans.taxonidentification;

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
public class PlaceOfPublicationXMLBean extends XMLWritable {

    private String publication_title;
    private String place_in_publication;
    private List<String> other_info_on_pubs;
    
    public PlaceOfPublicationXMLBean() {
        this.other_info_on_pubs = new ArrayList<String>();
    }
    
    public void setPublicationTitle(String publication_title) {
        this.publication_title = publication_title;
    }
    
    public String getPublicationTitle() {
        return this.publication_title;
    }
    
    public void setPlaceInPublication(String place_in_publication) {
        this.place_in_publication = place_in_publication;
    }
    
    public String getPlaceInPublication() {
        return this.place_in_publication;
    }
    
    public void addOtherInfoOnPub(String other_info_on_pub) {
        this.other_info_on_pubs.add(other_info_on_pub);
    }
    
    public List<String> getOtherInfoOnPubs() {
        return this.other_info_on_pubs;
    }
    
    @Override
    public void toXML(Document doc, Element parent) throws IOException {
        
        Element placeOfPublicationElem = doc.createElement("place_of_publication");
        parent.appendChild(placeOfPublicationElem);
        
        if(this.publication_title != null) {
            Element publicationTitleElem = doc.createElement("publication_title");
            placeOfPublicationElem.appendChild(publicationTitleElem);
            publicationTitleElem.setTextContent(this.publication_title);
        }
        
        if(this.place_in_publication != null) {
            Element placeInPublicationElem = doc.createElement("place_in_publication");
            placeOfPublicationElem.appendChild(placeInPublicationElem);
            placeInPublicationElem.setTextContent(this.place_in_publication);
        }
        
        if(this.other_info_on_pubs != null) {
            for(String other_info_on_pub : this.other_info_on_pubs) {
                Element otherInfoOnPubElem = doc.createElement("other_info_on_pub");
                placeOfPublicationElem.appendChild(otherInfoOnPubElem);
                otherInfoOnPubElem.setTextContent(other_info_on_pub);
            }
        }
    }
    
}
