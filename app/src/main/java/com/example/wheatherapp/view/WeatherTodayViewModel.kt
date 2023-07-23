package com.example.wheatherapp.view

import androidx.lifecycle.ViewModel
import com.example.wheatherapp.R
import com.example.wheatherapp.model.HourlyWeatherModel

class WeatherTodayViewModel : ViewModel() {
    val list = listOf<HourlyWeatherModel>(
        HourlyWeatherModel("22:00", R.drawable.sun_icon, temperature = "30"),
        HourlyWeatherModel("22:00", R.drawable.sun_icon, temperature = "30"),
        HourlyWeatherModel("22:00", R.drawable.sun_icon, temperature = "30"),
        HourlyWeatherModel("22:00", R.drawable.sun_icon, temperature = "30")
    )
}