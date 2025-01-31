package mx.edu.itson.guessthenumber

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    var minValue=0
    var maxValue=100
    var num:Int=0
    var won=false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val guesssings: TextView = findViewById(R.id.guessings)
        val down: Button = findViewById(R.id.down)
        val up:Button = findViewById(R.id.up)
        val generate:Button = findViewById(R.id.generate)
        val guessed:Button = findViewById(R.id.guessed)

        generate.setOnClickListener{
            num= Random.nextInt(minValue,maxValue)
        }
    }
}