package com.example.currencyconverter;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Spinner spinner;
    TextView res;
    Button btn;
    EditText amt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinner = (Spinner)findViewById(R.id.spinner);
        btn = (Button)findViewById(R.id.btn);
        res = (TextView)findViewById(R.id.res);
        amt = (EditText)findViewById(R.id.amt);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int pos = spinner.getSelectedItemPosition();
                String a = amt.getText().toString();
                float n = Float.parseFloat(a);
                float r;
                if(pos==1)
                {
                    r = n*73;
                    res.setText("Result ="+r);
                }
               else if(pos==2)
                {
                    r = n/73;
                    res.setText("Result ="+r);
                }
                else if(pos==3)
                {
                    r = n*95;
                    res.setText("Result ="+r);
                }
                else if(pos==4)
                {
                    r = n/95;
                    res.setText("Result ="+r);
                }
                else
                {
                    Toast.makeText(getApplicationContext(),"Please select option",Toast.LENGTH_LONG).show();
                }
            }
        });
    }
}