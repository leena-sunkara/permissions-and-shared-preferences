package com.masai.eventbooking;

import android.app.AlertDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import static com.masai.eventbooking.FirstScreen.PREF_STRING_KEY_1;
import static com.masai.eventbooking.FirstScreen.PREF_STRING_KEY_2;
import static com.masai.eventbooking.FirstScreen.PREF_STRING_KEY_3;
import static com.masai.eventbooking.FirstScreen.PREF_STRING_KEY_4;
import static com.masai.eventbooking.SecondScreen.PREF_STRING_KEY_5;
import static com.masai.eventbooking.SecondScreen.PREF_STRING_KEY_6;

public class ThirdScreen extends AppCompatActivity implements View.OnClickListener {

    String first_name, last_name, email, phone_number, date_of_show;
    int no_of_seats;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        TextView mTvFirstNameTwo, mTvLastNameTwo, mTvEmailTwo, mTvPhoneNumberTwo, mTvNoOfSeats, mTvDateOfShow;
        mTvFirstNameTwo = findViewById(R.id.tvFirstNameTwo);
        mTvLastNameTwo = findViewById(R.id.tvLastNameTwo);
        mTvEmailTwo = findViewById(R.id.tvEmailTwo);
        mTvPhoneNumberTwo = findViewById(R.id.tvPhoneNumberTwo);
        mTvNoOfSeats = findViewById(R.id.tvNoOfSeats);
        mTvDateOfShow = findViewById(R.id.tvDateOfShow);

        first_name = PreferenceHelper.getStringFromPreference(ThirdScreen.this, PREF_STRING_KEY_1);
        mTvFirstNameTwo.setText(first_name);
        last_name = PreferenceHelper.getStringFromPreference(ThirdScreen.this, PREF_STRING_KEY_2);
        mTvLastNameTwo.setText(last_name);
        email = PreferenceHelper.getStringFromPreference(ThirdScreen.this, PREF_STRING_KEY_3);
        mTvEmailTwo.setText(email);
        phone_number = PreferenceHelper.getStringFromPreference(ThirdScreen.this, PREF_STRING_KEY_4);
        mTvPhoneNumberTwo.setText(phone_number);
        no_of_seats = PreferenceHelper.getIntFromPreference(ThirdScreen.this, PREF_STRING_KEY_5);
        mTvNoOfSeats.setText(no_of_seats + "");
        date_of_show = PreferenceHelper.getStringFromPreference(ThirdScreen.this, PREF_STRING_KEY_6);
        mTvDateOfShow.setText(date_of_show);

        Button mBtnConfirm;
        mBtnConfirm = findViewById(R.id.btnConfirm);
        mBtnConfirm.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        AlertDialog.Builder alert = new AlertDialog.Builder(this);
        alert.setTitle("Booking Information");
        alert.setMessage("Event booking successful! Date of show is " + date_of_show);
        alert.show();
    }
}