package com.kosse.nikolas.textAdventure;

import android.app.Application;
import android.content.Context;

/**
 * Created by nikolas.kosse on 3/18/2016.
 */

public class ContextSource extends Application {

    private static Context context;

    public void onCreate() {
        super.onCreate();
        ContextSource.context = getApplicationContext();
    }

    public static Context getAppContext() {
        return ContextSource.context;
    }
}

