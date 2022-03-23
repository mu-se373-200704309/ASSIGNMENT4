package com.example.assignment4

import android.app.DatePickerDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import java.util.*

class MainActivity : AppCompatActivity() {

    val calendar = Calendar.getInstance()
    var year = calendar.get(Calendar.YEAR)
    var month = calendar.get(Calendar.MONTH)
    var day = calendar.get(Calendar.DAY_OF_MONTH)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun start(view: View){
        val textView = findViewById<TextView>(R.id.textView)
        val datePickerDialog = DatePickerDialog.OnDateSetListener { datePicker, y, m, d ->
            this.year = y
            this.month = m+1
            this.day = d

            textView.setText(""+day+"."+month+"."+year)
        }
        val dpd = DatePickerDialog(this,datePickerDialog,year,month,day)
        dpd.show()
    }
}
