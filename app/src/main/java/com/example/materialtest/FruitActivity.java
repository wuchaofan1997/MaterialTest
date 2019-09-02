package com.example.materialtest;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.google.android.material.appbar.CollapsingToolbarLayout;

public class FruitActivity extends AppCompatActivity {
public static final String fruitname="fruit_name";
    public static final String fruitimageid="fruit_image_id";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fruit);
        Intent intent=getIntent();
        String fruitName=intent.getStringExtra(fruitname);
        int fruitImagrId=intent.getIntExtra(fruitimageid,0);
        Toolbar toolbar=(Toolbar)findViewById(R.id.toolbar);
        CollapsingToolbarLayout collapsingToolbar=(CollapsingToolbarLayout)
                findViewById(R.id.collapsing_toolbar);
        ImageView fruitImageView=(ImageView)findViewById(R.id.fruit_image_view);
        TextView fruitcontentText=(TextView)findViewById(R.id.fruit_content_text);
        setSupportActionBar(toolbar);
        ActionBar actionBar=getSupportActionBar();
        if (actionBar !=null){
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
        collapsingToolbar.setTitle(fruitName);
        Glide.with(this).load(fruitImagrId).into(fruitImageView);
        String fruicontent=gennerateFruitContent(fruitname);
        fruitcontentText.setText(fruicontent);
    }
    private String gennerateFruitContent(String fruitname){
        StringBuilder fruitcontent=new StringBuilder();
        for (int i=0;i<30;i++){
            fruitcontent.append(fruitname);
        }
        return fruitcontent.toString();
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case android.R.id.home:
                finish();
                return  true;
        }
        return  super.onOptionsItemSelected(item);
    }
}
