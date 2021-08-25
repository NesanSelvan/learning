package com.example.helloworld;

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
    public void btnclick (View view)
    {
        TextView txtview = findViewById(R.id.textView);
        TextView txtview2 = findViewById(R.id.textView2);
        //txtHello.setText("Hello");
        EditText editText = findViewById(R.id.firstName);
        //txtHello.setText(editText.getText());

        EditText email = findViewById(R.id.email);
        EditText lastname = findViewById(R.id.lastName);
        txtview.setText("First name =" + editText.getText() + lastname.getText());
        txtview2.setText(" email ="+ email.getText().toString());






    }
}