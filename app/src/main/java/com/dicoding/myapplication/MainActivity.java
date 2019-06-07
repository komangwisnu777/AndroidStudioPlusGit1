package com.dicoding.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    TextView tvTulisan;
    Button btnTutup, btnUbah;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvTulisan = (TextView) findViewById(R.id.tv_tulisan);

        btnTutup = (Button) findViewById(R.id.btn_tutup);

        btnUbah = (Button) findViewById(R.id.btn_ubah);
        btnUbah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvTulisan.setText("Tulisan sudah dirubah oleh tombol dibawah, klik disini untuk reset tulisan ....");
            }
        });

        tvTulisan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvTulisan.setText("reset .....");
            }
        });
    }


    private void tutup(View view) {
        finish();
    }
}
