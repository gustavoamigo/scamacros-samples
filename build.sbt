name := "scamacros"

version := "1.0"

scalaVersion := "2.11.8"


libraryDependencies ++= Seq(
  "org.scala-lang"             %  "scala-reflect" % scalaVersion.value,
  "org.scalatest"   %% "scalatest"      % "2.2.4" % "test"
)