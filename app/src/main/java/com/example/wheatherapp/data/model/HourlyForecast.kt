package com.example.wheatherapp.data.model

import android.icu.util.TimeUnit

data class HourlyForecast(
    val time: TimeUnit,
    val temperature: Long
)
