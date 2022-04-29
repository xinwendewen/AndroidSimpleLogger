package com.xinwendewen.android.logger

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import java.time.Instant

class MainActivity : AppCompatActivity() {
    val loggerFactory = LoggerFactory("demo")
    val logger = loggerFactory.createLogger("MainActivity")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    override fun onPause() {
        super.onPause()
        logger.debug("onPause at:%s", Instant.now())
    }

    override fun onResume() {
        super.onResume()
        logger.debug("onResume")
    }

    override fun onDestroy() {
        super.onDestroy()
        logger.info("activity destroy")
    }
}
