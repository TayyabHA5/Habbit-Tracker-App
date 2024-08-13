package com.example.habbittrackerapp.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.habbittrackerapp.R
import com.example.habbittrackerapp.models.ModelRvAllHabits

class AllHabitsAdapter(private var arrAllHabits: List<ModelRvAllHabits>) : RecyclerView.Adapter<AllHabitsAdapter.ViewHolder>() {
    class ViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView){
        val cardTitle = itemView.findViewById<TextView>(R.id.allHabitsTitle)
        val cardDescription = itemView.findViewById<TextView>(R.id.allHabitsDescription)
        val cardBtnText = itemView.findViewById<TextView>(R.id.btnAllHabits)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AllHabitsAdapter.ViewHolder {
       val view = LayoutInflater.from(parent.context).inflate(R.layout.rv_allhabits_layout,parent,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: AllHabitsAdapter.ViewHolder, position: Int) {
        val currentPosition = arrAllHabits[position]
        holder.cardTitle.text = currentPosition.title
        holder.cardDescription.text = currentPosition.description
        holder.cardBtnText.text = currentPosition.buttonText

        holder.cardBtnText.setOnClickListener(){

        }
    }

    override fun getItemCount(): Int {
      return arrAllHabits.size
    }
}