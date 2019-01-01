package com.aravi.currencyconverterapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;
import java.text.Format;
import java.util.Formatter;

public class MainActivity extends AppCompatActivity {

    Button euro,doller,pound,japaneseyen,dinhamcoin,bitcoin,russinrobbile,ausdoller,canadadoller;
    TextView textView;
    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        euro=findViewById(R.id.Euro_currency);
        doller=findViewById(R.id.US_doller);
        pound=findViewById(R.id.british_pound);
        japaneseyen=findViewById(R.id.japanese_yen);
        dinhamcoin=findViewById(R.id.dinham);
        bitcoin=findViewById(R.id.bitcoin);
        russinrobbile=findViewById(R.id.Russiancoin);
        ausdoller=findViewById(R.id.ausdlr);
        canadadoller=findViewById(R.id.canadadlr);

        textView=findViewById(R.id.textView2);
        editText=findViewById(R.id.editText);

        euro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s=editText.getText().toString();
                if (TextUtils.isEmpty(s)){
                    editText.setError("Please enter any value");
                }else {
                    Double n,k;
                    n=Double.parseDouble(s);
                    textView.setText(null);

                    //Formatter formatter=new Formatter();
                    k=n*0.012;
                    //textView.setText(""+k);
                    DecimalFormat numberformat=new DecimalFormat("#.00");
                    textView.setText("€ "+numberformat.format(k));
                    //editText.setText(null);

                }
            }
        });

        doller.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s=editText.getText().toString();
                if (TextUtils.isEmpty(s)){
                    editText.setError("Please enter any value");
                }else {
                    Double n,k;
                    n=Double.parseDouble(s);
                    textView.setText(null);

                    //Formatter formatter=new Formatter();
                    k=n*0.0142;
                    //textView.setText(""+k);
                    DecimalFormat numberformat=new DecimalFormat("#.00");
                    textView.setText("$ "+numberformat.format(k));
                    //editText.setText(null);

                }
            }
        });

        pound.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s=editText.getText().toString();
                if (TextUtils.isEmpty(s)){
                    editText.setError("Please enter any value");
                }else {
                    Double n,k;
                    n=Double.parseDouble(s);
                    textView.setText(null);

                    //Formatter formatter=new Formatter();
                    k=n*0.011;
                    //textView.setText(""+k);
                    DecimalFormat numberformat=new DecimalFormat();
                    textView.setText("£ "+numberformat.format(k));
                    //editText.setText(null);

                }
            }
        });

        japaneseyen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s=editText.getText().toString();
                if (TextUtils.isEmpty(s)){
                    editText.setError("Please enter any value");
                }else {
                    Double n,k;
                    n=Double.parseDouble(s);
                    textView.setText(null);

                    //Formatter formatter=new Formatter();
                    k=n*1.58;
                    //textView.setText(""+k);
                    DecimalFormat numberformat=new DecimalFormat();
                    textView.setText("¥ "+numberformat.format(k));
                    //editText.setText(null);

                }
            }
        });

        dinhamcoin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s=editText.getText().toString();
                if (TextUtils.isEmpty(s)){
                    editText.setError("Please enter any value");
                }else {
                    Double n,k;
                    n=Double.parseDouble(s);
                    textView.setText(null);

                    //Formatter formatter=new Formatter();
                    k=n*0.0043;
                    //textView.setText(""+k);
                    DecimalFormat numberformat=new DecimalFormat();
                    textView.setText("KDNR "+numberformat.format(k));
                    //editText.setText(null);

                }
            }
        });

        bitcoin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s=editText.getText().toString();
                if (TextUtils.isEmpty(s)){
                    editText.setError("Please enter any value");
                }else {
                    Double n,k;
                    n=Double.parseDouble(s);
                    textView.setText(null);

                    //Formatter formatter=new Formatter();
                    k=n*0.0000034;
                    //textView.setText(""+k);
                    DecimalFormat numberformat=new DecimalFormat();
                    textView.setText("BTC "+numberformat.format(k));
                    //editText.setText(null);

                }
            }
        });

        russinrobbile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s=editText.getText().toString();
                if (TextUtils.isEmpty(s)){
                    editText.setError("Please enter any value");
                }else {
                    Double n,k;
                    n=Double.parseDouble(s);
                    textView.setText(null);

                    //Formatter formatter=new Formatter();
                    k=n*0.98;
                    //textView.setText(""+k);
                    DecimalFormat numberformat=new DecimalFormat();
                    textView.setText("RUS╜ "+numberformat.format(k));
                    //editText.setText(null);

                }
            }
        });

        ausdoller.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s=editText.getText().toString();
                if (TextUtils.isEmpty(s)){
                    editText.setError("Please enter any value");
                }else {
                    Double n,k;
                    n=Double.parseDouble(s);
                    textView.setText(null);

                    //Formatter formatter=new Formatter();
                    k=n*0.020;
                    //textView.setText(""+k);
                    DecimalFormat numberformat=new DecimalFormat();
                    textView.setText("Aus$ "+numberformat.format(k));
                   // editText.setText(null);

                }
            }
        });

        canadadoller.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s=editText.getText().toString();
                if (TextUtils.isEmpty(s)){
                    editText.setError("Please enter any value");
                }else {
                    Double n,k;
                    n=Double.parseDouble(s);
                    textView.setText(null);

                    //Formatter formatter=new Formatter();
                    k=n*0.019;
                    //textView.setText(""+k);
                    DecimalFormat numberformat=new DecimalFormat();
                    textView.setText("Can$ "+numberformat.format(k));
                    //editText.setText(null);

                }
            }
        });
    }
}
