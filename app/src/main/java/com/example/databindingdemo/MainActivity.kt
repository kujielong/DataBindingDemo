package com.example.databindingdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.databindingdemo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    private var aPerson : Person = Person("Ali","123456","ali@gmail.com","123 Jalan xyz")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.personData = aPerson

        /*
        binding.txName.text    = aPerson.name
        binding.txIC.text      = aPerson.ic
        binding.txEmail.text   = aPerson.email
        binding.txAddress.text = aPerson.address
        */

        binding.btnUpdate.setOnClickListener(){
            aPerson.email = "abu@gamil.com"
            aPerson.address = "33 ODP 7"
            binding.apply { invalidateAll() }

        }
    }
}