package models

import play.api.mvc.Request
import play.api.mvc.AnyContent

object REST_SPARQL_bridge {

  val dbo = "http://dbpedia.org/ontology/"
  val dbp = "http://dbpedia.org/resource/"

  
  /** For URI's like
   *   /baseURL/cities/fr/01600
   * 
   * create SPARQL query: <pre>
   * 
   * PREFIX dbpedia-owl: <http://dbpedia.org/ontology/>
   * PREFIX dbpedia:     <http://dbpedia.org/resource/>
   * CONSTRUCT {
   *   ?CITY ?P ?O .
   * }
   * WHERE {
   *   ?CITY a dbpedia-owl:Settlement ;
   *         dbpedia-owl:country dbpedia:France ;
   *         dbpedia-owl:postalCode 01600 ;
   *         ?P ?O .
   * }
   * <pre>
   * 
   *   */
  def getJSONLD(request: Request[AnyContent]): String = {
    println("getJSONLD: " + request)
    val path = request.path
    val elems =  path.split("/")
    
    val conf = RequestRDFConfig( Seq(
        RequestRDFPathName(dbo + "country"),
        RequestRDFPathName(dbo + "postalCode")
        ))
    // TODO >>>>>>>>>>>>>>
    "bla"
  }
  case class RequestRDFPathName(
      // name: String, 
      uri: String)
  case class RequestRDFConfig( mappings: Seq[RequestRDFPathName]) {  
  }
}