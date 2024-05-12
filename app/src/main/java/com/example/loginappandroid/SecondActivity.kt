import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.loginappandroid.databinding.ActivitySecondBinding
import com.google.android.material.textfield.TextInputEditText
import kotlinx.coroutines.newSingleThreadContext

class SecondActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySecondBinding
    private lateinit var editTextEmail: TextInputEditText
    private lateinit var editTextPassword: TextInputEditText
    private lateinit var editTextPassword2: TextInputEditText
    private lateinit var buttonReg: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Inisialisasi views
        editTextEmail = binding.fieldEmail
        editTextPassword = binding.fieldPass
        editTextPassword2 = binding.fieldPass2
        buttonReg = binding.buttonSignIn



        // Aktifkan tombol back pada app bar
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }
}
