package com.vinted.androidx_fragment_110

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_label.*

class LabelFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_label, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        label.text = requireArguments().getString(LABEL)
    }

    companion object {
        private const val LABEL = "label"
        fun newInstance(label: String): LabelFragment {
            return LabelFragment().apply {
                arguments = bundleOf(LABEL to label)
            }
        }
    }
}
