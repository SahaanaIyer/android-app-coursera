package com.example.block_03;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    Button button_small = (Button) findViewById(R.id.button_small);
    Button button_big = (Button) findViewById(R.id.button_big);
    Button button_north = (Button) findViewById(R.id.button_north);
    Button button_south = (Button) findViewById(R.id.button_south);
    Button button_east = (Button) findViewById(R.id.button_east);
    Button button_west = (Button) findViewById(R.id.button_west);
    Button button_sw = (Button) findViewById(R.id.button_sw);
    Button button_se = (Button) findViewById(R.id.button_se);
    Button button_ne = (Button) findViewById(R.id.button_ne);
    Button button_nw = (Button) findViewById(R.id.button_nw);
    Button button_center = (Button) findViewById(R.id.button_center);
}
