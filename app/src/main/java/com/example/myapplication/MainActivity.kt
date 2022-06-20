package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.android.insulive.domain.models.ClientUser
import com.example.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    private val clientUser : ClientUser = ClientUser(firstName = "Duc", lastName = "Tran")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        binding.clientUser = clientUser
        val a = 3
        val b = 2
        val c = a + b
        binding.apply {
            txtHelloworld.text = c.toString()
        }
    }
}
