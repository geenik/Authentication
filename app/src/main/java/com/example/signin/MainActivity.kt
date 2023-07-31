package com.example.signin

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.AppCompatButton
import com.google.firebase.auth.FirebaseAuth

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btn=findViewById<AppCompatButton>(R.id.logout_btn)
        val auth=FirebaseAuth.getInstance()
        btn.setOnClickListener {
            auth.signOut()
            startActivity(Intent(this,Signin::class.java))
            finish()
        }
    }
}