package com.dicoding.picodiploma.myfavjpopartist;

import android.app.Activity;
import android.content.Intent;
import android.media.Image;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

public class MainActivity2 extends AppCompatActivity {
    private String name,about,photo,url;
    private String title = "Detail Singer";

    @Override
    protected void onCreate(Bundle savedInstanceState){

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        ActionBar aBar = getSupportActionBar();
        getSupportActionBar().setTitle(title);
        getExtra();
        set();
    }
    private void getExtra() {
        Intent intent = getIntent();
        this.name= intent.getStringExtra("name");
        this.url = intent.getStringExtra("url");
        this.about = intent.getStringExtra("about");
        this.photo = intent.getStringExtra("photo");
    }
    private void set() {
        ImageView img = findViewById(R.id.img);
        TextView  title = findViewById(R.id.textTitle);
        TextView  about = findViewById(R.id.desc);
        Glide.with(this)
                .load(this.photo)
                .apply(new RequestOptions().override(350,200))
                .into(img);

        title.setText(this.name);
        about.setText(this.about);
    }

    public void urlOnclick(View v) {
        Intent x = new Intent(Intent.ACTION_VIEW, Uri.parse(this.url));
        startActivity(x);
    }
}
