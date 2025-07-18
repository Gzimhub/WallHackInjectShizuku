package com.gzimhub.wallhackinjectshizuku

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val injectButton = findViewById<Button>(R.id.injectButton)

        injectButton.setOnClickListener {
            showInjectDialog()
        }
    }

    private fun showInjectDialog() {
        AlertDialog.Builder(this)
            .setTitle("Injetar Pasta?")
            .setMessage("Você deseja injetar ou remover a pasta?")
            .setPositiveButton("YES") { _, _ ->
                Toast.makeText(this, "Injetando a pasta...", Toast.LENGTH_SHORT).show()
                // TODO: Aqui vai a lógica de injeção com Shizuku
            }
            .setNegativeButton("NO") { _, _ ->
                Toast.makeText(this, "Removendo a pasta...", Toast.LENGTH_SHORT).show()
                // TODO: Aqui vai a lógica de remoção
            }
            .show()
    }
}
