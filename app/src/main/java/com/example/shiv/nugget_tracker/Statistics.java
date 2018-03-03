package com.example.shiv.nugget_tracker;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.jjoe64.graphview.GraphView;
import com.jjoe64.graphview.series.DataPoint;
import com.jjoe64.graphview.series.LineGraphSeries;

import java.util.ArrayList;

public class Statistics extends AppCompatActivity {
    Intent i;
    int addEat;
    int x1;
    int x2 = 10;
    int x3;

   // int arrayEat;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_statistics);

        i = getIntent();
        addEat = i.getIntExtra("key",0);
        ArrayList<Integer> arrayEat = getIntent().getIntegerArrayListExtra("key");

////        for (int j = 0; j < arrayEat.size(); j++) {
            //x1 = arrayEat.get(0);
        int x1 = arrayEat.get(1);
////        }
//
//
//        GraphView graph = (GraphView) findViewById(R.id.graph);
//        LineGraphSeries<DataPoint> series = new LineGraphSeries<>(new DataPoint[] {
//
//
//
//                new DataPoint(0, x1),
//                new DataPoint(1,x2)
//
//        });
//        graph.addSeries(series);
//
//
//        Button r_btn = findViewById(R.id.return_button);
//        r_btn.setOnClickListener(new View.OnClickListener(){
//            @Override
//            public void onClick(View view){
//                finish();
//            }
//
//
//        });

    }



}