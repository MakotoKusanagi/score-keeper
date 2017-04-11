package com.example.android.footballscorekeeper;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;
    int scoreTeamB = 0;
    int faulTeamA = 0;
    int faulTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void faulA(View view) {
        faulTeamA = faulTeamA + 1;
        displayFaulA(faulTeamA);

    }

    public void displayFaulA(int faulTeamA){
        TextView faulViewA = (TextView) findViewById(R.id.team_a_faul);
        faulViewA.setText(String.valueOf(faulTeamA));
    }


    public void goalA(View view) {
        scoreTeamA = scoreTeamA + 1;
        displayForTeamA(scoreTeamA);
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    public void faulB(View view) {
        faulTeamB = faulTeamB + 1;
        displayFaulB(faulTeamB);
    }

    public void displayFaulB(int faulTeamB){
        TextView faulViewB = (TextView) findViewById(R.id.team_b_faul);
        faulViewB.setText(String.valueOf(faulTeamB));
    }



    public void goalB(View view) {
        scoreTeamB = scoreTeamB + 1;
        displayForTeamB(scoreTeamB);
    }
    public void resetScore(View view){
        scoreTeamA = 0;
        scoreTeamB = 0;
        faulTeamA = 0;
        faulTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
        displayFaulA(faulTeamA);
        displayFaulB(faulTeamB);
    }

}


