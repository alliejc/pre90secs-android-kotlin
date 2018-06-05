package com.alisonjc.pre90secs_kotlin.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName


class Exercises (
    @SerializedName("count")
    @Expose
    val count: Int?,
    @SerializedName("next")
    @Expose
    val next: String?,
    @SerializedName("previous")
    @Expose
    val previous: Any?,
    @SerializedName("results")
    @Expose
    val results: List<Result>
)