package com.arjuna.quizjan15_4;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText etAlas, etTinggi;
    Button btnhitung;
    TextView txthasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etAlas = (EditText) findViewById(R.id.etalas);
        etTinggi = (EditText) findViewById(R.id.ettinggi);
        btnhitung = (Button) findViewById(R.id.btnhitung);
        txthasil = (TextView) findViewById(R.id.txthasil);


        btnhitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //mengambil nilai dari widget edit text dan memasukan kedaam nilai String
                String nAlas = etAlas.getText().toString();
                String nTinggi = etTinggi.getText().toString();

                //mengecek apa edit text kosong
                //kondisi alas nya kosong
                if (nAlas.isEmpty()) {
                    //memberikan warning berupa eror
                    etAlas.setError("Panjang Tidak Boleh Kosong");
                } else if (nTinggi.isEmpty()) {
                    //Kondisi ketika lebarnya kosong
                    etTinggi.setError("Lebar Tidak Boleh Kosong");
                } else {

                    //mengubah nilai dari String ke Interger
                    int aAlas = Integer.parseInt(nAlas);
                    int aTinggi = Integer.parseInt(nTinggi);

                    //kondisi ketika panjang dan lebar nya tidak kosong

                    int hasilHitungLuas = ((aAlas * aTinggi) / 2);

                    //menampilkan hasil hitung ke widget textview
                    txthasil.setText("Luas : " + hasilHitungLuas);


                }
            }
        });

    }
}
