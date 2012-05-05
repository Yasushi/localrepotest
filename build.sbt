libraryDependencies ++= Seq(
  "commons-lang"%"commons-lang"%"2.6",
  "dummy"%"dummy"%"1.0"
)

resolvers += "typesafe-release" at "http://repo.typesafe.com/typesafe/releases/"

transitiveClassifiers := Seq("sources")

ivyLoggingLevel := UpdateLogging.Full

// logLevel := Level.Debug

// externalIvySettings()
