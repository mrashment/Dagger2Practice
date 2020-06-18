package com.example.dagger2practice;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.example.dagger2practice.di.AppComponent;

import java.util.List;

import javax.inject.Inject;

import dagger.android.support.DaggerAppCompatActivity;

public class AuthActivity extends DaggerAppCompatActivity {
    private static final String TAG = "AuthActivity";

    @Inject
    String someString;

    @Inject
    List<Integer> ints;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_auth);


        if (ints != null) Toast.makeText(getApplicationContext(),ints.toString(),Toast.LENGTH_LONG).show();
        else Toast.makeText(getApplicationContext(),"Nothing to toast",Toast.LENGTH_LONG).show();
    }
}
