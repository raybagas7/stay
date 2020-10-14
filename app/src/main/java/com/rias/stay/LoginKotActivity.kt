package com.rias.stay

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_login_kot.*

class LoginKotActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_kot)

        loginbutkot.setOnClickListener {
            val loginpindah = Intent (this, MainKotActivity::class.java)
            startActivity(loginpindah)
        }

        daftarbutkot.setOnClickListener {
            val daftarpindah = Intent (this, DaftarKotActivity::class.java)
            startActivity(daftarpindah)
        }
        
    }
}
