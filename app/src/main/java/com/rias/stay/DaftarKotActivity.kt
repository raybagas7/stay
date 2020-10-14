package com.rias.stay

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_daftar_kot.*

class DaftarKotActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_daftar_kot)

        daftarbutdaf.setOnClickListener {
            val datarpindahin = Intent (this, MainKotActivity::class.java)
                    .apply {
                        putExtra("namalengkap", fullnamekot.text.toString())
                        putExtra("email", emaildaftarkot.text.toString())
                        putExtra("password", passwordaftarkot.text.toString())
                        putExtra("notelp", notelpkot.text.toString())
                        putExtra("noktp", nomorktpkot.text.toString())
                    }
            startActivity(datarpindahin)
        }
    }
}
