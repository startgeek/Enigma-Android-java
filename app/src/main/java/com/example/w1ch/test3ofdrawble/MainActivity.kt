package com.example.w1ch.test3ofdrawble

import android.content.Intent
import android.os.Bundle
import android.support.design.widget.FloatingActionButton
import android.support.design.widget.Snackbar
import android.view.View
import android.support.design.widget.NavigationView
import android.support.v4.view.GravityCompat
import android.support.v4.widget.DrawerLayout
import android.support.v7.app.ActionBarDrawerToggle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.Toolbar
import android.view.Menu
import android.view.MenuItem


import com.example.w1ch.fragments.BecomeWellKnownUser
import com.example.w1ch.fragments.ContactUs
import com.example.w1ch.fragments.Guide
import com.example.w1ch.fragments.LoginFragment
import com.example.w1ch.fragments.News
import com.example.w1ch.fragments.Settings
import com.example.w1ch.fragments.TripFragment


class MainActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {


    //private Button mSettingButton;

    override fun onCreate(savedInstanceState: Bundle?) {


        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val toolbar = findViewById(R.id.toolbar) as Toolbar
        setSupportActionBar(toolbar)

        val fab = findViewById(R.id.fab) as FloatingActionButton
        fab.setOnClickListener { view ->
            Snackbar.make(view, R.string.noNewMesseges, Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show()
        }

        val drawer = findViewById(R.id.drawer_layout) as DrawerLayout
        val toggle = ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close)
        drawer.setDrawerListener(toggle)
        toggle.syncState()

        val navigationView = findViewById(R.id.nav_view) as NavigationView
        navigationView.setNavigationItemSelectedListener(this)
        //
        //mSettingButton = (Button) findViewById(R.id.action_settings);
        //mSettingButton.setOnClickListener(new View.OnClickListener(){
        //    @Override
        //    public void onClick(View v){
        //        Toast.makeText(MainActivity.this,R.string.melliID,Toast.LENGTH_LONG).show();
        //    }
        //});


    }


    override fun onBackPressed() {
        val drawer = findViewById(R.id.drawer_layout) as DrawerLayout
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START)
        } else {
            super.onBackPressed()
        }


    }


    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.main, menu)
        return true
    }


    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        val id = item.itemId


        if (id == R.id.action_settings) {
            val fm = fragmentManager
            fm.beginTransaction().replace(R.id.content_main, Settings()).commit()
        }

        return super.onOptionsItemSelected(item)
    }


    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        // Handle navigation view item clicks here.
        val id = item.itemId
        val fm = fragmentManager
        if (id == R.id.my_trips) {

            fm.beginTransaction().replace(R.id.content_main, TripFragment()).commit()

        } else if (id == R.id.my_account) {


            fm.beginTransaction().replace(R.id.content_main, LoginFragment()).commit()


        } else if (id == R.id.become_well_known_user) {


            fm.beginTransaction().replace(R.id.content_main, BecomeWellKnownUser()).commit()


        } else if (id == R.id.guide) {


            fm.beginTransaction().replace(R.id.content_main, Guide()).commit()


        } else if (id == R.id.news) {


            fm.beginTransaction().replace(R.id.content_main, News()).commit()

        } else if (id == R.id.contact_us) {


            fm.beginTransaction().replace(R.id.content_main, ContactUs()).commit()

        }

        val drawer = findViewById(R.id.drawer_layout) as DrawerLayout
        drawer.closeDrawer(GravityCompat.START)
        return true
    }


    fun runFirstMap(view: View?) {

        val intent = Intent(this, MapsActivity::class.java)

        val answer_of_first_trip = 1

        intent.putExtra("number_of_trp", "1")

        startActivityForResult(intent, answer_of_first_trip)


    }


}
