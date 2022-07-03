package com.example.kalkulatorbmi;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText ETtinggi,ETberat;
    TextView etStatus,etHasil;
    Button BTNsend,BTNClear;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ETtinggi = (EditText) findViewById(R.id.tinggi);
        ETberat = (EditText) findViewById(R.id.berat);
        etStatus = (TextView) findViewById(R.id.scStatus);
        etHasil = (TextView) findViewById(R.id.scHasil);
        BTNsend = (Button) findViewById(R.id.btnkirim);

        BTNsend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float tinggi = Integer.parseInt(ETtinggi.getText().toString());
                float berat = Integer.parseInt(ETberat.getText().toString());

                float tinggi2 = tinggi/100;

                float hasil = berat/(tinggi2*tinggi2);

                String muncul;

                if (hasil < 18.5)
                {
                    muncul = "Kurus";

                }
                else if(hasil >= 18.5 && hasil<24.5)
                {
                    muncul = "Ideal";
                }
                else if(hasil >= 24.6 && hasil<30)
                {
                    muncul = "Gemuk";
                }
                else
                {
                    muncul = "Obesitas";
                }

                etStatus.setText(muncul);
                etHasil.setText("Score" + hasil);

            }
        });
        BTNsend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                float tinggi = Integer.parseInt(ETtinggi.getText().toString());
                float berat = Integer.parseInt(ETberat.getText().toString());

                float tinggi2 = tinggi/100;

                float hasil = berat/(tinggi2*tinggi2);

                String muncul;

                if (hasil < 18.5)
                {
                    muncul = "Kurus";

                }
                else if(hasil >= 18.5 && hasil<24.5)
                {
                    muncul = "Ideal";
                }
                else if(hasil >= 24.6 && hasil<30)
                {
                    muncul = "Gemuk";
                }
                else
                {
                    muncul = "Obesitas";
                }

                etStatus.setText(muncul);
                etHasil.setText("Score" + hasil);
                ETtinggi.setText("");
                ETberat.setText("");

            }
        });

    }
}