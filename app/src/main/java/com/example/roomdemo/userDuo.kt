package com.example.roomdemo

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import kotlinx.coroutines.flow.Flow


@Dao
interface userDuo {

    @Query("SELECT * FROM  'EmployeeDetail'")
    fun getAll() : Flow<List<EmployeeDetail>>

    @Query("SELECT * FROM 'EmployeeDetail' Where Eid  = :id")
    fun getEmployeeById(id :Int) : EmployeeDetail

    @Delete
    suspend fun delete(EmployeeDetail:EmployeeDetail)

    @Update
    suspend fun update(EmployeeDetail:EmployeeDetail)

    @Insert
    suspend fun insert(EmployeeDetail :EmployeeDetail)
}