class ExtensionJava extends BaseClass with BaseJava {

  override val myInterface = new JavaInterface {
    override def method(): String = "Override"

    def myMethod = 123
  }

  val callInt = myInterface.myMethod

  println(callInt)
}


class ExtensionScala extends BaseClass with BaseScala {

  override val myInterface = new ScalaTrait {
    override def method: String = "Override"
    def myMethod = 123
  }

  val callInt = myInterface.myMethod

  println(callInt)
}

class ExtensionJava2 extends BaseJava {

  override val myInterface = new JavaInterface {
    override def method(): String = "Override"

    def myMethod = 123
  }

  val callInt = myInterface.myMethod

  println(callInt)
}


class ExtensionScala2 extends BaseScala {

  override val myInterface = new ScalaTrait {
    override def method: String = "Override"
    def myMethod = 123
  }

  val callInt = myInterface.myMethod

  println(callInt)
}
