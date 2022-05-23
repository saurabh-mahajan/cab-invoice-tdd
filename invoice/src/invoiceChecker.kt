class cabInvoiceCalculate {
    companion object {
        val FARE_PER_UNIT_DISTANCE = 10.0
        val FARE_PER_UNIT_TIME = 1
    }
    fun fairCalculate(Distance : Double, Time : Int): Double {

        return Distance * FARE_PER_UNIT_DISTANCE + Time * FARE_PER_UNIT_TIME
    }
    fun fair(rides : Ride) : Double {
        val (dis,time) = rides
        return dis * FARE_PER_UNIT_DISTANCE + time * FARE_PER_UNIT_TIME
    }
}
