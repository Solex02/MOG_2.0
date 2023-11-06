package com.motorship_original_gallery.mog_20

import android.content.Intent
import android.os.Bundle
import android.view.MenuItem
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    private lateinit var bottomNavigationView: BottomNavigationView
    val imageView = findViewById<ImageView>(R.id.action_item1)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bottomNavigationView = findViewById(R.id.bottom_navigation)
        bottomNavigationView.setOnNavigationItemSelectedListener { item ->
            Boton(item)
            true
        }
    }

    fun Boton(item: MenuItem) {
        var intent: Intent? = null

        when (item.itemId) {
            R.id.action_item1 -> intent = Intent(this, MenuPrincipal::class.java)
            R.id.action_item2 -> intent = Intent(this, MenuPrincipal::class.java)
            R.id.action_item3 -> intent = Intent(this, MenuPrincipal::class.java)
            R.id.action_item4 -> intent = Intent(this, MenuPrincipal::class.java)
        }

        if (intent != null) {
            startActivity(intent)
        }
    }
}