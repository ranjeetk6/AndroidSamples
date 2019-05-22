package com.example.testswooshapp.Controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.testswooshapp.Model.Player
import com.example.testswooshapp.R
import com.example.testswooshapp.Utilities.EXTRA_PLAYER
import kotlinx.android.synthetic.main.activity_finish.*

class FinishActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)

        //val league = intent.getStringExtra(EXTRA_LEGAUE)
        //val skill = intent.getStringExtra(EXTRA_SKILL)

        val player = intent.getParcelableExtra<Player>(EXTRA_PLAYER)

        searchLeagueText.text = "Looking for ${player.league }, ${player.skill} league near you ..."
    }

}
