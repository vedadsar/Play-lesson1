name := """Todo"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.11.1"

libraryDependencies ++= Seq(
  javaJdbc,
  javaEbean,
  cache,
<<<<<<< HEAD
  javaWs,
=======
  javaWs
>>>>>>> f69a440849b7b6779fdb0de2fbd850f0756b5d99
)
