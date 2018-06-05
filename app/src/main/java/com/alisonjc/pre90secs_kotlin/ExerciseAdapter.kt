package com.alisonjc.pre90secs_kotlin

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.ViewGroup
import android.view.LayoutInflater
import com.alisonjc.pre90secs_kotlin.model.Result


class ExerciseAdapter: RecyclerView.Adapter<ExerciseViewHolder>() {
    var mList = listOf<Result>()

    override fun onBindViewHolder(holder: ExerciseViewHolder, position: Int) {
        holder.onBind(mList[holder.adapterPosition])
    }

    override fun getItemCount(): Int {
        return if(mList.size > 0){
            mList.size
        } else {
            0
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ExerciseViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val v = inflater.inflate(R.layout.item_exercise, parent, false)

        return ExerciseViewHolder(v)
    }

    fun updateAdapter(list: List<Result>){
        notifyDataSetChanged()
        mList = list
        notifyDataSetChanged()
    }
}