package com.mpandroid.charts;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;

import com.github.mikephil.charting.charts.LineChart;

import java.util.ArrayList;
import java.util.List;

public class LineChartActivity2 extends AppCompatActivity {
    LineChart lineChart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_line_chart_activity2);
        lineChart =  findViewById(R.id.line_chart);
        showLineChart(lineChart);
        //showLineChart2();
    }
    private void showLineChart2(){
        LineChartManager lineChartManager=new LineChartManager(lineChart);
        //设置x轴的数据
        ArrayList<Float> xValues = new ArrayList<>();
        for (int i = 0; i <= 4; i++) {
            xValues.add((float) i);
        }

        //设置y轴的数据()
        List<List<Float>> yValues = new ArrayList<>();

        List<Float> y1Value = new ArrayList<>();
        List<Float> y2Value = new ArrayList<>();

        List<String> lableNameList = new ArrayList<>();
        lableNameList.add("交通运行");
        lableNameList.add("拥挤指数");

        for (int j = 0; j <= 4; j++) {
            float value = (float) (Math.random() * 80);
            y1Value.add(value);
            y2Value.add(value-5);
        }
        yValues.add(y1Value);
        //yValues.add(y2Value);

        List<Integer> colorList = new ArrayList<>();
        colorList.add(Color.parseColor("#6785f2"));
        colorList.add(Color.parseColor("#eecc44"));
        lineChartManager.showLineChart(xValues, yValues, lableNameList, colorList);
        lineChartManager.setDescription("");
    }
    private void showLineChart(LineChart lineChart) {
        lineChart.getDescription().setEnabled(false);

        LineChartManager2 lineChartManager=new LineChartManager2(lineChart);
        //设置x轴的数据
        ArrayList<Float> xValues = new ArrayList<>();
        for (int i = 0; i <= 4; i++) {
            xValues.add((float) i);
        }

        //设置y轴的数据()
        List<List<Float>> yValues = new ArrayList<>();

        List<Float> y1Value = new ArrayList<>();
        List<Float> y2Value = new ArrayList<>();

        List<String> lableNameList = new ArrayList<>();
        lableNameList.add("交通运行");
        lableNameList.add("拥挤指数");

        for (int j = 0; j <= 4; j++) {
            float value = (float) (Math.random() * 80);
            if(j%2 == 1){
                value = value * -3;
            }
            Log.d("tag","y1value = " + value);
            y1Value.add(value);
            y2Value.add(value-5);
        }
        yValues.add(y1Value);
        //yValues.add(y2Value);

        List<Integer> colorList = new ArrayList<>();
        colorList.add(Color.parseColor("#6785f2"));
        colorList.add(Color.parseColor("#eecc44"));


//        lineChart.getAxisLeft().setDrawLabels(false);
//        lineChart.getAxisRight().setDrawLabels(false);
//        lineChart.getXAxis().setDrawLabels(false);

        lineChartManager.showLineChartNoFill(xValues, yValues, lableNameList, colorList);
        lineChartManager.setDescription("这是一个描述");
        lineChart.getDescription().setEnabled(false);

    }

}