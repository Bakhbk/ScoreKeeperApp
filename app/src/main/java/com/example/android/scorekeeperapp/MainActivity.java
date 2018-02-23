package com.example.android.scorekeeperapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

  //////////SHOWING SCORES FOR TEAM A/////////
  //  Global integer for scoreTeamA
  private int scoreTeamA = 0;
  //  Global integer for yellowScoreTeamA
  int yellowScoreTeamA = 0;
  //  Global integer for yellowScoreTeamA
  int redScoreTeamA = 0;

  //////////SHOWING SCORES FOR TEAM B//////////
  //  Global integer for scoreTeamB
  private int scoreTeamB = 0;
  //  Global integer for yellowScoreTeamB
  int yellowScoreTeamB = 0;
  //  Global integer for yellowScoreTeamB
  int redScoreTeamB = 0;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    // Hide the keyboard
    this.getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);
    setContentView(R.layout.activity_main);

    //////////SHOWING SCORES FOR TEAM A//////////
    //    Show goals score for Team A
    displayScoreTeamA(scoreTeamA);
    //    Show yellow card score for Team A
    displayYellowScoreTeamA(yellowScoreTeamA);
    //    Show red card score for Team A
    displayRedScoreTeamA(redScoreTeamA);

    //////////SHOWING SCORES FOR TEAM B//////////
    //    Show goals score for Team B
    displayScoreTeamB(scoreTeamB);
    //    Show yellow card score for Team B
    displayYellowScoreTeamB(yellowScoreTeamB);
    //    Show red card score for Team B
    displayRedScoreTeamB(redScoreTeamB);
  }

  ////////START METHODS FOR TEAM A////////////////////
  //  To finding/changed/updating score_team_a.
  public void displayScoreTeamA(int score) {
    TextView scoreView = findViewById(R.id.score_team_a);
    scoreView.setText(String.valueOf(score));
  }

  //  Increase scoreTeamA by one click in button score_team_a
  public void increaseScoreTeamA(View v) {
    scoreTeamA += +1;
    displayScoreTeamA(scoreTeamA);
  }

  //  To finding/changed/updating yellow_score_team_a.
  public void displayYellowScoreTeamA(int score) {
    TextView scoreView = findViewById(R.id.yellow_score_team_a);
    scoreView.setText(String.valueOf(score));
  }

  //  Increase yellowScoreTeamA by one click in button yellow_score_team_a
  public void increaseYellowScoreTeamA(View v) {
    yellowScoreTeamA += +1;
    displayYellowScoreTeamA(yellowScoreTeamA);
  }

  //  To finding/changed/updating red_score_team_a.
  public void displayRedScoreTeamA(int score) {
    TextView scoreView = findViewById(R.id.red_score_team_a);
    scoreView.setText(String.valueOf(score));
  }

  //  Increase redScoreTeamA by one click in button red_score_team_a
  public void increaseRedScoreTeamA (View v) {
    redScoreTeamA += +1;
    displayRedScoreTeamA(redScoreTeamA);
  }

  ////////START METHODS FOR TEAM B////////////////////
  //  To finding/changed/updating score_team_b.
  public void displayScoreTeamB(int score) {
    TextView scoreView = findViewById(R.id.score_team_b);
    scoreView.setText(String.valueOf(score));
  }

  //  Increase scoreTeamA by one click in button score_team_b
  public void increaseScoreTeamB(View v) {
    scoreTeamB += +1;
    displayScoreTeamB(scoreTeamB);
  }

  //  To finding/changed/updating yellow_score_team_b
  public void displayYellowScoreTeamB(int score) {
    TextView scoreView = findViewById(R.id.yellow_score_team_b);
    scoreView.setText(String.valueOf(score));
  }

  //  Increase yellowScoreTeamB by one click in button yellow_score_team_b
  public void increaseYellowScoreTeamB(View v) {
    yellowScoreTeamB += +1;
    displayYellowScoreTeamB(yellowScoreTeamB);
  }

  //  To finding/changed/updating red_score_team_b.
  public void displayRedScoreTeamB(int score) {
    TextView scoreView = findViewById(R.id.red_score_team_b);
    scoreView.setText(String.valueOf(score));
  }

  //  Increase redScoreTeamB by one click in button red_score_team_b
  public void increaseRedScoreTeamB(View v) {
    redScoreTeamB += +1;
    displayRedScoreTeamB(redScoreTeamB);
  }

  ////////RESET ALL SCORES BY CLICK RESET BUTTON///////////////////////////
  public void resetButton(View view) {
    scoreTeamA = 0;
    yellowScoreTeamA = 0;
    redScoreTeamA = 0;
    scoreTeamB = 0;
    yellowScoreTeamB = 0;
    redScoreTeamB = 0;
    displayScoreTeamA(scoreTeamA);
    displayYellowScoreTeamA(yellowScoreTeamA);
    displayRedScoreTeamA(redScoreTeamA);
    displayScoreTeamB(scoreTeamB);
    displayYellowScoreTeamB(yellowScoreTeamB);
    displayRedScoreTeamB(redScoreTeamB);
  }
}