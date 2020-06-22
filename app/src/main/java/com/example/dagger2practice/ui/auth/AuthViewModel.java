package com.example.dagger2practice.ui.auth;

import android.util.Log;

import androidx.lifecycle.ViewModel;

import com.example.dagger2practice.network.auth.AuthApi;

import java.util.List;

import javax.inject.Inject;

public class AuthViewModel extends ViewModel {

    private static final String TAG = "AuthViewModel";

    private final AuthApi authApi;

    @Inject
    public AuthViewModel() {
        Log.d(TAG, "AuthViewModel: ViewModel created");
    }

}
