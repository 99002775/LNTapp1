package com.example.lntapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void clickHandler(View view) {
        Toast.makeText(this, "Hello Divya", Toast.LENGTH_SHORT).show();
        EditText nameeditText;
        nameeditText = findViewById(R.id.editText);
        String input = nameeditText.getText().toString();
        TextView textView2;
        textView2 = findViewById(R.id.textView2);
        textView2.setText(input);
    }
}