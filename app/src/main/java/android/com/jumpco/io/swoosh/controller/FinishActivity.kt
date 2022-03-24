package android.com.jumpco.io.swoosh.controller


import android.com.jumpco.io.swoosh.EXTRA_PLAYER
import android.com.jumpco.io.swoosh.databinding.ActivityFinishBinding
import android.com.jumpco.io.swoosh.model.Player
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class FinishActivity : AppCompatActivity() {

    private lateinit var binding: ActivityFinishBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFinishBinding.inflate(layoutInflater) //initializing the binding class
        setContentView(binding.root)

        val player = intent.getParcelableExtra<Player>(EXTRA_PLAYER)


        if (player != null) {
            binding.searcLeagueText.text = "Looking for ${player.league} ${player.skill} league near you..."
        }
    }
}