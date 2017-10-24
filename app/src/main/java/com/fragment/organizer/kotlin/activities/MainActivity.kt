package com.fragment.organizer.kotlin.activities

import android.os.Bundle
import android.os.Handler
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import com.fragment.organizer.kotlin.AppSingleton
import com.fragment.organizer.kotlin.R
import com.fragment.organizer.kotlin.fragments.FragmentA
import com.kotlin.demo.utility.FragmentBackHelper

/***
 * Created by Techno Blogger on 24/10/17.
 */

class MainActivity : AppCompatActivity() {

    private var backBtnCount = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        AppSingleton.instance.init(this)
        AppSingleton.instance.flowOrganization.replace(FragmentA(), false)
    }

    /***
     * Look closely on the onBackPressed() method.
     */
    override fun onBackPressed() {
        var isToWorkOnBack = true
        if (!AppSingleton.instance.flowOrganization.hasNoMoreBack()) {
            val list = supportFragmentManager.fragments
            if (list != null) {
                for (i in list.indices.reversed()) {
                    val fragment = list[i]
                    if (fragment is FragmentBackHelper) {
                        isToWorkOnBack = fragment
                                .onBackPressed()
                        break
                    }
                }
            }
        }
        if (!isToWorkOnBack)
            return

        if (!AppSingleton.instance.flowOrganization.hasNoMoreBack())
            super.onBackPressed()
        else {
            backBtnCount++
            @Suppress("DEPRECATED_IDENTITY_EQUALS")
            if (backBtnCount === 2) {
                System.exit(0)
                finish()
                return
            } else {
                Toast.makeText(AppSingleton.instance.activityInstance, "Press twice to exit", Toast.LENGTH_SHORT).show()
                Handler().postDelayed({ backBtnCount = 0 }, 500)
            }
        }
    }
}

