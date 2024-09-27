package com.example.projeto_sobre

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val layout = LinearLayout(this).apply {
            orientation = LinearLayout.VERTICAL
            setPadding(16, 16, 16, 16)
        }

        val titleTextView = TextView(this).apply {
            text = "Funcionários da Empresa"
            textSize = 24f
            setPadding(0, 0, 0, 24)
        }

        val button1 = Button(this).apply {
            text = "Sobre Guilherme Gomes Andrade"
            setOnClickListener {
                startActivity(Intent(this@MainActivity, AboutActivity_Guilherme_Gomes::class.java))
            }
        }

        val button2 = Button(this).apply {
            text = "Sobre João Victor Neves"
            setOnClickListener {
                startActivity(Intent(this@MainActivity, AboutActivity_Joao_Victor::class.java))
            }
        }

        val button3 = Button(this).apply {
            text = "Sobre Guilherme Holanda"
            setOnClickListener {
                startActivity(Intent(this@MainActivity, AboutActivity_Guilherme_Holanda::class.java))
            }
        }

        val button4 = Button(this).apply {
            text = "Sobre Luca Barros"
            setOnClickListener {
                startActivity(Intent(this@MainActivity, AboutActivity_Lucas_Barros::class.java))
            }
        }

        layout.addView(titleTextView)
        layout.addView(button1)
        layout.addView(button2)
        layout.addView(button3)
        layout.addView(button4)

        setContentView(layout)
    }
}
