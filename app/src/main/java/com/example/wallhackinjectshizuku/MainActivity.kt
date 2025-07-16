package com.example.wallhackinjectshizuku

import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import rikka.shizuku.Shizuku

class MainActivity : AppCompatActivity() {
    override fun onCreate(saved: Bundle?) {
        super.onCreate(saved)
        setContentView(R.layout.activity_main)

        val status = findViewById<TextView>(R.id.status)
        val yes = findViewById<RadioButton>(R.id.radioYes)
        val no = findViewById<RadioButton>(R.id.radioNo)
        val btn = findViewById<Button>(R.id.btnInject)

        if (!Shizuku.checkSelfPermission()) Shizuku.requestPermission(0)
        else status.text = "Shizuku OK"

        btn.setOnClickListener {
            if (!Shizuku.checkSelfPermission()) {
                status.text = "Precisa permissão Shizuku"
            } else if (yes.isChecked) {
                status.text = execute("echo Injetando")
            } else if (no.isChecked) {
                status.text = execute("echo Removendo")
            } else {
                status.text = "Selecione YES ou NO"
            }
        }
    }

    private fun execute(cmd: String): String {
        return try {
            Shizuku.newProcess(arrayOf("sh","-c",cmd), null,null)
                .inputStream.bufferedReader().readText()
        } catch(e: Exception) {
            "Erro: ${e.message}"
        }
    }
}
