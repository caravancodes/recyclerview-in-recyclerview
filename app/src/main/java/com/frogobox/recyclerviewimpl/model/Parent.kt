package com.frogobox.recyclerviewimpl.model

import com.frogobox.recyclerviewimpl.frogo.FrogoRecyclerViewAdapter

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
 * com.frogobox.recyclerviewimpl.model
 *
 */
data class Parent(

    val title: String,
    val adapter: FrogoRecyclerViewAdapter<Child>

)