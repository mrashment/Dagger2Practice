package com.example.dagger2practice.di;

import androidx.lifecycle.ViewModelProvider;

import com.example.dagger2practice.viewmodels.ViewModelProviderFactory;

import dagger.Binds;
import dagger.Module;

@Module
public abstract class ViewModelFactoryModule {

    @Binds
    public abstract ViewModelProvider.Factory bindViewModelFactory(ViewModelProviderFactory modelProviderFactory);


}
