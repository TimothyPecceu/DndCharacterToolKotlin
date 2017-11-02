package com.example.timothy.dndcharactertoolkotlin.activities

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import com.example.timothy.dndcharactertoolkotlin.R
import com.example.timothy.dndcharactertoolkotlin.data.tables.Race
import com.raizlabs.android.dbflow.kotlinextensions.from
import com.raizlabs.android.dbflow.sql.language.Select

class NewCharacterActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_new_character)

        val names : List<String?> = Select().from(Race::class).queryList().map { race -> race.name }
        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, names)

        val list : ListView = findViewById(R.id.classList)

        list.adapter = adapter
    }
}
