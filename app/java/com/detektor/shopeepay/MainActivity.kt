package com.detektor.shopeepay

import android.os.Bundle
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val layout = LinearLayout(this).apply {
            orientation = LinearLayout.VERTICAL
            setPadding(32, 32, 32, 32)
        }

        val title = TextView(this).apply {
            text = "ShopeePay Detector"
            textSize = 24f
        }

        val status = TextView(this).apply {
            text = "Detektor tautan pembayaran siap.\n\nMode: Manual Claim"
            textSize = 17f
        }

        layout.addView(title)
        layout.addView(status)

        setContentView(layout)
    }
}
