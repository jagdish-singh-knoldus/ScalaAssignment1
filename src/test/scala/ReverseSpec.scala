import org.scalatest.flatspec.AnyFlatSpec

class ReverseSpec extends AnyFlatSpec{

  "reverse of string" should "be found"in {
    val x = Reverse.reverseString("re")
    assert(x == "er")
  }
  "reverse of list" should "be found" in{
    val res=Reverse.reverseList(List(1,2,3,4))
    assert(res==(List(4,3,2,1)))
  }
}
