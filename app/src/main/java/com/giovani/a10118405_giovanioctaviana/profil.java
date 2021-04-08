package com.giovani.a10118405_giovanioctaviana;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class profil extends AppCompatActivity {
    //Tgl = 07/04/2021_10118405_GiovaniOctaviana_IF-10
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.profil);
        Button kembali = findViewById(R.id.btnKembali);
        kembali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(profil.this, login2.class);
                startActivity(intent);
            }
        });
    }
}
