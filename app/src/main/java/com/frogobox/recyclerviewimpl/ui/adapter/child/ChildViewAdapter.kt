package com.frogobox.recyclerviewimpl.ui.adapter.child

import android.view.View
import android.view.ViewGroup
import com.bumptech.glide.Glide
import com.frogobox.recyclerviewimpl.frogo.FrogoRecyclerViewAdapter
import com.frogobox.recyclerviewimpl.frogo.FrogoRecyclerViewHolder
import com.frogobox.recyclerviewimpl.model.Child
import kotlinx.android.synthetic.main.child_list_item.view.*

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
class ChildViewAdapter : FrogoRecyclerViewAdapter<Child>() {

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): FrogoRecyclerViewHolder<Child> {
        return ChildViewHolder(viewLayout(parent))
    }

    inner class ChildViewHolder(view: View) : FrogoRecyclerViewHolder<Child>(view) {

        val iv_image = view.iv_item

        override fun initComponent(data: Child) {
            super.initComponent(data)
            Glide.with(itemView.context).load(data.linkImage).into(iv_image)

        }
    }

}