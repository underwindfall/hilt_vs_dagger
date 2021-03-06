package com.qifan.hilt

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    @Inject
    internal lateinit var mainPresenter: MainPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mainPresenter.attachView()
        setContentView(R.layout.activity_main)
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