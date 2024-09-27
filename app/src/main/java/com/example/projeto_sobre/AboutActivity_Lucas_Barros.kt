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

class AboutActivity_Lucas_Barros : AppCompatActivity() {
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
            text = "Visitar GitHub"
            setOnClickListener {
                openLink("https://github.com/LuccaMontarroyos")
            }
            layoutParams = LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT
            ).apply {
                setMargins(0, 0, 0, 16)
            }
        }

        val titleTextView = TextView(this).apply {
            text = "Sobre Lucca Barros"
            textSize = 24f
            setTextColor(Color.BLACK)
            setPadding(0, 0, 0, 16)
        }

        val imageView1 = ImageView(this).apply {
            setImageResource(R.drawable.luca)
            layoutParams = LinearLayout.LayoutParams(600, 600).apply {
                setMargins(0, 0, 0, 16)
            }
        }

        val imageView2 = ImageView(this).apply {
            setImageResource(R.drawable.luca2)
            layoutParams = LinearLayout.LayoutParams(600, 600).apply {
                setMargins(0, 0, 0, 16)
            }
        }

        val imageView3 = ImageView(this).apply {
            setImageResource(R.drawable.luca3)
            layoutParams = LinearLayout.LayoutParams(600, 600).apply {
                setMargins(0, 0, 0, 16)
            }
        }

        val descriptionTextView = TextView(this).apply {
            text = """
                Meu foco atual é me tornar um Desenvolvedor Web Fullstack, atraído pelas tecnologias e pela dinâmica do desenvolvimento de sites e sistemas. Recentemente, trabalhei como instrutor de cursos por uma questão financeira, mas meu verdadeiro objetivo é conseguir uma posição como desenvolvedor júnior ou estagiário, onde possa crescer profissionalmente. No futuro, pretendo alcançar cargos como Dev Sênior ou Dev Chief, sempre buscando aprender mais e mais.
                
                Pessoalmente, sou tranquilo, amigável e sempre disposto a fazer novas amizades. Quando criança, sonhava em ser jogador de futebol, mas os planos mudaram e hoje estou muito feliz com o que posso alcançar. Minha família é grande e diversificada, com cinco irmãs de diferentes lados da família. Sinto muita falta da minha irmã que mora em San Francisco, assim como do meu pai, que está no Mato Grosso. Felizmente, tenho planos de vê-los em breve — meu pai vem para Recife no final do ano, e no próximo ano, farei uma viagem a Tóquio, onde verei minha irmã também.
                
                Em 2021, conheci minha namorada, e desde então estamos juntos. Compartilhamos o sonho de morar juntos e construir uma família, algo que estamos ansiosos para realizar. Recentemente, troquei o futebol pelo futevôlei, um esporte pelo qual me apaixonei. Treino toda semana e estou focado em melhorar e participar de campeonatos. Também comecei a frequentar a academia, algo que tem sido uma meta pessoal para ganhar mais peso e força. Até agora, estou vendo bons resultados.
                
                Sou fascinado por esportes em geral. Adoro assistir futebol, basquete, surf, e ultimamente comecei a me interessar por futebol americano também. O esporte faz parte da minha vida, tanto na prática quanto como espectador.
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
        layout.addView(titleTextView)
        layout.addView(imageView1)
        layout.addView(imageView2)
        layout.addView(imageView3)
        layout.addView(descriptionTextView)
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
