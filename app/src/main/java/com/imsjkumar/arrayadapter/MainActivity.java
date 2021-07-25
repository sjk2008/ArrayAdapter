package com.imsjkumar.arrayadapter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.Collections;

public class MainActivity extends AppCompatActivity {
    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = findViewById(R.id.list_View);

        ArrayAdapter arrayAdapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_single_choice,
                getResources().getStringArray(R.array.android_version));
        listView.setAdapter(arrayAdapter);

    }
}