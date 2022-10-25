package com.example.checkbox

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.CheckBox
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mariaImage: ImageView = findViewById(R.id.imageView)
        val wojtekImage: ImageView = findViewById(R.id.imageView2)
        val kacperImage: ImageView = findViewById(R.id.imageView3)
        val stasiuImage: ImageView = findViewById(R.id.imageView4)
        val georgeImage: ImageView = findViewById(R.id.imageView5)
        val agataImage: ImageView = findViewById(R.id.imageView6)
        val ashleyImage: ImageView = findViewById(R.id.imageView7)
        val sebaImage: ImageView = findViewById(R.id.imageView8)
        val karolinaImage: ImageView = findViewById(R.id.imageView9)
        val kamilImage: ImageView = findViewById(R.id.imageView10)

        val maria: CheckBox = findViewById(R.id.av0Check)
        val wojtek: CheckBox = findViewById(R.id.av1Check)
        val kacper: CheckBox = findViewById(R.id.av2Check)
        val stasiu: CheckBox = findViewById(R.id.av3Check)
        val george: CheckBox = findViewById(R.id.av4Check)
        val agata: CheckBox = findViewById(R.id.av5Check)
        val ashley: CheckBox = findViewById(R.id.av6Check)
        val seba: CheckBox = findViewById(R.id.av7Check)
        val karolina: CheckBox = findViewById(R.id.av8Check)
        val kamil: CheckBox = findViewById(R.id.av9Check)

        mariaImage.isActivated = true

        maria.setOnClickListener()
        {
            if (maria.isChecked)
            {
                mariaImage.visibility = View.VISIBLE
            }
            else
            {
                mariaImage.setVisibility(View.INVISIBLE)
            }
        }
        if(wojtek.isChecked)
        {
            wojtekImage.isActivated = true
        }
        if(kacper.isChecked)
        {
            kacperImage.isActivated = true
        }
        if(stasiu.isChecked)
        {
            stasiuImage.isActivated = true
        }
        if(george.isChecked)
        {
            georgeImage.isActivated = true
        }
        if(agata.isChecked)
        {
            agataImage.isActivated = true
        }
        if(ashley.isChecked)
        {
            ashleyImage.isActivated = true
        }
        if(seba.isChecked)
        {
            sebaImage.isActivated = true
        }
        if(karolina.isChecked)
        {
            karolinaImage.isActivated = true
        }
        if(kamil.isChecked)
        {
            kamilImage.isActivated = true
        }
    }
}