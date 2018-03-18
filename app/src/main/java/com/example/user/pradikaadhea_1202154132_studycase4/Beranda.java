package com.example.user.pradikaadhea_1202154132_studycase4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Beranda extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beranda);
        setTitle("AsyncTask");
    }
    //method saat button ditekan
    public void namamahasiswa(View view) {
        //untuk berpindah ke aktivitas mahasiswa//
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }
    //method saat button ditekan
    public void gambar(View view) {
        //untuk berpindah ke aktivitas gambar//
        Intent intent = new Intent(this, GambarAsynctask.class);
        startActivity(intent);
    }
}
