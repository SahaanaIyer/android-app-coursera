package com.example.block_01;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button blue_button, purple_button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        blue_button = (Button) findViewById(R.id.blue_button);
        purple_button = (Button) findViewById(R.id.purple_button);
    }

    public void todo(View v) {
        if(v.equals(blue_button))
            v.setVisibility(View.INVISIBLE);
        if(v.equals(purple_button))
            Toast.makeText(getApplicationContext(),
                    "Todo...Todo...Todo...",
                    Toast.LENGTH_LONG).show();
    }
}
