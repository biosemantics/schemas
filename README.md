schemas
=======
treatment 
------
- meta
- unbounded taxon_identification

meta
------
- source
- processed by (unbounded processor or charaparser)
- other_info_on_meta

processors
------
- defines processor
- defines charaparser

taxonIdentifiaction
------
- various string identification elements

textTreatment
------
- extends treatment
- adds textDescription

markedUpTreatment
------
- extends treatment
- adds markedupDescription

textDescription
------
- defines string description element

markedUpDescription
------
- defines description made up of unbounded statements, which contain structure, character and relations

iplantInputTreatment
------
- extends textTreatment
- adds discussion 

iplantOutputTreatment
------
- extends markedUpTreatment
- adds discussion

extendedTreatment
------
- defines treatment that uses extendedTaxonIdentification
- meta
- extendedTaxonIdentification

extendedTaxonIdentification
------
- extends taxonIdentification
- adds unbounded taxon_hierarchy

beeTreatment
------
- extends extendedTreatment
- adds number, description, type, synonym, other_name, material, discussion, taxon_relation_articulation, habitat_elevation_distribution_or_ecology, key_file

key
------
- meta
- key heading
- key author
- discussion
- key head
- key statement

Example purpose only
=======
templateTreatment.xml, test.xml
