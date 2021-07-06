package com.masai.eventbooking;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class FirstScreen extends AppCompatActivity {

    public static final String PREF_STRING_KEY_1 = "PREF_STRING_KEY_1";
    public static final String PREF_STRING_KEY_2 = "PREF_STRING_KEY_2";
    public static final String PREF_STRING_KEY_3 = "PREF_STRING_KEY_3";
    public static final String PREF_STRING_KEY_4 = "PREF_STRING_KEY_4";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        EditText mEtFirstName;
        EditText mEtLastName;
        EditText mEtEmail;
        EditText mEtPhoneNumber;
        Button mBtnOne;

        mEtFirstName = findViewById(R.id.etFirstName);
        mEtLastName = findViewById(R.id.etLastName);
        mEtEmail = findViewById(R.id.etEmail);
        mEtPhoneNumber = findViewById(R.id.etPhoneNumber);
        mBtnOne = findViewById(R.id.btnOne);

        mBtnOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                PreferenceHelper.writeStringToPreference(FirstScreen.this, PREF_STRING_KEY_1, mEtFirstName.getText().toString());
                PreferenceHelper.writeStringToPreference(FirstScreen.this, PREF_STRING_KEY_2, mEtLastName.getText().toString());
                PreferenceHelper.writeStringToPreference(FirstScreen.this, PREF_STRING_KEY_3, mEtEmail.getText().toString());
                PreferenceHelper.writeStringToPreference(FirstScreen.this, PREF_STRING_KEY_4, mEtPhoneNumber.getText().toString());

                Intent intent = new Intent(FirstScreen.this, SecondScreen.class);
                startActivity(intent);
            }
        });
    }
}