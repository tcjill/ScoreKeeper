package android.example.scorekeeper;

import android.example.scorekeeper.R;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreTeamRed = 0;
    int scoreTeamBlue =0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //displayForTeamA(12);

    }
    public void addTwoForTeamA(View v) {

        scoreTeamRed = scoreTeamRed + 2;
        displayForTeamRed(scoreTeamRed);
    }
    //dispaly for b
    public void addTwoForTeamBlue(View v){
        scoreTeamBlue = scoreTeamBlue + 2;
        displayForTeamBlue(scoreTeamBlue);

    }
    public void addOneForTeamRed(View v) {

        scoreTeamRed = scoreTeamRed + 1;
        displayForTeamRed(scoreTeamRed);
    }

    public void addThreeForTeamBlue(View v){
        scoreTeamBlue = scoreTeamBlue + 3;
        displayForTeamBlue(scoreTeamBlue);

    }

    public void addThreeForTeamRed(View v) {

        scoreTeamRed = scoreTeamRed + 3;
        displayForTeamRed(scoreTeamRed);

    }

    public void addOneForTeamBlue(View v){
        scoreTeamBlue = scoreTeamBlue + 1;
        displayForTeamBlue(scoreTeamBlue);

    }

    //reset button sets back to zero
    public void resetScore(View v){
        scoreTeamRed = 0;
        scoreTeamBlue = 0;
        displayForTeamRed(scoreTeamRed);
        displayForTeamBlue(scoreTeamBlue);



    }






    /**
     * Displays the given score for Team red.
     */
    public void displayForTeamRed(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_red_score);
        scoreView.setText(String.valueOf(score));
    }
    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamBlue(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_blue_score);
        scoreView.setText(String.valueOf(score));
    }

}
