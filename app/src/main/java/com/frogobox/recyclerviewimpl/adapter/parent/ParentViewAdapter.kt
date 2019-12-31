package com.frogobox.recyclerviewimpl.adapter.parent

import android.view.View
import android.view.ViewGroup
import com.frogobox.recycler.adapter.FrogoRecyclerViewAdapter
import com.frogobox.recycler.adapter.FrogoRecyclerViewHolder
import com.frogobox.recyclerviewimpl.model.Parent

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
class ParentViewAdapter : FrogoRecyclerViewAdapter<Parent>() {
    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): FrogoRecyclerViewHolder<Parent> {
        return ParentViewHolder(viewLayout(parent))
    }

    inner class ParentViewHolder(view: View) : FrogoRecyclerViewHolder<Parent>(view) {

        override fun initComponent(data: Parent) {
            super.initComponent(data)
        }
    }

}