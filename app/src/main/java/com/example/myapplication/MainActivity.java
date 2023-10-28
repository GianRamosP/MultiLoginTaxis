package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnCliente, btnConductor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnCliente = findViewById(R.id.btnCliente);
        btnConductor = findViewById(R.id.btnConductor);

        btnCliente.setOnClickListener(view -> goToSelectAuth());
        btnConductor.setOnClickListener(view -> goToSelectAuth());

    }

    private void goToSelectAuth() {
        Intent intent = new Intent(this, SelectOptionAuthActivity.class);
        startActivity(intent);
    }
}