name := """play-clojure-example-start"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.11.1"

libraryDependencies ++= Seq(
  javaJdbc,
  javaEbean,
  cache,
  javaWs
)

seq(clojure.settings :_*)

libraryDependencies += "org.clojure" % "clojure" % "1.5.1"