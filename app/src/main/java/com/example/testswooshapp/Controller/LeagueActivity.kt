package com.example.testswooshapp.Controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.testswooshapp.Model.Player
import com.example.testswooshapp.R
import com.example.testswooshapp.Utilities.EXTRA_PLAYER
import kotlinx.android.synthetic.main.activity_league.*

class LeagueActivity : BaseActivity() {

    var player = Player("","")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)
    }


    fun onMensClicked(view:View){
        womenslegaueBtn.isChecked = false
        coedlegaueBtn.isChecked = false

        player.league = "mens"
    }

    fun onWomensClicked(view:View){
        mensleagueBtn.isChecked = false
        coedlegaueBtn.isChecked = false

        player.league = "womens"

    }

    fun onCoedClicked(view: View){
        mensleagueBtn.isChecked = false
        womenslegaueBtn.isChecked = false

        player.league = "co-ed"

    }

    fun leageNextClicked(view: View){

        if(player.league !="") {

            val skillactivity = Intent(this, SkillActivity::class.java)
            skillactivity.putExtra(EXTRA_PLAYER, player)
            startActivity(skillactivity)
        } else {
            Toast.makeText(this, "Please select legaue Btn", Toast.LENGTH_SHORT).show()
        }
    }

}
