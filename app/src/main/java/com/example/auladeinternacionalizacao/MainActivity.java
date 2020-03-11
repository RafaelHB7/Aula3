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

        final ArrayList<String> listaDeComponentes = new ArrayList<>();

        listaDeComponentes.add("Button");
        listaDeComponentes.add("RadioButton");
        listaDeComponentes.add("ImageButton");
        listaDeComponentes.add("CheckBox");
        listaDeComponentes.add("RatingBar");
        listaDeComponentes.add("ToggleButton");
        listaDeComponentes.add("DatePicker");
        listaDeComponentes.add("AlertDialog");

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getApplicationContext(),
                android.R.layout. simple_list_item_1,
                android.R.id.text1,
                listaDeComponentes);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(MainActivity.this, ComponenteView.class);

                intent.putExtra("Componente", listaDeComponentes.get(position));
                startActivity(intent);
            }
        });
    }
}
