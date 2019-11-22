package com.vinted.androidx_fragment_110

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment

class ChildSupportFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_empty, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

//        childFragmentManager.beginTransaction()
//            .add(R.id.container, LabelFragment.newInstance(requireArguments().getString(LABEL)!!))
//            .commit()
    }

    companion object {
        private const val LABEL = "label"
        fun newInstance(label: String): ChildSupportFragment {
            return ChildSupportFragment().apply {
                arguments = bundleOf(LABEL to label)
            }
        }
    }
}
