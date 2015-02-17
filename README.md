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
- another SPARQL server, less good for concurrent updates (but that is not necessary here): Jena TDB and Jena Fuseki; see [Setting up a DBPedia SPARQL mirror with Jena](http://svn.code.sf.net/p/eulergui/code/trunk/eulergui/html/server-sparql-dbpedia.html)
- for pretty reformatting of semantic data: rapper ; get or install raptor v2 from [http://librdf.org/raptor](http://librdf.org/raptor/) or from Debian / Ubuntu package raptor2-utils .

