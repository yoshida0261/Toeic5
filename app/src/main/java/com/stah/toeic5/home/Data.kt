package com.stah.toeic5.home

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.*


@Entity
data class Score(
    @PrimaryKey val uid: Int,
    @ColumnInfo(name = "date") val date: Date,
    @ColumnInfo(name = "last_name") val lastName: String?
)

@Entity
data class User(
    @PrimaryKey val uid: Int,
    @ColumnInfo(name = "first_name") val firstName: String?,
    @ColumnInfo(name = "last_name") val lastName: String?
)
