package com.example.uts_appsederhana;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button activity = findViewById(R.id.activity);
        activity.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(MainActivity.this,activity.class);
                startActivity(intent);
            }
        });

        Button service = findViewById(R.id.service);
        service.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(MainActivity.this,service.class);
                startActivity(intent);
            }
        });

        Button broadcastreceiver = findViewById(R.id.broadcastreceiver);
        broadcastreceiver.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(MainActivity.this,broadcastreceiver.class);
                startActivity(intent);
            }
        });

        Button contentprovider = findViewById(R.id.contentprovider);
        contentprovider.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(MainActivity.this,contentprovider.class);
                startActivity(intent);
            }
        });

        Button manifest = findViewById(R.id.manifest);
        manifest.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(MainActivity.this,manifest.class);
                startActivity(intent);
            }
        });

    }
}
