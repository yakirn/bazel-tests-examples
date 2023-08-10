package com.example

import com.exampale.Calculator
import org.specs2.concurrent.ExecutionEnv
import org.specs2.specification.core.AsExecution
import org.specs2.mutable.SpecificationWithJUnit

class ExampleTest(implicit ee: ExecutionEnv) extends SpecificationWithJUnit {
  "running me works" should {
    "running only me fails" should {
      "cant find me" >> {
        success
      }
    }
  }
}
