package uz.turgunboyevjurabek.myfirstmapapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import uz.turgunboyevjurabek.myfirstmapapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        binding.text.setOnClickListener {
            startActivity(Intent(this,MapsActivity::class.java))
        }

    }
}