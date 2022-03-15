package com.galih.learngit

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        print("commit revisi")
        println("Ini commit kedua")
        println("Ini commit kelima")
        println("commit 2 Exprimental")
        println("Ini commit dari branch Exprimental")
        println("Ini commit remote")
    }
}