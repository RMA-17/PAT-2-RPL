package com.example.pat2rpl;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.pat2rpl.isiApp.IsiActivity;

public class RootActivity extends AppCompatActivity {

    Button aplikasiBiodata;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_root);
        aplikasiBiodata = findViewById(R.id.Biodata_btn);

        aplikasiBiodata.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent abc;
                abc = new Intent(RootActivity.this, IsiActivity.class);
                startActivity(abc);
                finish();
            }
        });


        
    }
}