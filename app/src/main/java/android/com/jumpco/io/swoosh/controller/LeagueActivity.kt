package android.com.jumpco.io.swoosh.controller

import android.com.jumpco.io.swoosh.EXTRA_PLAYER
import android.com.jumpco.io.swoosh.R
import android.com.jumpco.io.swoosh.databinding.ActivityLeagueBinding
import android.com.jumpco.io.swoosh.databinding.ActivitySkillBinding
import android.com.jumpco.io.swoosh.model.Player
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_league.*

class LeagueActivity : BaseActivity() {

    var player = Player("","")

    private lateinit var binding: ActivityLeagueBinding

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putParcelable(EXTRA_PLAYER,player)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       binding = ActivityLeagueBinding.inflate(layoutInflater) //initializing the binding class
        setContentView(binding.root)
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        if(savedInstanceState != null){
            player = savedInstanceState.getParcelable(EXTRA_PLAYER)!!
        }
    }

    fun onMensClicked(view: View){
        binding.womensLeagueBtn.isChecked = false
        binding.coedLeagueBtn.isChecked = false

        player.league = "mens"
    }

    fun onWomensClicked(view: View) {
        binding.mensLeagueBtn.isChecked = false
        binding.coedLeagueBtn.isChecked = false

        player.league = "womens"
    }

    fun onCoedClicked(view: View){
        binding.mensLeagueBtn.isChecked = false
        binding.womensLeagueBtn.isChecked = false

        player.league = "co-ed"
    }

    fun leagueNextClicked(view: View){

        if(player.league != "") {
            val skillActivity = Intent(this, SkillActivity::class.java)
            skillActivity.putExtra(EXTRA_PLAYER, player)
            startActivity(skillActivity)
        } else {
            Toast.makeText(this,"Please selected a league.",Toast.LENGTH_SHORT).show()
        }
    }
}