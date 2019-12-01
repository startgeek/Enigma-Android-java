package com.example.w1ch.test3ofdrawble

import android.content.Intent
import android.support.v4.app.FragmentActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast

import com.google.android.gms.maps.CameraUpdate
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.GoogleMap
import com.google.android.gms.maps.OnMapReadyCallback
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.MarkerOptions

class MapsActivity : FragmentActivity(), OnMapReadyCallback {

    private var mMap: GoogleMap? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_maps)


        //start of my shit


        //get info from trip activity
        // Intent intent_of_getting_infos_of_trip_activity = getIntent();
        // String trip_one_activity = (String)intent_of_getting_infos_of_trip_activity.getExtras().getString("number_of_trp");
        //  String number_of_trip = trip_one_activity;
        //return info(src and destination of trip to trip activity)
        //Intent return_to_trips_and_send_my_data_to_it = getIntent();

        //return_to_trips_and_send_my_data_to_it.putExtra("src", "source_of_trip");
        // return_to_trips_and_send_my_data_to_it.putExtra("dst", "destination_of_trip");

        //setResult(RESULT_OK,return_to_trips_and_send_my_data_to_it);
        // Obtain the SupportMapFragment and get notified when the map is ready to be used.

        //end of my shit


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


        //this is milad tower lat lon 35.7448416,51.3731325 our default view when map loads
        // Add a marker in Sydney and move the camera
        // LatLng milad_tower = new LatLng(35.7448, 51.3731);

        mMap!!.moveCamera(CameraUpdateFactory.newLatLngZoom(LatLng(35.7448, 51.3731), 13.0f))


        //now let user add two markers a src and a dst


        /*   googleMap.setOnMapClickListener(new GoogleMap.OnMapClickListener() {

            @Override
            public void onMapClick(LatLng point) {
                try{
                MarkerOptions marker = new MarkerOptions()
                        .position(new LatLng(point.latitude, point.longitude))
                        .title("here's your source");
                googleMap.addMarker(marker);
                System.out.println(point.latitude + "---" + point.longitude);
            }try {
                    MarkerOptions marker = new MarkerOptions()
                            .position(new LatLng(point.latitude, point.longitude))
                            .title("here's your destination");
                    googleMap.addMarker(marker);
                    System.out.println(point.latitude + "---" + point.longitude);
                }else(){
                    Toast.makeText("you already set your trip",Toast.LENGTH_LONG);
                }
                }
        });*/
    }


    fun TakeMeToSecondMap(view: View) {

        //all of the infos should pass here

        val to_second_map_intent = Intent(this, MapsActivity2::class.java)

        val answer_of_first_trip = 1

        to_second_map_intent.putExtra("number_of_trp", "1")

        startActivityForResult(to_second_map_intent, answer_of_first_trip)

    }


}
