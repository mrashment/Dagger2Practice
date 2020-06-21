package com.example.dagger2practice.ui.auth;

import android.util.Log;

import androidx.lifecycle.ViewModel;

import java.util.List;

import javax.inject.Inject;

public class AuthViewModel extends ViewModel {

    private static final String TAG = "AuthViewModel";

    @Inject
    List<Integer> ints;

    @Inject
    public AuthViewModel() {
        Log.d(TAG, "AuthViewModel: ViewModel created");
    }

    public List<Integer> getInts() {return ints;}
}
