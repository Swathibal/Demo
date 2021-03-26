package com.example.courtcounter;

import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    int scoreOfA = 0, scoreOfB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void countScoreOfTeamA_3(View view) {
        scoreOfA += 3;
        displayForTeamA(scoreOfA);
    }

    public void countScoreOfTeamA_2(View view) {
        scoreOfA += 2;
        displayForTeamA(scoreOfA);
    }

    public void countScoreOfTeamA_1(View view) {
        scoreOfA += 1;
        displayForTeamA(scoreOfA);
    }

    public void countScoreOfTeamB_3(View view) {
        scoreOfB += 3;
        displayForTeamB(scoreOfB);
    }

    public void countScoreOfTeamB_2(View view) {
        scoreOfB += 2;
        displayForTeamB(scoreOfB);
    }

    public void countScoreOfTeamB_1(View view) {
        scoreOfB += 1;
        displayForTeamB(scoreOfB);
    }

    public void resetScore(View view) {
        scoreOfA = 0;
        scoreOfB = 0;
        displayForTeamA(scoreOfA);
        displayForTeamB(scoreOfB);

    }

    public void displayForTeamA(int score) {
        TextView scoreViewA = (TextView) findViewById(R.id.team_a_score);
        scoreViewA.setText(String.valueOf(score));
    }

    public void displayForTeamB(int score) {
        TextView scoreViewB = (TextView) findViewById(R.id.team_b_score);
        scoreViewB.setText(String.valueOf(score));
    }
}