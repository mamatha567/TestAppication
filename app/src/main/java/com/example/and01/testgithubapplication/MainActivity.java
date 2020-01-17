package com.example.and01.testgithubapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
/*harsha*/
public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.btn_onClick);
        button.setOnClickListener(this);
        Toast.makeText(MainActivity.this,"new branch Test Toast",Toast.LENGTH_SHORT).show();
    }
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_onClick:
                Toast.makeText(this, " you clicked button", Toast.LENGTH_SHORT).show();
                break;
            case R.id.text :
                Toast.makeText(this, "textview Toast ", Toast.LENGTH_SHORT).show();
                break;

        }
        Toast.makeText(this, "mamatha", Toast.LENGTH_SHORT).show();
    }
}
