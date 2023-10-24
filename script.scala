import scala.sys.process._

@main def foo =
  Process(Seq("sbt", "publishLocal"), new java.io.File("library")).!
  Process(Seq("sbt", "compile"), new java.io.File("application")).!
