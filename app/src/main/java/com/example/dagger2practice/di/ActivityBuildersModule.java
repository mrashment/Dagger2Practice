package com.example.dagger2practice.di;

import com.example.dagger2practice.di.auth.AuthModule;
import com.example.dagger2practice.di.auth.AuthViewModelsModule;
import com.example.dagger2practice.ui.auth.AuthActivity;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class ActivityBuildersModule {

    @ContributesAndroidInjector(
            modules = {
                    AuthViewModelsModule.class,
                    AuthModule.class,
            }
    )
    abstract AuthActivity contributesAuthActivity();

}
