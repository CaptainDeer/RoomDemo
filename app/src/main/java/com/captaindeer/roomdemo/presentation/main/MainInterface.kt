package com.captaindeer.roomdemo.presentation.main

import com.captaindeer.roomdemo.data.local.entities.UserEntity

interface MainInterface {

    interface Presenter{
        fun createNewUser()
        fun getAllUsers()
    }

    interface View {
        fun onSuccess()
        fun onError(msg:String)
        fun setUpdateData(users: ArrayList<UserEntity>)
    }

}