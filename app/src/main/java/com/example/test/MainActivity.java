package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText txtAlas;
    private EditText txtTinggi;
    private EditText txtTinggiLimas;
    private EditText txtVolume;
    private Button btnHitung;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtAlas = (EditText) findViewById(R.id.txtAlas);
        txtTinggi = (EditText) findViewById(R.id.txtTinggi);
        txtTinggiLimas = (EditText) findViewById(R.id.txtTinggiLimas);
        txtVolume = (EditText) findViewById(R.id.txtVolume);
        btnHitung = (Button) findViewById(R.id.btnHitung);
    }

    public void hitungVolume(View view) {
        try {
            int Alas = Integer.parseInt(txtAlas.getText().toString());
            int Tinggi = Integer.parseInt(txtTinggi.getText().toString());
            int TinggiLimas = Integer.parseInt(txtTinggiLimas.getText().toString());
            int Volume = (((Alas * Tinggi) / 2) * TinggiLimas) / 3;
            txtVolume.setText(String.valueOf(Volume));
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public void balik(View View) {
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }
}