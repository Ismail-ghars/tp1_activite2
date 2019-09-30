package com.example.tp1_ex2;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @SuppressLint("SetTextI18n")
    public void ButtonEnvoyerOnClick(View view) {
        TextView texte = findViewById(R.id.TextViewBonjour);
        TextView texte2 = (TextView)findViewById(R.id.EditTextNom) ;
        texte.setText("Bonjour "+ texte2.getText() +'!');
    }
}
