package com.example.android.popularlibraries.scheduler

import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers
import io.reactivex.rxjava3.core.Scheduler

class DefaultSchedulers : Schedulers {

    override fun background(): Scheduler = io.reactivex.rxjava3.schedulers.Schedulers.newThread()

    override fun main(): Scheduler = AndroidSchedulers.mainThread()
}