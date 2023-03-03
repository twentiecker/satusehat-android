package com.twentiecker.satusehat

import android.content.Intent
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.WindowInsets
import android.view.WindowManager
import androidx.appcompat.app.ActionBar
import com.twentiecker.satusehat.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setupView()

        binding.btnCheckin.setOnClickListener {
            val intent = Intent(this, CheckInActivity::class.java)
            startActivity(intent)
        }
        binding.cvResume.setOnClickListener {
//            val intent = Intent(this, ListStoryActivity::class.java)
//            startActivity(intent)
        }

        binding.cvVaksin.setOnClickListener {
//            val intent = Intent(this, DirectionActivity::class.java)
//            startActivity(intent)
        }

        binding.cvHasil.setOnClickListener {
//            val intent = Intent(this, BikeActivity::class.java)
//            startActivity(intent)
        }

        binding.cvRawat.setOnClickListener {
//            val intent = Intent(this, ScanActivity::class.java)
//            startActivity(intent)
        }

        binding.cvPelayanan.setOnClickListener {
//            val intent = Intent(this, PeduliActivity::class.java)
//            startActivity(intent)
        }
    }

    private fun setupView() {
        @Suppress("DEPRECATION")
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.R) {
            window.insetsController?.hide(WindowInsets.Type.statusBars())
        } else {
            window.setFlags(
                WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS,
                WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS
            )
        }
        supportActionBar?.hide()
    }
}