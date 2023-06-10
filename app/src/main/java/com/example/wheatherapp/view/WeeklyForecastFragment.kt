package com.example.wheatherapp.view

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.wheatherapp.R
import com.example.wheatherapp.viewmodel.WeeklyForecastViewModel

class WeeklyForecastFragment : Fragment() {

    companion object {
        fun newInstance() = WeeklyForecastFragment()
    }

    private lateinit var viewModel: WeeklyForecastViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_weekly_forecast, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(WeeklyForecastViewModel::class.java)
        // TODO: Use the ViewModel
    }

}