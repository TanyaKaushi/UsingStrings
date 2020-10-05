package com.example.madpro;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.EditText;

public class List extends AppCompatActivity {

    EditText at,bt,ct,dt,et,ft,gt,ht,hospital,contact,city;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        at = findViewById(R.id.a);
        bt = findViewById(R.id.b);
        ct = findViewById(R.id.c);
        dt = findViewById(R.id.d);
        et = findViewById(R.id.e);
        ft = findViewById(R.id.f);
        gt = findViewById(R.id.g);
        ht = findViewById(R.id.h);
        hospital = findViewById(R.id.hospital);
        city = findViewById(R.id.city);
        contact = findViewById(R.id.contact);

        String as = getIntent().getStringExtra("aa");
        String bs = getIntent().getStringExtra("bb");
        String cs = getIntent().getStringExtra("cc");
        String ds = getIntent().getStringExtra("dd");
        String es = getIntent().getStringExtra("ee");
        String fs = getIntent().getStringExtra("ff");
        String gs = getIntent().getStringExtra("gg");
        String hs = getIntent().getStringExtra("hh");
        String hos = getIntent().getStringExtra("hospital");
        String cit = getIntent().getStringExtra("city");
        String con = getIntent().getStringExtra("contact");

        at.setText(as);
        bt.setText(bs);
        ct.setText(cs);
        dt.setText(ds);
        et.setText(es);
        ft.setText(fs);
        gt.setText(gs);
        ht.setText(hs);
        hospital.setText(hos);
        city.setText(cit);
        contact.setText(con);


    }
}