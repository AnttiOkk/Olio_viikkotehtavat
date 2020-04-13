package com.example.anttiokkonen.h7t3;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

    EditText editText;
    Button button;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText=(EditText)findViewById(R.id.edittext);
        button=(Button)findViewById(R.id.button);
        //button.setOnClickListener((View.OnClickListener) this);
        textView=(TextView)findViewById(R.id.textview);
    }


    public void changeText(View v) {
        String value=editText.getText().toString();
        textView.setText(value);
    }
}

