name := """play-exam-work"""
organization := "charus.com"

version := "1.0-SNAPSHOT"

val common = Seq(
  version := "0.1",
  scalaVersion := "2.13.8"
)


lazy val internProject = (project in file("."))
  .settings(common)
  .settings(
    name := "Scalasbtprojects",
    libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.9" % Test,
    libraryDependencies += "com.typesafe" % "config" % "1.3.3",
    libraryDependencies += "com.typesafe.scala-logging" %% "scala-logging" % "3.9.4",
      libraryDependencies += "ch.qos.logback" % "logback-classic" % "1.2.10",
    libraryDependencies += "log4j" % "log4j" % "1.2.14",
    crossScalaVersions := Seq("2.10.8", "2.12.4", "2.13.8")


  )
  .dependsOn(backend)
  .enablePlugins(PlayScala)


lazy val backend = (project in file("backendPostgres"))
  .settings(common)
  .settings(
    name := "backendPostgres",
    libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.9" % Test,
    libraryDependencies += "com.typesafe" % "config" % "1.3.3",
    libraryDependencies += "postgresql" % "postgresql" % "9.1-901.jdbc4",
    libraryDependencies += "com.typesafe.play" %% "play-json" % "2.9.2",
    libraryDependencies += "com.typesafe.scala-logging" %% "scala-logging" % "3.9.4",
    libraryDependencies += "log4j" % "log4j" % "1.2.14",
    libraryDependencies += "ch.qos.logback" % "logback-classic" % "1.2.10",
  )

libraryDependencies += guice


// Adds additional packages into Twirl
//TwirlKeys.templateImports += "charus.com.controllers._"

// Adds additional packages into conf/routes
// play.sbt.routes.RoutesKeys.routesImport += "charus.com.binders._"
