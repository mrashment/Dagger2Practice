package com.example.dagger2practice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import javax.inject.Inject;

public class AuthActivity extends AppCompatActivity {
    private static final String TAG = "AuthActivity";

//    @Inject
//    boolean mBoolean;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_auth);

//        Log.d(TAG, "onCreate: Application == null? " + mBoolean);
    }
}
