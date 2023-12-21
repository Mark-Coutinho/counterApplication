package com.example.plusminus

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {

    private lateinit var minus:Button
    private lateinit var plus:Button
    private lateinit var text:TextView
    private var counter=0
    private lateinit var reset:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        minus = findViewById(R.id.minus)
        plus = findViewById(R.id.plus)
        text=findViewById(R.id.text)
        reset=findViewById(R.id.reset)

        minus.setOnClickListener(View.OnClickListener {
            if(counter!=0){
                counter-=1
            text.setText(counter.toString())}
            else
                text.setText(counter.toString())

        })

        plus.setOnClickListener(View.OnClickListener {

            counter+=1
            text.setText(counter.toString())


        })
        reset.setOnClickListener(View.OnClickListener {
            counter=0
            text.setText(counter.toString())
        })
    }

}