package com.alisonjc.pre90secs_kotlin

import com.alisonjc.pre90secs_kotlin.model.Exercises
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.Retrofit
import com.google.gson.GsonBuilder
import com.google.gson.Gson
import io.reactivex.Observable
import okhttp3.OkHttpClient


class WorkoutService {

    companion object {
        fun create(): ExerciseInterface {
            val workoutUrl = "https://wger.de/api/v2/workout/"

            val retrofit = Retrofit.Builder()
                    .baseUrl(workoutUrl)
                    .client(OkHttpClient())
                    .addConverterFactory(GsonConverterFactory.create())
                    .build()

            return retrofit.create(ExerciseInterface::class.java)
        }

        fun getExercises(): Observable<Exercises> {
            return WorkoutService.create().getExercises(Constants.create().mToken)
        }
    }
}