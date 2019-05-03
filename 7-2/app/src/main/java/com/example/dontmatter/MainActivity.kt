package com.example.dontmatter

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    var java = 0
    var network = 0
    var database = 0

    var total = 0
    var ave = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        java = editTextJava.text.toString().toInt()
        network = editTextNetwork.text.toString().toInt()
        database = editTextDatabase.text.toString().toInt()

        buttonTotal.setOnClickListener{

            total = java + network + database
            editTextTotal.setText(total)
        }

        buttonAverage.setOnClickListener{

            ave = total/3
            editTextAverage.setText(ave)

            if (ave >= 90) {
                tvGrade.text = "A"
            }
            else if (ave >= 80) {
                tvGrade.text = "B"
            }
            else if (ave >= 70){
                tvGrade.text = "C"
            }
            else if (ave >= 60){
                tvGrade.text = "D"
            }
            else{
                tvGrade.text = "F"
            }

        }
    }
}
