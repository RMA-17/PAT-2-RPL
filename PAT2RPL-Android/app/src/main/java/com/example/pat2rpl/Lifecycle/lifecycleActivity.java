package com.example.pat2rpl.Lifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.example.pat2rpl.R;
import com.example.pat2rpl.RootActivity;

public class lifecycleActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lifecycle);

        Log.d("MSG", "Jika engkau melihat ini ini adalah onCreate | onCreate = mucul ketika activity dimulai/dibuat");


        Button kembali;
        kembali = findViewById(R.id.kembali);
        kembali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent abc = new Intent(lifecycleActivity.this, RootActivity.class);
                startActivity(abc);
                finish();
            }
        });
    }

    @Override
    protected void onPause() {
        super.onPause();

        Log.d("MSG","Jika engkau melihat ini, maka ini adalah onPause | Aplikasi/Activity ini sedang dipause/diberhentikan sementara");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("MSG", "Jika engkau melihat ini, maka ini adalah onStart | onStart berarti melanjutkan setelah pause/bangkit saat onCreate");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("MSG", "Jika engkau melihat ini, maka ini adalah onDestroy Aplikasi/Activity ini terhancurkan dan tidak dipakai lagi, salah satu cara memunculkannya kembali adalah dengan onCreate");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("MSG", "Jika engkau melihat ini, maka ini adalah onStop | Aplikasi/Activity ini distop, tidak bisa diresume. Cara memunculkannya kembali ialah onRestart");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("MSG","Jika engkau melihat ini, maka ini adalah onRestart | Aplikasi/Activity ini dimulai ulang setelah di-stop");
    }
}