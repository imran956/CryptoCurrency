package com.example.cryptocurrency.data.remote.dto

import com.example.cryptocurrency.domain.model.Coin
import com.google.gson.annotations.SerializedName

data class CoinDto(
    val id: String,
    @SerializedName("is_active")
    val is_active: Boolean,
    @SerializedName("is_new")
    val is_new: Boolean,
    val name: String,
    val rank: Int,
    val symbol: String,
    val type: String
)

fun CoinDto.toCoin() = Coin(
    id = id,
    is_active = is_active,
    name = name,
    rank = rank,
    symbol = symbol
)