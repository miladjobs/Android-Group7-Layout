package com.example.group7_ui_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btn_hotdog = findViewById<ImageButton>(R.id.imageButton3)
        btn_hotdog.setOnClickListener{
            Toast.makeText(this@MainActivity, "You clicked hot dog.", Toast.LENGTH_SHORT).show()
        }
        val btn_sushi = findViewById<ImageButton>(R.id.imageButton4)
        btn_sushi.setOnClickListener {
            Toast.makeText(this@MainActivity, "You clicked sushi.", Toast.LENGTH_SHORT).show()
        }
        val btn_pizza = findViewById<ImageButton>(R.id.imageButton5)
        btn_pizza.setOnClickListener {
            Toast.makeText(this@MainActivity, "You clicked pizza.", Toast.LENGTH_SHORT).show()
        }
        val btn_more = findViewById<ImageButton>(R.id.imageButton6)
        btn_more.setOnClickListener {
            Toast.makeText(this@MainActivity, "You clicked more.", Toast.LENGTH_SHORT).show()
        }
    }

    override fun onWindowFocusChanged(hasFocus: Boolean) {
        super.onWindowFocusChanged(hasFocus)
        if (hasFocus) hideSystemUI()
    }

    private fun hideSystemUI() {
        // Enables regular immersive mode.
        // For "lean back" mode, remove SYSTEM_UI_FLAG_IMMERSIVE.
        // Or for "sticky immersive," replace it with SYSTEM_UI_FLAG_IMMERSIVE_STICKY
        window.decorView.systemUiVisibility = (View.SYSTEM_UI_FLAG_IMMERSIVE
                // Set the content to appear under the system bars so that the
                // content doesn't resize when the system bars hide and show.
                or View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                or View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                or View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
                // Hide the nav bar and status bar
                or View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
                or View.SYSTEM_UI_FLAG_FULLSCREEN)
    }

    // Shows the system bars by removing all the flags
// except for the ones that make the content appear under the system bars.
    private fun showSystemUI() {
        window.decorView.systemUiVisibility = (View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                or View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
                or View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN)
    }


}

