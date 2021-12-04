# Experiment with Mill and Scala

[Mill](https://com-lihaoyi.github.io/mill/mill/Intro_to_Mill.html) is a shiny new Java/Scala build tool!

See also [this blog post](https://www.lihaoyi.com/post/MillBetterScalaBuilds.html) from the creator.

## Mill

  - Update IDEA project: `mill mill.scalalib.GenIdea/idea`

## Some further links

  - [Scala Mill Build Tool: Getting started (The First Six Steps)](https://alvinalexander.com/scala/mill-build-tool/intro/)


## Http4s

https://http4s.org/v0.23/service/

```scala
package de.mirb.github.pg

import cats.effect._
import org.http4s.Method.GET
import org.http4s.Uri.Path.Root
import org.http4s.{HttpRoutes, _}
object HttpServer {

  val service = HttpRoutes.of[IO] {
//    case request@GET -> Root / "health" =>
//      IO(Response(Status = Status.Ok, body = "EntityBody[String]"))
//    case GET -> Root / "health" => IO(Response(Status.Ok))
    case _ =>
      IO(Response(Status.Ok))
  }
}
```