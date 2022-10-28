package com.example.inf04

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /************************************************************************************
         * nazwa funkcji:       bttConfirmOnClick
         * parametry wejściowe:
         * wartość zwracacane:  tekst informujący użytkownika o logowaniu zwracany do labela
         * autor:               Dejwa Kubanek
         */
        findViewById<Button>(R.id.bttConfirm).setOnClickListener {

            val sMail = findViewById<EditText>(R.id.txtMail).text.toString()
            val sPass = findViewById<EditText>(R.id.txtPass).text.toString()
            val sPassRep = findViewById<EditText>(R.id.txtPassRep).text.toString()

            if (sPass == sPassRep){
                findViewById<TextView>(R.id.lblOutput).text = "Witaj " + sMail
            }else{
                findViewById<TextView>(R.id.lblOutput).text = "Hasła się różnią"
            }

        }
    }
}