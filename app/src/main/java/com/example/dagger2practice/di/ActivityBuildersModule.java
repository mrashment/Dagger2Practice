package com.example.dagger2practice.di;

import com.example.dagger2practice.AuthActivity;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class ActivityBuildersModule {

    @ContributesAndroidInjector
    abstract AuthActivity contributesAuthActivity();

}
