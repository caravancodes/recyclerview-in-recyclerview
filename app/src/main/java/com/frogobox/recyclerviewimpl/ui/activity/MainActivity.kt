package com.frogobox.recyclerviewimpl.ui.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.frogobox.recycler.adapter.FrogoRecyclerViewAdapter
import com.frogobox.recyclerviewimpl.R
import com.frogobox.recyclerviewimpl.model.Child
import com.frogobox.recyclerviewimpl.model.Parent
import com.frogobox.recyclerviewimpl.ui.adapter.child.ChildViewAdapter
import com.frogobox.recyclerviewimpl.ui.adapter.parent.ParentViewAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupRecyclerView()
    }

    private fun listChild(): MutableList<Child> {
        val childs = mutableListOf<Child>()
        childs.add(Child("https://images.pexels.com/photos/414612/pexels-photo-414612.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500"))
        childs.add(Child("https://images.pexels.com/photos/414612/pexels-photo-414612.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500"))
        childs.add(Child("https://images.pexels.com/photos/414612/pexels-photo-414612.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500"))
        childs.add(Child("https://images.pexels.com/photos/414612/pexels-photo-414612.jpeg?auto=compress&cs=tinysrgb&dpr=1&w=500"))
        return childs
    }
    
    private fun adapterChild(listData: MutableList<Child>): FrogoRecyclerViewAdapter<Child> {
        val adapter = ChildViewAdapter()
        adapter.setupRequirement(null, listData, R.layout.child_list_item)
        return adapter
    }

    private fun listParent(): MutableList<Parent> {
        val parents = mutableListOf<Parent>()
        parents.add(Parent("Child", adapterChild(listChild())))
        parents.add(Parent("Child1", adapterChild(listChild())))
        parents.add(Parent("Child2", adapterChild(listChild())))
        return parents
    }

    private fun adapterParent(): FrogoRecyclerViewAdapter<Parent> {
        val adapter = ParentViewAdapter()
        adapter.setupRequirement(null, listParent(), R.layout.parent_list_item)
        return adapter
    }

    private fun setupRecyclerView(){
        parent_recycler_view.adapter = adapterParent()
        parent_recycler_view.layoutManager = LinearLayoutManager(this)
    }

}
