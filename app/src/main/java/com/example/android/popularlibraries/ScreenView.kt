package com.example.android.popularlibraries

import moxy.MvpView
import moxy.viewstate.strategy.alias.SingleState

interface ScreenView : MvpView {

    @SingleState
    fun showError(error: Throwable)

}