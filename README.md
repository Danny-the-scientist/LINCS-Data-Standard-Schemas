# FAIR Compliant JSON Data Schemas for LINCS Data Standards

**Purpose** - This page serves to host information relating to the LINCS DCIC effort to define its [Data Standards](http://www.lincsproject.org/LINCS/data/standards) in JSON-LD format in order to specifically improve machine readability, accessibility, and interoperability of LINCS data and metadata.

## Current Paradigm

* Data standards are only available in PDF format, with relatively ill-defined requirements for submission
* Standards are adopted and followed to an extent by the LINCS consortium, but extensive manual curation is required to ensure compliance
* No direct means of autmated combinatorial analysis with external data sources exists

## Goals

1. Explicitly define LINCS Data Standards in the context of existing terminologies and annotations
	1. Integrate definitions into machine-readable sections of the LINCS Data access protocols, including API
2. Integrate LINCS Standard definitions with external data standards for cross analysis
3. Utilize more extensive and defined controlled vocabulary to reduce manual effort of data curation

## Effort Overview

* Define and annotate LINCS data standards in the context of ontology branch terms and property name matches to [ensure interoperability](https://academic.oup.com/bioinformatics/article/33/18/2914/3848915)
	* Initial definitions and linkages published in Google Sheets for individial reagent types
* Publish JSON-LD schemas reflecting controlled vocabulary and ontological annotations to enable machine readability and combinatorial data analyses
	* JSON-LD schemas generated based on standardized data standard linkage Google Sheet format through custom-built JAR
* Define and publish the LINCS Namespace Ontology to more clearly define key metadata details such as identifiers and free-text fields when external ontologies are unavailable/ambiguous
* Implement data schemas and definitions into LINCS data processing and curation workflows to automate curation, checking for errors, automatically rejecting required fields, etc.

## Reasoning/The "Why" Factor

With the recent and meteoric-like rise of -omics level data in recent years, the amount of available scientific data has expanded exponentially, while curation efforts and personel remain relatively steady.  Most groups/labs set up and follow their own requirements for data collection, tracking, and, if needed, repository submission.  Re-usability of these data is a tremendous resource for other scientists to answer hypothesis-driven questions, but it is a world of metadata annotation inconsistencies, inaccuracies, and simple unavailibility.  With combinatorial analyses requiring data be obtained from similiar or identical platforms, procedures, and reagents, missing or inaccurate metadata significantly hamstrings this effort.

By more clearly defining data standards using universal, machine-readable vocabularies and language, we can enable combinatorial efforts without forcing users into a single data workflow or set of data standards. Data and standards having differences in the exact spelling and syntax of a "Cell Line Name" property, for example, is irrelevant as long as each property is defined with the same ontological vocabulary term.  Such annotations and linkages are also more valuable to share, through tools such as BioSharing, with other groups due to the universality of the terms. Sharing an arbitrary, ill-defined list of fields is less helpful to a new/curious resarcher than a well-defined and annotated list of specific, recognized terms the properties corrospond to.

Additionally, efforts relating to controlled vocabularies and terms will enable more automation of data curation.  Direct examination of controlled vocabulary restrictions can be easily automated and given as more instantaneous feedback to a user, as opposed to frequent back-and-forth communication regarding valid entries.

## Contents/Key Information

1. [LINCS Data Standards](http://www.lincsproject.org/LINCS/data/standards) - current available format of LINCS reagent metadata standards, PDF format
2. [Key Ontologies](https://docs.google.com/document/d/1CUwaYE6FgqXKUeuI9YpmY2He54rmxC_t8cG3UUKlbrY/edit) - rough hierarchy of ontologies utilized for initial object and property mapping of LINCS data standards
3. Reagent Ontology Linkages - individial Google Sheet pages generated for all LINCS reagents reflecting connectivity to ontologies outlined above: Includes class matches for controlled vocabulary, property/object annotation mapping, and LINCS-Defined controlled vocabulary, if relevant.  See Content 2 for more info on the development of these documents.
	1. [Cell Lines](https://docs.google.com/spreadsheets/d/1rRb5C7JIj8DG09_VcMR_SNQkutheEjN02x1TMeiwI08/edit#gid=0)
	2. [Primary Cells](https://docs.google.com/spreadsheets/d/19ywtX048gUV9uTDDUvGd7UdVQPYxN4Bsv7bxsylhEFc/edit#gid=0)
	3. [Differentiated Cells](https://docs.google.com/spreadsheets/d/1xEUsPss28RclqZbmM-MtZvBfm2z9wwLNPkcT6L_DNoo/edit#gid=0)
	4. [iPS Cells](https://docs.google.com/spreadsheets/d/1hAzSOHjdJKUHvKrAMIDSIaeeuuBcVsQCyopY_mWN71U/edit#gid=0)
	5. [ES Cells](https://docs.google.com/spreadsheets/d/1toVh40GcxJFFHtJtCtbxivupvTbw_D0ubWpPBB8Z5Ss/edit#gid=0)
	6. [Small Molecules](https://docs.google.com/spreadsheets/d/1WVZlf78S4xHIyi7T4g_PKGObv4aNImsJxqmTA0Nc9m4/edit#gid=0)
	7. [Antibody Reagents](https://docs.google.com/spreadsheets/d/1Q4nlP3RBNWVo56NXGhnGaajvwoIAgn9ThjenPehz5JU/edit#gid=0)
	8. [Protein Reagents](https://docs.google.com/spreadsheets/d/1cHdCNmFmK8u4gb49yElcFlt4ZJklyix7NaHWdUU37es/edit#gid=0)
	9. [Nucleic Acid Reagents](https://docs.google.com/spreadsheets/d/1mMWIP0AA7LcZ1ruGd3GIBfXO9IwBNepxzgr0gXOFKg4/edit#gid=0)
4. JSON-LD Schemas - Processed formats of Content 3 into machine-readable schemas
5. JSON conversion code - source code and resultant JAR utilize to produce JSON-LD schemas
6. [LINCS Namespace Starter](https://docs.google.com/document/d/1OArBGePzhKZ2DhlsJTilN1VG-yhbjRH8_7Zalr1LSZo/edit) - pre-OWL list of elements, axioms, and relations for the LINCS Namespace Ontology
