package com.alisonjc.pre90secs_kotlin;

import android.arch.lifecycle.Observer
import android.arch.lifecycle.ViewModelProviders
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import com.alisonjc.pre90secs_kotlin.model.Result

class MainActivity : AppCompatActivity() {
   var mExerciseViewModel:ExerciseViewModel? = null
    lateinit var mAdapter:ExerciseAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun setUpObservers(){
        mExerciseViewModel = ViewModelProviders.of(this).get(ExerciseViewModel::class.java)

        val exerciseObserver = object : Observer<List<Result>>{
            override fun onChanged(t: List<Result>) {
                mAdapter.updateAdapter(t)
            }
        }
    }

//    private void setUpObservers()
//    {
//        mModel = ViewModelProviders.of(this).get(MatchViewModel::class.java!!)
//
//        val datumObserver = object : Observer<List<Datum>> {
//            override fun onChanged(newDatumList: List<Datum>?) {
//                mAdapter.updateAdapter(newDatumList)
//            }
//        }
//
//        mModel.getDatumList().observe(this, datumObserver)
//    }
}
