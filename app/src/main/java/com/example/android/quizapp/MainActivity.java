package com.example.android.quizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;
import static android.widget.Toast.LENGTH_LONG;

public class MainActivity extends AppCompatActivity {

    private RadioButton yesRadioButton;
    private RadioGroup firstRadioGroup;

    private RadioButton secondYesRadioButton;
    private RadioGroup secondRadioGroup;;

    private RadioButton thirdYesRadioButton;
    private RadioGroup thirdRadioGroup;

    private RadioButton fourthYesRadioButton;
    private RadioGroup fourthRadioGroup;

    private  RadioButton fifthYesRadioButton;
    private RadioGroup fifthRadioGroup;

    private RadioButton sixthYesRadioButton;
    private RadioGroup sixthRadioGroup;

    private  EditText answerField;

    private CheckBox checkBoxVienna;
    private CheckBox checkBoxBrussels;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        yesRadioButton = findViewById(R.id.yes_radio_button);
        firstRadioGroup = findViewById(R.id.first_radio_group);

        secondYesRadioButton = findViewById(R.id.second_yes_radio_button);
        secondRadioGroup = findViewById(R.id.second_radio_group);

        thirdYesRadioButton = findViewById(R.id.third_yes_radio_button);
        thirdRadioGroup = findViewById(R.id.third_radio_group);

        fourthYesRadioButton = findViewById(R.id.fourth_yes_radio_button);
        fourthRadioGroup = findViewById(R.id.fourth_radio_group);

        fifthYesRadioButton = findViewById(R.id.fifth_yes_radio_button);
        fifthRadioGroup = findViewById(R.id.fifth_radio_group);

        sixthYesRadioButton = findViewById(R.id.sixth_yes_radio_button);
        sixthRadioGroup = findViewById(R.id.sixth_radio_group);

        answerField = findViewById(R.id.answer_field);

        checkBoxVienna = findViewById(R.id.checkbox_vienna);
        checkBoxBrussels = findViewById(R.id.checkbox_brussels);
    }

    private int totalScore = 0;

    public void submitScore(View view) {

        //Is the button  now checked?
        if (yesRadioButton.isChecked()) {
            totalScore = totalScore + 1;
        }

        //Is the button  now checked?
        if (secondYesRadioButton.isChecked()) {
            totalScore = totalScore + 1;
        }

        //Is the button  now checked?
        if (thirdYesRadioButton.isChecked()) {
            totalScore = totalScore + 1;
        }

        //Is the button  now checked?
        if (fourthYesRadioButton.isChecked()) {
            totalScore = totalScore + 1;
        }

        //Is the button  now checked?
        if (fifthYesRadioButton.isChecked()) {
            totalScore = totalScore + 1;
        }

        //Is the button now checked?
        if (sixthYesRadioButton.isChecked()) {
            totalScore = totalScore + 1;
        }

        String name = answerField.getText().toString();
        //Correct answer is Canberra
        if(name.equals("Canberra")) {
            totalScore = totalScore + 1;
        }

        boolean checkBoxViennaIsChecked = checkBoxVienna.isChecked();
        if(checkBoxViennaIsChecked) {
            totalScore = totalScore + 1;
        }

        //Show a congratulations message
        String message = String.format("Congratulations, you have %d correct answsers", totalScore);
        Toast.makeText(this, message, LENGTH_LONG).show();
    }

    public void resetScore(View view) {
        totalScore = 0;

        firstRadioGroup.clearCheck();

        secondRadioGroup.clearCheck();

        thirdRadioGroup.clearCheck();;

        fourthRadioGroup.clearCheck();

        fifthRadioGroup.clearCheck();

        sixthRadioGroup.clearCheck();

        answerField.setText("");

        checkBoxVienna.setChecked(false);
        checkBoxBrussels.setChecked(false);
    }
}

















