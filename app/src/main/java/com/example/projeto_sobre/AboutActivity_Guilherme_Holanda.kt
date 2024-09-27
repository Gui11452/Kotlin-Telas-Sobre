package com.example.projeto_sobre

import android.animation.ObjectAnimator
import android.content.Intent
import android.graphics.Color
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.ScrollView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class AboutActivity_Guilherme_Holanda : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val scrollView = ScrollView(this).apply {
            layoutParams = LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.MATCH_PARENT
            )
        }

        val layout = LinearLayout(this).apply {
            orientation = LinearLayout.VERTICAL
            setBackgroundColor(Color.WHITE)
            setPadding(16, 16, 16, 16)
        }

        val githubButton = Button(this).apply {
            text = "GitHub"
            setOnClickListener {
                openLink("https://github.com/guilhermeholanda2010")
            }
            layoutParams = LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT
            ).apply {
                setMargins(0, 0, 0, 16)
            }
        }

        val companyButton = Button(this).apply {
            text = "Empresa que eu trabalho"
            setOnClickListener {
                openLink("https://www.amigotech.com.br/")
            }
            layoutParams = LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT
            ).apply {
                setMargins(0, 0, 0, 16)
            }
        }

        val imageView = ImageView(this).apply {
            setImageResource(R.drawable.holanda)
            layoutParams = LinearLayout.LayoutParams(600, 600).apply {
                setMargins(0, 0, 0, 16)
            }
        }

        val descriptionTextView = TextView(this).apply {
            text = """
                Guilherme Holanda é um jovem desenvolvedor com uma paixão inigualável pela tecnologia e inovação. Atualmente, estagia na empresa AmigoTech, onde trabalha em projetos que buscam transformar o mercado e entregar soluções de alta qualidade para os clientes. Guilherme está sempre buscando novos desafios e oportunidades para crescer profissionalmente, e seu foco é se tornar um desenvolvedor completo e de destaque na área.
                
                Fora do trabalho, Guilherme adora se envolver em comunidades de desenvolvedores, contribuir para projetos open-source e compartilhar seus conhecimentos com outros profissionais e entusiastas. Seu objetivo é continuar evoluindo e se tornar um líder no campo da tecnologia.
            """.trimIndent()
            textSize = 16f
            setTextColor(Color.BLACK)
        }

        val backButton = Button(this).apply {
            text = "Voltar para o Menu Principal"
            setOnClickListener {
                finish()
            }
            layoutParams = LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT
            ).apply {
                setMargins(0, 16, 0, 0)
            }
        }

        layout.addView(githubButton)
        layout.addView(companyButton)
        layout.addView(imageView)
        layout.addView(descriptionTextView)
        layout.addView(backButton)

        scrollView.addView(layout)

        setContentView(scrollView)

        startButtonRotationAnimation(githubButton)
        startButtonRotationAnimation(companyButton)
    }

    private fun openLink(url: String) {
        val intent = Intent(Intent.ACTION_VIEW)
        intent.data = Uri.parse(url)
        startActivity(intent)
    }

    private fun startButtonRotationAnimation(button: Button) {
        val animator = ObjectAnimator.ofFloat(button, "rotation", 0f, 360f).apply {
            duration = 2000
            repeatCount = ObjectAnimator.INFINITE
            repeatMode = ObjectAnimator.RESTART
        }
        animator.start()
    }
}
