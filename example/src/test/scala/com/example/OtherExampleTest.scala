//import org.scalatest.funsuite.AnyFunSuite
package com.example

import org.specs2.concurrent.ExecutionEnv
import org.specs2.mutable.SpecificationWithJUnit
import org.specs2.specification.core.AsExecution

class OtherExampleTest(implicit ee: ExecutionEnv) extends SpecificationWithJUnit {
  "other example" in {
    List.empty.length mustEqual 0
  }
}
