package com.example.wrenchlog

class VehicleRepository {

    private val vehicles = listOf(
        Vehicle(
            id = 1,
            make = "Suzuki",
            model = "GSX-R 600",
            year = 2005,
            type = VehicleType.MOTORCYCLE
        ),
        Vehicle(
            id = 2,
            make = "Skoda",
            model = "Octavia",
            year = 2019,
            type = VehicleType.CAR
        )
    )

    fun getVehicles(): List<Vehicle> = vehicles

    fun addVehicle() {

    }

    fun removeVehicle(id: Int) {

    }
}
