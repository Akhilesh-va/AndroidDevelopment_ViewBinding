package com.example.viewbinding

import android.content.res.ColorStateList
import android.graphics.Color
import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.viewbinding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding //Step 1 Declare a binding variable
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)     //Step 2 Initialize the binding variable)
        enableEdgeToEdge()
        setContentView(binding.root) //Step 3 seeting binding root
        binding.button.setOnClickListener{
            if(binding.checkBox.isChecked){
                // Open a new screen

            }else{
                binding.checkBox.buttonTintList= ColorStateList.valueOf(Color.RED)
                Toast.makeText(this, "Please Accept T&C", Toast.LENGTH_SHORT).show()
            }
        }

    }
}