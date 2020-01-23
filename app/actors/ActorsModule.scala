package actors

import com.google.inject.AbstractModule
import play.api.libs.concurrent.AkkaGuiceSupport

class ActorsModule extends AbstractModule with AkkaGuiceSupport{
  override def configure() = {
    bindActor[ExampleManager]("example-manager")
  }
}
