package com.example.startanotheractivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.viewbinding.ViewBinding
import com.example.startanotheractivity.databinding.ActivityMainBBinding


class MainActivityB : AppCompatActivity() {
    private  val TAG = "DEMO"
    private lateinit var viewBinding: ActivityMainBBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(TAG, "[B] onCreate: ")
        viewBinding = ActivityMainBBinding.inflate(layoutInflater)
        setContentView(viewBinding.root)
        initView()
    }

    private fun initView() {
        viewBinding.openActivityA.setOnClickListener {
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        }
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "[B] onStart: ")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "[B] onResume: ")

    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "[B] onPause: ")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "[B] onStop: ")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "[B] onDestroy: ")
    }
}