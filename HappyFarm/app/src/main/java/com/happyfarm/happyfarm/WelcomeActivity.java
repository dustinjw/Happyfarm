package com.happyfarm.happyfarm;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class WelcomeActivity extends AppCompatActivity implements View.OnClickListener{

    TextView mainLoginTxt, mainAccountTxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        mainLoginTxt = (TextView)findViewById(R.id.mainLoginTxt);
        mainLoginTxt.setOnClickListener(this);
        mainAccountTxt = (TextView)findViewById(R.id.mainAccountTxt);
        mainAccountTxt.setOnClickListener(this);
    }

    public void onClick(View v){
        if(v == mainLoginTxt) {
            Intent intent = new Intent(this,LoginActivity.class);
            startActivity(intent);
        }
        else if( v == mainAccountTxt){
            Intent intent = new Intent(this,AccountActivity.class);
            startActivity(intent);
        }
    }

}

