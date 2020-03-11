package com.example.auladeinternacionalizacao;

import androidx.annotation.ColorRes;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class ComponenteView extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_componente_view);

        Bundle bundle = getIntent().getExtras();
        String componente = bundle.getString("Componente");

        switch (componente){
            case "Button":
                CriarBotao();
                break;
            case "RadioButton":
                RadioButton radioButton = new RadioButton(this);
                RadioButton radioButton2 = new RadioButton(this);

                break;
        }
    }

    public void CriarBotao(){
        Button botao = new Button(this);
        botao.setText("OK");

        LinearLayout layout = findViewById(R.id.layoutBotao);
        layout.addView(botao);

        TextView tv = new TextView(this);
        tv.setText("Button em XML: ");
        tv.setTextSize(20);

        EditText et = new EditText(this);
        et.setText("<Button\n" +
                "        android:id=\"@+id/IdDoBotao\"\n" +
                "        android:onClick=\"Funcao\"\n" +
                "        android:text=\"Texto\"/>");
        et.setEnabled(false);
        et.setTextColor(Color.BLACK);

        LinearLayout layout2 = findViewById(R.id.layoutXML);
        layout2.addView(tv);
        layout2.addView(et);

        TextView tv2 = new TextView(this);
        tv2.setText("Button em Java: ");
        tv2.setTextSize(20);

        EditText et2 = new EditText(this);
        et2.setText("Button botao = new Button(this);\n" +
                "botao.setText(\"Texto\");");
        et2.setEnabled(false);
        et2.setTextColor(Color.BLACK);

        LinearLayout layout3 = findViewById(R.id.layoutJava);
        layout3.addView(tv2);
        layout3.addView(et2);
    }
}


//Button
//RadioButton
//ImageButton
//CheckBox
//RatingBar
//ToggleButton
//DatePicker
//AlertDialog