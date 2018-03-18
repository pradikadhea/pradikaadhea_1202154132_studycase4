package com.example.user.pradikaadhea_1202154132_studycase4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class GambarAsynctask extends AppCompatActivity {
    //mendeklarasikan variabel yang dibutuhkan
    ImageView gambar;
    EditText sumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gambar_asynctask);
        setTitle("AsyncTask"); //set title pada tampilan

        //memanggil variabel yang ada pada layout
        gambar = (ImageView)findViewById(R.id.gambar);
        sumber = (EditText)findViewById(R.id.sumber);
    }
    //method saat button ditekan
    public void cari(View view) {
        //loading gambar dari internet ke imageview
        Picasso.with(GambarAsynctask.this).load(sumber.getText().toString())
                .placeholder(R.mipmap.ic_launcher_round)
                .error(R.mipmap.ic_launcher)
                .into(gambar);
    }
}