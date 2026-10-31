package com.example.wrenchlog

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

class GarageViewModel : ViewModel() {

    var vehicles by mutableStateOf(
        listOf(
            Vehicle(
                id = 1,
                make = "Suzuki",
                model = "GSX-R 600",
                year = 2015,
                type = VehicleType.MOTORCYCLE
            ),
            Vehicle(
                id = 2,
                make = "Volvo",
                model = "V70",
                year = 2012,
                type = VehicleType.CAR
            )
        )
    )
        private set

    fun addVehicle(vehicle: Vehicle) {
        vehicles = vehicles + vehicle
    }
}