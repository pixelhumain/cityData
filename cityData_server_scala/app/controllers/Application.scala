package controllers

import play.api._
import play.api.mvc._
import play.api.mvc.Request
import play.api.libs.iteratee.Enumerator
import play.api.libs.iteratee.Iteratee
import scala.concurrent.Future
import scala.concurrent.ExecutionContext.Implicits.global
import models.REST_SPARQL_bridge

object Application extends Controller {

  /**
   * a simple wrapper with simple URL's for a SPARQL database.
   *   For example for dbPedia it would accept URI's like
   *   /baseURL/Settlement?country=France&postalCode=01600
   *   In fact we are only interested in a small number of classes and properties,
   *   but it would be nice to have something as generic as possible.
   *   
   *  The entry point starts with a country and a postal code.
   *  The process retrieves corresponding triples from the following sources:
   *  - local (embedded) dbPedia instance
   *  - hosted dbPedia instance at endpoint http://dbpedia.org/sparql
   */
  def displayCity = {
    Action { implicit request =>
      Ok(REST_SPARQL_bridge.getJSONLD(request)).as("application/ld+json")
    }
  }
}
