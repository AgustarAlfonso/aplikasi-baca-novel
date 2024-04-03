package com.example.aplikasimobile;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {
    private String  judul, penulis, chapter, deskripsi;
    private int gambar;
    private Button btnshare;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        judul = getIntent().getStringExtra("judul");
        penulis = getIntent().getStringExtra("penulis");
        chapter = getIntent().getStringExtra("chapter");
        deskripsi = getIntent().getStringExtra("deskripsi");
        gambar = getIntent().getIntExtra("gambar", 0);


        ImageView gambarr = findViewById(R.id.imgcover);
        TextView judull = findViewById(R.id.tvjudul);
        TextView penuliss = findViewById(R.id.tvpenulis);
        TextView chapterr = findViewById(R.id.tvchapter);
        TextView deskripsii = findViewById(R.id.tvdeskripsi);
        btnshare = findViewById(R.id.btnshare);

        judull.setText(judul);
        penuliss.setText(penulis);
        chapterr.setText(chapter);
        deskripsii.setText(deskripsi);
        gambarr.setImageResource(gambar);

        btnshare.setOnClickListener(v -> {
            Intent intent = new Intent(Intent.ACTION_SEND);
            intent.setType("text/plain");

            String shareMessage = "Selamat membaca Novel " + judull.getText() + " karya dari " + penuliss.getText();
            intent.putExtra(Intent.EXTRA_TEXT, shareMessage);
            startActivity(Intent.createChooser(intent, "Bagikan melalui"));
        });
    }
}