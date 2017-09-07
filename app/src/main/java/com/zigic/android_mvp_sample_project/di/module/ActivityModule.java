package com.zigic.android_mvp_sample_project.di.module;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;

import com.zigic.android_mvp_sample_project.di.annotation.ActivityContext;

import dagger.Module;
import dagger.Provides;

/**
 * Created by zigic on 08/09/17.
 */

@Module
public class ActivityModule {
    private AppCompatActivity mAppCompatActivity;

    public ActivityModule(AppCompatActivity appCompatActivity){
        this.mAppCompatActivity = appCompatActivity;
    }

    @Provides
    @ActivityContext
    Context provideContext(){
        return mAppCompatActivity;
    }

    @Provides
    AppCompatActivity provideAppCompactActivity(){
        return mAppCompatActivity;
    }
}
