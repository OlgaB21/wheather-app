package com.example.wheatherapp.model.hourlyweather

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.wheatherapp.R

class HourlyWeatherViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    val hour: TextView = itemView.findViewById(R.id.hour)
    val icon: ImageView = itemView.findViewById(R.id.hourly_icon)
    val temperature: TextView = itemView.findViewById(R.id.temperature)
}