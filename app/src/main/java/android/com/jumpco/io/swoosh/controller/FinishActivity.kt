package android.com.jumpco.io.swoosh.controller

import android.com.jumpco.io.swoosh.EXTRA_LEAGUE
import android.com.jumpco.io.swoosh.EXTRA_SKILL
import android.com.jumpco.io.swoosh.R
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_finish.*

class FinishActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)

        val league = intent.getStringExtra(EXTRA_LEAGUE)
        val skill = intent.getStringExtra(EXTRA_SKILL)

        searcLeagueText.text = "Looking for $league $skill league near you..."
    }
}