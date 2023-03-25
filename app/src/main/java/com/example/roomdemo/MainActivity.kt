package com.example.roomdemo

import android.app.Application
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.lifecycleScope
import com.example.roomdemo.databinding.ActivityMainBinding
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {
    var  binding :ActivityMainBinding? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding?.root)
val empDao = (application as EmployeeApplication).Edatabase.dao()


binding?.button?.setOnClickListener {
    addDataToDataBase(empDao)
}

    }


    fun addDataToDataBase(EmployeeDa0 :userDuo){
        val name = binding?.nameText?.text.toString()
        val email = binding?.emailText?.text.toString()

        if (name.isNotEmpty() && email.isNotEmpty()){

            lifecycleScope.launch {
                EmployeeDa0.insert(EmployeeDetail( employeeName = name, employeeMail = email))
                binding?.nameText?.text?.clear()
                binding?.emailText?.text?.clear()
            }
        }
    }
}