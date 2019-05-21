package com.example.testswooshapp

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        getStartedbtn.setOnClickListener {

            val leagueIntent = Intent(this,LeagueActivity::class.java)
            startActivity(leagueIntent)
        }

    }
}
