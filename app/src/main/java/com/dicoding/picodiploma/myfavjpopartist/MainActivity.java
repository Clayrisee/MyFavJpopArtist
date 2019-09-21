package com.dicoding.picodiploma.myfavjpopartist;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.dicoding.picodiploma.myfavjpopartist.adapter.ListSingerAdapter;
import com.dicoding.picodiploma.myfavjpopartist.model.AboutMe;
import com.dicoding.picodiploma.myfavjpopartist.model.Singer;
import com.dicoding.picodiploma.myfavjpopartist.model.SingersData;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvSingers;
    private ArrayList<Singer> list = new ArrayList<>();
    private String title = "J-pop Singers";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ActionBar aBar = getSupportActionBar();
        getSupportActionBar().setTitle(title);
        rvSingers = findViewById(R.id.rv_singers);
        rvSingers.setHasFixedSize(true);

        list.addAll(SingersData.getListData());
        showRecyclerView();
    }

    public void showRecyclerView() {
        rvSingers.setLayoutManager(new LinearLayoutManager(this));
        ListSingerAdapter listSingerAdapter = new ListSingerAdapter(this);
        listSingerAdapter.setListSinger(list);
        rvSingers.setAdapter(listSingerAdapter);

        ItemClickSupport.addTo(rvSingers).setOnItemClickListener(new ItemClickSupport.OnItemClickListener() {
                    @Override
                    public void onItemClicked(RecyclerView recyclerView, int position, View v) {
                        showSelectedItem(list.get(position));
                    }});
    }
    private void showSelectedItem(Singer singer){
        Intent i = new Intent(getBaseContext(),MainActivity2.class);
        i.putExtra("name", singer.getName());
        i.putExtra("about",singer.getAbout());
        i.putExtra("photo",singer.getPhoto());
        i.putExtra("url",singer.getUrl());
        startActivity(i);
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
        switch (mode) {
            case R.id.AboutMe:
                Intent pindah = new Intent(MainActivity.this, AboutMe.class);
                startActivity(pindah);
                break;

        }
    }
}
