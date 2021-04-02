package com.captaindeer.roomdemo.presentation.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Adapter
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.captaindeer.roomdemo.R
import com.captaindeer.roomdemo.data.local.entities.UserEntity
import com.captaindeer.roomdemo.presentation.adapters.MainAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), MainInterface.View {

    private var presenter: MainPresenter? = null
    private var adapter: MainAdapter? = null
    private var users = arrayListOf<UserEntity>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        presenter = MainPresenter(this,this)
        adapter = MainAdapter(users)
        main_rv.setHasFixedSize(true)
        main_rv.layoutManager = LinearLayoutManager(this)
        main_rv.adapter = adapter

       // presenter!!.createNewUser()
        presenter!!.getAllUsers()
    }

    override fun onSuccess() {

    }

    override fun onError(msg: String) {
    }

    override fun setUpdateData(users: ArrayList<UserEntity>) {
        adapter!!.updateData(users)
    }
}