package com.example.android.scorekeeper;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

//import android.view.Menu;
//import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int teamAScore=0;
    int teamBScore=0;
    int teamAFoul=0;
    int teamBFoul=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void addTeamAScore(View v){
        teamAScore++;
        displayScore(teamAScore,"A");
    }

    public void addTeamBScore(View v){
        teamBScore++;
        displayScore(teamBScore,"B");
    }

    public void displayScore(int score, String team) {
        TextView scoreView;
        if(team=="A"){
             scoreView = (TextView) findViewById(R.id.teamAScore);
        }
        else{
             scoreView = (TextView) findViewById(R.id.teamBScore);
        }
        scoreView.setText(String.valueOf(score));
    }
}
