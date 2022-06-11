package com.example.widget

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.widget.databinding.ActivityLoginBinding
import com.example.widget.databinding.CustomDialogBinding

private lateinit var binding: ActivityLoginBinding
class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnLogin.setOnClickListener{

            val dataLogin = ModelLogin(binding.txtPUsername.text.toString(), binding.txtPPassword.text.toString())
            val intent = Intent(this, MainActivity::class.java)
            intent.putExtra("data", dataLogin)
            startActivity(intent)
            finish()
        }
    }
}