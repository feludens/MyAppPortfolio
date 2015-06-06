package com.spadatech.myappportfolio;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    private Button btnSpotify;
    private Button btnScores;
    private Button btnLibrary;
    private Button btnBIB;
    private Button btnXYZ;
    private Button btnCapstone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnSpotify = (Button) findViewById(R.id.btnSpotify);
        btnScores = (Button) findViewById(R.id.btnScores);
        btnLibrary = (Button) findViewById(R.id.btnLibrary);
        btnBIB = (Button) findViewById(R.id.btnBIB);
        btnXYZ = (Button) findViewById(R.id.btnXYZ);
        btnCapstone = (Button) findViewById(R.id.btnCapstone);
    }

    public void buttonClicked(View btn){

        String message = "";

        if(btn.getId() == btnSpotify.getId()){
            message = "This button will launch my Spotify app!";
        }
        else if(btn.getId() == btnScores.getId()){
            message = "This button will launch my Scores app!";
        }
        else if(btn.getId() == btnLibrary.getId()){
            message = "This button will launch my Library app!";
        }
        else if(btn.getId() == btnBIB.getId()){
            message = "This button will launch my BIB app!";
        }
        else if(btn.getId() == btnXYZ.getId()){
            message = "This button will launch my Reader app!";
        }
        else if(btn.getId() == btnCapstone.getId()){
            message = "This button will launch my Capstone app!";
        }else{
            message = "Error #1";
        }

        Toast.makeText(this, message, Toast.LENGTH_LONG).show();

        //Error #1 = btn.getID() did not match any of the if/else cases
    }

}
