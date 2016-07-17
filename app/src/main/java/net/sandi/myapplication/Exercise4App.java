package net.sandi.myapplication;

import android.app.Application;
import android.content.Context;

/**
 * Created by UNiQUE on 7/1/2016.
 */
public class Exercise4App extends Application {

    private static Context context;

    @Override
    public void onCreate() {
        super.onCreate();
        context = getApplicationContext();
    }

    public static Context getContext() {
        return context;
    }
}
