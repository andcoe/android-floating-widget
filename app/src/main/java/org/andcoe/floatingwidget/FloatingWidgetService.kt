package org.andcoe.floatingwidget

import android.app.Service
import android.content.Context
import android.content.Intent
import android.os.IBinder
import android.view.WindowManager

class FloatingWidgetService : Service() {

    private lateinit var windowManager: WindowManager
    private lateinit var floatingWidgetView: FloatingWidgetView

    override fun onCreate() {
        super.onCreate()
        windowManager = getSystemService(Context.WINDOW_SERVICE) as WindowManager
        floatingWidgetView = FloatingWidgetView(this)
    }

    override fun onBind(intent: Intent?): IBinder? {
        return null
    }

    override fun onDestroy() {
        super.onDestroy()

        if(::windowManager.isInitialized) windowManager.removeView(floatingWidgetView)
    }


}
