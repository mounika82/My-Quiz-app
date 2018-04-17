package com.example.bangaram.quiz_app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {


    int score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void SubmitQuiz(View view) {
        EditText nameField = findViewById(R.id.et_1);
        String name = nameField.getText().toString();
        EditText answer = findViewById(R.id.et_2);
        onRadioButtonClicked(findViewById(R.id.q1_o1));
        onRadioButtonClicked(findViewById(R.id.q1_o2));
        onRadioButtonClicked(findViewById(R.id.q1_o3));
        onRadioButtonClicked(findViewById(R.id.q1_o4));
        onRadioButtonClicked(findViewById(R.id.q2_o1));
        onRadioButtonClicked(findViewById(R.id.q2_o2));
        onRadioButtonClicked(findViewById(R.id.q2_o3));
        onRadioButtonClicked(findViewById(R.id.q2_o4));
        onRadioButtonClicked(findViewById(R.id.q3_o1));
        onRadioButtonClicked(findViewById(R.id.q3_o2));
        onRadioButtonClicked(findViewById(R.id.q3_o3));
        onRadioButtonClicked(findViewById(R.id.q3_o4));
        onRadioButtonClicked(findViewById(R.id.q4_o1));
        onRadioButtonClicked(findViewById(R.id.q4_o2));
        onRadioButtonClicked(findViewById(R.id.q4_o3));
        onRadioButtonClicked(findViewById(R.id.q4_o4));
        onRadioButtonClicked(findViewById(R.id.q5_o1));
        onRadioButtonClicked(findViewById(R.id.q5_o2));
        onRadioButtonClicked(findViewById(R.id.q5_o3));
        onRadioButtonClicked(findViewById(R.id.q5_o4));
        onRadioButtonClicked(findViewById(R.id.q6_o1));
        onRadioButtonClicked(findViewById(R.id.q6_o2));
        onRadioButtonClicked(findViewById(R.id.q6_o3));
        onRadioButtonClicked(findViewById(R.id.q6_o4));
        onRadioButtonClicked(findViewById(R.id.q7_o1));
        onRadioButtonClicked(findViewById(R.id.q7_o2));
        onRadioButtonClicked(findViewById(R.id.q7_o3));
        onRadioButtonClicked(findViewById(R.id.q7_o4));
        onRadioButtonClicked(findViewById(R.id.q8_o1));
        onRadioButtonClicked(findViewById(R.id.q8_o2));
        onRadioButtonClicked(findViewById(R.id.q8_o3));
        onRadioButtonClicked(findViewById(R.id.q8_o4));
        textCompare(answer);
        onRadioButtonClicked(findViewById(R.id.q10_o1));
        onRadioButtonClicked(findViewById(R.id.q10_o2));
        onRadioButtonClicked(findViewById(R.id.q10_o3));
        onRadioButtonClicked(findViewById(R.id.q10_o4));

        String finalScore = name + " Your final score is : " + score + " out of 10";

            Toast.makeText(getApplicationContext(), finalScore , Toast.LENGTH_SHORT).show();

    }


    private void onRadioButtonClicked(View view) {
        boolean checked = ((RadioButton) view).isChecked();

        switch (view.getId()) {

            case R.id.q1_o2:
                if (checked) {
                    score += 1;
                    break;
                }
            case R.id.q2_o3:
                if (checked) {
                    score += 1;
                    break;
                }
            case R.id.q3_o2:
                if (checked) {
                    score += 1;
                    break;
                }

            case R.id.q4_o2:
                if (checked) {
                    score += 1;
                    break;
                }


            case R.id.q5_o1:
                if (checked) {
                    score += 1;
                    break;
                }


            case R.id.q6_o1:
                if (checked) {
                    score += 1;
                    break;
                }


            case R.id.q7_o3:
                if (checked) {
                    score += 1;
                    break;
                }

            case R.id.q8_o4:
                if (checked) {
                    score += 1;
                    break;
                }
            case R.id.q10_o3:
                if (checked) {
                    score += 1;
                    break;
                }
        }
    }
    private void textCompare(View view) {
        EditText answer = (EditText) findViewById(R.id.et_2);
        if (answer.getText().toString().equals("True") || answer.getText().toString().equals("true")) {
            score += 1;
        }
    }
        public void PlayAgain(View v)
        {
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
        }

}