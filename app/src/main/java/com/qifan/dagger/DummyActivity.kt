package com.qifan.dagger

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.qifan.dagger.di.DaggerAppComponent
import javax.inject.Inject

class DummyActivity : AppCompatActivity() {

    @Inject
    internal lateinit var mainPresenter: MainPresenter

    override fun onCreate(savedInstanceState: Bundle?) {

        DaggerAppComponent.create()
            .inject(this)

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dummy)

        findViewById<Button>(R.id.button).setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
            finish()
        }
    }
}