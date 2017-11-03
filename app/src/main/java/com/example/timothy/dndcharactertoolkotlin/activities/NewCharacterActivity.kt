package com.example.timothy.dndcharactertoolkotlin.activities

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import com.example.timothy.dndcharactertoolkotlin.R
import com.example.timothy.dndcharactertoolkotlin.data.tables.Class
import com.example.timothy.dndcharactertoolkotlin.data.tables.Class_Table
import com.raizlabs.android.dbflow.kotlinextensions.*

class NewCharacterActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_new_character)

        val names : List<String?> =(
                    select from Class::class
                    where Class_Table.type.`like`("%base%")
                    orderBy Class_Table.name.asc()
                ).list.map { c -> c.name }

        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, names)

        val list : ListView = findViewById(R.id.classList)

        list.adapter = adapter
    }
}
