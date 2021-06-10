package com.example.pat2rpl;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.fonts.Font;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.pat2rpl.Lifecycle.lifecycleActivity;
import com.example.pat2rpl.UIApp.YuAiActivity;
import com.example.pat2rpl.isiApp.IsiActivity;

public class RootActivity extends AppCompatActivity {

    Button aplikasiBiodata;
    Button aplikasiUI;
    Button aplikasiLifecycle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_root);
        aplikasiBiodata = findViewById(R.id.Biodata_btn);
        aplikasiUI = findViewById(R.id.Yuai_btn);
        aplikasiLifecycle = findViewById(R.id.lifecycle);


        aplikasiBiodata.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent abc;
                abc = new Intent(RootActivity.this, IsiActivity.class);
                startActivity(abc);
                finish();
            }
        });
        aplikasiUI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent abc;
                abc = new Intent(RootActivity.this, YuAiActivity.class);
                startActivity(abc);
                finish();
            }
        });
        aplikasiLifecycle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent abc;
                abc = new Intent(RootActivity.this, lifecycleActivity.class);
                startActivity(abc);
                finish();
            }
        });


        
    }
}