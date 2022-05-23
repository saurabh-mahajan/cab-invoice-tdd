import io.kotest.core.spec.style.StringSpec
//import io.kotest.matchers.booleans.shouldBeFalse
//import io.kotest.matchers.booleans.shouldBeTrue

//import io.kotest.matchers.doubles.shouldBeExactly

import io.kotest.matchers.shouldBe

class cabInvoiceTest : StringSpec() {
    init {
        "If car travels for '1.0' km in '10' minutes"{
           // var invoice = carInvoiceTest()
            //var actualFare : Double = invoice.fairCalculate(1.0,10)
             //actualFare shouldBeExactly 1.0

            cabInvoiceCalculate().fairCalculate(1.0,10) shouldBe 20.0
        }
        "If car travels for '0.5' km in '5' minutes"{
            cabInvoiceCalculate().fairCalculate(0.5,5) shouldBe 10.0
        }
        "If car travels for '0.0' km in '10' minutes"{
            cabInvoiceCalculate().fairCalculate(0.0,10) shouldBe 10.0
        }


    }
}
