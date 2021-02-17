import xerial.sbt.Sonatype._

name := "jwt-scala"

version := "1.3.0"

scalaVersion := "2.13.4"

crossScalaVersions := Seq("2.10.6", "2.11.11", "2.12.6")

pomIncludeRepository := { _ => false }

sources in (Compile, doc) := Seq()

libraryDependencies ++= Seq(
  "org.scalatest" %% "scalatest" % "3.2.2" % "test",
  "com.typesafe.play" %% "play-json" % "2.9.2",
  "commons-codec" % "commons-codec" % "1.6",
  "org.bouncycastle" % "bcprov-jdk16" % "1.46"
)
