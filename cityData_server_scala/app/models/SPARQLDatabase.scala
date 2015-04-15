package models

import org.w3.banana.SparqlOpsModule
import org.w3.banana.jena.JenaModule
import org.w3.banana.jena.Jena
import com.hp.hpl.jena.query.Dataset
import com.hp.hpl.jena.tdb.TDBFactory
import play.api.Logger

object SPARQLDatabase extends SPARQLDatabaseTrait[Jena, Dataset] with JenaModule {
  type DATASET = Dataset
  override lazy val dataset: DATASET = {
//  override lazy val dataset: Dataset = {
    val dataset = TDBFactory.createDataset("TDB")
    Logger.info(s"RDFStoreLocalJena1Provider dataset created $dataset")
    dataset
  }
}