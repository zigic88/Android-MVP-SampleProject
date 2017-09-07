package com.zigic.android_mvp_sample_project.di.module;

import android.app.Application;
import android.content.Context;

import com.zigic.android_mvp_sample_project.di.annotation.ApplicationContext;

import dagger.Module;
import dagger.Provides;

/**
 * Created by zigic on 08/09/17.
 */

@Module
public class ApplicationModule {
    private final Application mApplication;

    public ApplicationModule(Application application){
        this.mApplication = application;
    }

    @Provides
    @ApplicationContext
    Context provideContext(){
        return mApplication;
    }

    @Provides
    Application provideApplication(){
        return mApplication;
    }

}
