import com.typesafe.sbt.jse.JsEngineImport.JsEngineKeys
import com.typesafe.sbt.jse.JsEngineImport.JsEngineKeys
import com.typesafe.sbt.web.Import.WebJs
import com.typesafe.sbt.web.SbtWeb
import play.sbt.PlayScala

name := """sbt-play-with-es6"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala).enablePlugins(SbtWeb)

scalaVersion := "2.11.7"

libraryDependencies ++= Seq(
  jdbc,
  cache,
  ws,
  "org.scalatestplus.play" %% "scalatestplus-play" % "1.5.1" % Test
)

JsEngineKeys.engineType := JsEngineKeys.EngineType.Node

resolvers += "scalaz-bintray" at "http://dl.bintray.com/scalaz/releases"

BabelKeys.options := WebJs.JS.Object(
  "presets" -> List("stage-0")
  // More options ...
)
