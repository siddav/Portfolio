package com.example.sidda.portfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private static final String PREPEND_TEXT = "This button will launch my ";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        Button spotifyStreamerButton = (Button) findViewById(R.id.spotifyStreamerButton);
        Button scoresAppButton = (Button) findViewById(R.id.scoresAppButton);
        Button libraryAppButton = (Button) findViewById(R.id.libraryAppButton);
        Button buildItBiggerButton = (Button) findViewById(R.id.buildItBiggerButton);
        Button xyzButton = (Button) findViewById(R.id.xyzButton);
        Button capstoneButton = (Button) findViewById(R.id.capstoneButton);

        spotifyStreamerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = Toast.makeText(getApplicationContext(), PREPEND_TEXT+" spotify streamer app", Toast.LENGTH_SHORT);
                toast.show();
            }
        });

        scoresAppButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = Toast.makeText(getApplicationContext(), PREPEND_TEXT + " scores app", Toast.LENGTH_SHORT);
                toast.show();
            }
        });


        libraryAppButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = Toast.makeText(getApplicationContext(), PREPEND_TEXT+" library app", Toast.LENGTH_SHORT);
                toast.show();
            }
        });


        buildItBiggerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = Toast.makeText(getApplicationContext(), PREPEND_TEXT+" build it bigger app", Toast.LENGTH_SHORT);
                toast.show();
            }
        });


        xyzButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = Toast.makeText(getApplicationContext(), PREPEND_TEXT+" xyz reader app", Toast.LENGTH_SHORT);
                toast.show();
            }
        });

        capstoneButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = Toast.makeText(getApplicationContext(), PREPEND_TEXT+" capstone app", Toast.LENGTH_SHORT);
                toast.show();
            }
        });
        /**
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        }); */
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
