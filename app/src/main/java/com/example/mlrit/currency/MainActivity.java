package com.example.mlrit.currency;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


            int pos=0;
    Button myb;
    EditText myt;
    TextView myv;
    Spinner myspn;
    String[] name={"YEN","DOLLAR","EURO","POUND"};

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        myb=(Button) findViewById(R.id.b);
        myspn=(Spinner) findViewById(R.id.s1);
        myt=(EditText) findViewById(R.id.t);
        myv=(TextView) findViewById(R.id.tv1);
        ArrayAdapter ad1=new ArrayAdapter(this, android.R.layout.simple_dropdown_item_1line,name);
        myspn.setAdapter(ad1);
        myspn.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                pos=position;
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
        myb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String x= myt.getText().toString();
                int y=Integer.parseInt(x);
                if(pos==0) {
                    y = y * 80;
                    myv.setText(""+y);
                }
                else if(pos==1)
                {
                    y=y*65;
                    myv.setText("" +y);
                }
                else if(pos==2)
                {
                    y=y*140;
                    myv.setText(" "+y);
                }
                else if(pos==3)
                {
                    y=y*100;
                    myv.setText(" "+y);
                }

            }

        });
    }
}
