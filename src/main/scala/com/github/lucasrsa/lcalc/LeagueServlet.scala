package com.github.lucasrsa.lcalc

import org.apache.spark.{SparkConf, SparkContext}
import org.scalatra._

class LeagueServlet extends ScalatraServlet {

  private var conf: SparkConf = new SparkConf().setAppName("league-calculator-api").setMaster("local[4]")
  private val sc: SparkContext = new SparkContext(conf)

  get("/") {
    views.html.hello()
  }

  get("/test") {
    val arr = sc.parallelize(Seq(1,2,3,4,5,6,7,8,9))

    Ok(arr.map(_ + 1).sum)
  }

}
