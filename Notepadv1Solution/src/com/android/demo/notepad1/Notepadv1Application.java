package com.android.demo.notepad1;

import gueei.binding.Binder;
import android.app.Application;

public class Notepadv1Application extends Application {
    /**
     * this method register the binding implementation
     * @see android.app.Application#onCreate()
     */
    @Override
    public void onCreate() {
        super.onCreate();
        Binder.init(this);
    }
}
