package com.android.insulive.domain.models

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.Index
import androidx.room.PrimaryKey

@Entity(indices = [Index(value = ["id", "firstName", "lastName"])])
data class ClientUser (

    @PrimaryKey var id: Long? = -1,

    @ColumnInfo(name="id") private var serverId: String? = "-1",
    private var firstName: String? = null,
    private var lastName: String? = null,
    private var token: String? = null,
    private var email: String? = null

)