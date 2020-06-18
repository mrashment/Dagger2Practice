package com.example.dagger2practice.di;

import android.app.Application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import dagger.Module;
import dagger.Provides;

@Module
public class AppModule {

    @Provides
    static String someString() {
        return "Test string";
    }

    @Provides
    static List<Integer> someInts() {return Arrays.asList(1,2,3,4,5);}

}
