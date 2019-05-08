package com.example.checkboxbasic;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    TextView textView;
    CheckBox a,j,ph,p,u;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView=findViewById(R.id.textView2);
        a=findViewById(R.id.androidcheckBox);
        a.setOnClickListener(this);

        j=findViewById(R.id.javacheckBox2);
        j.setOnClickListener(this);

        ph=findViewById(R.id.phpcheckBox3);
        ph.setOnClickListener(this);

        p=findViewById(R.id.pythoncheckBox4);
        p.setOnClickListener(this);

        u=findViewById(R.id.uniytcheckBox5);
        u.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (textView.getId())
        {
            case R.id.androidcheckBox:
                if(a.isChecked())
                    Toast.makeText(getApplicationContext(),"Android",Toast.LENGTH_SHORT).show();
                break;

            case R.id.javacheckBox2:
                if(j.isChecked())
                    Toast.makeText(getApplicationContext(),"Java",Toast.LENGTH_SHORT).show();
                break;

            case R.id.phpcheckBox3:
                if(ph.isChecked())
                    Toast.makeText(getApplicationContext(),"PHP",Toast.LENGTH_SHORT).show();
                break;

            case R.id.pythoncheckBox4:
                if(p.isChecked())
                    Toast.makeText(getApplicationContext(),"Python",Toast.LENGTH_SHORT).show();
                break;

            case R.id.uniytcheckBox5:
                if(u.isChecked())
                    Toast.makeText(getApplicationContext(),"Unity 3D",Toast.LENGTH_SHORT).show();
                break;

        }
    }
}