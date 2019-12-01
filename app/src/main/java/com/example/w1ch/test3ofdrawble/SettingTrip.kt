package com.example.w1ch.test3ofdrawble


import android.app.DatePickerDialog
import android.app.TimePickerDialog
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.DatePicker
import kotlinx.android.synthetic.main.activity_setting_trip.*
import java.util.*
import javax.xml.datatype.DatatypeConstants.MONTHS

class SettingTrip : AppCompatActivity(){





    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
  setContentView(R.layout.activity_setting_trip)

timedatebutton.text =getString(com.example.w1ch.test3ofdrawble.R.string.timeDateBTN)
        val c = Calendar.getInstance()
        val year = c.get(Calendar.YEAR)
        val month = c.get(Calendar.MONTH)
        val day = c.get(Calendar.DAY_OF_MONTH)
        val hourofday = c.get(Calendar.HOUR_OF_DAY)
        val minute = c.get(Calendar.MINUTE)
timedatebutton.setOnClickListener {

        val dpd = DatePickerDialog(this, DatePickerDialog.OnDateSetListener { view, year, monthOfYear, dayOfMonth ->


             TimePickerDialog(this,TimePickerDialog.OnTimeSetListener { view, hourOfDay, minute ->
                // Display Selected date in textbox
                timedatebutton.setText("day:" + dayOfMonth + "month:" + month + "year: " + year + "hour"+ hourofday + "minute" + minute )
            },hourofday,minute,true).show()
        }, year, month, day)
        dpd.show()}


    }


}
