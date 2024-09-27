package com.example.projeto_sobre

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

class AboutActivity_Joao_Victor : AppCompatActivity() {
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

        fun createSection(title: String, description: String, imageResId: Int): LinearLayout {
            return LinearLayout(this@AboutActivity_Joao_Victor).apply {
                orientation = LinearLayout.VERTICAL
                setPadding(0, 0, 0, 24)

                val sectionTitle = TextView(this@AboutActivity_Joao_Victor).apply {
                    text = title
                    textSize = 20f
                    setTextColor(Color.BLACK)
                    setPadding(0, 0, 0, 8)
                }

                val imageView = ImageView(this@AboutActivity_Joao_Victor).apply {
                    setImageResource(imageResId)
                    layoutParams = LinearLayout.LayoutParams(400, 400).apply {
                        setMargins(0, 0, 0, 8)
                    }
                }

                val descriptionTextView = TextView(this@AboutActivity_Joao_Victor).apply {
                    text = description
                    textSize = 16f
                    setTextColor(Color.BLACK)
                }

                addView(sectionTitle)
                addView(imageView)
                addView(descriptionTextView)
            }
        }

        layout.addView(createSection(
            "Minha Infância: ",
            "Bem, minha infância foi muito divertida. Sempre fui uma criança aventureira e acelerada. Gostava de praticar esportes, brincar de pega-pega e esconde-esconde, porém tinha meu lado caseiro: Sempre gostei de passar um tempo com minha família, escutar sobre as histórias de vida dos meus parentes, ver filmes com meus pais e o principal pra mim, o almoço em família nos domingos.",
            R.drawable.joao_infancia
        ))

        layout.addView(createSection(
            "Minha adolescência: ",
            "Já minha adolescência foi bem diferente da minha infância... Descobri os e-sports onde criei uma paixão pelo jogo de FPS chamado CS:GO. Foi a partir da paixão pelos jogos que tomei a decisão de cursar ciência da computação e me tornar um programador.",
            R.drawable.joao_adolescencia
        ))

        layout.addView(createSection(
            "Meus Hobbies: ",
            "Hoje em dia tenho como hobbies: Jogar no computador, treinar na academia, jogar bola e jogar vôlei.",
            R.drawable.joao_hobies
        ))

        layout.addView(createSection(
            "Planejamentos Profissionais: ",
            "Como planejamento profissional: atualmente estou em busca de estágio na área de engenharia de software, como desenvolvedor full-stack e pretendo seguir por esse caminho pro resto da minha vida.",
            R.drawable.joao_planejamento
        ))

        layout.addView(createSection(
            "Futuro Pessoal: ",
            "E planejando meu futuro pessoal pretendo construir uma linda família com minha namorada e ganhar muito dinheiro para poder viajar o mundo todo.",
            R.drawable.joao_futuro
        ))

        val socialLayout = LinearLayout(this).apply {
            orientation = LinearLayout.HORIZONTAL
            setPadding(0, 24, 0, 0)

            val instagramIcon = ImageView(this@AboutActivity_Joao_Victor).apply {
                setImageResource(R.drawable.instagram)
                layoutParams = LinearLayout.LayoutParams(100, 100).apply {
                    setMargins(16, 0, 16, 0)
                }
                setOnClickListener {
                    openLink("https://www.instagram.com/joaovneves_")
                }
            }
            val linkedInIcon = ImageView(this@AboutActivity_Joao_Victor).apply {
                setImageResource(R.drawable.linkedln)
                layoutParams = LinearLayout.LayoutParams(100, 100).apply {
                    setMargins(16, 0, 16, 0)
                }
                setOnClickListener {
                    openLink("https://www.linkedin.com/in/joão-victor-neves-de-souza-3a81891a8")
                }
            }
            val githubIcon = ImageView(this@AboutActivity_Joao_Victor).apply {
                setImageResource(R.drawable.github)
                layoutParams = LinearLayout.LayoutParams(100, 100).apply {
                    setMargins(16, 0, 16, 0)
                }
                setOnClickListener {
                    openLink("https://www.github.com/joaovictorns")
                }
            }

            addView(instagramIcon)
            addView(linkedInIcon)
            addView(githubIcon)
        }

        layout.addView(socialLayout)

        val backButton = Button(this).apply {
            text = "Voltar para o Menu Principal"
            setOnClickListener {
                finish()
            }
            layoutParams = LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT
            ).apply {
                setMargins(0, 50, 0, 0)
            }
        }

        layout.addView(backButton)

        scrollView.addView(layout)

        setContentView(scrollView)
    }

    private fun openLink(url: String) {
        val intent = Intent(Intent.ACTION_VIEW)
        intent.data = Uri.parse(url)
        startActivity(intent)
    }
}
