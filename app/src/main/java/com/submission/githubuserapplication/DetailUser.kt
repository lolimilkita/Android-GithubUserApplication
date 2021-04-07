package com.submission.githubuserapplication

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class DetailUser : AppCompatActivity() {
    companion object {
        const val EXTRA_USER = "extra_user"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_user)

        val actionbar = supportActionBar
        actionbar!!.title= "Detail User"

        val imgPhoto: ImageView = findViewById(R.id.img_item_photo)
        val tvName: TextView = findViewById(R.id.tv_item_name)
        val tvUsername: TextView = findViewById(R.id.tv_item_username)
        val tvCompany: TextView = findViewById(R.id.tv_item_company)
        val tvRepository: TextView = findViewById(R.id.tv_repository)
        val tvFollowers: TextView = findViewById(R.id.tv_followers)
        val tvFollowing: TextView = findViewById(R.id.tv_following)
        val tvLocation:TextView = findViewById(R.id.tv_location)
        val btnShare: Button = findViewById(R.id.btn_set_share)

        val dataUser = intent.getParcelableExtra<User>(EXTRA_USER)

        if (dataUser != null) {
            tvName.text = dataUser.name
            imgPhoto.setImageResource(dataUser.avatar)
            tvUsername.text = dataUser.username
            tvCompany.text = dataUser.company
            tvRepository.text = dataUser.repository
            tvFollowers.text = dataUser.followers
            tvFollowing.text = dataUser.following
            tvLocation.text = dataUser.location

            btnShare.setOnClickListener {
                Toast.makeText(this,"Share " + tvName.text, Toast.LENGTH_SHORT).show()
            }
        }
    }
}