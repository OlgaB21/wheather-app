package com.example.wheatherapp.model

import java.time.DayOfWeek

data class WeeklyWeatherModel(
    val dayOfWeek: DayOfWeek,
    val icon: Int,
    val temperature: String
)
