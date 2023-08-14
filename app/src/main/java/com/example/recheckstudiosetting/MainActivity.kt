package com.example.recheckstudiosetting

import android.os.Bundle
import android.widget.Toast
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import com.example.recheckstudiosetting.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val viewModel by viewModels<MainViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setUpViews()
        setUpObservers()
    }

    private fun setUpViews() {
        binding.btnSample.setOnClickListener {
            viewModel.load()
        }
    }

    private fun setUpObservers() {
        viewModel.sampleData.observe(this) {
            Toast.makeText(this, "Receive = $it", Toast.LENGTH_SHORT).show()
        }
    }
}
