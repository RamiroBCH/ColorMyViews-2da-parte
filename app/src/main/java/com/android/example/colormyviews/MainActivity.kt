package com.android.example.colormyviews

import android.graphics.Color
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setListeners()
    }
    private fun makeColored(view: View){
        val boxthreetext = findViewById<TextView>(R.id.box_three_text)
        val boxfourtext = findViewById<TextView>(R.id.box_four_text)
        val boxfivetext = findViewById<TextView>(R.id.box_five_text)
        when(view.id){
            R.id.box_one_text -> view.setBackgroundColor(Color.DKGRAY)
            R.id.box_two_text -> view.setBackgroundColor(Color.GRAY)
            R.id.box_three_text -> view.setBackgroundColor(Color.BLUE)
            R.id.box_four_text -> view.setBackgroundColor(Color.MAGENTA)
            R.id.box_five_text -> view.setBackgroundColor(Color.BLUE)

            R.id.red_button -> boxthreetext.setBackgroundResource(R.color.my_red)
            R.id.yellow_button -> boxfourtext.setBackgroundResource(R.color.my_yellow)
            R.id.green_button -> boxfivetext.setBackgroundResource(R.color.my_green)

            else -> view.setBackgroundColor(Color.LTGRAY)
        }
    }
    private fun makeColoredTwo(view: View){
        when(view.id){
            R.id.box_one_text -> view.setBackgroundResource(R.drawable.drgray)
            R.id.box_two_text -> view.setBackgroundResource(R.drawable.gray)
            R.id.box_three_text -> view.setBackgroundResource(R.drawable.blue)
            R.id.box_four_text -> view.setBackgroundResource(R.drawable.magenta)
            R.id.box_five_text -> view.setBackgroundResource(R.drawable.blue)
            else -> view.setBackgroundResource(R.drawable.ltgray)
        }
    }
    private fun setListeners() {

        val boxOneText = findViewById<TextView>(R.id.box_one_text)
        val boxTwoText = findViewById<TextView>(R.id.box_two_text)
        val boxThreeText = findViewById<TextView>(R.id.box_three_text)
        val boxFourText = findViewById<TextView>(R.id.box_four_text)
        val boxFiveText = findViewById<TextView>(R.id.box_five_text)

        val rootConstraintLayout = findViewById<View>(R.id.constraint_layout)

        val redButton = findViewById<TextView>(R.id.red_button)
        val greenButton = findViewById<TextView>(R.id.green_button)
        val yellowButton = findViewById<TextView>(R.id.yellow_button)


        val clickableViews: List<View> =
            listOf(boxOneText, boxTwoText, boxThreeText,
                boxFourText, boxFiveText, rootConstraintLayout,
                redButton, greenButton, yellowButton
            )
        for (item in clickableViews) {
            item.setOnClickListener { makeColored(it) }
        }
    }
}