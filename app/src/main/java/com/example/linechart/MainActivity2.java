package com.example.linechart;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.jjoe64.graphview.GraphView;
import com.jjoe64.graphview.series.DataPoint;
import com.jjoe64.graphview.series.LineGraphSeries;

public class MainActivity2 extends AppCompatActivity {

    Integer data0, data1, data2, data3, data4, data5;
    GraphView graphView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main2);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        data0 = getIntent().getIntExtra("Data0", 0);
        data1 = getIntent().getIntExtra("Data1", 0);
        data2 = getIntent().getIntExtra("Data2", 0);
        data3 = getIntent().getIntExtra("Data3", 0);
        data4 = getIntent().getIntExtra("Data4", 0);
        data5 = getIntent().getIntExtra("Data5", 0);

        // on below line we are initializing our graph view.
        graphView = findViewById(R.id.idGraphView);

        // on below line we are adding data to our graph view.
        LineGraphSeries<DataPoint> series = new LineGraphSeries<DataPoint>(new DataPoint[]{
                // on below line we are adding
                // each point on our x and y axis.
                new DataPoint(0, data0),
                new DataPoint(1, data1),
                new DataPoint(2, data2),
                new DataPoint(4, data3),
                new DataPoint(5, data4),
                new DataPoint(6, data5),

        });

        // after adding data to our line graph series.
        // on below line we are setting
        // title for our graph view.
        graphView.setTitle("My Graph View");

        // on below line we are setting
        // text color to our graph view.
        graphView.setTitleColor(R.color.black);

        // on below line we are setting
        // our title text size.
        graphView.setTitleTextSize(18);

        // on below line we are adding
        // data series to our graph view.
        graphView.addSeries(series);




    }
}