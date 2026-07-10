// Comment to get more information during initialization
logLevel := Level.Warn

// The Typesafe repository
resolvers += "Typesafe repository" at "https://repo.typesafe.com/typesafe/releases/"

// Use the Play sbt plugin for Play projects
addSbtPlugin("org.playframework" % "sbt-plugin" % "3.0.11")

addSbtPlugin("org.playframework.twirl" % "sbt-twirl" % "2.0.9")

addSbtPlugin("com.jsuereth" % "sbt-pgp" % "1.1.1")

addSbtPlugin("com.github.sbt" % "sbt-javaagent" % "0.2.0")

addSbtPlugin("org.scalameta" % "sbt-scalafmt" % "2.6.1")
