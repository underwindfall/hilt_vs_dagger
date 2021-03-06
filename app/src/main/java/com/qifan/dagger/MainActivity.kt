package com.qifan.dagger

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.qifan.dagger.di.DaggerActivityComponent
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
    @Inject
    internal lateinit var mainPresenter: MainPresenter

    @Inject
    internal lateinit var string: String

    override fun onCreate(savedInstanceState: Bundle?) {
        DaggerActivityComponent.builder()
            .build()
            .inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        mainPresenter.attachView()
        Log.d("MainPresenterImp","$string")
        findViewById<Button>(R.id.button).setOnClickListener {
            startActivity(Intent(this, DummyActivity::class.java))
            finish()
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        mainPresenter.detachView()
    }
}