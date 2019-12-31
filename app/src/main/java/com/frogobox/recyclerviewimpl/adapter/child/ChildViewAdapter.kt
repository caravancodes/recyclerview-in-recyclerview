package com.frogobox.recyclerviewimpl.adapter.child

import android.view.View
import android.view.ViewGroup
import com.frogobox.recycler.adapter.FrogoRecyclerViewAdapter
import com.frogobox.recycler.adapter.FrogoRecyclerViewHolder
import com.frogobox.recyclerviewimpl.model.Child

/**
 * Created by Faisal Amir
 * FrogoBox Inc License
 * =========================================
 * RecyclerViewImpl
 * Copyright (C) 31/12/2019.
 * All rights reserved
 * -----------------------------------------
 * Name     : Muhammad Faisal Amir
 * E-mail   : faisalamircs@gmail.com
 * Github   : github.com/amirisback
 * LinkedIn : linkedin.com/in/faisalamircs
 * -----------------------------------------
 * FrogoBox Software Industries
 * com.frogobox.recyclerviewimpl.adapter
 *
 */
class ChildViewAdapter : FrogoRecyclerViewAdapter<Child>() {

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): FrogoRecyclerViewHolder<Child> {
        return ChildViewHolder(viewLayout(parent))
    }


    inner class ChildViewHolder(view: View) : FrogoRecyclerViewHolder<Child>(view) {

        override fun initComponent(data: Child) {
            super.initComponent(data)



        }
    }

}