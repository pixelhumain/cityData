# city Data == commune Data
Open data and schema of a city.

## Introduction
"city Data" is an a tool building open city data by aggregating 
multiple sources of semantic data set (Linked Open Data) relative to a city.

The entry point starts with a country and a postal code.
The process retrieves corresponding triples from the following sources ( tentative list ) :
- [dbPedia.org](http://dbPedia.org)
- Wikidata
- data.INSEE.fr (for France)
- BANO (for France)

 ## Panoply of tools
- for semantic data transformation: Euler / EYE ; [introduction to the N3 language and a how to for the Euler/eye engine](http://svn.code.sf.net/p/eulergui/code/trunk/eulergui/html/N3_introduction.xhtml)
- for serving RDF / JSON-LD data with SPARQL : [BigData(TM)](http://BigData.com)
- for pretty reformatting of semantic data: rapper ; get or install raptor v2 from [http://librdf.org/raptor](http://librdf.org/raptor/) or from Debian / Ubuntu package raptor2-utils .

