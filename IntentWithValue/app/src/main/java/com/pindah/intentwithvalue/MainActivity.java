package com.pindah.intentwithvalue;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText nama = (EditText) findViewById(R.id.edi_nama);
        final EditText alamat = (EditText) findViewById(R.id.edit_alamat);
        final EditText kelas = (EditText) findViewById(R.id.edit_kelas);
        final EditText prodi = (EditText) findViewById(R.id.edit_prodi);
        final EditText fakultas = (EditText) findViewById(R.id.edit_fakultas);
        final EditText notelp = (EditText) findViewById(R.id.edit_notelp);
        Button btntampil = (Button) findViewById(R.id.buttonTampil);

        btntampil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                intent.putExtra("data1",nama.getText().toString());
                intent.putExtra("data2",alamat.getText().toString());
                intent.putExtra("data3",kelas.getText().toString());
                intent.putExtra("data4",prodi.getText().toString());
                intent.putExtra("data5",fakultas.getText().toString());
                intent.putExtra("data6",notelp.getText().toString());
                startActivity(intent);
            }
        });
    }
}
