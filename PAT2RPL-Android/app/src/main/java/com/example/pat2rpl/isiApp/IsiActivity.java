package com.example.pat2rpl.isiApp;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.net.VpnService;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

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

        //  ALert Dialog
        final AlertDialog.Builder dialog = new AlertDialog.Builder(this);


        btnSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //.getText().toString() harus di dalem OnClickListener
                nama_lengkap = Nama.getText().toString();
                umur = Umur.getText().toString();
                alamat = Alamat.getText().toString();
                nomorT = NoTelp.getText().toString();

                if (nama_lengkap.equals("")){
                    Nama.requestFocus();
                    Nama.setError("Nama belum diisi");
                } else if (umur.equals("")){
                    Umur.requestFocus();
                    Umur.setError("Umurnya isi dulu dong bosku");
                } else if (alamat.equals("")){
                    Alamat.requestFocus();
                    Alamat.setError("Alamatmu dimana?");
                } else if (nomorT.equals("")){
                    NoTelp.requestFocus();
                    NoTelp.setError("Minta telepon nya!!!");
                } else {

                    dialog.setTitle("Apakah sudah benar?")
                            .setMessage("Username: " + nama_lengkap + '\n'
                            + "Umur: " + umur + '\n'
                            + "Alamat: " + alamat + '\n'
                            + "Nomor Telepon: " + nomorT);
                    dialog.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
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
                    dialog.setNeutralButton("No", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            Toast.makeText(IsiActivity.this, "Pengirimian dibatalkan", Toast.LENGTH_SHORT).show();
                        }
                    });
                    AlertDialog show = dialog.create();
                    show.show();


                }
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