package com.example.timothy.dndcharactertoolkotlin

import android.app.Application
import com.example.timothy.dndcharactertoolkotlin.data.SRDDatabase
import com.raizlabs.android.dbflow.config.DatabaseConfig
import com.raizlabs.android.dbflow.config.FlowConfig
import com.raizlabs.android.dbflow.config.FlowManager

class MyApplication : Application(){
    override fun onCreate() {
        super.onCreate()
        FlowManager.init(FlowConfig.builder(baseContext)
                .addDatabaseConfig(DatabaseConfig.builder(SRDDatabase::class.java)
                        .databaseName("dnd35")
                        .build())
                .build())
    }
}