package com.example.roomdemo

import androidx.annotation.WorkerThread
import kotlinx.coroutines.flow.Flow

class employeeRepository(private val mdao :userDuo)
{


    val a  : Flow<List<EmployeeDetail>> = mdao.getAll()

    @WorkerThread
    suspend fun insert(detail :EmployeeDetail) {
        mdao.insert(detail)
    }
}