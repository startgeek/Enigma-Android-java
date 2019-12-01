package com.example.w1ch.fragments

import android.app.Fragment
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebSettings
import android.webkit.WebView

import com.example.w1ch.test3ofdrawble.R


import android.webkit.WebViewClient

/**
 * just trying to switch between pages based on diffrent fragments instead of activities this make your app lighter hopfuly
 */

class Guide : Fragment() {


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        //make a VIEW out of xml file
        val guide_view = inflater.inflate(R.layout.guide_fragment, container, false)

        //webView settings goes here
        //disable java if its possible to pervent hacking by XSS methods

        val mWebView = guide_view.findViewById(R.id.guidePage) as WebView
        val webSettings = mWebView.settings
        webSettings.javaScriptEnabled = true
        webSettings.setAppCacheEnabled(false)
        mWebView.setWebViewClient(WebViewClient())


        //this is the target url

        mWebView.loadUrl("http://www.careerbuilder.com/terms")



        return guide_view
    }
}
