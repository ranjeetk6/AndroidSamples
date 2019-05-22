package com.example.testswooshapp.Controller

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.view.View
import android.widget.Toast
import com.example.testswooshapp.Model.Player
import com.example.testswooshapp.R
import com.example.testswooshapp.Utilities.EXTRA_PLAYER
import kotlinx.android.synthetic.main.activity_skill.*

class SkillActivity : AppCompatActivity() {

    lateinit var player: Player

    override fun onSaveInstanceState(outState: Bundle?) {
        super.onSaveInstanceState(outState)

        outState?.putParcelable(EXTRA_PLAYER, player)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)

        player = intent.getParcelableExtra(EXTRA_PLAYER)
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle?) {
        super.onRestoreInstanceState(savedInstanceState)

        if(savedInstanceState != null) {
            player = savedInstanceState.getParcelable(EXTRA_PLAYER)
        }
    }

    fun onBeginnerClicked(view: View){
        ballerSkillbtn.isChecked = false
        player.skill = "beginner"
    }

    fun onBallerClicked(view:View){
        begineerSkillbtn.isChecked = false
        player.skill = "baller"

    }


    fun onSkillFinishClicked(view:View){

        if(player.skill != "") {
            val finishActivity = Intent(this, FinishActivity::class.java)
           finishActivity.putExtra(EXTRA_PLAYER, player)
            startActivity(finishActivity)
        } else {
            Toast.makeText(this, "Please select skill Btn", Toast.LENGTH_SHORT).show()
        }

    }

}
