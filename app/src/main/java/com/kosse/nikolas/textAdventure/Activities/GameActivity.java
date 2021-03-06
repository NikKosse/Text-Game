package com.kosse.nikolas.textAdventure.Activities;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.TextView;

import com.kosse.nikolas.textAdventure.Controllers.Locations.Camp;
import com.kosse.nikolas.textAdventure.Controllers.Locations.Forest;
import com.kosse.nikolas.textAdventure.R;

public class GameActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    private Forest _forest;
    private Camp _camp;
    private final String TAG = "GameActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        _forest = new Forest();
        _camp = new Camp();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.game, menu);
        return true;
    }
    @SuppressWarnings("if statement can be replaced")
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.save_game) {
            //TODO: implement save game
            return true;
        }

        if (id == R.id.load_game) {
            //TODO: implement load game
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_health) {
            // Handle the camera action
        } else if (id == R.id.nav_fatigue) {

        } else if (id == R.id.nav_intelligence) {

        } else if (id == R.id.nav_strength) {

        } else if (id == R.id.nav_speed) {

        } else if (id == R.id.nav_toughness) {

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    public void exploreForest(View view){
        TextView text = (TextView)findViewById(R.id.mainGameText);
        String updateText = _forest.getActionText();

        text.setText(updateText);
        Button exploreButton =  (Button)findViewById(R.id.exploreButton);
        exploreButton.setVisibility(View.GONE);

    }
}
