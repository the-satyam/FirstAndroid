package com.example.firstandroid

import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView


class CountriesAdapter : RecyclerView.Adapter<CountriesAdapter.CountriesViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CountriesViewHolder {
        return null
    }

    override fun onBindViewHolder(holder: CountriesViewHolder, position: Int) {}

    override fun getItemCount(): Int {
        return 0
    }

    class CountriesViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)

}