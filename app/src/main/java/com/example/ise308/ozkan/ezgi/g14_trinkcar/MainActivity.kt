package com.example.ise308.ozkan.ezgi.g14_trinkcar

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.DefaultItemAnimator
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class MainActivity : AppCompatActivity() {

    private var adapter: CarAdapter? = null
    private val carList = ArrayList<Car>()
    private var recyclerView: RecyclerView? = null


    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater = menuInflater
        inflater.inflate(R.menu.main_menu, menu)
        return super.onCreateOptionsMenu(menu)
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.car_list_page)



        recyclerView = findViewById<View>(R.id.recylerView) as RecyclerView

        adapter = CarAdapter(this, this.carList!!)
        val layoutManager = LinearLayoutManager(applicationContext)

        recyclerView!!.layoutManager = layoutManager
        recyclerView!!.itemAnimator = DefaultItemAnimator()

        // Add a neat dividing line between items in the list
        recyclerView!!.addItemDecoration(
            DividerItemDecoration(this,
                LinearLayoutManager.VERTICAL)
        )

        // set the adapter
        recyclerView!!.adapter = adapter
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId){
            R.id.OptionItemSelected -> {

                val intent = Intent(this, NewCarPage::class.java)

                startActivity(intent)
                true
            }
            else -> super.onOptionsItemSelected(item)
        }

    }

    fun createNewCar(c: Car){

        carList.add(c)
        adapter!!.notifyDataSetChanged()
    }

}