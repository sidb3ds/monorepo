package com.example.pdp.view

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.pdp.R
import com.example.pdp.repository.Repository
import com.example.builder.Component
import com.example.pdp.view.adapter.PdpRecyclerViewAdapter

class PdpActivity : AppCompatActivity() {
    lateinit var recyclerView: RecyclerView
    lateinit var componentsList : List<Component>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pdp)
        recyclerView = findViewById(R.id.recyclerView)

        val repository = Repository()

        componentsList = repository.getPdpList(resources.getString(R.string.domain))

        initRecyclerView()
    }

    companion object{
        fun startPdpActivity(context: Activity){
            context.startActivity(Intent(context, PdpActivity::class.java))
        }
    }

    private fun initRecyclerView() {
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = PdpRecyclerViewAdapter(this, componentsList)
    }
}