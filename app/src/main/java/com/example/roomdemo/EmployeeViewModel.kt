package com.example.roomdemo

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData

class EmployeeViewModel(private val mrepository :employeeRepository): ViewModel() {


    val allWords: LiveData<List<EmployeeDetail>> = mrepository.a.asLiveData()

}