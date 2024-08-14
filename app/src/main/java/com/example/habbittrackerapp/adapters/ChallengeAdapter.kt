package com.example.habbittrackerapp.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.habbittrackerapp.R
import com.example.habbittrackerapp.models.ModelChallenge

class ChallengeAdapter(private var arrChallenge: List<ModelChallenge>) : RecyclerView.Adapter<ChallengeAdapter.ViewHolder>() {
    class ViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView){
        val cardTitle = itemView.findViewById<TextView>(R.id.rvChallengeTitle)
        val cardDescription = itemView.findViewById<TextView>(R.id.rvChallengeDescription)
        val cardBtnText = itemView.findViewById<TextView>(R.id.rvChallengeBtn)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ChallengeAdapter.ViewHolder {
       val view = LayoutInflater.from(parent.context).inflate(R.layout.rv_challenge_layout,parent,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ChallengeAdapter.ViewHolder, position: Int) {
        val currentPosition = arrChallenge[position]
        holder.cardTitle.text = currentPosition.title
        holder.cardDescription.text = currentPosition.description
        holder.cardBtnText.text = currentPosition.buttonText

        holder.cardBtnText.setOnClickListener(){

        }
    }

    override fun getItemCount(): Int {
      return arrChallenge.size
    }
}