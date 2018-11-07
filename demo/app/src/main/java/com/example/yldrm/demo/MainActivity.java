package com.example.yldrm.demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.*;
import android.content.Intent;
public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       final Button topcik = (Button) findViewById(R.id.topcik);
       final Button harita = (Button) findViewById(R.id.harita);
        topcik.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
               final Intent intent = new Intent(MainActivity.this,toplamacikarma.class);
                MainActivity.this.startActivity(intent);
                MainActivity.this.finish();
            }
        });

        harita.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                final Intent intent = new Intent(MainActivity.this,harita.class);
                MainActivity.this.startActivity(intent);
                MainActivity.this.finish();
            }
        });

    }

}