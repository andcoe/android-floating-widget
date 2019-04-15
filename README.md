# Android floating widget

This is a floating widget that can be used to display an icon over apps (it's a simpler version of Messenger's chat heads).

Uses kotlin, kotlin-android-extensions, androidx and the main components are:
* FloatingWidgetService => _android.app.Service_
    * This service makes it possible for the widget to live without being connected to specific activities or fragments
* FloatingWidgetView    => _androidx.constraintlayout.widget.ConstraintLayout_
    * This is responsible to layout the view

Current functionality includes:
* Asking for permissions to draw on top of apps on Android SDK > M
* Use the widget when the app in on foreground or background
* Drag the floating widget around
* Click detection (which can be used to trigger functionality)