package com.example.w1ch.fragments

import android.app.Fragment
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.example.w1ch.test3ofdrawble.R

/**
 * just trying to switch between pages based on diffrent fragments instead of activities this make your app lighter hopfuly
 */

class BecomeWellKnownUser : Fragment() {


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        return inflater.inflate(R.layout.well_known_fragmnet, container, false)

    }
}
