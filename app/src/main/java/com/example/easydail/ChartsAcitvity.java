package com.example.easydail;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import java.util.List;

import lecho.lib.hellocharts.view.Chart;

public class ChartsAcitvity extends AppCompatActivity{

    private Chart mChart;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.chart_view);
        mChart = (Chart) findViewById(R.id.chart);
        List<CostBean> allDate = (List<CostBean>) getIntent().getSerializableExtra("cost_list");
    }
}
