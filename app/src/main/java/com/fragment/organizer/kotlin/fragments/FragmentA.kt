package com.fragment.organizer.kotlin.fragments

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import com.fragment.organizer.kotlin.AppSingleton
import com.fragment.organizer.kotlin.R
import kotlinx.android.synthetic.main.fragment_a.*

/***
 * Created by Techno Blogger on 24/10/17.
 */
class FragmentA : Fragment() {
    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val rootView = inflater!!.inflate(R.layout.fragment_a, container, false)

        val btnNext = rootView!!.findViewById<Button>(R.id.btnGoToNext)
        btnNext.setOnClickListener {
            AppSingleton.instance.flowOrganization.replace(FragmentB(), true)
        }

        return rootView
    }

}