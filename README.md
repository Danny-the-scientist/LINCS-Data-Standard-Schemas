# FAIR Compliant JSON Data Schemas for LINCS Data Standards

1/4/2022 - This Repo (fork) was built to feed a publication of taking csv data standards and converting them into JSON and, with data, JSON-LD schemas. Unfortunately, the paper was completed, but never went through publishing due to obligations of the PI.


UPDATED 7/3/2019 - Uploaded initial dataset schema based on new fields and JSON format
UPDATED 5/24/2019 - Updated schemas focused on schema.org and bioschemas.org terminologies

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
3. Reagent Ontology Linkages - individial Google Sheet pages generated for all LINCS reagents reflecting connectivity to ontologies outlined above: Includes class matches for controlled vocabulary, property/object annotation mapping, and LINCS-Defined controlled vocabulary, if relevant, as well as associations to schema/bioschemas terminologies and general styling.  See Content 1 for more info.
	1. [Cell Lines](https://docs.google.com/spreadsheets/d/11GyXGX5XfdvHJN5d_Da_OtwcErc8ig74Y6-nOB2ObQ8/edit#gid=0)
	2. [Primary Cells](https://docs.google.com/spreadsheets/d/1Rebdnpi0h9qSFOqFfFImoRDX8WASYXWCVl6s18k4Qw8/edit#gid=0)
	3. [Differentiated Cells](https://docs.google.com/spreadsheets/d/1dUmRRX9k0N7J2pvI9UpZfHgkXdB0lKczb70_MnHOFKY/edit#gid=0)
	4. [iPS Cells](https://docs.google.com/spreadsheets/d/1-puvfhd67h2fNygL9RQHjLtPjlXUDj1-Xnan69ozOu0/edit#gid=0)
	5. [ES Cells](https://docs.google.com/spreadsheets/d/1OAUBeuD4MWMJBetUVNXIADA9Mz6csJHPruzO4uBXCyA/edit#gid=0)
	6. [Small Molecules](https://docs.google.com/spreadsheets/d/16gOYATQ1KktutIiY7iv4BmqOGEIIAIviDyZ-3iLpiaI/edit#gid=0)
	7. [Antibody Reagents](https://docs.google.com/spreadsheets/d/1_3sXm_njUP3oUo6U3EMBL4gt6Z3lvBTT8xmi-R170QA/edit#gid=0)
	8. [Protein Reagents](https://docs.google.com/spreadsheets/d/1BaYJi0CPDkrvsbVfKYMovmdtFxSwfud8N5mRLpsDY64/edit#gid=0)
	9. [Nucleic Acid Reagents](https://docs.google.com/spreadsheets/d/1ArDLqK4kE4sOxSu1GonvG37UsRQWvnOjwLBeCwmR4vM/edit#gid=0)
4. [Dataset Specifications](https://docs.google.com/spreadsheets/d/1ZlS-_tsOa1rtJFSJQHACEAPDwAFtftNrgi2xCDlGX8Y/edit#gid=0) - dataset metadata collected, as defined my LINCS specifications and published as a Google Doc and subsequently as a JSON schema; as described above.
5. JSON-LD Schemas - Processed formats of Content 3 into machine-readable schemas
6. JSON conversion code - source code and resultant JAR utilize to produce JSON-LD schemas
7. [LINCS Namespace Starter](https://docs.google.com/document/d/1OArBGePzhKZ2DhlsJTilN1VG-yhbjRH8_7Zalr1LSZo/edit) - pre-OWL list of elements, axioms, and relations for the LINCS Namespace Ontology
