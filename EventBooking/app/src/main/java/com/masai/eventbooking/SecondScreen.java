package com.masai.eventbooking;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import static com.masai.eventbooking.FirstScreen.PREF_STRING_KEY_1;
import static com.masai.eventbooking.FirstScreen.PREF_STRING_KEY_2;
import static com.masai.eventbooking.FirstScreen.PREF_STRING_KEY_3;
import static com.masai.eventbooking.FirstScreen.PREF_STRING_KEY_4;

public class SecondScreen extends AppCompatActivity {

    public static final String PREF_STRING_KEY_5 = "PREF_STRING_KEY_5";
    public static final String PREF_STRING_KEY_6 = "PREF_STRING_KEY_6";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        TextView mTvFirstName, mTvLastName, mTvEmail, mTvPhoneNumber;
        mTvFirstName = findViewById(R.id.tvFirstName);
        mTvLastName = findViewById(R.id.tvLastName);
        mTvEmail = findViewById(R.id.tvEmail);
        mTvPhoneNumber = findViewById(R.id.tvPhoneNumber);

        String fn = PreferenceHelper.getStringFromPreference(SecondScreen.this, PREF_STRING_KEY_1);
        mTvFirstName.setText(fn);
        String ln = PreferenceHelper.getStringFromPreference(SecondScreen.this, PREF_STRING_KEY_2);
        mTvLastName.setText(ln);
        String em = PreferenceHelper.getStringFromPreference(SecondScreen.this, PREF_STRING_KEY_3);
        mTvEmail.setText(em);
        String pn = PreferenceHelper.getStringFromPreference(SecondScreen.this, PREF_STRING_KEY_4);
        mTvPhoneNumber.setText(pn);

        EditText mEtNoOfSeats, mEtDateOfShow;
        Button mBtnTwo;
        mEtNoOfSeats = findViewById(R.id.etNoOfSeats);
        mEtDateOfShow = findViewById(R.id.etDateOfShow);
        mBtnTwo = findViewById(R.id.btnTwo);

        mBtnTwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PreferenceHelper.writeIntToPreference(SecondScreen.this, PREF_STRING_KEY_5, Integer.parseInt(mEtNoOfSeats.getText().toString()));
                PreferenceHelper.writeStringToPreference(SecondScreen.this, PREF_STRING_KEY_6, mEtDateOfShow.getText().toString());

                Intent intent = new Intent(SecondScreen.this, ThirdScreen.class);
                startActivity(intent);
            }
        });

    }
}