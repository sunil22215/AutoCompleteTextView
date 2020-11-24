package com.example.autocompletetextview;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class MainActivity extends AppCompatActivity {
    String[] language={"C","C++","Java",".Net","iphone","Android","ASP.Net"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayAdapter<String>adapter=new ArrayAdapter<String>(this,android.R.layout.select_dialog_item,language);
        AutoCompleteTextView actv=(AutoCompleteTextView) findViewById(R.id.autoCompleteTextView);
        actv.setThreshold(1);
        actv.setAdapter(adapter);
        actv.setTextColor(Color.RED);
    }
}