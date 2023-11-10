package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem

class RelativeLayoutActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_layout_relative)

        setSupportActionBar(findViewById(R.id.my_toolbar))
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        var x = false
        when (item.itemId) {
            R.id.action_linearLayout -> {
                intent = Intent(this@RelativeLayoutActivity, Prueba::class.java) // primero va la actividad en la que estes y luego a la que quieres ir
                x = true
                startActivity(intent)
            }
            else -> super.onOptionsItemSelected(item)
        }
        return x
    }
}