package com.example.and01.testgithubapplication;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ActivityH extends AppCompatActivity {
    Button bth;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activityh);
        bth = (Button) findViewById(R.id.btn);
        bth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(ActivityH.this,"Activityh",Toast.LENGTH_SHORT).show();
            }
        });
    }
}
