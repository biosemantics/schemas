/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package xml.newformat.beans;

import common.xml.XMLWritable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import xml.newformat.beans.taxonidentification.PlaceOfPublicationXMLBean;

/**
 *
 * @author iychoi
 */
public class TaxonIdentificationXMLBean extends XMLWritable {

    private List<String> family_names;
    private List<String> family_authorities;
    private List<String> subfamily_names;
    private List<String> subfamily_authorities;
    private List<String> tribe_names;
    private List<String> tribe_authorities;
    private List<String> subtribe_names;
    private List<String> subtribe_authorities;
    private List<String> genus_names;
    private List<String> genus_authorities;
    private List<String> subgenus_names;
    private List<String> subgenus_authorities;
    private List<String> section_names;
    private List<String> section_authorities;
    private List<String> subsection_names;
    private List<String> subsection_authorities;
    private List<String> series_names;
    private List<String> series_authorities;
    private List<String> species_names;
    private List<String> species_authorities;
    private List<String> subspecies_names;
    private List<String> subspecies_authorities;
    private List<String> variety_names;
    private List<String> variety_authorities;
    private List<String> unranked_epithet_names;
    private List<String> unranked_epithet_authorities;
    private List<String> other_info_on_names;
    private List<PlaceOfPublicationXMLBean> place_of_publications;
    
    private String status;
    
    public TaxonIdentificationXMLBean() {
        this.family_names = new ArrayList<String>();
        this.family_authorities = new ArrayList<String>();
        this.subfamily_names = new ArrayList<String>();
        this.subfamily_authorities = new ArrayList<String>();
        this.tribe_names = new ArrayList<String>();
        this.tribe_authorities = new ArrayList<String>();
        this.subtribe_names = new ArrayList<String>();
        this.subtribe_authorities = new ArrayList<String>();
        this.genus_names = new ArrayList<String>();
        this.genus_authorities = new ArrayList<String>();
        this.subgenus_names = new ArrayList<String>();
        this.subgenus_authorities = new ArrayList<String>();
        this.section_names = new ArrayList<String>();
        this.section_authorities = new ArrayList<String>();
        this.subsection_names = new ArrayList<String>();
        this.subsection_authorities = new ArrayList<String>();
        this.series_names = new ArrayList<String>();
        this.series_authorities = new ArrayList<String>();
        this.species_names = new ArrayList<String>();
        this.species_authorities = new ArrayList<String>();
        this.subspecies_names = new ArrayList<String>();
        this.subspecies_authorities = new ArrayList<String>();
        this.variety_names = new ArrayList<String>();
        this.variety_authorities = new ArrayList<String>();
        this.unranked_epithet_names = new ArrayList<String>();
        this.unranked_epithet_authorities = new ArrayList<String>();
        this.other_info_on_names = new ArrayList<String>();
        this.place_of_publications = new ArrayList<PlaceOfPublicationXMLBean>();
    }
    
    public void addFamilyName(String family_name) {
        this.family_names.add(family_name);
    }
    
    public List<String> getFamilyNames() {
        return this.family_names;
    }
    
    public void addFamilyAuthority(String family_authority) {
        this.family_authorities.add(family_authority);
    }
    
    public List<String> getFamilyAuthorities() {
        return this.family_authorities;
    }
    
    public void addSubfamilyName(String subfamily_name) {
        this.subfamily_names.add(subfamily_name);
    }
    
    public List<String> getSubfamilyNames() {
        return this.subfamily_names;
    }
    
    public void addSubfamilyAuthority(String subfamily_authority) {
        this.subfamily_authorities.add(subfamily_authority);
    }
    
    public List<String> getSubfamilyAuthorities() {
        return this.subfamily_authorities;
    }
    
    public void addTribeName(String tribe_name) {
        this.tribe_names.add(tribe_name);
    }
    
    public List<String> getTribeNames() {
        return this.tribe_names;
    }
    
    public void addTribeAuthority(String tribe_authority) {
        this.tribe_authorities.add(tribe_authority);
    }
    
    public List<String> getTribeAuthorities() {
        return this.tribe_authorities;
    }
    
    public void addSubtribeName(String subtribe_name) {
        this.subtribe_names.add(subtribe_name);
    }
    
    public List<String> getSubtribeNames() {
        return this.subtribe_names;
    }
            
    public void addSubtribeAuthority(String subtribe_authority) {
        this.subtribe_authorities.add(subtribe_authority);
    }
    
    public List<String> getSubtribeAuthorities() {
        return this.subtribe_authorities;
    }
    
    public void addGenusName(String genus_name) {
        this.genus_names.add(genus_name);
    }
    
    public List<String> getGenusNames() {
        return this.genus_names;
    }
    
    public void addGenusAuthority(String genus_authority) {
        this.genus_authorities.add(genus_authority);
    }
    
    public List<String> getGenusAuthorities() {
        return this.genus_authorities;
    }
    
    public void addSubgenusName(String subgenus_name) {
        this.subgenus_names.add(subgenus_name);
    }
    
    public List<String> getSubgenusNames() {
        return this.subgenus_names;
    }
    
    public void addSubgenusAuthority(String subgenus_authority) {
        this.subgenus_authorities.add(subgenus_authority);
    }
    
    public List<String> getSubgenusAuthorities() {
        return this.subgenus_authorities;
    }
    
    public void addSectionName(String section_name) {
        this.section_names.add(section_name);
    }
    
    public List<String> getSectionNames() {
        return this.section_names;
    }
    
    public void addSectionAuthority(String section_authority) {
        this.section_authorities.add(section_authority);
    }
    
    public List<String> getSectionAuthorities() {
        return this.section_authorities;
    }
    
    public void addSubsectionName(String subsection_name) {
        this.subsection_names.add(subsection_name);
    }
    
    public List<String> getSubsectionNames() {
        return this.subsection_names;
    }
    
    public void addSubsectionAuthority(String subsection_authority) {
        this.subsection_authorities.add(subsection_authority);
    }
    
    public List<String> getSubsectionAuthorities() {
        return this.subsection_authorities;
    }
    
    public void addSeriesName(String series_name) {
        this.series_names.add(series_name);
    }
    
    public List<String> getSeriesNames() {
        return this.series_names;
    }
    
    public void addSeriesAuthority(String series_authority) {
        this.series_authorities.add(series_authority);
    }
    
    public List<String> getSeriesAuthorities() {
        return this.series_authorities;
    }
    
    public void addSpeciesName(String species_name) {
        this.species_names.add(species_name);
    }
    
    public List<String> getSpeciesNames() {
        return this.species_names;
    }
    
    public void addSpeciesAuthority(String species_authority) {
        this.species_authorities.add(species_authority);
    }
    
    public List<String> getSpeciesAuthorities() {
        return this.species_authorities;
    }
    
    public void addSubspeciesName(String subspecies_name) {
        this.subspecies_names.add(subspecies_name);
    }
    
    public List<String> getSubspeciesNames() {
        return this.subspecies_names;
    }
    
    public void addSubspeciesAuthority(String subspecies_authority) {
        this.subspecies_authorities.add(subspecies_authority);
    }
    
    public List<String> getSubspeciesAuthorities() {
        return this.subspecies_authorities;
    }
    
    public void addVarietyName(String variety_name) {
        this.variety_names.add(variety_name);
    }
    
    public List<String> getVarietyNames() {
        return this.variety_names;
    }
    
    public void addVarietyAuthority(String variety_authority) {
        this.variety_authorities.add(variety_authority);
    }
    
    public List<String> getVarietyAuthorities() {
        return this.variety_authorities;
    }
    
    public void addUnrankedEpithetName(String unranked_epithet_name) {
        this.unranked_epithet_names.add(unranked_epithet_name);
    }
    
    public List<String> getUnrankedEpithetNames() {
        return this.unranked_epithet_names;
    }
    
    public void addUnrankedEpithetAuthority(String unranked_epithet_authority) {
        this.unranked_epithet_authorities.add(unranked_epithet_authority);
    }
    
    public List<String> getUnrankedEpithetAuthorities() {
        return this.unranked_epithet_authorities;
    }
    
    public void addOtherInfoOnName(String other_info_on_name) {
        this.other_info_on_names.add(other_info_on_name);
    }
    
    public List<String> getOtherInfoOnNames() {
        return this.other_info_on_names;
    }
    
    public void addPlaceOfPublication(PlaceOfPublicationXMLBean place_of_publication) {
        this.place_of_publications.add(place_of_publication);
    }
    
    public List<PlaceOfPublicationXMLBean> getPlaceOfPublications() {
        return this.place_of_publications;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }
    
    public String getStatus() {
        return this.status;
    }
    
    @Override
    public void toXML(Document doc, Element parent) throws IOException {
        
        Element taxonIdentificationElem = doc.createElement("taxon_identification");
        parent.appendChild(taxonIdentificationElem);
                
        if(this.status == null) {
            throw new IOException("status is not declared");
        }
        
        if(this.status != null) {
            Attr statusAttr = doc.createAttribute("status");
            taxonIdentificationElem.setAttributeNode(statusAttr);
            statusAttr.setValue(this.status);
        }
        
        if(this.family_names != null) {
            for(String family_name : this.family_names) {
                Element familyNameElem = doc.createElement("family_name");
                taxonIdentificationElem.appendChild(familyNameElem);
                familyNameElem.setTextContent(family_name);
            }
        }
        
        if(this.family_authorities != null) {
            for(String family_authority : this.family_authorities) {
                Element familyAuthorityElem = doc.createElement("family_authority");
                taxonIdentificationElem.appendChild(familyAuthorityElem);
                familyAuthorityElem.setTextContent(family_authority);
            }
        }
        
        if(this.subfamily_names != null) {
            for(String subfamily_name : this.subfamily_names) {
                Element subfamilyNameElem = doc.createElement("subfamily_name");
                taxonIdentificationElem.appendChild(subfamilyNameElem);
                subfamilyNameElem.setTextContent(subfamily_name);
            }
        }
        
        if(this.subfamily_authorities != null) {
            for(String subfamily_authority : this.subfamily_authorities) {
                Element subfamilyAuthorityElem = doc.createElement("subfamily_authority");
                taxonIdentificationElem.appendChild(subfamilyAuthorityElem);
                subfamilyAuthorityElem.setTextContent(subfamily_authority);
            }
        }
        
        if(this.tribe_names != null) {
            for(String tribe_name : this.tribe_names) {
                Element tribeNameElem = doc.createElement("tribe_name");
                taxonIdentificationElem.appendChild(tribeNameElem);
                tribeNameElem.setTextContent(tribe_name);
            }
        }
        
        if(this.tribe_authorities != null) {
            for(String tribe_authority : this.tribe_authorities) {
                Element tribeAuthorityElem = doc.createElement("tribe_authority");
                taxonIdentificationElem.appendChild(tribeAuthorityElem);
                tribeAuthorityElem.setTextContent(tribe_authority);
            }
        }
        
        if(this.subtribe_names != null) {
            for(String subtribe_name : this.subtribe_names) {
                Element subtribeNameElem = doc.createElement("subtribe_name");
                taxonIdentificationElem.appendChild(subtribeNameElem);
                subtribeNameElem.setTextContent(subtribe_name);
            }
        }
        
        if(this.subtribe_authorities != null) {
            for(String subtribe_authority : this.subtribe_authorities) {
                Element subtribeAuthorityElem = doc.createElement("subtribe_authority");
                taxonIdentificationElem.appendChild(subtribeAuthorityElem);
                subtribeAuthorityElem.setTextContent(subtribe_authority);
            }
        }
        
        if(this.genus_names != null) {
            for(String genus_name : this.genus_names) {
                Element genusNameElem = doc.createElement("genus_name");
                taxonIdentificationElem.appendChild(genusNameElem);
                genusNameElem.setTextContent(genus_name);
            }
        }
        
        if(this.genus_authorities != null) {
            for(String genus_authority : this.genus_authorities) {
                Element genusAuthorityElem = doc.createElement("genus_authority");
                taxonIdentificationElem.appendChild(genusAuthorityElem);
                genusAuthorityElem.setTextContent(genus_authority);
            }
        }
        
        if(this.subgenus_names != null) {
            for(String subgenus_name : this.subgenus_names) {
                Element subgenusNameElem = doc.createElement("subgenus_name");
                taxonIdentificationElem.appendChild(subgenusNameElem);
                subgenusNameElem.setTextContent(subgenus_name);
            }
        }
        
        if(this.subgenus_authorities != null) {
            for(String subgenus_authority : this.subgenus_authorities) {
                Element subgenusAuthorityElem = doc.createElement("subgenus_authority");
                taxonIdentificationElem.appendChild(subgenusAuthorityElem);
                subgenusAuthorityElem.setTextContent(subgenus_authority);
            }
        }
        
        if(this.section_names != null) {
            for(String section_name : this.section_names) {
                Element sectionNameElem = doc.createElement("section_name");
                taxonIdentificationElem.appendChild(sectionNameElem);
                sectionNameElem.setTextContent(section_name);
            }
        }
        
        if(this.section_authorities != null) {
            for(String section_authority : this.section_authorities) {
                Element sectionAuthorityElem = doc.createElement("section_authority");
                taxonIdentificationElem.appendChild(sectionAuthorityElem);
                sectionAuthorityElem.setTextContent(section_authority);
            }
        }
        
        if(this.subsection_names != null) {
            for(String subsection_name : this.subsection_names) {
                Element subsectionNameElem = doc.createElement("subsection_name");
                taxonIdentificationElem.appendChild(subsectionNameElem);
                subsectionNameElem.setTextContent(subsection_name);
            }
        }
        
        if(this.subsection_authorities != null) {
            for(String subsection_authority : this.subsection_authorities) {
                Element subsectionAuthorityElem = doc.createElement("subsection_authority");
                taxonIdentificationElem.appendChild(subsectionAuthorityElem);
                subsectionAuthorityElem.setTextContent(subsection_authority);
            }
        }
        
        if(this.series_names != null) {
            for(String series_name : this.series_names) {
                Element seriesNameElem = doc.createElement("series_name");
                taxonIdentificationElem.appendChild(seriesNameElem);
                seriesNameElem.setTextContent(series_name);
            }
        }
        
        if(this.series_authorities != null) {
            for(String series_authority : this.series_authorities) {
                Element seriesAuthorityElem = doc.createElement("series_authority");
                taxonIdentificationElem.appendChild(seriesAuthorityElem);
                seriesAuthorityElem.setTextContent(series_authority);
            }
        }
        
        if(this.species_names != null) {
            for(String species_name : this.species_names) {
                Element speciesNameElem = doc.createElement("species_name");
                taxonIdentificationElem.appendChild(speciesNameElem);
                speciesNameElem.setTextContent(species_name);
            }
        }
        
        if(this.species_authorities != null) {
            for(String species_authority : this.species_authorities) {
                Element speciesAuthorityElem = doc.createElement("species_authority");
                taxonIdentificationElem.appendChild(speciesAuthorityElem);
                speciesAuthorityElem.setTextContent(species_authority);
            }
        }
        
        if(this.subspecies_names != null) {
            for(String subspecies_name : this.subspecies_names) {
                Element subspeciesNameElem = doc.createElement("subspecies_name");
                taxonIdentificationElem.appendChild(subspeciesNameElem);
                subspeciesNameElem.setTextContent(subspecies_name);
            }
        }
        
        if(this.subspecies_authorities != null) {
            for(String subspecies_authority : this.subspecies_authorities) {
                Element subspeciesAuthorityElem = doc.createElement("subspecies_authority");
                taxonIdentificationElem.appendChild(subspeciesAuthorityElem);
                subspeciesAuthorityElem.setTextContent(subspecies_authority);
            }
        }
        
        if(this.variety_names != null) {
            for(String variety_name : this.variety_names) {
                Element varietyNameElem = doc.createElement("variety_name");
                taxonIdentificationElem.appendChild(varietyNameElem);
                varietyNameElem.setTextContent(variety_name);
            }
        }
        
        if(this.variety_authorities != null) {
            for(String variety_authority : this.variety_authorities) {
                Element varietyAuthorityElem = doc.createElement("variety_authority");
                taxonIdentificationElem.appendChild(varietyAuthorityElem);
                varietyAuthorityElem.setTextContent(variety_authority);
            }
        }
        
        if(this.unranked_epithet_names != null) {
            for(String unranked_epithet_name : this.unranked_epithet_names) {
                Element unrankedEpithetNameElem = doc.createElement("unranked_epithet_name");
                taxonIdentificationElem.appendChild(unrankedEpithetNameElem);
                unrankedEpithetNameElem.setTextContent(unranked_epithet_name);
            }
        }
        
        if(this.unranked_epithet_authorities != null) {
            for(String unranked_epithet_authority : this.unranked_epithet_authorities) {
                Element unrankedEpithetAuthorityElem = doc.createElement("unranked_epithet_authority");
                taxonIdentificationElem.appendChild(unrankedEpithetAuthorityElem);
                unrankedEpithetAuthorityElem.setTextContent(unranked_epithet_authority);
            }
        }
        
        if(this.other_info_on_names != null) {
            for(String other_info_on_name : this.other_info_on_names) {
                Element otherInfoOnNameElem = doc.createElement("other_info_on_name");
                taxonIdentificationElem.appendChild(otherInfoOnNameElem);
                otherInfoOnNameElem.setTextContent(other_info_on_name);
            }
        }
        
        if(this.place_of_publications != null) {
            for(PlaceOfPublicationXMLBean place_of_publication : this.place_of_publications) {
                place_of_publication.toXML(doc, taxonIdentificationElem);
            }
        }
    }
    
}
