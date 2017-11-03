package com.example.timothy.dndcharactertoolkotlin.data.tables

import com.example.timothy.dndcharactertoolkotlin.data.SRDDatabase
import com.raizlabs.android.dbflow.annotation.Column
import com.raizlabs.android.dbflow.annotation.PrimaryKey
import com.raizlabs.android.dbflow.annotation.Table

@Table(database = SRDDatabase::class, name = "class")
class Class(@PrimaryKey var id: Int = 0,
            @Column(name = "name") var name: String? = null,
            @Column(name = "type") var type: String? = null)