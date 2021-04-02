package com.captaindeer.roomdemo.presentation.adapters.viewHolder

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.captaindeer.roomdemo.R

class MainViewHolder(view: View) : RecyclerView.ViewHolder(view) {

    val name = view.findViewById(R.id.home_tvName) as TextView
    val lastName = view.findViewById(R.id.home_tvLastName) as TextView

}