package com.example.monorepo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.base.NkUtils
import com.example.library.MyClass
import com.example.player.ui.login.LoginActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //starting activity from player module
        findViewById<Button>(R.id.button).setOnClickListener {
            LoginActivity.startPlayerActivity(context = this)
        }

        //using class from base module
        NkUtils.dummyFunc()

        //using classes from library module
        val myClass = MyClass()
        myClass.print()
    }
}