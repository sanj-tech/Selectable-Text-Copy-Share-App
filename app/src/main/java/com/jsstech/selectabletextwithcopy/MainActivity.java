package com.jsstech.selectabletextwithcopy;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
TextView textView;
EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView=findViewById(R.id.textView);
        editText=findViewById(R.id.etcopy);


        textView.setTextIsSelectable(true);

        editText.setText("");
        editText.setTextIsSelectable(true);

    }
}