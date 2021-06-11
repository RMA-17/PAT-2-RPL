package com.example.pat2rpl.isiApp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.pat2rpl.R;
import com.example.pat2rpl.RootActivity;

public class IsiActivity extends AppCompatActivity {

    Button btnBack, btnSend;
    EditText Nama, Umur, Alamat, NoTelp;
    String nama_lengkap,umur,alamat,nomorT;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_isi);

        //  EditText
        Nama = findViewById(R.id.nama_lengkap);
        Umur = findViewById(R.id.umur);
        Alamat = findViewById(R.id.alamat);
        NoTelp = findViewById(R.id.nomor_telepon);

        //  Button
        btnBack = findViewById(R.id.tombol_back);
        btnSend = findViewById(R.id.tombol_send);

        //  String/Penampung


        btnSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //.getText().toString() harus di dalem OnClickListener
                nama_lengkap = Nama.getText().toString();
                umur = Umur.getText().toString();
                alamat = Alamat.getText().toString();
                nomorT = NoTelp.getText().toString();

                Intent abc = new Intent(IsiActivity.this, DetailActivity.class);
                Bundle send = new Bundle();
                send.putString("NAMA", nama_lengkap);
                send.putString("UMUR", umur);
                send.putString("ALAMAT", alamat);
                send.putString("NOT", nomorT);
                abc.putExtras(send);
                startActivity(abc);

            }
        });

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent abc = new Intent(IsiActivity.this, RootActivity.class);
                startActivity(abc);
                finish();

            }
        });



    }
}