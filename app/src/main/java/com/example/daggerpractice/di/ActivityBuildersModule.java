package com.example.daggerpractice.di;

import com.example.daggerpractice.di.auth.AuthModule;
import com.example.daggerpractice.di.auth.AuthViewModelsModule;
import com.example.daggerpractice.di.main.MainFragmentBuildersModule;
import com.example.daggerpractice.di.main.MainViewModelsModule;
import com.example.daggerpractice.ui.auth.AuthActivity;
import com.example.daggerpractice.ui.auth.AuthViewModel;
import com.example.daggerpractice.ui.main.MainActivity;

import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import dagger.android.ContributesAndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;

@Module
public abstract class  ActivityBuildersModule {

    @ContributesAndroidInjector(
            modules = {
                    AuthViewModelsModule.class,
                    AuthModule.class
            }
    )
    abstract AuthActivity contributeAuthActivity();

    @ContributesAndroidInjector(
            modules = {
                    MainFragmentBuildersModule.class,
                    MainViewModelsModule.class
            }
    )
    abstract MainActivity contributeMainActivity();

    /*@Provides
    static String someString(){
        return "this is a test string";
    }*/

    /*@Binds
    @IntoMap
    @ClassKey(AuthActivity.class)
    abstract AndroidInjector.Factory<?> bindAndroidInjectorFactory(
            AuthActivitySubcomponent.Factory builder);

    @Subcomponent(modules = AuthViewModelsModule.class)
    public interface AuthActivitySubcomponent extends AndroidInjector<AuthActivity> {
        @Subcomponent.Factory
        interface Factory extends AndroidInjector.Factory<AuthActivity> {}
    }*/

}
