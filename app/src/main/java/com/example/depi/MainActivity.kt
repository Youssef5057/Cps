package com.example.depi

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    //init global variables
    lateinit var  text:TextView
    lateinit var button:Button
    lateinit var button2:Button
    lateinit var reset:Button
    var y=0
    var temp=""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        text=findViewById(R.id.text1)
        button=findViewById(R.id.button)
        button2=findViewById(R.id.button2)
        reset=findViewById(R.id.reset)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        var y=0
        var temp=y.toString()
        button.setOnClickListener {
         RightClick()
        }

        button2.setOnClickListener {
            LeftClick()
        }

        reset.setOnClickListener{
            reset()

            }
    }

    fun RightClick(){
        y-=1
        temp=y.toString()
        text.text=temp
        //button.setBackgroundColor(4)
    }

    fun LeftClick(){
        y+=1
        temp=y.toString()
        text.text=temp

        //button2.setBackgroundColor(10)

    }

    fun reset(){
        y=0
        temp=y.toString()
        text.text=temp

    }




}