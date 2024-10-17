package com.example.uts_aulianofika

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class DetailMakanan : AppCompatActivity() {

    private lateinit var txtDetail : TextView
    private lateinit var imageDetail : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_detail_makanan)

       txtDetail = findViewById(R.id.txtDetail)
        imageDetail = findViewById(R.id.imageDetail
        )

        //get data
        val detailText = intent.getStringExtra("judul")
        val detailimage= intent.getIntExtra("image",0)

        txtDetail.setText(detailText)
        imageDetail.setImageResource(detailimage)


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}