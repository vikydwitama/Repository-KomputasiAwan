package com.example.myapplication

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import org.jetbrains.anko.*

class SecondActivity : AppCompatActivity() {

    private var name: String = ""
    lateinit var nameTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        verticalLayout{
            backgroundColor = ContextCompat.getColor(context, R.color.teal_200)
            padding = dip(16)
            nameTextView = textView()
        }

        val intent = intent
        name = intent.getStringExtra("name").toString()
        nameTextView.text = name
    }
}
