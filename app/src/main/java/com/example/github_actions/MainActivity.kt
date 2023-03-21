package com.example.github_actions

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonCustomActivity = findViewById<Button>(R.id.buttonCustomActivity)

        buttonCustomActivity.setOnClickListener {
            Intent().apply {
                setClassName(
                    this@MainActivity,
                    "com.example.github_actions.custom_module.CustomActivity"
                )
            }.also {
                startActivity(it)
            }
        }
    }
}
