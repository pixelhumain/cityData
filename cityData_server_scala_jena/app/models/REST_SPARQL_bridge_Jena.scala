package models

import play.api.mvc.Request
import play.api.mvc.AnyContent
import org.w3.banana.jena.Jena
import com.hp.hpl.jena.query.Dataset

trait REST_SPARQL_bridge_Jena extends REST_SPARQL_bridge[Jena, Dataset]
  with SPARQLDatabaseJena