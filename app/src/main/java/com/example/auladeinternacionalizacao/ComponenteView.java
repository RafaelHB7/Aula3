package com.example.auladeinternacionalizacao;

import androidx.annotation.ColorRes;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
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
                CriarRadio();
                break;
        }
    }

    public void CriarBotao(){
        Button botao = new Button(this);
        botao.setText("OK");

        botao.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(ComponenteView.this, "Você apertou o botão!", Toast.LENGTH_LONG).show();
            }
        });

        LinearLayout layout = findViewById(R.id.layoutBotao);
        layout.addView(botao);

        GradientDrawable border = new GradientDrawable();
        border.setStroke(5, Color.GRAY);
        layout.setBackground(border);

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

    public void CriarRadio(){
        RadioButton radioButton = new RadioButton(this);
        RadioButton radioButton2 = new RadioButton(this);

        radioButton.setText("Botão 1");
        radioButton2.setText("Botão 2");

        RadioGroup radios = new RadioGroup(this);

        radios.addView(radioButton);
        radios.addView(radioButton2);

        radioButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(ComponenteView.this, "Você marcou o botão 1!", Toast.LENGTH_LONG).show();
            }
        });

        radioButton2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(ComponenteView.this, "Você marcou o botão 2!", Toast.LENGTH_LONG).show();
            }
        });

        LinearLayout layout = findViewById(R.id.layoutBotao);
        layout.addView(radios);

        GradientDrawable border = new GradientDrawable();
        border.setStroke(5, Color.GRAY);
        layout.setBackground(border);

        TextView tv = new TextView(this);
        tv.setText("RadioButton em XML: ");
        tv.setTextSize(20);

        EditText et = new EditText(this);
        et.setText("<RadioGroup\"\n" +
                "    android:orientation=\"vertical\">\n" +
                "    <RadioButton android:id=\"@+id/IdDoRadio1\"\n" +
                "        android:text=\"@string/Texto\"\n" +
                "        android:onClick=\"Funcao\"/>\n" +
                "    <RadioButton android:id=\"@+id/IdDoRadio2\"\n" +
                "        android:text=\"@string/Texto\"\n" +
                "        android:onClick=\"Funcao\"/>\n" +
                "</RadioGroup>");
        et.setEnabled(false);
        et.setTextColor(Color.BLACK);

        LinearLayout layout2 = findViewById(R.id.layoutXML);
        layout2.addView(tv);
        layout2.addView(et);

        TextView tv2 = new TextView(this);
        tv2.setText("RadioButton em Java: ");
        tv2.setTextSize(20);

        EditText et2 = new EditText(this);
        et2.setText("RadioButton radioButton = new RadioButton(this);\n" +
                "RadioButton radioButton2 = new RadioButton(this);\n" +
                "\n" +
                "radioButton.setText(\"Texto\");\n" +
                "radioButton2.setText(\"Texto\");\n" +
                "\n" +
                "RadioGroup radios = new RadioGroup(this);\n" +
                "\n" +
                "radios.addView(radioButton);\n" +
                "radios.addView(radioButton2);");
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