package com.example.wheatherapp.model.weeklyweather

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.wheatherapp.R

class WeeklyWeatherViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
    val weekday: TextView =itemView.findViewById(R.id.weekday)
    val icon: ImageView = itemView.findViewById(R.id.weekly_icon)
    val temperature: TextView = itemView.findViewById(R.id.temperature)
}

