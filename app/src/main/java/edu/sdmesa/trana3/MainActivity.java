package edu.sdmesa.trana3;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button mesaButton, redditButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // buttons
        mesaButton = (Button) findViewById(R.id.buttonMesa);
        mesaButton.setOnClickListener(this);

        redditButton = (Button) findViewById(R.id.buttonReddit);
        redditButton.setOnClickListener(this);

        // locked on portrait orientation
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
    }

    @Override
    public void onClick(View v) {

        // determines what action to do based on which button is pressed
        switch (v.getId())
        {
            case R.id.buttonMesa: {
                Intent openMesa = new Intent(this, Mesa.class);
                startActivity(openMesa);
                break;
            }

            case R.id.buttonReddit: {
                Intent openReddit = new Intent(this, Reddit.class);
                startActivity(openReddit);
                break;
            }
        }
    }
}
