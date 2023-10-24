//> using publish.organization org.foobar
//> using publish.name lib
//> using publish.version 0.0.1-SNAPSHOT

//@scala.annotation.nowarn("msg=unused implicit parameter")
object Foo {
  @scala.annotation.nowarn("msg=unused implicit parameter")
  def foo(i: Int)(implicit ev: String): Int = i + 1
}
