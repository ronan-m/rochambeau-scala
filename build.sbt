ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.12"

libraryDependencies += "org.scalatest" %% "scalatest-funsuite" % "3.2.17" % "test"

addSbtPlugin("org.scoverage" % "sbt-scoverage" % "1.6.1")
addSbtPlugin("com.sonar-scala" % "sbt-sonar" % "2.3.0")

lazy val root = (project in file("."))
  .settings(
    name := "rock-paper-scissors"
  )


