import mill._
import scalalib._

object main extends ScalaModule {

  def scalaVersion = "3.1.0"

  def http4sVersion = "0.23.6"
  def circeVersion = ":0.14.1"

  override def ivyDeps = Agg(
    ivy"org.http4s::http4s-core:$http4sVersion",
    ivy"org.http4s::http4s-dsl:$http4sVersion",
    ivy"org.http4s::http4s-blaze-server:$http4sVersion",
    ivy"org.http4s::http4s-circe:$http4sVersion",

    ivy"io.circe::circe-core:$circeVersion",
    ivy"io.circe::circe-generic:$circeVersion"
  )

  object test extends Tests with TestModule.ScalaTest {

    override def ivyDeps = Agg(
      ivy"org.scalactic::scalactic:3.2.10",
      ivy"org.scalatest::scalatest:3.2.10"
    )
  }
}

