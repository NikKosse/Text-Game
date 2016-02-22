package com.kosse.nikolas.textAdventure;

import android.support.test.runner.AndroidJUnit4;

import com.kosse.nikolas.textAdventure.Activities.GameActivity;
import com.kosse.nikolas.textAdventure.Activities.StartActivity;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.closeSoftKeyboard;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.doesNotExist;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;


import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith (AndroidJUnit4.class)
public class UI_Tests {

//    public UI_Tests() {
////        super(StartActivity.class);
//    }

    @Test
    public void newGameButtonLaunchesGame(){
        onView(withText("New Game"))
                .perform(click())
                .check(doesNotExist());
    }
}
