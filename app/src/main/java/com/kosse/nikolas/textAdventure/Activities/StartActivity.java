package com.kosse.nikolas.textAdventure.Activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.kosse.nikolas.textAdventure.R;

public class StartActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
    }


    public void startNew(View view){
        Intent intent = new Intent(StartActivity.this, GameActivity.class);
        StartActivity.this.startActivity(intent);
    }
}
