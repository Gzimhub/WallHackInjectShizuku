package com.gzimhub.wallhackinjectshizuku

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val button = Button(this).apply {
            text = "Injetar pasta?"
            setOnClickListener {
                AlertDialog.Builder(this@MainActivity)
                    .setTitle("Escolha uma opção")
                    .setMessage("Deseja injetar a pasta no APK?")
                    .setPositiveButton("YES") { _, _ ->
                        // ação para injetar
                    }
                    .setNegativeButton("NO") { _, _ ->
                        // ação para remover
                    }
                    .show()
            }
        }

        setContentView(button)
    }
}
