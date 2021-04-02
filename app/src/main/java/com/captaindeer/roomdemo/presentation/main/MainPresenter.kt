package com.captaindeer.roomdemo.presentation.main

import android.content.Context
import com.captaindeer.roomdemo.data.local.ExampleDatabase
import com.captaindeer.roomdemo.data.local.entities.UserEntity

class MainPresenter(private val context: Context, private val view: MainInterface.View): MainInterface.Presenter {

    private val database = ExampleDatabase(context)

    override fun createNewUser() {
        database.dao().insert(UserEntity("Erik","Eduardo Hdez"))
    }

    override fun getAllUsers() {
        val convertList = database.dao().readUsers() as ArrayList
        view.setUpdateData(convertList)
    }


}