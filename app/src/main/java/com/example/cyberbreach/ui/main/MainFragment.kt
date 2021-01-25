package com.example.cyberbreach.ui.main

import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.example.cyberbreach.R
import com.google.android.material.button.MaterialButton
import com.google.android.material.textview.MaterialTextView

class MainFragment : Fragment() {

    companion object {
        fun newInstance() = MainFragment()
    }

    private lateinit var viewModel: MainViewModel
    private lateinit var templateButton: MaterialButton
    private lateinit var templateTextView: MaterialTextView
    private lateinit var root: View

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View {
        Log.i("LIFE CYCLE", "onCreateView")
        root = inflater.inflate(R.layout.main_fragment, container, false)

        // elements in fragment
        templateButton = root.findViewById(R.id.templateButton)

        // onClickListeners
        templateButton.setOnClickListener { ButtonPress() }

        return root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        viewModel = ViewModelProvider(this).get(MainViewModel::class.java)
        // TODO: Use the ViewModel

        Log.i("LIFE CYCLE", "onActivityCreated")
    }

    private fun ButtonPress(){
        Toast.makeText(activity, "button pressed", Toast.LENGTH_SHORT).show()
    }
}