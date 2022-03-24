package android.com.jumpco.io.swoosh.controller


import android.com.jumpco.io.swoosh.EXTRA_PLAYER
import android.com.jumpco.io.swoosh.R
import android.com.jumpco.io.swoosh.model.Player
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_finish.*

class FinishActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)

        val player = intent.getParcelableExtra<Player>(EXTRA_PLAYER)


        if (player != null) {
            searcLeagueText.text = "Looking for ${player.league} ${player.skill} league near you..."
        }
    }
}