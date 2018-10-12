package com.example.android.scorekeeper;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.media.MediaPlayer;
import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import static com.example.android.scorekeeper.R.mipmap.ic_launcher;

public class MainActivity extends AppCompatActivity {
    int scoreTeamA;
    int scorefoulA;
    int scoreTeamB;
    int scorefoulB;
    @Override
    
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
    public void displayForTeamA1(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score1);
        scoreView.setText(String.valueOf(score));


    }
    public void goal(View view)
    { scoreTeamA=scoreTeamA+1;
        displayForTeamA1(scoreTeamA);
    }
    public void displayForTeamA2(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score2);
        scoreView.setText(String.valueOf(score));
    }
    public void foul(View view)
    { scorefoulA=scorefoulA+1;
        displayForTeamA2(scorefoulA);
    }
    public void displayForTeamB1(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score1);
        scoreView.setText(String.valueOf(score));

    }
    public void goal2(View view)
    { scoreTeamB=scoreTeamB+1;
        displayForTeamB1(scoreTeamB);
    }
    public void displayForTeamB2(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score2);
        scoreView.setText(String.valueOf(score));
    }
    public void foul2(View view)
    { scorefoulB=scorefoulB+1;
        displayForTeamB2(scorefoulB);
    }
    public void reset(View view)
    {
        scorefoulA=0;
        scorefoulB=0;
        scoreTeamA=0;
        scoreTeamB=0;
        displayForTeamA1(scoreTeamA);
        displayForTeamA2(scorefoulA);
        displayForTeamB1(scoreTeamB);
        displayForTeamB2(scoreTeamA);
    }
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK) {
            exitByBackKey();

            //moveTaskToBack(false);

            return true;
        }
        return super.onKeyDown(keyCode, event);
    }

    protected void exitByBackKey() {

        AlertDialog alertbox = new AlertDialog.Builder(this)
                .setTitle("Exit!!")
                .setIcon(R.mipmap.ic_launcher)
                .setMessage("Do you want to exit ScoreKeeper?")
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {

                    // do something when the button is clicked
                    public void onClick(DialogInterface arg0, int arg1) {

                        finish();
                        //close();


                    }
                })
                .setNegativeButton("No", new DialogInterface.OnClickListener() {

                    // do something when the button is clicked
                    public void onClick(DialogInterface arg0, int arg1) {
                    }
                })
                .show();}
   

    }

}
