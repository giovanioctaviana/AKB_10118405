package com.giovani.a10118405_giovanioctaviana;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class login2 extends AppCompatActivity {
    //Tgl = 07/04/2021_10118405_GiovaniOctaviana_IF-10
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login2);

        Button profil = findViewById(R.id.btnProfil);
        profil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(login2.this, profil.class);
                startActivity(intent);
            }
        });
        Button logout = findViewById(R.id.btnLogout);
        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(login2.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
