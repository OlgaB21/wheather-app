package com.example.wheatherapp.model.hourlyweather

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.wheatherapp.R
import com.example.wheatherapp.model.HourlyWeatherModel

class HourlyWeatherAdapter(private val hourlyList: List<HourlyWeatherModel>) :
    RecyclerView.Adapter<HourlyWeatherViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HourlyWeatherViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.hourly_weather_item, parent, false)
        return HourlyWeatherViewHolder(view)
    }

    override fun getItemCount(): Int = hourlyList.size


    override fun onBindViewHolder(holder: HourlyWeatherViewHolder, position: Int) {
        val item = hourlyList[position]
        holder.hour.text = item.hour
        holder.icon.setImageResource(item.icon)
        holder.temperature.text = item.temperature
    }
}
