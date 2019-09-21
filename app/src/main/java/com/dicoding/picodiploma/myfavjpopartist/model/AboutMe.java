package com.dicoding.picodiploma.myfavjpopartist.model;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toolbar;

import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import com.dicoding.picodiploma.myfavjpopartist.MainActivity;
import com.dicoding.picodiploma.myfavjpopartist.R;

public class AboutMe extends AppCompatActivity {
    String title = "About Me";
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.about);
        ActionBar aBar = getSupportActionBar();
        getSupportActionBar().setTitle(title);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        setMenu(menuItem.getItemId());
        return super.onOptionsItemSelected(menuItem);
    }

    public void setMenu(int mode) {
        switch (mode){
            case R.id.AboutMe :
                break;

            case R.id.ListSingers:
                Intent pindah = new Intent(AboutMe.this,MainActivity.class);
                startActivity(pindah);
                break;
        }
    }
}
