package com.example.test

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Adapter
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.test.Adapter.note_adapter
import com.example.test.model.note_data
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val mNoteList = ArrayList<note_data>()
    lateinit var mNoteAdapter: note_adapter


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        for (i: Int in 1 until 10)
            mNoteList.add(note_data("제목${i}", "같은 내용 반복"))

        mNoteAdapter = note_adapter(this, mNoteList)
        noteRecycleView.adapter = mNoteAdapter
        noteRecycleView.layoutManager = LinearLayoutManager(this)

    }
}