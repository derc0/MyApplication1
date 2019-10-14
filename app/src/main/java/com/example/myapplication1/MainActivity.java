package com.example.myapplication1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Button myButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myButton = (Button) findViewById(R.id.button_magic);
    }

    public void seeMagic(View v)
    {
        if(v.equals(myButton))
        {
            v.setVisibility(View.INVISIBLE);
            Toast.makeText(getApplicationContext(),"MAGIC :P",Toast.LENGTH_SHORT).show();
        }
    }
}
