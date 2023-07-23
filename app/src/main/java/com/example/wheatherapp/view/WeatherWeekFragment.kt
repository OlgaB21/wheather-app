package com.example.wheatherapp.view

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.wheatherapp.R

class WeatherWeekFragment : Fragment() {

    companion object {
        fun newInstance() = WeatherWeekFragment()
    }

    private lateinit var viewModel: WeatherWeekViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_weather_week, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(WeatherWeekViewModel::class.java)
        // TODO: Use the ViewModel
    }

}