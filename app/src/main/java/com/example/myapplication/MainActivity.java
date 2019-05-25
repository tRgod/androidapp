package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button databaseBtn;
    private Button firebaseBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        databaseBtn = (Button) findViewById(R.id.databaseBtn);
        firebaseBtn = (Button) findViewById(R.id.firebaseBtn);

        databaseBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(MainActivity.this, SQLDataBaseActivity.class);
                    startActivity(intent1);

            }
        });

       firebaseBtn.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent i = new Intent(MainActivity.this, FireBaseActivity.class);
               startActivity(i);
           }
       });
    }
}