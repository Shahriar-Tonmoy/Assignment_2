package com.example.userpc.books;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private Button searchButoon;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        searchButoon=(Button) findViewById(R.id.searchButton);
        textView =(TextView) findViewById(R.id.textViewId);
        final String myString ="Searching!!";

        searchButoon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),myString,Toast.LENGTH_LONG).show();
            }
        });
    }
}
