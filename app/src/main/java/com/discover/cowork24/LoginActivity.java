package com.discover.cowork24;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener{

    Toolbar mToolbar;
    ActionBar mActionBar;

    ImageView mImageViewFindPeople, mImageViewCreateHotspot;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        instantiateViews();
        setActionBar();

        mImageViewFindPeople.setOnClickListener(this);
        mImageViewCreateHotspot.setOnClickListener(this);

    }

    public void instantiateViews(){
        mToolbar = (Toolbar) findViewById(R.id.toolbar);
        mImageViewFindPeople = (ImageView) findViewById(R.id.imageViewFindPeople);
        mImageViewCreateHotspot = (ImageView) findViewById(R.id.imageViewCreateHotspot);
    }

    public void setActionBar(){

        setSupportActionBar(mToolbar);
        mActionBar = getSupportActionBar();
        mActionBar.setDisplayShowHomeEnabled(true);
        mActionBar.setDisplayUseLogoEnabled(true);
        mActionBar.setLogo(R.drawable.app_icon);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.imageViewFindPeople:
                Intent intent = new Intent(LoginActivity.this, MapsFinderActivity.class);
                startActivity(intent);
                break;

            case R.id.imageViewCreateHotspot:

                break;
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_login, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
