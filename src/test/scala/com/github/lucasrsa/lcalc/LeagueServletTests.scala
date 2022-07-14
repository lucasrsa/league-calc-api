package com.github.lucasrsa.lcalc

import org.scalatra.test.scalatest._

class LeagueServletTests extends ScalatraFunSuite {

  addServlet(classOf[LeagueServlet], "/*")

  test("GET / on LeagueServlet should return status 200") {
    get("/") {
      status should equal (200)
    }
  }

}
