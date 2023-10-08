package com.example.belajarandroid

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toolbar

class MainActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var tv: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tv = findViewById(R.id.textView)

        val username = intent.getParcelableExtra<User>("User")?.Username
        val password = intent.getParcelableExtra<User>("User")?.Password
        tv.text = "Username: $username dan Password: $password"

        val btnimplicit: Button = findViewById(R.id.btn_implicit)
        btnimplicit.setOnClickListener(this)

    }

    override fun onClick(v: View) {
        when(v.id) {
            R.id.btn_implicit -> {
                val message = "Pinjam Dulu Seratus"
                val intent = Intent()
                intent.action= Intent.ACTION_SEND
                intent.putExtra(Intent.EXTRA_TEXT, message)
                intent.type = "text/plain"
                startActivity(intent)

//                val intent = Intent()
//                intent.putExtra("history", "Anda sudah login")
//                setResult(RESULT_OK, intent)
//                finish()
            }
        }
    }
}