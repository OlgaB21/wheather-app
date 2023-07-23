package com.example.wheatherapp.view

import androidx.lifecycle.ViewModel
import com.example.wheatherapp.R
import com.example.wheatherapp.model.WeeklyWeatherModel

class WeatherWeekViewModel : ViewModel() {
    val list = listOf<WeeklyWeatherModel>(
        WeeklyWeatherModel("Monday", R.drawable.cloud_icon, temperature = "10"),
        WeeklyWeatherModel("Monday", R.drawable.sun_icon, temperature = "29"),
        WeeklyWeatherModel("Monday", R.drawable.cloud_icon, temperature = "10"),
        WeeklyWeatherModel("Monday", R.drawable.sun_icon, temperature = "29")
    )
}
