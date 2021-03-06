package com.qifan.dagger

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.qifan.dagger.di.DaggerActivityComponent
import javax.inject.Inject

class DummyActivity : AppCompatActivity() {

    @Inject
    internal lateinit var mainPresenter: MainPresenter

    override fun onCreate(savedInstanceState: Bundle?) {

        DaggerActivityComponent.builder()
            .build()
            .inject(this)

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dummy)

        findViewById<Button>(R.id.button).setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
            finish()
        }
    }
}