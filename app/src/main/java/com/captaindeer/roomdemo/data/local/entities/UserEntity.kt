package com.captaindeer.roomdemo.data.local.entities

import android.graphics.Bitmap
import androidx.annotation.NonNull
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "user")
class UserEntity (
    @ColumnInfo (name = "name") @NonNull val name: String,
    @ColumnInfo (name = "lastName") @NonNull val lastName: String
 //   @ColumnInfo (name = "pp") @NonNull val pp: Bitmap
        ){
    @PrimaryKey(autoGenerate = true)
    var id: Int = 0
}