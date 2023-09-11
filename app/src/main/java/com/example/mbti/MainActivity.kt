package com.example.mbti

import android.content.Context
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mbti.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding:ActivityMainBinding
    lateinit var sharedPref:SharedPreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.nameTv.text = MyApplication.nickname
        binding.tvAge.text = MyApplication.age.toString()

        binding.nameTv.setOnClickListener{

        }
        binding
        binding.navBottom.setOnItemSelectedListener {
            val transaction = supportFragmentManager.beginTransaction()
            when(it.itemId){
                R.id.nav_community -> transaction.replace(R.id.fl_main, CommunityFragment())
                //R.id.nav_setting -> transaction.replace(R.id.fl_main,)

            }
            transaction.commit()
            true
        }


    }
}