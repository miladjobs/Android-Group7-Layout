package com.example.group7_ui_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import android.widget.RelativeLayout
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

        val btn_burger = findViewById<ImageButton>(R.id.imageButton7)
        btn_burger.setOnClickListener {
            Toast.makeText(this@MainActivity, "You clicked burger.", Toast.LENGTH_SHORT).show()
        }
        val btn_fries = findViewById<ImageButton>(R.id.imageButton8)
        btn_fries.setOnClickListener {
            Toast.makeText(this@MainActivity, "You clicked fries.", Toast.LENGTH_SHORT).show()
        }
        val btn_pizza2 = findViewById<ImageButton>(R.id.imageButton9)
        btn_pizza2.setOnClickListener {
            Toast.makeText(this@MainActivity, "You clicked pizaa.", Toast.LENGTH_SHORT).show()
        }
        val btn_hotdog2 = findViewById<ImageButton>(R.id.imageButton10)
        btn_hotdog2.setOnClickListener {
            Toast.makeText(this@MainActivity, "You clicked hot dog.", Toast.LENGTH_SHORT).show()
        }

        val x = findViewById<ImageButton>(R.id.imageButton11)
        val y = findViewById<ImageButton>(R.id.imageButton12)
        val z = findViewById<ImageButton>(R.id.imageButton13)
        val k = findViewById<ImageButton>(R.id.imageButton14)
        x.setOnClickListener {
            x.setBackgroundResource(R.color.white)
            y.setBackgroundResource(R.color.trans)
            z.setBackgroundResource(R.color.trans)
            k.setBackgroundResource(R.color.trans)
        }

        y.setOnClickListener {
            y.setBackgroundResource(R.color.white)
            x.setBackgroundResource(R.color.trans)
            z.setBackgroundResource(R.color.trans)
            k.setBackgroundResource(R.color.trans)
        }
        z.setOnClickListener {
            z.setBackgroundResource(R.color.white)
            x.setBackgroundResource(R.color.trans)
            y.setBackgroundResource(R.color.trans)
            k.setBackgroundResource(R.color.trans)
        }
        k.setOnClickListener {
            k.setBackgroundResource(R.color.white)
            x.setBackgroundResource(R.color.trans)
            y.setBackgroundResource(R.color.trans)
            z.setBackgroundResource(R.color.trans)
        }




        val btn_show_all = findViewById<Button>(R.id.Button10)
        btn_show_all.setOnClickListener {
            Toast.makeText(this@MainActivity, "You clicked show all.", Toast.LENGTH_SHORT).show()
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

