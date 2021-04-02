package com.captaindeer.roomdemo.presentation.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.captaindeer.roomdemo.R
import com.captaindeer.roomdemo.data.local.entities.UserEntity
import com.captaindeer.roomdemo.presentation.adapters.viewHolder.MainViewHolder

class MainAdapter(private var users: ArrayList<UserEntity>) : RecyclerView.Adapter<MainViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainViewHolder {
        return MainViewHolder(
            LayoutInflater.from(parent.context)
                .inflate(R.layout.dni_fragment,parent,false)
        )
    }

    override fun onBindViewHolder(holder: MainViewHolder, position: Int) {
        val user = users[position]
        holder.name.text = user.name
        holder.lastName.text = user.lastName
    }

    override fun getItemCount(): Int = users.size

    fun updateData(users: ArrayList<UserEntity>){
        this.users = users
        notifyDataSetChanged()
    }
}