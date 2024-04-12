package com.example.japanese_reps.ui.home.random

import com.example.japanese_reps.ui.lists.LIST_ID_EXTRA
import com.example.japanese_reps.ui.lists.ListNames
import com.example.japanese_reps.ui.lists.listList
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.japanese_reps.databinding.ListCellBinding

class DetailActivityRandom : AppCompatActivity()
{
    private lateinit var binding: ListCellBinding

    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        binding = ListCellBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val listID = intent.getIntExtra(LIST_ID_EXTRA, -1)
        val list = listFromID(listID)
        if(list != null)
        {
            binding.title.text = list.title
        }
    }

    private fun listFromID(listID: Int): ListNames?
    {
        for(listName in listList)
        {
            if(listName.id == listID)
                return listName
        }
        return null
    }
}