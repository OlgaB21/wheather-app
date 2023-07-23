package com.example.wheatherapp

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class weekly_weather_item : Fragment() {

    companion object {
        fun newInstance() = weekly_weather_item()
    }

    private lateinit var viewModel: WeeklyWeatherItemViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.weekly_weather_item, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(WeeklyWeatherItemViewModel::class.java)
        // TODO: Use the ViewModel
    }

}