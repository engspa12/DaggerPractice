package com.example.daggerpractice.di.main;

import androidx.lifecycle.ViewModel;

import com.example.daggerpractice.di.ViewModelKey;
import com.example.daggerpractice.ui.main.profile.ProfileViewModel;

import javax.inject.Inject;

import dagger.Binds;
import dagger.Module;
import dagger.multibindings.IntoMap;

@Module
public abstract class MainViewModelsModule {

    @Binds
    @IntoMap
    @ViewModelKey(ProfileViewModel.class)
    public abstract ViewModel bindProfileViewModel(ProfileViewModel profileViewModel);
}
