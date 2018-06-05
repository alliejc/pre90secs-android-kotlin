package com.alisonjc.pre90secs_kotlin.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName


data class Result(
        @SerializedName("id")
        @Expose
        val id: Int?,
        @SerializedName("license_author")
        @Expose
        val licenseAuthor: String?,
        @SerializedName("status")
        @Expose
        val status: String?,
        @SerializedName("description")
        @Expose
        val description: String?,
        @SerializedName("name")
        @Expose
        val name: String?,
        @SerializedName("name_original")
        @Expose
        val nameOriginal: String?,
        @SerializedName("creation_date")
        @Expose
        val creationDate: String?,
        @SerializedName("uuid")
        @Expose
        val uuid: String?,
        @SerializedName("license")
        @Expose
        val license: Int?,
        @SerializedName("category")
        @Expose
        val category: Int?,
        @SerializedName("language")
        @Expose
        val language: Int?,
        @SerializedName("muscles")
        @Expose
        val muscles: List<Int>?,
        @SerializedName("muscles_secondary")
        @Expose
        val musclesSecondary: List<Int>?,
        @SerializedName("equipment")
        @Expose
        val equipment: List<Int>?
)