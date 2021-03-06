package io.github.grishaninvyacheslav.my_courses_viewer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import io.github.grishaninvyacheslav.my_courses_viewer.ui.home.HomeFragment

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, HomeFragment.newInstance())
                .commitNow()
        }
    }
}