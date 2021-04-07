package com.submission.githubuserapplication

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView

class UserAdapter internal constructor(private val context: Context) : BaseAdapter(){
    internal var users = arrayListOf<User>()

    override fun getCount(): Int = users.size

    override fun getItem(position: Int): Any = users[position]

    override fun getItemId(position: Int): Long = position.toLong()

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        var itemView = convertView
        if (itemView == null) {
            itemView = LayoutInflater.from(context).inflate(R.layout.item_user, parent, false)
        }
        val viewHolder = ViewHolder(itemView as View)

        val user = getItem(position) as User
        viewHolder.bind(user)
        return itemView

    }

    private inner class ViewHolder(view: View) {
        private val tvName: TextView = view.findViewById(R.id.tv_item_name)
        private val tvUsername: TextView = view.findViewById(R.id.tv_item_username)
        private val imgPhoto: ImageView = view.findViewById(R.id.img_item_photo)
        private val tvCompany: TextView = view.findViewById(R.id.tv_item_company)
        fun bind(user: User) {
            tvName.text = user.name
            tvUsername.text = user.username
            tvCompany.text = user.company
            imgPhoto.setImageResource(user.avatar)
        }
    }
}