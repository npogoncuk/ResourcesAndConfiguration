package com.example.resourcesandconfiguration

import android.content.res.Configuration
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.resourcesandconfiguration.databinding.ActivityConfigurationBinding

class ConfigurationActivity : AppCompatActivity() {

    private lateinit var binding: ActivityConfigurationBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityConfigurationBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }

    override fun onConfigurationChanged(newConfig: Configuration) {
        super.onConfigurationChanged(newConfig)

        if (newConfig.orientation == Configuration.ORIENTATION_LANDSCAPE)
            Toast.makeText(this, "ORIENTATION_LANDSCAPE", Toast.LENGTH_LONG).show()
        else Toast.makeText(this, "ORIENTATION_PORTRAIT", Toast.LENGTH_LONG).show()

        binding.textViewScreenSize.text = resources.getString(R.string.screen_size, "${newConfig.screenWidthDp}dp x ${newConfig.screenHeightDp}dp")
    }
}