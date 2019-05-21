package com.example.testswooshapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_league.*

class LeagueActivity : BaseActivity() {

    var selectedLeague = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)
    }


    fun onMensClicked(view:View){
        womenslegaueBtn.isChecked = false
        coedlegaueBtn.isChecked = false

        selectedLeague = "mens"
    }

    fun onWomensClicked(view:View){
        mensleagueBtn.isChecked = false
        coedlegaueBtn.isChecked = false

        selectedLeague = "womens"

    }

    fun onCoedClicked(view: View){
        mensleagueBtn.isChecked = false
        womenslegaueBtn.isChecked = false

        selectedLeague = "co-ed"

    }

    fun leageNextClicked(view: View){

        if(selectedLeague !="") {

            val skillactivity = Intent(this, SkillActivity::class.java)
            skillactivity.putExtra(EXTRA_LEGAUE, selectedLeague)
            startActivity(skillactivity)
        } else {
            Toast.makeText(this, "Please select legaue Btn", Toast.LENGTH_SHORT).show()
        }
    }

}
