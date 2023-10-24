val main = project
  .in(file("."))
  .settings(
    scalaVersion := "3.3.1",
    semanticdbEnabled := true,
    libraryDependencies += "org.test" %% "lib" % "0.1.0-SNAPSHOT"
  )
