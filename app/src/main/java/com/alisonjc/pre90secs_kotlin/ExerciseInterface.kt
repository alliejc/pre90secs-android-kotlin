package com.alisonjc.pre90secs_kotlin

import com.alisonjc.pre90secs_kotlin.model.Exercises
import io.reactivex.Observable
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Query


interface ExerciseInterface {
    @GET("/exercise")
    fun getExercises(@Header("Authorization") bearerToken:String): Observable<Exercises>
}