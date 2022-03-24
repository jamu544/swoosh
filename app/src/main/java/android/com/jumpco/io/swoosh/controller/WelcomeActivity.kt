package android.com.jumpco.io.swoosh.controller

import android.com.jumpco.io.swoosh.databinding.ActivitySkillBinding
import android.com.jumpco.io.swoosh.databinding.ActivityWelcomeBinding
import android.content.Intent
import android.os.Bundle

class WelcomeActivity : BaseActivity() {

    private lateinit var binding: ActivityWelcomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityWelcomeBinding.inflate(layoutInflater) //initializing the binding class
        setContentView(binding.root)

        binding.getStartedBtn.setOnClickListener{
            val leagueIntent = Intent(this, LeagueActivity::class.java)
            startActivity(leagueIntent)
        }

    }
}