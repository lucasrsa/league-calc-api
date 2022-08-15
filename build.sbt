val ScalatraVersion = "2.8.2"
val SparkVersion = "3.2.1"

ThisBuild / scalaVersion := "2.13.8"
ThisBuild / organization := "com.github.lucasrsa"

lazy val hello = (project in file("."))
  .settings(
    name := "League Calculator API",
    version := "0.1.0-SNAPSHOT",
    libraryDependencies ++= Seq(
      "org.scalatra" %% "scalatra" % ScalatraVersion,
      "org.scalatra" %% "scalatra-scalatest" % ScalatraVersion % "test",
      "ch.qos.logback" % "logback-classic" % "1.2.11" % "runtime",
      "org.eclipse.jetty" % "jetty-webapp" % "11.0.9" % "container",
      "javax.servlet" % "javax.servlet-api" % "4.0.1" % "provided",
      "org.apache.spark" %% "spark-core" % SparkVersion,
      "org.apache.spark" %% "spark-mllib" % SparkVersion,
      "org.apache.spark" %% "spark-sql" % SparkVersion % "runtime"
    )
  )

enablePlugins(SbtTwirl)
enablePlugins(JettyPlugin)
