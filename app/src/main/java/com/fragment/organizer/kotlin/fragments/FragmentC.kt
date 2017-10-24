package com.fragment.organizer.kotlin.fragments

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.fragment.organizer.kotlin.R

/***
 * Created by Techno Blogger on 24/10/17.
 */
class FragmentC : Fragment() {
    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater!!.inflate(R.layout.fragment_c, container, false)
    }
}