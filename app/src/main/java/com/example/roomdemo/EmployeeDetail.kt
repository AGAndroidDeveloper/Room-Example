package com.example.roomdemo

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.RoomSQLiteQuery
import androidx.room.PrimaryKey


@Entity(tableName = "Employee-detail")
data class EmployeeDetail(
     @PrimaryKey(autoGenerate = true)
     val Eid :Int = 0,
     @ColumnInfo(name ="eName") val employeeName :String,
     @ColumnInfo (name ="eMailName") val employeeMail  :String

){



}
