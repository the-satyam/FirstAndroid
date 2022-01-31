package com.example.firstandroid


import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView


class RecyclerActivity : AppCompatActivity() {
    var countries = arrayOf("Russia", "Ukraine", "UK", "Germany", "US", "China") //data = plug

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler)
        val countriesRecyclerView = findViewById<RecyclerView>(R.id.countriesRview)
    }
}