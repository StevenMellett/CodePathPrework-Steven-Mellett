package com.example.helloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout

var userInputText = String()

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.TextChangeButton).setOnClickListener {

            findViewById<TextView>(R.id.textView2).setTextColor(getResources().getColor(R.color.SRed))
            Log.i("Button", "ButtonPressed")
        }
        findViewById<Button>(R.id.BgChangeButton).setOnClickListener {
            findViewById<ConstraintLayout>(R.id.appReference).setBackgroundColor(getResources().getColor(R.color.purple_200))
        }
        findViewById<ConstraintLayout>(R.id.appReference).setOnClickListener {
            findViewById<TextView>(R.id.textView2).setTextColor(getResources().getColor(R.color.SGreen))
            findViewById<ConstraintLayout>(R.id.appReference).setBackgroundColor(getResources().getColor(R.color.SBackGround))
            findViewById<TextView>(R.id.textView2).setText(getResources().getText(R.string.HelloWorld))
        }
        findViewById<Button>(R.id.vtextChangeButton).setOnClickListener {
            findViewById<TextView>(R.id.textView2).setText(getResources().getText(R.string.android))
        }
        findViewById<Button>(R.id.labelViewChange).setOnClickListener {
            val userInputText = findViewById<EditText>(R.id.textView2).getText()
            findViewById<EditText>(R.id.textView2).setText(userInputText)

        }
    }
}