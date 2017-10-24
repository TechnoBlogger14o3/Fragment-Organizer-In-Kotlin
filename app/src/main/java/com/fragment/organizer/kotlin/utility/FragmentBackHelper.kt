package com.kotlin.demo.utility

import android.support.v4.app.Fragment
import com.fragment.organizer.kotlin.interfaces.IOnBackPressed


/***
 * Created by Techno Blogger on 20/5/16.
 */
/***
 * This FragmentBackHelper class will be extending the Fragment Class,
 * and will be implementing the IOnBackPressed, in this we will override the\
 * onBackPress of Activity.
 *
 * Kindly go through the Activity's onBackPress method.
 */

open class FragmentBackHelper : Fragment(), IOnBackPressed {
    override fun onBackPressed(): Boolean {
        return true
    }
}
