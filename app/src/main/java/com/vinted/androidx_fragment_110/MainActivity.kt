package com.vinted.androidx_fragment_110

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentManager

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        supportFragmentManager.popBackStackImmediate(null, FragmentManager.POP_BACK_STACK_INCLUSIVE)

        supportFragmentManager.beginTransaction()
            .setCustomAnimations(0, 0, 0, 0)
            .replace(android.R.id.content, LabelFragment.newInstance("foo"))
            .commitAllowingStateLoss()

        supportFragmentManager.beginTransaction()
            .setCustomAnimations(0, 0, R.anim.slide_in_left, R.anim.slide_out_right)
            .addToBackStack("added bar")
            .replace(android.R.id.content, ChildSupportFragment.newInstance("bar"))
            .commitAllowingStateLoss()

        // initial fragment
        supportFragmentManager.popBackStackImmediate(null, FragmentManager.POP_BACK_STACK_INCLUSIVE)

        supportFragmentManager.beginTransaction()
            .setCustomAnimations(0, 0, 0, 0)
            .replace(android.R.id.content, LabelFragment.newInstance("foo 2"))
            .commitAllowingStateLoss()
    }

    override fun onResume() {
        super.onResume()

        supportFragmentManager.popBackStackImmediate(null, FragmentManager.POP_BACK_STACK_INCLUSIVE)

        supportFragmentManager.beginTransaction()
            .setCustomAnimations(0, 0, 0, 0)
            .replace(android.R.id.content, LabelFragment.newInstance("foo"))
            .commitAllowingStateLoss()

        supportFragmentManager.beginTransaction()
            .setCustomAnimations(0, 0, R.anim.slide_in_left, R.anim.slide_out_right)
            .addToBackStack("added bar")
            .replace(android.R.id.content, ChildSupportFragment.newInstance("bar"))
            .commitAllowingStateLoss()

        // initial fragment
        supportFragmentManager.popBackStackImmediate(null, FragmentManager.POP_BACK_STACK_INCLUSIVE)

        supportFragmentManager.beginTransaction()
            .setCustomAnimations(0, 0, 0, 0)
            .replace(android.R.id.content, LabelFragment.newInstance("foo 2"))
            .commitAllowingStateLoss()
    }
}
