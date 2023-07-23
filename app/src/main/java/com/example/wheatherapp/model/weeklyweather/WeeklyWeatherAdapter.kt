package com.example.wheatherapp.model.weeklyweather

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.wheatherapp.R
import com.example.wheatherapp.model.WeeklyWeatherModel

class WeeklyWeatherAdapter(private val weeklyList: List<WeeklyWeatherModel>) :
    RecyclerView.Adapter<WeeklyWeatherViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WeeklyWeatherViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.weekly_weather_item, parent, false)
        return WeeklyWeatherViewHolder(view)
    }

    override fun getItemCount(): Int = weeklyList.size

    override fun onBindViewHolder(holder: WeeklyWeatherViewHolder, position: Int) {
        val item = weeklyList[position]
        holder.weekday.text = item.weekday
        holder.icon.setImageResource(item.icon)
        holder.temperature.text = item.temperature
    }
}


