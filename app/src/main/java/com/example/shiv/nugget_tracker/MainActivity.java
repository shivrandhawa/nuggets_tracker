package com.example.shiv.nugget_tracker;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int count = 0;
    boolean achievement_10 = false;
    boolean achievement_50 = false;
    boolean achievement_100 = false;
    boolean achievement_200 = false;
    boolean achievement_1000 = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final Button eat_1 = (Button) findViewById(R.id.eat_1);
        final Button eat_10 = (Button) findViewById(R.id.eat_10);
        final Button achiev = (Button) findViewById(R.id.to_achiev);

        Switch s1 = (Switch) findViewById(R.id.switchid);


        achiev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(), Achievements.class);

                startActivity(i);
            }

        });

        s1.setOnClickListener(new View.OnClickListener() {
            @Override //if switch set negative change btn text to -1/-10
            public void onClick(View v) {
                if (isSetNeg() == true) {
                    eat_1.setText("-1");
                    eat_10.setText("-10");

                } else if (isSetNeg() == false) {
                    eat_1.setText("+1");
                    eat_10.setText("+10");

                }
                eat_1.invalidate();
                eat_10.invalidate();
            }
        });

        eat_10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                incCountTen();
            }

        });


        eat_1.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View v) {

                incCountOne();

            }

        });


    }

    public void incCountTen() {
        final TextView bigCount = (TextView) findViewById(R.id.eatCount);

        if (isSetNeg() == false) {
            count += 10;
            checkachievements();
        } else if (isSetNeg() == true) {
            count -= 10;

        }
        bigCount.setText(String.valueOf(count));

    }


    //increments or decrements the coutner by 1
    public void incCountOne() {
        final TextView bigCount = (TextView) findViewById(R.id.eatCount);

        if (isSetNeg() == false) {
            count++;
            checkachievements();
        } else if (isSetNeg() == true) {
            count--;
        }
        bigCount.setText(String.valueOf(count));

    }

    //checks if switch is set to negative.  Button defaults as set positive.
    public boolean isSetNeg() {


        Switch s1 = (Switch) findViewById(R.id.switchid);
        if (s1.isChecked() == true) {
            return true;
        } else {
            return false;

        }
    }

    public void checkachievements() {

        if ((count >= 10) && achievement_10 == false) {
            Toast.makeText(MainActivity.this, "Achievement Unlocked!", Toast.LENGTH_SHORT).show();
            achievement_10 = true;
        } else if ((count >= 50) && achievement_50 == false) {
            Toast.makeText(MainActivity.this, "omg! another Achievement Unlocked!", Toast.LENGTH_SHORT).show();
            achievement_50 = true;
        } else if ((count >= 100) && achievement_100 == false) {
            Toast.makeText(MainActivity.this, "your on a roll!, Achievement Unlocked!", Toast.LENGTH_SHORT).show();
            achievement_100 = true;
        } else if ((count >= 200) && achievement_200 == false) {
            Toast.makeText(MainActivity.this, "Achievement Unlockeddddddd!", Toast.LENGTH_SHORT).show();
            achievement_200 = true;
        } else if ((count >= 1000) && achievement_1000 == false) {
            Toast.makeText(MainActivity.this, "FINAL Achievement Unlocked!!!! your SICK!", Toast.LENGTH_SHORT).show();
            achievement_1000 = true;
        }

    }

}
