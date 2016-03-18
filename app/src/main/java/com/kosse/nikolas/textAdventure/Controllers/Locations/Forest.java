package com.kosse.nikolas.textAdventure.Controllers.Locations;

import android.content.Context;
import android.util.Log;

import com.kosse.nikolas.textAdventure.ContextSource;
import com.kosse.nikolas.textAdventure.R;

/**
 * Forest location class
 */
public class Forest {

    private final String TAG = "Forest.java";

    public Forest(){
    }

    public String getActionText(){
        Context context = ContextSource.getAppContext();
        String text = context.getString(R.string.forest_text);
        return text;
    }


}
