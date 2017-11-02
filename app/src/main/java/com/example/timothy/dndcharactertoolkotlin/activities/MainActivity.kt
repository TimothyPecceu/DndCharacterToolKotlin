package com.example.timothy.dndcharactertoolkotlin.activities

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.timothy.dndcharactertoolkotlin.R

class MainActivity : AppCompatActivity() {

    private lateinit var newCharacter : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        newCharacter = findViewById(R.id.new_character)

        newCharacter.setOnClickListener( {
            val i = Intent(applicationContext, NewCharacterActivity::class.java)
            startActivity(i)
        })
    }
}
