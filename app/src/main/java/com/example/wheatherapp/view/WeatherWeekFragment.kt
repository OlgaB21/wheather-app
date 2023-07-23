package com.example.wheatherapp.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.wheatherapp.R
import com.example.wheatherapp.model.weeklyweather.WeeklyWeatherAdapter

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
        viewModel = ViewModelProvider(this)[WeatherWeekViewModel::class.java]
        // TODO: Use the ViewModel

        val recycleView = view?.findViewById<RecyclerView>(R.id.weekly_temperature_list)
        recycleView?.layoutManager =
            LinearLayoutManager(activity, LinearLayoutManager.HORIZONTAL, false)
        recycleView?.adapter = WeeklyWeatherAdapter(viewModel.list)
    }

}







