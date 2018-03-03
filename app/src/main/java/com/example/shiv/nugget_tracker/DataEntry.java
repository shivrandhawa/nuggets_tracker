package com.example.shiv.nugget_tracker;

import android.content.Intent;
import android.os.Parcelable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.ArrayList;
import java.util.List;

public class DataEntry extends AppCompatActivity {
     String numberEaten;
    List<Integer> list;

    {
        list = new ArrayList<Integer>();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Intent i;

        final EditText num_eat;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_data_entry);

        i = getIntent();

        numberEaten = i.getStringExtra("key");
        num_eat = (EditText) findViewById(R.id.numeat_id);

        num_eat.setText(numberEaten);


        Button submit_btn = (Button) findViewById(R.id.submit_id);
        Button go_to_statistics = (Button) findViewById(R.id.nav_stats);
        go_to_statistics.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i2 = new Intent(getApplicationContext(),Statistics.class);
                startActivity(i2);
            }

        });


        submit_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                submit();
            }

        });

    }


    public void submit() {
        Intent i = new Intent(this,Statistics.class);
        int num = Integer.parseInt((numberEaten.toString()));
        list.add(num);


        i.putIntegerArrayListExtra("key", (ArrayList<Integer>) list);


    }

}
