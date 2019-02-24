package com.example.hoangle.tinhtonghaiso;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity    {

    private EditText edtNumbera;
    private EditText edtNumberb;
    private TextView tvResult;
    private Button btnResult;






    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtNumbera = (EditText)findViewById(R.id.edt_inputa);
        edtNumberb = (EditText)findViewById(R.id.edt_inputb);
        tvResult =(TextView)findViewById(R.id.tv_result);
        btnResult = (Button)findViewById(R.id.btnResult);
        btnResult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              String chuoi1 = edtNumbera.getText().toString();
              int so1 = Integer.parseInt(chuoi1);
              String chuoi2 = edtNumberb.getText().toString();
              int so2 = Integer.parseInt(chuoi2);
              int tong = so1 + so2;
              tvResult.setText(String.valueOf(tong));
            }
        });
    }





}