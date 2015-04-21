package models

import scala.util.Try
import org.w3.banana.RDF
import org.w3.banana.RDFOpsModule
import org.w3.banana.RDFStore
import org.w3.banana.SparqlOpsModule

/**
 * abstract RDFStore Local Provider
 * NOTE: same design pattern as for XXXModule in Banana
 */
trait RDFStoreLocalProvider[Rdf <: RDF, DATASET] extends RDFOpsModule with SparqlOpsModule {
  implicit val rdfStore: RDFStore[Rdf, Try, DATASET]
  val dataset: DATASET
}
