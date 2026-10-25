package com.example.wrenchlog

enum class VehicleType {
    MOTORCYCLE,
    CAR
}

data class Vehicle(
    val id: Int,
    val make: String,
    val model: String,
    val year: Int,
    val type: VehicleType
)
