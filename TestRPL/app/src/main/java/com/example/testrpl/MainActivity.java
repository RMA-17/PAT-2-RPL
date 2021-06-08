package com.example.testrpl;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button alertShower;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AlertDialog.Builder alertDialog = new AlertDialog.Builder(this);
        alertShower = (Button)findViewById(R.id.alertDialog);

        alertShower.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                alertDialog
                        .setTitle("Nah ini muncul")
                        .setMessage("Ini alert Dialog bang")
                        .setPositiveButton("Toast", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Toast.makeText(MainActivity.this, "mantap", Toast.LENGTH_SHORT).show();
                            }
                        });
                AlertDialog dialog = alertDialog.create();
                dialog.show();

            }
        });

    }
}