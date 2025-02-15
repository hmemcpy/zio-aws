val zioVersion = "1.0.13"
val awsVersion = "2.17.104"

sbtPlugin := true
scalaVersion := "2.12.15"
organization := "io.github.vigoo"
scalacOptions := Seq("-Ypartial-unification", "-deprecation")
libraryDependencies ++= Seq(
  "dev.zio" %% "zio" % zioVersion,
  "dev.zio" %% "zio-nio" % "1.0.0-RC9",
  "io.circe" %% "circe-yaml" % "0.13.1",
  "software.amazon.awssdk" % "codegen" % awsVersion,
  "software.amazon.awssdk" % "aws-sdk-java" % awsVersion,
  "org.scalameta" %% "scalameta" % "4.4.21",
  "com.lihaoyi" %% "os-lib" % "0.7.1",
  "io.github.vigoo" %% "metagen-core" % "0.0.8"
)
