package com.example.adan.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Trabajos extends AppCompatActivity {

    Button empresa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trabajos);


        empresa = (Button) findViewById(R.id.empleo);


        empresa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Trabajos.this,Empresa.class);
                startActivity(intent);
            }
        });
    }
}
