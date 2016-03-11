package com.kosse.nikolas.textAdventure.Controllers.Locations;

import android.content.Context;

import com.kosse.nikolas.textAdventure.R;

/**
 * Forest location class
 */
public class Forest {

    public Forest(){}

    public String getActionText(Context context){

        String text = context.getString(R.string.forest_text);
        return text;
    }


}
