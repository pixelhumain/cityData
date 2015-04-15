package models

import org.w3.banana.SparqlOpsModule
import org.w3.banana.RDF

trait SPARQLDatabaseTrait[Rdf <: RDF, DATASET] extends RDFStoreLocalProvider[Rdf, DATASET] {
  import ops._
  import rdfStore.transactorSyntax._
  import rdfStore.graphStoreSyntax._
  import sparqlOps._
  import rdfStore.sparqlEngineSyntax._

  def runQuery(queryString: String): String = {
    val r = dataset.r({
      val result = for {
        query <- parseConstruct(queryString)
        graph <- dataset.executeConstruct(query, Map())
      } yield graph
      result
    })
    // TODO serialize in JSON-LD <<<<<<<<<<<<<<<<<<<<<<<
    ???
  }
}