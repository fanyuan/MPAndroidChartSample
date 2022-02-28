package com.mpandroid.charts;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;

import com.github.mikephil.charting.charts.RadarChart;

import java.util.ArrayList;
import java.util.List;

public class RadarChartActivity extends AppCompatActivity {
    private RadarChart radarChart;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_radar_chart);
        initView();
    }
    private void initView() {
        radarChart = findViewById(R.id.reader_chart);
        RadarChartManager manager = new RadarChartManager(this,radarChart);

        List<String> xData = new ArrayList<>();
        List<List<Float>> yDatas = new ArrayList<>();
        List<String> names = new ArrayList<>();
        names.add("东城区");
        names.add("朝阳区");
        names.add("西城");
        names.add("丰台区");
        names.add("石景山");
        names.add("房山区");

        xData.add("总体");
        xData.add("交通设施");
        xData.add("评价");
        xData.add("平均");
        xData.add("交通治理");
        xData.add("交通需求");
        xData.add("交通拥堵指数");
        List<Integer> colors = new ArrayList<>();

        for (int i = 0; i < 6; i++) {
            List<Float> nData = new ArrayList<>();
            for (int j = 0; j < 7; j++) {
                nData.add((float) (Math.random() * 20));
            }
            yDatas.add(nData);
        }

        colors.add(Color.parseColor("#fbd06a"));
        colors.add(Color.parseColor("#f69a40"));
        colors.add(Color.parseColor("#ff5d52"));
        colors.add(Color.parseColor("#e71f19"));
        colors.add(Color.parseColor("#ff9b43"));
        colors.add(Color.parseColor("#8eb9fb"));

        manager.showRadarChart(xData, yDatas, names, colors);
    }
}