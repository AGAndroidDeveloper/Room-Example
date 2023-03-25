package com.example.roomdemo

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.recyclerview.widget.RecyclerView

class customAdapter( private val context :Context,val dataList :ArrayList<EmployeeDetail>) :
    RecyclerView.Adapter<customAdapter.customHolder>() {



    class customHolder(view: View) :RecyclerView.ViewHolder(view) {
        val eName :TextView = view.findViewById(R.id.name_)
        val eMail :TextView = view.findViewById(R.id.email_)


    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): customHolder {
       val holder = LayoutInflater.from(context).inflate(R.layout.exercise_data,parent,false)
        return customHolder(holder)
    }

    override fun getItemCount(): Int {
       return dataList.size
    }

    override fun onBindViewHolder(holder: customHolder, position: Int) {
     val data12 = dataList[position]
       holder.eName.text =  data12.employeeName
        holder.eMail.text = data12.employeeMail
    }


}