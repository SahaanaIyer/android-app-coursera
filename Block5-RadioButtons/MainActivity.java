package com.example.block_05;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.widget.RelativeLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.os.Bundle;
import android.graphics.Color;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SharedPreferences preferences = getSharedPreferences("COLOR_PREF", Context.MODE_PRIVATE);
        final SharedPreferences.Editor editor = preferences.edit();
        final RelativeLayout layout1 = (RelativeLayout) findViewById(R.id.layout1);

            if(preferences.contains(("colorId")))
                layout1.setBackgroundColor(preferences.getInt("colorId", 0));

        RadioGroup radioGroup_colors = (RadioGroup) findViewById(R.id.radioGroup_colors);
        radioGroup_colors.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                int colorCode = 0;
                switch (checkedId) {
                    case R.id.radioButton_blue:
                        colorCode = Color.BLUE;
                        break;
                    case R.id.radioButton_magenta:
                        colorCode = Color.MAGENTA;
                        break;
                    case R.id.radioButton_yellow:
                        colorCode = Color.YELLOW;
                        break;
                }
                layout1.setBackgroundColor(colorCode);
                editor.putInt("colorId",colorCode);
                editor.commit();
            }
        });
    }
}
