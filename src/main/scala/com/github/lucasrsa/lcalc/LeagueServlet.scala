package com.github.lucasrsa.lcalc

import org.scalatra._

class LeagueServlet extends ScalatraServlet {

  get("/") {
    views.html.hello()
  }

}
