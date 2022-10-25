package com.example.app2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.SeekBar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val seekBar = findViewById<SeekBar>(R.id.seekBar)
        val seekBar2 = findViewById<SeekBar>(R.id.seekBar2)
        val seekBar3 = findViewById<SeekBar>(R.id.seekBar3)
        val seekBar4 = findViewById<SeekBar>(R.id.seekBar4)

        val imageView = findViewById<ImageView>(R.id.image)
        val imageRed = findViewById<ImageView>(R.id.red)
        val imageGreen = findViewById<ImageView>(R.id.green)
        val imageBlue = findViewById<ImageView>(R.id.blue)


        seekBar.setOnSeekBarChangeListener(object: SeekBar.OnSeekBarChangeListener{
            override fun onProgressChanged(p0: SeekBar?, p1: Int, p2: Boolean) {
                //This is for set the opacity to progress (i.e. opacity(40%))
                imageView.imageAlpha = p1
            }

            override fun onStartTrackingTouch(p0: SeekBar?) {
//          Write your custom code (When you start the track)
            }
            override fun onStopTrackingTouch(p0: SeekBar?) {
//           Write your own custom code on stop of tracking
            }
        })

        seekBar2.setOnSeekBarChangeListener(object: SeekBar.OnSeekBarChangeListener{
            override fun onProgressChanged(p0: SeekBar?, p1: Int, p2: Boolean) {
                //This is for set the opacity to progress (i.e. opacity(40%))
                imageRed.imageAlpha = p1
            }

            override fun onStartTrackingTouch(p0: SeekBar?) {
//          Write your custom code (When you start the track)
            }
            override fun onStopTrackingTouch(p0: SeekBar?) {
//           Write your own custom code on stop of tracking
            }
        })

        seekBar3.setOnSeekBarChangeListener(object: SeekBar.OnSeekBarChangeListener{
            override fun onProgressChanged(p0: SeekBar?, p1: Int, p2: Boolean) {
                //This is for set the opacity to progress (i.e. opacity(40%))
                imageGreen.imageAlpha = p1
            }

            override fun onStartTrackingTouch(p0: SeekBar?) {
//          Write your custom code (When you start the track)
            }
            override fun onStopTrackingTouch(p0: SeekBar?) {
//           Write your own custom code on stop of tracking
            }
        })

        seekBar4.setOnSeekBarChangeListener(object: SeekBar.OnSeekBarChangeListener{
            override fun onProgressChanged(p0: SeekBar?, p1: Int, p2: Boolean) {
                //This is for set the opacity to progress (i.e. opacity(40%))
                imageBlue.imageAlpha = p1
            }

            override fun onStartTrackingTouch(p0: SeekBar?) {
//          Write your custom code (When you start the track)
            }
            override fun onStopTrackingTouch(p0: SeekBar?) {
//           Write your own custom code on stop of tracking
            }
        })
    }
}