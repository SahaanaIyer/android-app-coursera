package com.example.block_08;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Intent caller = getIntent();
        float rating = caller.getFloatExtra("nbStars", 0);
        TextView textView = (TextView) findViewById(R.id.largeText);
        textView.setText("Welcome to the second activity! \nYour rating : " + rating);
    }
}
