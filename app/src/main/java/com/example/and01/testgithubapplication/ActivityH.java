package com.example.and01.testgithubapplication;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;

public class ActivityH extends AppCompatActivity {
    Button bth;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activityh);
        bth = (Button) findViewById(R.id.btn);
    }
}
