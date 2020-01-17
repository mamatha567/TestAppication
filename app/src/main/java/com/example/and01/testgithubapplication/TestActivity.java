package com.example.and01.testgithubapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class TestActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView textView;
    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
        textView = findViewById(R.id.textview);
        button  = findViewById(R.id.btn_text);
        textView.setOnClickListener(this);
        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.textview:
                Toast.makeText(this, "TestActivity", Toast.LENGTH_SHORT).show();

                Toast.makeText(this, "TestActivity", Toast.LENGTH_SHORT).show();
                break;
            case R.id.btn_text:


                Toast.makeText(this, "TestActivity", Toast.LENGTH_SHORT).show();
                break;

        }
    }
}
