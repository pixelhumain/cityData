package models

import play.api.mvc.Request
import play.api.mvc.AnyContent
import org.w3.banana.jena.Jena
import com.hp.hpl.jena.query.Dataset
import org.w3.banana.sesame.Sesame
import org.openrdf.repository.RepositoryConnection

trait REST_SPARQL_bridge_BigData extends REST_SPARQL_bridge[Sesame, RepositoryConnection]
  with SPARQLDatabaseBigData