package com.example.myapplication

import android.content.res.Resources
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val imageCarousel : ImageView = findViewById(R.id.imageCarousel)
        val changeImageButton : Button = findViewById(R.id.changeImageButton)
        val imageList : IntArray = intArrayOf(
            R.drawable.hocus_pocus,
            R.drawable.summerween,
            R.drawable.scardeypants,
            R.drawable.girl_vs_monster)
        var count: Int = 0;
        changeImageButton.setOnClickListener {
            count++;
            imageCarousel.setImageResource(imageList.get(count))
            if(count == 3){
                count = 0
            }
        }
    }
}