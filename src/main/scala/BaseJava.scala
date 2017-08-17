trait BaseJava {
  val myInterface: JavaInterface = new DefaultJavaInterface
}

trait BaseScala {
  val myInterface: ScalaTrait = new DefaultScalaTrait
}

trait ScalaTrait {
  def method: String
}

class DefaultScalaTrait extends ScalaTrait {
  override def method: String = "Scala"
}

class DefaultJavaInterface extends JavaInterface {
  override def method(): String = "Default"
}


class BaseClass