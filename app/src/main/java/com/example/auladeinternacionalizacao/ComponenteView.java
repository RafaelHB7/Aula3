package com.example.auladeinternacionalizacao;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class ComponenteView extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_componente_view);

        Bundle bundle = getIntent().getExtras();
        String fruta = bundle.getString("Frutas");

        Toast.makeText(ComponenteView.this, fruta, Toast.LENGTH_LONG).show();
    }
}
