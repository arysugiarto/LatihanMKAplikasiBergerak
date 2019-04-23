package com.pindah.intentwithvalue;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        TextView tampilData1 = (TextView) findViewById(R.id.tampilnama);
        TextView tampilData2 = (TextView) findViewById(R.id.tampilAlamat);
        TextView tampilData3 = (TextView) findViewById(R.id.tampilKelas);
        TextView tampilData4 = (TextView) findViewById(R.id.tampilProdi);
        TextView tampilData5 = (TextView) findViewById(R.id.tampilFakultas);
        TextView tampilData6 = (TextView) findViewById(R.id.tampilNotelp);

        tampilData1.setText(getIntent().getStringExtra("data1"));
        tampilData2.setText(getIntent().getStringExtra("data2"));
        tampilData3.setText(getIntent().getStringExtra("data3"));
        tampilData4.setText(getIntent().getStringExtra("data4"));
        tampilData5.setText(getIntent().getStringExtra("data5"));
        tampilData6.setText(getIntent().getStringExtra("data6"));
    }
}
