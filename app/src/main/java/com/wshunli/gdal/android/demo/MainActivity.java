package com.wshunli.gdal.android.demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import org.gdal.ogr.ogr;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ogr.RegisterAll();


    }
}
