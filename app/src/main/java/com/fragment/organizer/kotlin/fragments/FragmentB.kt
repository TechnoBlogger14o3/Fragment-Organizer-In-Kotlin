package com.fragment.organizer.kotlin.fragments

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import com.fragment.organizer.kotlin.AppSingleton
import com.fragment.organizer.kotlin.R
import com.kotlin.demo.utility.FragmentBackHelper

/***
 * Created by Techno Blogger on 24/10/17.
 */

/***
 * If you want to handle the onBackPress in a Fragment, so instead of
 * extending the android.support.v4.app.Fragment, we will extend the
 * custom Fragment class, in this case it is FragmentBackHelper.
 */
class FragmentB : FragmentBackHelper() {
    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val rootView = inflater!!.inflate(R.layout.fragment_b, container, false)
        val btnNext = rootView!!.findViewById<Button>(R.id.btnGoToFragmentC)
        btnNext.setOnClickListener { AppSingleton.instance.flowOrganization.replace(FragmentC(), true) }

        return rootView
    }

    override fun onBackPressed(): Boolean {
        // Perform your operation onBackPress()
        Toast.makeText(context, "Toast Message", Toast.LENGTH_LONG).show()
        return super.onBackPressed()
    }
}