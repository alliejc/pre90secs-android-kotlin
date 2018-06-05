package com.alisonjc.pre90secs_kotlin

import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel
import com.alisonjc.pre90secs_kotlin.model.Exercises
import com.alisonjc.pre90secs_kotlin.model.Result
import io.reactivex.Observable
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.schedulers.Schedulers

class ExerciseViewModel: ViewModel() {
    private lateinit var exerciseList: MutableLiveData<List<Result>>


    fun loadExerciseList() {
        val service:ExerciseInterface = WorkoutService.create()

        val o:Observable<Exercises> = service.getExercises(Constants.create().mToken)
        o.subscribeOn(Schedulers.newThread())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe({ exercises ->
                    val list = exercises.results
                    exerciseList.setValue(list)
                }, { throwable -> System.out.print(throwable.message) }
                )
    }

    fun getExerciseList(): MutableLiveData<List<Result>> {
        return exerciseList;
    }
}