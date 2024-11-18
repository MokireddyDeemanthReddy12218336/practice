package com.example.practice

import android.annotation.SuppressLint
import android.graphics.Color
import android.os.Bundle
import android.view.ContextMenu
import android.view.MenuInflater
import android.view.MenuItem
import android.view.View
import android.widget.ImageView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class contextMenu : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_context_menu)
        var j1=findViewById<ImageView>(R.id.cc)
        registerForContextMenu(j1)
    }

    override fun onCreateContextMenu(
        menu: ContextMenu?,
        v: View?,
        menuInfo: ContextMenu.ContextMenuInfo?
    ) {
        super.onCreateContextMenu(menu, v, menuInfo)
        var j2:MenuInflater =menuInflater
        j2.inflate(R.menu.context_ment,menu)
    }

    override fun onContextItemSelected(item: MenuItem): Boolean {
        var j3=findViewById<ImageView>(R.id.cc)
        return when(item.itemId){
            R.id.change_colour -> {
                j3.setColorFilter(Color.RED)
                Toast.makeText(this,"Image color changed to red",Toast.LENGTH_SHORT).show()
                true
            }
            R.id.rotate ->{
                j3.rotation =j3.rotation + 45f
                Toast.makeText(this,"Image rotated by 45 degree",Toast.LENGTH_SHORT).show()
                true
            }
            else ->return super.onContextItemSelected(item)
        }

    }
}