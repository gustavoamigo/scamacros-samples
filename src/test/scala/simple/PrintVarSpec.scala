package simple

import org.scalatest.{ FreeSpec, Matchers }

class PrintVarSpec extends FreeSpec with Matchers {
  import PrintVar._
  "printVarName"  - {
    val myTest = "test"
    val myVar = printVarName(myTest)
    myVar should equal ("myTest")
  }

  "printVar" - {
    val myTest = "test3"
    val myVar = printVar(myTest)
    myVar should equal ("""myTest="test3"""")
  }

}
