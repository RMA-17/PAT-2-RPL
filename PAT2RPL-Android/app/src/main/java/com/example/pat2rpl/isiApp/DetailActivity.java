package com.example.pat2rpl.isiApp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

import com.example.pat2rpl.R;

public class DetailActivity extends AppCompatActivity {
    TextView getNama, getUmur, getAlamat, getNoT;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ativity_detail);

        getNama = (TextView) findViewById(R.id.getnamalengkap);
        getUmur = (TextView) findViewById(R.id.getUmur);
        getAlamat = (TextView) findViewById(R.id.getAlamat);
        getNoT = (TextView) findViewById(R.id.getNT);

        Bundle dapatkanpackage = getIntent().getExtras();

        getNama.setText(dapatkanpackage.getString("NAMA"));
        getUmur.setText(dapatkanpackage.getString("UMUR"));
        getAlamat.setText(dapatkanpackage.getString("ALAMAT"));
        getNoT.setText(dapatkanpackage.getString("NOT"));
    }
}