scalaVersion := "2.11.2"

testOptions in Test := Seq(Tests.Argument("-oC"))

libraryDependencies := Seq(
  "org.scala-lang" % "scala-compiler" % scalaVersion.value,
  "org.scalatest" %% "scalatest" % "2.2.1")

