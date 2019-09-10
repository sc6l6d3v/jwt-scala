import xerial.sbt.Sonatype._

name := "jwt-scala"

version := "1.3.0"

scalaVersion := "2.12.8"

crossScalaVersions := Seq("2.10.6", "2.11.11", "2.12.6")

pomIncludeRepository := { _ => false }

sources in (Compile, doc) := Seq()

libraryDependencies ++= Seq(
  "org.scalatest" %% "scalatest" % "3.0.1" % "test",
  "com.typesafe.play" %% "play-json" % "2.6.8",
  "commons-codec" % "commons-codec" % "1.6",
  "org.bouncycastle" % "bcprov-jdk16" % "1.46"
)

resolvers ++= Seq(
  "Typesafe Repository" at "http://repo.typesafe.com/typesafe/releases/"
)
