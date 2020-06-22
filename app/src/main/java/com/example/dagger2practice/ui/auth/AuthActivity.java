package com.example.dagger2practice.ui.auth;



import android.os.Bundle;
import android.widget.Toast;


import androidx.lifecycle.ViewModelProvider;

import com.example.dagger2practice.R;
import com.example.dagger2practice.viewmodels.ViewModelProviderFactory;


import javax.inject.Inject;

import dagger.android.support.DaggerAppCompatActivity;

public class AuthActivity extends DaggerAppCompatActivity {
    private static final String TAG = "AuthActivity";

    private AuthViewModel viewModel;

    @Inject
    ViewModelProviderFactory providerFactory;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_auth);

        viewModel = new ViewModelProvider(this, providerFactory).get(AuthViewModel.class);
    }
}
