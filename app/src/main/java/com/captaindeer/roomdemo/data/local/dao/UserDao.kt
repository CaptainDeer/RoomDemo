package com.captaindeer.roomdemo.data.local.dao

import androidx.room.*
import com.captaindeer.roomdemo.data.local.entities.UserEntity

@Dao
interface UserDao {

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    fun insert(user: UserEntity)

    @Update(onConflict = OnConflictStrategy.REPLACE)
    fun update(user: UserEntity)

    @Delete
    fun delete(user: UserEntity)

    @Query(value = "select * from user")
    fun readUsers(): List<UserEntity>

}