package ph.kodego.victor.yu.leones.patricia.ivee.procurementsystemapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import ph.kodego.victor.yu.leones.patricia.ivee.procurementsystemapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}