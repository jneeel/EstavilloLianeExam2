package com.liane.estavillo.estavillolianeexam1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
    }
    public void process2 (View v) {
        Intent i = null, chooser = null;
        if (v.getId() == R.id.button3) {
            i = new Intent(this, MainActivity.class);
            startActivity(i);
        }

    }
}
