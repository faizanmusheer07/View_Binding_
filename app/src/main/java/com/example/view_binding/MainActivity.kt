package com.example.view_binding

import android.annotation.SuppressLint
import android.content.Intent
import android.content.res.ColorStateList
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.example.view_binding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
   private lateinit var binding : ActivityMainBinding
   private lateinit var Button : Button
    @SuppressLint("SuspiciousIndentation")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button.setOnClickListener {
       if (binding.checkBox.isChecked){

               val intent  = Intent(this, SecondActivity::class.java)
               startActivity(intent)

        }  else{
            binding.checkBox.buttonTintList = ColorStateList.valueOf(Color.RED)
                Toast.makeText(this,"please accept the terms and conditions", Toast.LENGTH_LONG).show()
       }

        }
    }
}