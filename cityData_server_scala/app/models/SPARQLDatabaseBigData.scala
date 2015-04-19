package models

import org.w3.banana.SparqlOpsModule
import org.w3.banana.sesame.Sesame
import org.w3.banana.sesame.SesameModule
import play.api.Logger
import org.w3.banana.io.RDFWriter
import org.w3.banana.io.JsonLdExpanded
import org.w3.banana.io.JsonLdFlattened
import com.bigdata.rdf.sail.remote.BigdataSailRemoteRepository
import com.bigdata.rdf.sail.{BigdataSailTupleQuery, BigdataSailRepositoryConnection, BigdataSailRepository, BigdataSail}
import java.io.File
import java.util.Properties
import org.apache.commons.io.FileUtils
import scala.util.Try
import org.openrdf.query.{TupleQueryResult, QueryLanguage}
import org.openrdf.model.impl.URIImpl
import org.openrdf.repository.RepositoryConnection
import org.openrdf.query.Dataset

trait SPARQLDatabaseBigData extends SPARQLDatabaseTrait[Sesame, RepositoryConnection] with SesameModule {
  type DATASET =
    RepositoryConnection
  override lazy val dataset: DATASET = {
    val db = BigData() // initializing the database
    // TODO expose  write Connection
    val rc = db.readConnection
    Logger.info(s"SPARQLDatabaseTrait dataset created $rc")
    rc
  }
}