name := "jwt-scala"

version := "1.3.0-SNAPSHOT"

organization := "com.github.3tty0n"

crossScalaVersions := Seq("2.10.6", "2.11.11", "2.12.6")

sonatypeProfileName := "com.github.3tty0n"

publishMavenStyle := true

import xerial.sbt.Sonatype._

sonatypeProjectHosting := Some(GitHubHosting("3tty0n", "jwt-scala", "yuizalp@gmail.com"))

homepage := Some(url("https://github.com/3tty0n/jwt-scala"))

licenses += "Apache2" -> url("http://www.opensource.org/licenses/Apache-2.0")

scmInfo := Some(
  ScmInfo(
    url("https://github.com/3tty0n/jwt-scala"),
    "scm:git@github.com:3tty0n/jwt-scala.git"
  )
)

publishArtifact in Test := false

pomIncludeRepository := { _ => false }

pomExtra :=
  <developers>
    <developer>
      <id>3tty0n</id>
      <name>Yusuke Izawa</name>
      <url>https://github.com/3tty0n</url>
    </developer>
  </developers>

publishTo := {
  val nexus = "https://oss.sonatype.org/"
  if (isSnapshot.value)
    Some("snapshots" at nexus + "content/repositories/snapshots")
  else
    Some("releases" at nexus + "service/local/staging/deploy/maven2")
}

scalaVersion := "2.12.6"

libraryDependencies ++= Seq(
  "org.scalatest" %% "scalatest" % "3.0.1" % "test",
  "com.typesafe.play" %% "play-json" % "2.6.8",
  "commons-codec" % "commons-codec" % "1.6",
  "org.bouncycastle" % "bcprov-jdk16" % "1.46"
)

resolvers ++= Seq(
  "Typesafe Repository" at "http://repo.typesafe.com/typesafe/releases/"
)
