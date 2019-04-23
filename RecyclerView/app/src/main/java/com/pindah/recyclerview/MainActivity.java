package com.pindah.recyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    private String[] list = new String[]{
            "Real Madrid","Liverpool","Barca","Totenham","Ajax", "Manchester united","Juventus"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView) findViewById(R.id.listView);
        ArrayAdapter arrayAdapter = new ArrayAdapter( MainActivity.this, android.R.layout.simple_list_item_1, list);
        listView.setAdapter(arrayAdapter);
    }
}
