package com.mpandroid.charts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.github.mikephil.charting.charts.RadarChart;

public class MainActivity extends AppCompatActivity {
    private RadarChart radarChart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void toLineChartActivity(View view) {
        startActivity(new Intent(this,LineChartActivity.class));
    }

    public void toRadarChartActivity(View view) {
        startActivity(new Intent(this,RadarChartActivity.class));
    }


    public void toLineChartActivity2(View view) {
        startActivity(new Intent(this, LineChartActivity2.class));
    }
}