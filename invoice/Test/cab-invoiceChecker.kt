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
        "'x' person travels for total '10.0' km in '10' minutes "{

//            cabInvoiceCalculate().fair(Ride(0.5,5)) shouldBe 10.0
            cabInvoiceCalculate().fair(listOf(Ride(0.5,5)) ) shouldBe 10.0

        }
        "'3' times 'x' person travels for total '1.5' km in '25' minutes"{ // fare of multiple rides is now being calculated
            val rideOne = Ride(0.5,5)
            val rideTwo = Ride(1.0,10)
            val rideThree = Ride(0.0,10)
            cabInvoiceCalculate().fair(listOf(rideOne,rideTwo,rideThree)) shouldBe 40.0
        }
        "After multiple stops total fare of multiple rides"{
            val rideOne = Ride(0.5,5)
            val rideTwo = Ride(1.0,10)
            val rideThree = Ride(0.0,10)
            cabInvoiceCalculate().fair(listOf(rideOne,rideTwo,rideThree)) shouldBe 40.0
        }
        "No rides per month"{
            cabInvoiceCalculate().fair(listOf()) shouldBe 0.0
        }
//        "when Getting Nullable Rides"{
//            //var totalRides = listOf(Ride(null,null))
//            cabInvoiceCalculate().fair(listOf(Ride(null,null))) shouldBe null
//        }


    }
}
class cabInvoiceDetailedTest : StringSpec() {
    init{
        "calculating total fair,Number of rides taken & Average cost per ride (per person) "{
            val rideOne = Ride(0.5,5)
            val rideTwo = Ride(1.0,10)
            val rideThree = Ride(0.0,10)
            var totalFare = cabInvoiceCalculate().fair(listOf(rideOne,rideTwo,rideThree))
            totalFare shouldBe 40.0
            var totalRides = cabInvoiceCalculate().totalRides(listOf(rideOne,rideTwo,rideThree))
            totalRides shouldBe 3
            var averageCostPerRide = totalFare / totalRides
            averageCostPerRide shouldBe 13.333333333333334
        }
    }
}
class cabInvoiceDetailedTest1 : StringSpec() {
    init{
        "calculating total fair,Number of rides taken & Average cost per ride (per person) "{
            val rideOne = Ride(0.5,5)
            val rideTwo = Ride(1.0,10)
            val rideThree = Ride(0.0,10)
            var data = cabInvoiceCalculate().totalInvoiceData(listOf(rideOne,rideTwo,rideThree))
            data.totalFair shouldBe 40.0
            data.totalRides shouldBe 3
            data.averageCost shouldBe 13.333333333333334
//            var totalFare = cabInvoiceCalculate().fair(listOf(rideOne,rideTwo,rideThree))
//            totalFare shouldBe 40.0
//            var totalRides = cabInvoiceCalculate().totalRides(listOf(rideOne,rideTwo,rideThree))
//            totalRides shouldBe 3
//            var averageCostPerRide = totalFare / totalRides
//            averageCostPerRide shouldBe 13.333333333333334
        }
    }
}

