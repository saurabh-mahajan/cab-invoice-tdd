class cabInvoiceCalculate {
    companion object {
        val FARE_PER_UNIT_DISTANCE = 10.0
        val FARE_PER_UNIT_TIME = 1
    }
    fun fairCalculate(Distance : Double, Time : Int): Double {

        return Distance * FARE_PER_UNIT_DISTANCE + Time * FARE_PER_UNIT_TIME
    }
    fun fair(rides : List<Ride>) : Double {
        //var dis : Double = 10.0
        //var time : Int = 1

        //val upperCase1: (String) -> String = { str: String -> str.uppercase() }

//        return rides.sumOf { it.distance* FARE_PER_UNIT_DISTANCE + it.time* FARE_PER_UNIT_TIME}
        return rides.sumOf { it.calculateFare()}

//        for(element in rides){
//            dis += element.distance
//            time += element.time
//        }
//
//        return dis * FARE_PER_UNIT_DISTANCE + time * FARE_PER_UNIT_TIME
    }
    fun totalRides(rides : List<Ride>) : Int {
        return rides.size
    }
    fun totalInvoiceData(rides : List<Ride>) : InvoiceTotalData{
        var totalFair = rides.sumOf { it.calculateFare()}
        var totalRides = rides.size
        var averageCost = totalFair / totalRides
        var data = InvoiceTotalData(totalFair,totalRides,averageCost)
        return data
    }
//    fun totalInvoiceData(rides : List<Ride>) : {
//
//        var totalFair = rides.sumOf { it.calculateFare()}
//        return mutableListOf(totalFair, rides.size, totalFair/rides.size)
//        //return resultData
//            // resultData.add(totalRides)
//
//    }
}
