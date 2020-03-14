package com.example.auladeinternacionalizacao;

import androidx.annotation.ColorRes;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.DialogInterface;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

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
            case "ImageButton":
                CriarImage();
                break;
            case "CheckBox":
                CriarCheckBox();
                break;
            case "RatingBar":
                CriarRatingBar();
                break;
            case "ToggleButton":
                CreateToggleButton();
                break;
            case "DatePicker":
                CreateDatePicker();
                break;
            case "AlertDialog":
                CreateAlertDialog();
                break;
            default:
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

    public void CriarImage(){
        ImageButton imageButton = new ImageButton(this);
        imageButton.setImageResource(R.drawable.imagem);

        imageButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast.makeText(ComponenteView.this, "Você apertou na imagem!", Toast.LENGTH_LONG).show();
            }
        });

        LinearLayout layout = findViewById(R.id.layoutBotao);
        layout.addView(imageButton);

        GradientDrawable border = new GradientDrawable();
        border.setStroke(5, Color.GRAY);
        layout.setBackground(border);

        TextView tv = new TextView(this);
        tv.setText("ImageButton em XML: ");
        tv.setTextSize(20);

        EditText et = new EditText(this);
        et.setText("<ImageButton\n" +
                "        android:id=\"@+id/IdDoBotao\"\n" +
                "        android:onClick=\"Funcao\"" +
                "        android:src=\"@drawable/NomeDaImagem\" />");
        et.setEnabled(false);
        et.setTextColor(Color.BLACK);

        LinearLayout layout2 = findViewById(R.id.layoutXML);
        layout2.addView(tv);
        layout2.addView(et);

        TextView tv2 = new TextView(this);
        tv2.setText("ImageButton em Java: ");
        tv2.setTextSize(20);

        EditText et2 = new EditText(this);
        et2.setText("ImageButton imageButton = new ImageButton(this);\n" +
                "imageButton.setImageResource(R.drawable.NomeDaImagem);");
        et2.setEnabled(false);
        et2.setTextColor(Color.BLACK);

        LinearLayout layout3 = findViewById(R.id.layoutJava);
        layout3.addView(tv2);
        layout3.addView(et2);
    }

    public void CriarCheckBox() {
        final CheckBox checkBox = new CheckBox(this);
        checkBox.setText("Check box!");

        checkBox.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (checkBox.isChecked()) {
                    Toast.makeText(ComponenteView.this, "Você marcou o check box!", Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(ComponenteView.this, "Você desmarcou o check box!", Toast.LENGTH_LONG).show();
                }
            }
        });

        LinearLayout layout = findViewById(R.id.layoutBotao);
        layout.addView(checkBox);

        GradientDrawable border = new GradientDrawable();
        border.setStroke(5, Color.GRAY);
        layout.setBackground(border);

        TextView tv = new TextView(this);
        tv.setText("CheckBox em XML: ");
        tv.setTextSize(20);

        EditText et = new EditText(this);
        et.setText("<CheckBox android:id=\"@+id/IdDoCheckBox\"\n" +
                "        android:text=\"Texto\"\n" +
                "        android:onClick=\"Funcao\"/>");
        et.setEnabled(false);
        et.setTextColor(Color.BLACK);

        LinearLayout layout2 = findViewById(R.id.layoutXML);
        layout2.addView(tv);
        layout2.addView(et);

        TextView tv2 = new TextView(this);
        tv2.setText("CheckBox em Java: ");
        tv2.setTextSize(20);

        EditText et2 = new EditText(this);
        et2.setText("CheckBox checkBox = new CheckBox(this);\n" +
                "checkBox.setText(\"Texto\");");
        et2.setEnabled(false);
        et2.setTextColor(Color.BLACK);

        LinearLayout layout3 = findViewById(R.id.layoutJava);
        layout3.addView(tv2);
        layout3.addView(et2);
    }

    public void CriarRatingBar() {
        final RatingBar ratingBar = new RatingBar(this);
        ratingBar.setNumStars(5);

        ratingBar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            public void onRatingChanged(RatingBar ratingBar, float nota, boolean usuario) {
                Toast.makeText(ComponenteView.this, "Você selecionou "+nota+" estrelas", Toast.LENGTH_LONG).show();
            }
        });

        LinearLayout layout = findViewById(R.id.layoutBotao);
        layout.addView(ratingBar);

        GradientDrawable border = new GradientDrawable();
        border.setStroke(5, Color.GRAY);
        layout.setBackground(border);

        TextView tv = new TextView(this);
        tv.setText("RatingBar em XML: ");
        tv.setTextSize(20);

        EditText et = new EditText(this);
        et.setText("<RatingBar\n" +
                "        android:id=\"@+id/IdDaRatingBar\"\n" +
                "        android:numStars=\"5\"\n" +
                "        android:onClick=\"Funcao\" />");
        et.setEnabled(false);
        et.setTextColor(Color.BLACK);

        LinearLayout layout2 = findViewById(R.id.layoutXML);
        layout2.addView(tv);
        layout2.addView(et);

        TextView tv2 = new TextView(this);
        tv2.setText("RatingBar em Java: ");
        tv2.setTextSize(20);

        EditText et2 = new EditText(this);
        et2.setText("RatingBar ratingBar = new RatingBar(this);\n" +
                "ratingBar.setNumStars(5);");
        et2.setEnabled(false);
        et2.setTextColor(Color.BLACK);

        LinearLayout layout3 = findViewById(R.id.layoutJava);
        layout3.addView(tv2);
        layout3.addView(et2);
    }

    public void CreateToggleButton() {
        final ToggleButton toggleButton = new ToggleButton(this);
        toggleButton.setText("Desligado");
        toggleButton.setTextOn("Ligado");
        toggleButton.setTextOff("Desligado");

        toggleButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                if (toggleButton.isChecked()) {
                    Toast.makeText(ComponenteView.this, "Você Ligou!", Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(ComponenteView.this, "Você Desligou!", Toast.LENGTH_LONG).show();
                }
            }
        });

        LinearLayout layout = findViewById(R.id.layoutBotao);
        layout.addView(toggleButton);

        GradientDrawable border = new GradientDrawable();
        border.setStroke(5, Color.GRAY);
        layout.setBackground(border);

        TextView tv = new TextView(this);
        tv.setText("ToggleButton em XML: ");
        tv.setTextSize(20);

        EditText et = new EditText(this);
        et.setText("<ToggleButton\n" +
                "        android:id=\"@+id/IdDoToggleButton\"\n" +
                "        android:onClick=\"Funcao\"\n" +
                "        android:text=\"Texto incial\"\n" +
                "        android:textOff=\"Texto desligado\"\n" +
                "        android:textOn=\"Texto ligado\" />");
        et.setEnabled(false);
        et.setTextColor(Color.BLACK);

        LinearLayout layout2 = findViewById(R.id.layoutXML);
        layout2.addView(tv);
        layout2.addView(et);

        TextView tv2 = new TextView(this);
        tv2.setText("ToggleButton em Java: ");
        tv2.setTextSize(20);

        EditText et2 = new EditText(this);
        et2.setText("ToggleButton toggleButton = new ToggleButton(this);\n" +
                "toggleButton.setText(\"Texto incial\");\n" +
                "toggleButton.setTextOn(\"Texto ligado\");\n" +
                "toggleButton.setTextOff(\"texto desligado\");");
        et2.setEnabled(false);
        et2.setTextColor(Color.BLACK);

        LinearLayout layout3 = findViewById(R.id.layoutJava);
        layout3.addView(tv2);
        layout3.addView(et2);
    }

    public void CreateDatePicker() {
        DatePicker datePicker = new DatePicker(this);

        datePicker.setOnDateChangedListener(new DatePicker.OnDateChangedListener() {
            public void onDateChanged(DatePicker datePicker, int ano, int mes, int dia) {
                Toast.makeText(ComponenteView.this, "Você selecionou a data: "+dia+"/"+mes+"/"+ano, Toast.LENGTH_LONG).show();
            }
        });

        LinearLayout layout = findViewById(R.id.layoutBotao);
        layout.addView(datePicker);

        GradientDrawable border = new GradientDrawable();
        border.setStroke(5, Color.GRAY);
        layout.setBackground(border);

        TextView tv = new TextView(this);
        tv.setText("DatePicker em XML: ");
        tv.setTextSize(20);

        EditText et = new EditText(this);
        et.setText("<DatePicker\n"+
                "         android:id=\"@+id/IdDoDatePicker\" />");
        et.setEnabled(false);
        et.setTextColor(Color.BLACK);

        LinearLayout layout2 = findViewById(R.id.layoutXML);
        layout2.addView(tv);
        layout2.addView(et);

        TextView tv2 = new TextView(this);
        tv2.setText("DatePicker em Java: ");
        tv2.setTextSize(20);

        EditText et2 = new EditText(this);
        et2.setText("DatePicker datePicker = new DatePicker(this);");
        et2.setEnabled(false);
        et2.setTextColor(Color.BLACK);

        LinearLayout layout3 = findViewById(R.id.layoutJava);
        layout3.addView(tv2);
        layout3.addView(et2);
    }

    public void CreateAlertDialog() {
        AlertDialog.Builder construtor = new AlertDialog.Builder(this);
        construtor.setTitle("Caixa de diálogo!");
        construtor.setMessage("Clique em \"Ok\" para continuar!");
        construtor.setCancelable(false);

        construtor.setPositiveButton("Ok",new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface alertDialog, int id) {
                alertDialog.cancel();
            }
        });

        AlertDialog alertDialog = construtor.create();
        alertDialog.show();

        TextView tv2 = new TextView(this);
        tv2.setText("AlertDialog em Java: ");
        tv2.setTextSize(20);

        EditText et2 = new EditText(this);
        et2.setText("AlertDialog.Builder construtor = new AlertDialog.Builder(this);\n" +
                "construtor.setTitle(\"Titulo do alerta\");\n" +
                "construtor.setMessage(\"Mensagem do alerta\");\n" +
                "AlertDialog alertDialog = construtor.create();\n" +
                "alertDialog.show();");
        et2.setEnabled(false);
        et2.setTextColor(Color.BLACK);

        LinearLayout layout3 = findViewById(R.id.layoutJava);
        layout3.addView(tv2);
        layout3.addView(et2);
    }
}