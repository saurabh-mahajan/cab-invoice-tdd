data class Ride(val distance : Double, val time : Int){
    companion object {
        val FARE_PER_UNIT_DISTANCE = 10.0
        val FARE_PER_UNIT_TIME = 1
    }
    fun calculateFare() : Double{
        return this.distance* FARE_PER_UNIT_DISTANCE + this.time* FARE_PER_UNIT_TIME
    }
}
