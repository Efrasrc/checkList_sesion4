package com.example.etext

import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.RadioButton
import android.widget.RadioGroup
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.etext.ui.theme.ETextTheme

class MainActivity : ComponentActivity() {

    lateinit var bton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        val myButton = findViewById<Button>(R.id.btn)

        val checkbox = findViewById<CheckBox>(R.id.verify)
        checkbox.setOnCheckedChangeListener { buttonView, isChecked ->

            if (isChecked) {
               // myButton.isEnabled = true

            } else {
               // myButton.isEnabled = false
            }}

        val radioGroup = findViewById<RadioGroup>(R.id.radioGroup)
        val radioButton1 = findViewById<RadioButton>(R.id.radioB1)
        val radioButton2 = findViewById<RadioButton>(R.id.radioB2)
        val radioButton3 = findViewById<RadioButton>(R.id.radioB3)
        val radioButton4 = findViewById<RadioButton>(R.id.radioB4)

            myButton.isEnabled = false

        radioGroup.setOnCheckedChangeListener {_, checkedId ->
            when (checkedId) {
            R.id.radioB1 -> {
                myButton.isEnabled = false
            } R.id.radioB2 -> {
                myButton.isEnabled = true
            } R.id.radioB3 -> {
                myButton.isEnabled = false
            } R.id.radioB4 -> {
                myButton.isEnabled = false
            }
        }






        }


        //bton  = findViewById<Button>(R.id.btn)


    }
}
