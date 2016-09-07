package com.toney.burnedcaloriescalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;

import org.w3c.dom.Text;

public class BurnedCaloriesCalculatorActivity extends AppCompatActivity
        implements OnEditorActionListener{

    private EditText weightEditText;
    private TextView milesTextView;
    private EditText caloriesEditText;
    private TextView bmiTextView;
    private EditText nameEditText;
    private SeekBar seekBar;
    private Spinner feetSpinner;
    private Spinner inchesSpinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_burned_calories_calculator);

        //get references to the widgets
        weightEditText = (EditText) findViewById(R.id.weightEditText);
        milesTextView = (TextView) findViewById(R.id.milesTextView);
        caloriesEditText = (EditText) findViewById(R.id.caloriesEditText);
        bmiTextView = (TextView) findViewById(R.id.bmiTextView);
        nameEditText = (EditText) findViewById(R.id.nameEditText);
        seekBar = (SeekBar) findViewById(R.id.seekBar);
        feetSpinner = (Spinner) findViewById(R.id.feetSpinner);
        inchesSpinner = (Spinner) findViewById(R.id.inchesSpinner);

        //set the listener
        caloriesEditText.setOnEditorActionListener(this);
    }

    @Override
    public boolean onEditorAction(TextView textView, int actionId, KeyEvent keyEvent) {
        if(actionId == EditorInfo.IME_ACTION_DONE ||
                actionId == EditorInfo.IME_ACTION_UNSPECIFIED) {
            calculateAndDisplay();
        }
        return false;
    }

    private void calculateAndDisplay () {
        //
    }

    /*private void calculateAndDisplay() {
        caloriesEditText = 0.75 * weightEditText * milesTextView;
        bmiTextView = (weightEditText * 703) / ((12 * feetSpinner + inchesSpinner) * (12 * feet + inches));

        caloriesBurned = 0.75 * weight * milesRan;
        bmi = (weight * 703) / ((12 * feet + inches) * (12 * feet + inches));

    }*/
}
