//@scala.annotation.nowarn("msg=unused implicit parameter")
trait Foo {
  @scala.annotation.nowarn("msg=unused implicit parameter")
  def foo(i: Int)(implicit ev: String): Int = i + 1
}
