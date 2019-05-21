package com.example.testswooshapp.Controller

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.testswooshapp.Utilities.EXTRA_LEGAUE
import com.example.testswooshapp.R
import com.example.testswooshapp.Utilities.EXTRA_SKILL
import kotlinx.android.synthetic.main.activity_skill.*

class SkillActivity : AppCompatActivity() {

    var league=""
    var skill=""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)

        league = intent.getStringExtra(EXTRA_LEGAUE)

        println(league)
    }

    fun onBeginnerClicked(view: View){
        ballerSkillbtn.isChecked = false
        skill = "beginner"
    }

    fun onBallerClicked(view:View){
        begineerSkillbtn.isChecked = false
        skill = "baller"

    }


    fun onSkillFinishClicked(view:View){

        if(skill != "") {
            val finishActivity = Intent(this, FinishActivity::class.java)
            finishActivity.putExtra(EXTRA_LEGAUE, league)
            finishActivity.putExtra(EXTRA_SKILL,skill)

            startActivity(finishActivity)
        } else {
            Toast.makeText(this, "Please select skill Btn", Toast.LENGTH_SHORT).show()
        }

    }

}
