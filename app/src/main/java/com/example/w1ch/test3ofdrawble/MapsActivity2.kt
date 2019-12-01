package com.example.w1ch.test3ofdrawble

import android.content.Intent
import android.support.v4.app.FragmentActivity
import android.os.Bundle
import android.view.View

import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions

class MapsActivity2 : FragmentActivity(), OnMapReadyCallback {

    private var mMap: GoogleMap? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_maps2)
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.
        val mapFragment = supportFragmentManager
                .findFragmentById(R.id.map) as SupportMapFragment
        mapFragment.getMapAsync(this)
    }


    /**
     * Manipulates the map once available.
     * This callback is triggered when the map is ready to be used.
     * This is where we can add markers or lines, add listeners or move the camera. In this case,
     * we just add a marker near Sydney, Australia.
     * If Google Play services is not installed on the device, the user will be prompted to install
     * it inside the SupportMapFragment. This method will only be triggered once the user has
     * installed Google Play services and returned to the app.
     */
    override fun onMapReady(googleMap: GoogleMap) {
        mMap = googleMap
        // this one default view is azadi tower why? I HAVE NO FUCKING IDEA
        // we can change this by adding a setting for user
        mMap!!.moveCamera(CameraUpdateFactory.newLatLngZoom(LatLng(35.6997326, 51.3358963), 13.0f))
    }

    fun TakeMeToSchuldeFragment(view: View) {

        //all of the infos should pass here

        val to_setting_trip_intent = Intent(this, SettingTrip::class.java)

        val answer_of_first_trip = 1

        to_setting_trip_intent.putExtra("number_of_trp", "1")

        startActivityForResult(to_setting_trip_intent, answer_of_first_trip)

    }


}
