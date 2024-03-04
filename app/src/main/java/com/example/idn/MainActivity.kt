package com.example.idn

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

import android.content.Intent
import com.example.idn.AboutActivity
import com.example.idn.Prov
import com.example.idn.DataProv
import com.example.idn.ListProvAdapter



class MainActivity : AppCompatActivity() {
    private lateinit var rvProves: RecyclerView
    private val list : ArrayList<Prov> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val actionBar = supportActionBar
        actionBar!!.title = "Provinsi Indonesia"

        rvProves = findViewById(R.id.rv_provs)
        rvProves.setHasFixedSize(true)

        // Get Data from Object
        list.addAll(DataProv.listData)

        // Layout manager = LinearLayoutManager
        rvProves.layoutManager = LinearLayoutManager(this)
        val listProvAdapter = ListProvAdapter(list)
        rvProves.adapter = listProvAdapter
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return when (item.itemId) {
            R.id.action_list -> {
                // Layout becomes LinearLayoutManager
                rvProves.layoutManager = LinearLayoutManager(this)
                true
            }
            R.id.action_grid -> {
                // Layout becomes GridLayoutManager 2 block
                rvProves.layoutManager = GridLayoutManager(this, 2)
                true
            }
            R.id.about -> {
                // Activitas from MainActivity to AboutActivity
                startActivity(Intent(this@MainActivity, AboutActivity::class.java))
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }
}