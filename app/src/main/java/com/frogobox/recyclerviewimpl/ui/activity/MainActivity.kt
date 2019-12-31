package com.frogobox.recyclerviewimpl.ui.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.frogobox.recyclerviewimpl.R
import com.frogobox.recyclerviewimpl.model.Child

class MainActivity : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    private fun listChild(): MutableList<Child> {
        val childs = mutableListOf<Child>()
        childs.add(Child("https://images.pexels.com/photos/414612/pexels-photo-414612.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500"))
        childs.add(Child("https://images.pexels.com/photos/414612/pexels-photo-414612.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500"))
        childs.add(Child("https://images.pexels.com/photos/414612/pexels-photo-414612.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500"))
        childs.add(Child("https://images.pexels.com/photos/414612/pexels-photo-414612.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500"))
        return childs
    }


//    private fun adapterChild(listData: MutableList<Child>): FrogoRecyclerViewAdapter<Child>{
//
//        val adapter = ChildViewAdapter()
//        adapter.setupRequirement()
//
//    }
//
//    private fun listParent(): MutableList<Parent> {
//        val parents = mutableListOf<Parent>()
//        parents.add(Parent())
//
//    }

}
