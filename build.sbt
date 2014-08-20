scalaVersion in ThisBuild := "2.11.2"

testOptions in Test in ThisBuild := Seq(Tests.Argument("-oINCXHELPOQRM"))

lazy val dependencies = Seq(
  "org.scalatest" %% "scalatest" % "2.2.2")

lazy val module1 = project
	.settings(libraryDependencies := dependencies)

lazy val module2 = project
	.settings(libraryDependencies := dependencies)
	.dependsOn(module1)

lazy val root = project.in(file(".")).aggregate(module1, module2)