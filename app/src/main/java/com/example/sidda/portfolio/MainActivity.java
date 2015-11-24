package com.example.sidda.portfolio;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    private static final String PREPEND_TEXT = "This button will launch my ";
    @Bind(R.id.spotifyStreamerButton) Button spotifyStreamerButton;
    @Bind(R.id.scoresAppButton) Button scoresAppButton;
    @Bind(R.id.libraryAppButton) Button libraryAppButton;
    @Bind(R.id.buildItBiggerButton) Button buildItBiggerButton;
    @Bind(R.id.xyzButton) Button xyzButton;
    @Bind(R.id.capstoneButton) Button capstoneButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        // adding view injection butter knife
        ButterKnife.bind(this);
/**
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

    @Nullable
    @OnClick({R.id.spotifyStreamerButton, R.id.scoresAppButton, R.id.libraryAppButton, R.id.buildItBiggerButton, R.id.xyzButton,R.id.capstoneButton})
    public void buttonClick(Button button) {
        Toast toast = Toast.makeText(getApplicationContext(), PREPEND_TEXT+ button.getText() + " app", Toast.LENGTH_SHORT);
        toast.show();
    }
}
