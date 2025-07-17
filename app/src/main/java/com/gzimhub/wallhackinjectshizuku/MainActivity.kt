package com.gzimhub.wallhackinjectshizuku

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Criar botão programaticamente
        val button = Button(this).apply {
            text = "Injetar pasta?"
            setOnClickListener {
                AlertDialog.Builder(this@MainActivity)
                    .setTitle("Escolha uma opção")
                    .setMessage("Deseja injetar a pasta no APK?")
                    .setPositiveButton("YES") { _, _ ->
                        // Coloque aqui o código para injetar a pasta
                    }
                    .setNegativeButton("NO") { _, _ ->
                        // Coloque aqui o código para remover a pasta injetada
                    }
                    .show()
            }
        }

        // Definir o botão como conteúdo da activity
        setContentView(button)
    }
}
