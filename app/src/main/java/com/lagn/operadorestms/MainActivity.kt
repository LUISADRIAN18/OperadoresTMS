package com.lagn.operadorestms

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.lagn.operadorestms.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var mainBinding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        mainBinding = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(mainBinding.root)
    }
}