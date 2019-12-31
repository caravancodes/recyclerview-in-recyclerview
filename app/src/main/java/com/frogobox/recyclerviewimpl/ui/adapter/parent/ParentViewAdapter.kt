package com.frogobox.recyclerviewimpl.ui.adapter.parent

import android.view.View
import android.view.ViewGroup
import com.frogobox.recyclerviewimpl.frogo.FrogoRecyclerViewAdapter
import com.frogobox.recyclerviewimpl.frogo.FrogoRecyclerViewHolder
import com.frogobox.recyclerviewimpl.model.Parent
import kotlinx.android.synthetic.main.parent_list_item.view.*

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
 * com.frogobox.recyclerviewimpl.ui.adapter
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

        val rv_child = view.rv_list
        val tv_title = view.tv_title

        override fun initComponent(data: Parent) {
            super.initComponent(data)

            rv_child.adapter = data.adapter

            tv_title.text = data.title

        }
    }

}