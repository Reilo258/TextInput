package com.example.textinput

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.btnok).setOnClickListener {
            if(findViewById<TextInputEditText>(R.id.imieinput).text.toString() == "" || findViewById<TextInputEditText>(R.id.nazwiskoinput).text.toString() == "")
                findViewById<TextView>(R.id.wyniktext).text = "Wypełnij wszystkiepola";
            else
                findViewById<TextView>(R.id.wyniktext).text = "Dane poprawne";
        }
    }
}