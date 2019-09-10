import xerial.sbt.Sonatype._

lazy val user = "sc6l6d3v"

lazy val email = "hk-vndr@iscs-i.com"

lazy val myname = "Henry Katz"

ThisBuild / organization := s"com.github.$user"

ThisBuild / sonatypeProjectHosting := Some(GitHubHosting(user, "jwt-scala", email))

ThisBuild / homepage := Some(url(s"https://github.com/$user/jwt-scala"))

ThisBuild / licenses += "Apache2" -> url("http://www.opensource.org/licenses/Apache-2.0")

ThisBuild / scmInfo := Some(
  ScmInfo(
    url(s"https://github.com/$user/jwt-scala"),
    "scm:git@github.com:$user/jwt-scala.git"
  )
)

ThisBuild /  publishArtifact in Test := false

ThisBuild / pomIncludeRepository := { _ => false }

ThisBuild /  developers :=
  List(
    Developer(
    id=user,
    name=myname,
    email=email,
    url=url(s"https://github.com/$user")))

ThisBuild / publishTo := {
  val nexus = "https://oss.sonatype.org/"
  if (isSnapshot.value)
    Some("snapshots" at nexus + "content/repositories/snapshots")
  else
    Some("releases" at nexus + "service/local/staging/deploy/maven2")
}

ThisBuild / publishMavenStyle := true

useGpg := true
