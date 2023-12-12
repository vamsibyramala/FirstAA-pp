package com.tefologic.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void btn(View view) {
        TextView txtHello = findViewById(R.id.textView);
        EditText editName = findViewById(R.id.editTextText);
        txtHello.setText("Hello " + editName.getText().toString());
        TextView textView = findViewById(R.id.textView3);
        EditText editRegister = findViewById(R.id.editTextText4);
        textView.setText(editRegister.getText().toString());
        TextView textName = findViewById(R.id.textView2);
        EditText editCollege = findViewById(R.id.editTextText2);
        textName.setText(editCollege.getText().toString());

    }
}