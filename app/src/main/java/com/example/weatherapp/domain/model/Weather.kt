package com.example.weatherapp.domain.model

data class Weather(
    val cityName: String,
    val country: String,
    val temperature: Double,
    val feelsLike: Double,
    val tempMin: Double,
    val tempMax: Double,
    val humidity: Int,
    val pressure: Int,
    val windSpeed: Double,
    val description: String,
    val icon: String,
    val visibility: Int,
    val sunrise: Long,
    val sunset: Long
)

data class ForecastDay(
    val date: String,
    val tempMin: Double,
    val tempMax: Double,
    val description: String,
    val icon: String,
    val humidity: Int,
    val windSpeed: Double
)
