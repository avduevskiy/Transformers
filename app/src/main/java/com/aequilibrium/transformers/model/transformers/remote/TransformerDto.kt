package com.aequilibrium.transformers.model.transformers.remote

import com.google.gson.annotations.SerializedName

data class TransformerDto(
    @SerializedName("id")
    val id: String?,
    @SerializedName("name")
    val name: String?,
    @SerializedName("team")
    val team: String?,
    @SerializedName("strength")
    val strength: Int?,
    @SerializedName("intelligence")
    val intelligence: Int?,
    @SerializedName("speed")
    val speed: Int?,
    @SerializedName("endurance")
    val endurance: Int?,
    @SerializedName("rank")
    val rank: Int?,
    @SerializedName("courage")
    val courage: Int?,
    @SerializedName("firepower")
    val firepower: Int?,
    @SerializedName("skill")
    val skill: Int?,
    @SerializedName("team_icon")
    val teamIcon: String?,
)