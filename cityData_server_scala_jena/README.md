# Introduction
Here is a web application with Play! framework that wraps the Apache Jena TDB SPARQL database.
It depends on [../cityData\_server\_scala\_core](../cityData_server_scala_core) , that contains the database independent source code, thanks to Banana-RDF.

# How to run
## Run locally from sources

Dependencies to install : Java 7 or 8 (Scala is now also ready for Java 8), [SBT](http://www.scala-sbt.org/)
or [Typesafe Activator](http://typesafe.com/platform/getstarted) .
Then SBT or Activator donwload the rest.

- build and run this project with [latest play activator from typesafe.com](http://typesafe.com/platform/getstarted) , and type in activator :
```
~ run
```
The default port is 9000, so you can direct your browser to [http://localhost:9000/cities/fra/01600](http://localhost:9000/cities/fra/01600) .
To run on another port than 9000 :
    run 9053

# Preloading RDF content

- Preloading data ( currently dbPedia ) :
in Unix shell type:
```shell
    wget http://data.dws.informatik.uni-mannheim.de/dbpedia/2014/fr/instance_types_en_uris_fr.ttl.bz2
    wget http://data.dws.informatik.uni-mannheim.de/dbpedia/2014/fr/mappingbased_properties_en_uris_fr.ttl.bz2
    bunzip2 instance_types_en_uris_fr.ttl.bz2
    bunzip2 mappingbased_properties_en_uris_fr.ttl.bz2
```
in activator shell type:
```
    runMain tdb.tdbloader --loc=TDB --graph=dbPedia instance_types_en_uris_fr.ttl mappingbased_properties_en_uris_fr.ttl
```

You can also use [Fuseki](http://jena.apache.org/documentation/serving_data/) web manager.
