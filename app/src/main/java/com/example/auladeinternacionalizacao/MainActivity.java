package com.example.auladeinternacionalizacao;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.ListView);

        final ArrayList<String> listaDeFrutas = new ArrayList<>();
        
        listaDeFrutas.add("Maçã");
        listaDeFrutas.add("Goiaba");
        listaDeFrutas.add("Banana");
        listaDeFrutas.add("Pera");
        listaDeFrutas.add("Uva");
        listaDeFrutas.add("Melancia");

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getApplicationContext(),
                android.R.layout. simple_list_item_1,
                android.R.id.text1,
                listaDeFrutas);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, listaDeFrutas.get(position), Toast.LENGTH_LONG).show();
                Intent intent = new Intent(MainActivity.this, ComponenteView.class);
                intent.putExtra("Frutas", listaDeFrutas.get(position));
                startActivity(intent);
            }
        });
    }
}
