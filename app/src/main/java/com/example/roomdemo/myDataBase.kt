package com.example.roomdemo

import android.content.Context
import androidx.room.Dao
import androidx.room.Database
import androidx.room.Entity
import androidx.room.Room
import androidx.room.RoomDatabase


@Database(entities = [Entity::class], version = 1)
abstract class myDataBase  :RoomDatabase(){

abstract fun dao() : userDuo



companion object{
    // Singleton prevents multiple instances of database opening at the
    // same time.
     @Volatile
    private var minstance :myDataBase? = null

    fun getInstance(context :Context)  :myDataBase{

        // if the INSTANCE is not null, then return it,
        // if it is, then create the database

          return minstance ?:synchronized(this) {
            val instance = Room.databaseBuilder(context.applicationContext ,
                myDataBase::class.java, "Employee_database").fallbackToDestructiveMigration().build()


            minstance = instance
            instance
        }



    }


}


     }