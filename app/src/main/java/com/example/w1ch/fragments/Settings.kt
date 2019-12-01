package com.example.w1ch.fragments

import android.app.Fragment
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.example.w1ch.test3ofdrawble.R

/**
 * Created by wtch on 2/24/18.
 */

class Settings : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View {


        return inflater.inflate(R.layout.fragment_settings, container, false)
    }

}
