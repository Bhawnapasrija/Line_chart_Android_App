package com.example.linechart;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.jjoe64.graphview.GraphView;
import com.jjoe64.graphview.series.DataPoint;
import com.jjoe64.graphview.series.LineGraphSeries;

public class MainActivity extends AppCompatActivity {
    GraphView graphView;

    EditText Serial1_data0;
    EditText Serial1_data1;
    EditText Serial1_data2;
    EditText Serial1_data3;
    EditText Serial1_data4;
    EditText Serial1_data5;

    Button Submit_btn;

    Integer data0, data1, data2, data3, data4, data5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        Serial1_data0 = findViewById(R.id.Serial1_data0);
        Serial1_data1 = findViewById(R.id.Serial1_data1);
        Serial1_data2 = findViewById(R.id.Serial1_data2);
        Serial1_data3 = findViewById(R.id.Serial1_data3);
        Serial1_data4 = findViewById(R.id.Serial1_data4);
        Serial1_data5 = findViewById(R.id.Serial1_data5);
        Submit_btn =  findViewById(R.id.Submit_btn);

        Submit_btn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                data0 = Integer.parseInt(Serial1_data0.getText().toString());
                data1 = Integer.parseInt(Serial1_data1.getText().toString());
                data2 = Integer.parseInt(Serial1_data2.getText().toString());
                data3 = Integer.parseInt(Serial1_data3.getText().toString());
                data4 = Integer.parseInt(Serial1_data4.getText().toString());
                data5 = Integer.parseInt(Serial1_data5.getText().toString());

                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
                intent.putExtra("Data0", data0);
                intent.putExtra("Data1", data1);
                intent.putExtra("Data2", data2);
                intent.putExtra("Data3", data3);
                intent.putExtra("Data4", data4);
                intent.putExtra("Data5", data5);
                startActivity(intent);

            }
        });




    }
}