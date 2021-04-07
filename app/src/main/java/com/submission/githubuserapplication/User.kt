package com.submission.githubuserapplication

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class User (
    var username: String,
    var name: String,
    var company: String,
    var avatar: Int,
    var location: String,
    var repository: String,
    var followers: String,
    var following: String
):Parcelable