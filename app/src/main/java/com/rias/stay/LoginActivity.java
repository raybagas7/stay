package com.rias.stay;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Button TryToLogin, DaftarBut;

        TryToLogin = (Button) findViewById(R.id.loginbut);
        DaftarBut = (Button) findViewById(R.id.daftarbut);

        TryToLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SendUserToMainActivity();
            }
        });

        DaftarBut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SendUserToDaftarActivity();
            }
        });


    }
    private void SendUserToMainActivity(){
        Intent enteringIntent = new Intent(LoginActivity.this, MainActivity.class);
        startActivity(enteringIntent);
    }

    private void SendUserToDaftarActivity(){
        Intent daftarIntent = new Intent(LoginActivity.this, DaftarActivity.class);
        startActivity(daftarIntent);
    }
}
