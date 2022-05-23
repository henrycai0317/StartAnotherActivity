package com.example.startanotheractivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.viewbinding.ViewBinding
import com.example.startanotheractivity.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
  private  val TAG = "DEMO"

    private lateinit var viewBinding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        Log.d(TAG, "[A] onCreate: ")
        super.onCreate(savedInstanceState)
        viewBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(viewBinding.root)
        initView()
    }

    private fun initView() {
        viewBinding.openActivityB.setOnClickListener {
            val intent = Intent(this,MainActivityB::class.java)
            startActivity(intent)
        }
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "[A] onStart: ")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "[A] onResume: ")

    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "[A] onPause: ")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "[A] onStop: ")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "[A] onDestroy: ")
    }


}