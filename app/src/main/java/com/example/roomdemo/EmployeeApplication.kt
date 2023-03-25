package com.example.roomdemo

import android.app.Application

class EmployeeApplication : Application() {

    // Using by lazy so the database and the repository are only created when they're needed
    // rather than when the application starts

       val Edatabase by lazy{
           myDataBase.getInstance(this)
       }

}