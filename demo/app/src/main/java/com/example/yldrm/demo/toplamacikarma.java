package com.example.yldrm.demo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class toplamacikarma extends Activity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.toplamacikarma);
        final EditText sayi1 = findViewById(R.id.sayi1);
        final TextView sonuc = findViewById(R.id.yazi);
        final EditText sayi2 = findViewById(R.id.sayi2);
        final Button toplamaIslem = findViewById(R.id.topla);
        final Button cikarmaIslem = findViewById(R.id.cikar);
        final Button goBack = findViewById(R.id.goback);

        toplamaIslem.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                int sayiInt = Integer.parseInt(sayi1.getText().toString());
                int sayi2Int = Integer.parseInt(sayi2.getText().toString());
                sonuc.setText(String.valueOf(sayiInt+sayi2Int));
            }
        });

        cikarmaIslem.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                int sayiInt = Integer.parseInt(sayi1.getText().toString());
                int sayi2Int = Integer.parseInt(sayi2.getText().toString());
                sonuc.setText(String.valueOf(sayiInt-sayi2Int));
            }
        });

        goBack.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                final Intent intent = new Intent(toplamacikarma.this,MainActivity.class);
                toplamacikarma.this.startActivity(intent);
                toplamacikarma.this.finish();
            }
        });




    }

}
