package com.example.calendaranddateformat

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.text.DateFormat
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var c = Calendar.getInstance()
        var time = c.time

        DateFormat.getDateInstance().format(time).let { tv_currentDate.text = it }
        DateFormat.getTimeInstance().format(time).let { tv_currentTime.text = it }
        DateFormat.getDateTimeInstance().format(time).let { tv_currentDateTime.text = it }

        //c.set(Calendar.Year ,2021)
        //changes the current year to 2021
        
        c.add(Calendar.YEAR, 1)
        c.add(Calendar.MONTH, 1)
        c.add(Calendar.DAY_OF_MONTH, 1)
        c.add(Calendar.HOUR_OF_DAY, 1)
        c.add(Calendar.MINUTE, 1)
        c.add(Calendar.SECOND, 1)
        var futureTime: Date = c.time

        DateFormat.getDateTimeInstance().format(futureTime).let { tv_futureDateTime.text = it }

    }
}
