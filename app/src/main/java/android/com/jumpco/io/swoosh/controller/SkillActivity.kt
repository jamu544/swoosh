package android.com.jumpco.io.swoosh.controller



import android.com.jumpco.io.swoosh.EXTRA_PLAYER
import android.com.jumpco.io.swoosh.R
import android.com.jumpco.io.swoosh.databinding.ActivitySkillBinding
import android.com.jumpco.io.swoosh.model.Player
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast

class SkillActivity : BaseActivity() {

    lateinit var player : Player
    private lateinit var binding: ActivitySkillBinding

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putParcelable(EXTRA_PLAYER, player)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySkillBinding.inflate(layoutInflater) //initializing the binding class
        setContentView(binding.root)

        player = intent.getParcelableExtra(EXTRA_PLAYER)!!

    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        if (savedInstanceState != null){
            player = savedInstanceState.getParcelable(EXTRA_PLAYER)!!

        }
    }

    fun onBallerClick(view: View) {
        binding.beginnerSkillBtn.isChecked = false
        player.skill = "baller"
    }
    fun onBeginnerClick(view: View){
        binding.ballerSkillBtn.isChecked = false
        player.skill = "beginner"
    }

    fun onSkillFinishClick(view: View) {
          if(player.skill != ""){
            val finishActivity = Intent(this, FinishActivity::class.java)
              finishActivity.putExtra(EXTRA_PLAYER,player)

            startActivity(finishActivity)
        } else {
            Toast.makeText(this,"Please select a skill level", Toast.LENGTH_SHORT).show()
          }
    }
}