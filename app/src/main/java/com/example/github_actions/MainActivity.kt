package com.example.github_actions

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val intent = Intent()
        intent.setClassName(
            this@MainActivity,
            "com.example.github_actions.custom_module.CustomActivity"
        )
        startActivity(intent)
    }
}
