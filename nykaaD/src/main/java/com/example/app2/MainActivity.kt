package com.example.app2

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.example.app2.databinding.ActivityMainBinding
import com.example.pdp.view.PdpActivity
import com.example.player.ui.login.LoginActivity

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        binding.login.setOnClickListener {
            LoginActivity.startLoginActivity(this)
        }

        binding.pdp.setOnClickListener {
            PdpActivity.startPdpActivity(this)
        }
    }
}