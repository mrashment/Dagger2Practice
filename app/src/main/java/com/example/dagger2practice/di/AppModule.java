package com.example.dagger2practice.di;

import android.app.Application;

import dagger.Module;
import dagger.Provides;

@Module
public class AppModule {

    @Provides
    static String someString() {
        return "Test string";
    }

}
