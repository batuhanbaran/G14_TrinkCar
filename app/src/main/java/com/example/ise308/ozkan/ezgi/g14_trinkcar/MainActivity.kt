package com.example.ise308.ozkan.ezgi.g14_trinkcar

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import kotlinx.android.synthetic.main.car_new_page.*


class MainActivity : AppCompatActivity() {





    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater = menuInflater

        return super.onCreateOptionsMenu(menu)
    }



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.car_new_page)
    }




}