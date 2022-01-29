package com.example.firstandroid

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
    }

    fun sendHandle(view: android.view.View) {
        Toast.makeText(this, "Sending data", Toast.LENGTH_SHORT).show()
        var intent: Intent    //kotlin says you can't have a variable as null
        intent = Intent(this,MainActivity::class.java)  //no need to give the word new
        startActivity(intent)
    }
}