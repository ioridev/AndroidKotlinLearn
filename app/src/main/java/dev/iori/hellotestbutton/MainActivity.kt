package dev.iori.hellotestbutton

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var helloText : TextView = findViewById(R.id.textView1)
        var helloButton : Button = findViewById(R.id.button1)
        helloButton.setOnClickListener{
            helloText.text = "Androidアプリを作ってみました！"
        }

    }
}
