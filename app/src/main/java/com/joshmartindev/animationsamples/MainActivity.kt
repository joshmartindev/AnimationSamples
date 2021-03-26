package com.joshmartindev.animationsamples

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.joshmartindev.animationsamples.adapter.BlogRecyclerAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var blogAdapter: BlogRecyclerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initRecyclerView()
        addDataSet()
    }

    private fun addDataSet() {
        val data = DataSource.createDataSet()
        blogAdapter.submitList(data)
    }

    private fun initRecyclerView(){
        recyclerView.apply {
            layoutManager = LinearLayoutManager(this@MainActivity)
            blogAdapter = BlogRecyclerAdapter()
            adapter = blogAdapter
        }
    }
}