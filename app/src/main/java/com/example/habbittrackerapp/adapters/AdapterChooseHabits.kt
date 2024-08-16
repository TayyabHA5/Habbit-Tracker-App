package com.example.habbittrackerapp.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.habbittrackerapp.R
import com.example.habbittrackerapp.models.ModelChooseHabit
import com.google.android.material.card.MaterialCardView

class AdapterChooseHabits(private var arrChoosehabits: List<ModelChooseHabit>) : RecyclerView.Adapter<AdapterChooseHabits.ViewHolder>() {

    private val selectedItems = mutableListOf<Int>() // To track selected item positions

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val img: ImageView = itemView.findViewById(R.id.ivChooseHabitsRv)
        val title: TextView = itemView.findViewById(R.id.tvChooseHabitRv)
        val chooseItemLayout: MaterialCardView = itemView.findViewById(R.id.rvChooseItemLayout)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AdapterChooseHabits.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.rv_choosehabit_layout, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: AdapterChooseHabits.ViewHolder, position: Int) {
        val currentPosition = arrChoosehabits[position]
        holder.img.setImageResource(currentPosition.img)
        holder.title.text = currentPosition.title




    }

    override fun getItemCount(): Int {
        return arrChoosehabits.size
    }

}
