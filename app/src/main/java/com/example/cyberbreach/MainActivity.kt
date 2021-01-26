package com.example.cyberbreach

import android.Manifest
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import com.google.android.material.button.MaterialButton
import com.google.android.material.textview.MaterialTextView

class MainActivity : AppCompatActivity() {

    companion object {
        private const val TAG = "CyberBreach"
        private const val FILENAME_FORMAT = "yyyy-MM-dd-HH-mm-ss-SSS"
        private const val REQUEST_CODE_PERMISSIONS = 10
        private val REQUIRED_PERMISSIONS = arrayOf(Manifest.permission.CAMERA)
        private const val RATIO_4_3_VALUE = 4.0 / 3.0
        private const val RATIO_16_9_VALUE = 16.0 / 9.0

    }

    private lateinit var templateButton: MaterialButton
    private lateinit var templateTextView: MaterialTextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)

        Log.i(TAG, "onCreate")

        // elements in fragment
        templateButton = findViewById(R.id.templateButton)

        // onClickListeners
        templateButton.setOnClickListener { startBreach() }
    }

    override fun onStart() {
        super.onStart()

        Log.i(TAG, "onStart")
    }

    private fun startBreach(){

        Toast.makeText(this, "button pressed", Toast.LENGTH_SHORT).show()
    }
}