package com.rias.stay

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_daftar_kot.*
import kotlinx.android.synthetic.main.activity_main_kot.*

class MainKotActivity : AppCompatActivity() {

    var variablestring : String = "Alamat"
    val variableint = 230899
    val variablearray = intArrayOf(10,20,30,40,50)
    val variablechar = 'O'

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_kot)

        namalengkapshow.text = intent.getStringExtra("namalengkap")
        nomortelpshow.text = intent.getStringExtra("notelp")

        variablestring = "Graha Sari Endah"
        stringan.text = variablestring
        intan.text = variableint.toString()
        intanarray1.text = variablearray[4].toString()
        intanarray2.text = variablearray[0].toString()
        charan.text = variablechar.toString()
        kembali.setOnClickListener {
            val kembali = Intent (this, LoginKotActivity::class.java)
            startActivity(kembali)
        }

    }
}
