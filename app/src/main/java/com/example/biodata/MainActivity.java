package com.example.biodata;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.net.URL;

public class MainActivity extends AppCompatActivity {

    Button btnEmail, btnTelepon, btnAlamat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnTelepon = findViewById(R.id.btnTelepon);

        btnTelepon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nomor="081327299709";
                Intent panggil=new Intent(Intent.ACTION_DIAL);
                panggil.setData(Uri.fromParts("tel", nomor, null));
                startActivity(panggil);
            }
        });
    }

    public void btnAlamat(View view){
        String url="https://goo.gl/maps/WP7yhzG4zJ6wBDDr7";
        Intent bukaAlamat = new Intent(Intent.ACTION_VIEW);
        bukaAlamat.setData(Uri.parse(url));
        startActivity(bukaAlamat);
    }

    public void btnEmail(View view) {
        String url = "mailto:sayhello@mjurnal.com";
        Intent bukaEmail = new Intent(Intent.ACTION_VIEW);
        bukaEmail.setData(Uri.parse(url));
        startActivity(bukaEmail);
    }
}