package models

import play.api.mvc.Request
import play.api.mvc.AnyContent

object REST_SPARQL_bridge {

  /** For URI's like
   *   /baseURL/cities/fr/01600
   * 
   * create SPARQL query: <pre>
   * 
   * PREFIX dbpedia-owl: <http://dbpedia.org/ontology>
   * PREFIX dbpedia:     <http://dbpedia.org/resource>
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
//    val headers = request.headers.toSimpleMap
    
    // TODO >>>>>>>>>>>>>>
    "bla"
  }

}