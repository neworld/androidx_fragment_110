package com.vinted.androidx_fragment_110

import androidx.fragment.app.FragmentManager
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.Robolectric
import org.robolectric.RobolectricTestRunner

@RunWith(RobolectricTestRunner::class)
class MainActivityTest {
    @Test
    fun check() {
        val controller = Robolectric.buildActivity(MainActivity::class.java)
        controller.setup()
        controller.resume()

        val activity = controller.get()
        val fragmentManager = activity.supportFragmentManager

        fragmentManager.executePendingTransactions()
    }

    @Test
    fun checkWithCustomManagement() {
        val controller = Robolectric.buildActivity(MainActivity::class.java)
        controller.setup()
        controller.resume()

        val activity = controller.get()
        val fragmentManager = activity.supportFragmentManager

        fragmentManager.popBackStackImmediate(null, FragmentManager.POP_BACK_STACK_INCLUSIVE)

        fragmentManager.beginTransaction()
            .setCustomAnimations(0, 0, 0, 0)
            .replace(android.R.id.content, LabelFragment.newInstance("foo"))
            .commitAllowingStateLoss()

        fragmentManager.beginTransaction()
            .setCustomAnimations(0, 0, R.anim.slide_in_left, R.anim.slide_out_right)
            .addToBackStack("added bar")
            .replace(android.R.id.content, ChildSupportFragment.newInstance("bar"))
            .commitAllowingStateLoss()

        // initial fragment
        fragmentManager.popBackStackImmediate(null, FragmentManager.POP_BACK_STACK_INCLUSIVE)

        fragmentManager.beginTransaction()
            .setCustomAnimations(0, 0, 0, 0)
            .replace(android.R.id.content, LabelFragment.newInstance("foo 2"))
            .commitAllowingStateLoss()
    }
}
