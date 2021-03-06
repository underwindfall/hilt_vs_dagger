package com.qifan.hilt

import android.util.Log

class MainPresenterImpl : MainPresenter {
    override fun attachView() {
        Log.d(MainPresenterImpl::class.java.simpleName, "AttachView")
    }

    override fun detachView() {
        Log.d(MainPresenterImpl::class.java.simpleName, "DeAttachView")
    }
}