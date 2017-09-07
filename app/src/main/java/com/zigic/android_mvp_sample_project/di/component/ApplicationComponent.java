package com.zigic.android_mvp_sample_project.di.component;

import android.app.Application;
import android.content.Context;

import com.zigic.android_mvp_sample_project.MainApplication;
import com.zigic.android_mvp_sample_project.di.annotation.ApplicationContext;
import com.zigic.android_mvp_sample_project.di.module.ApplicationModule;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by zigic on 08/09/17.
 */

@Singleton
@Component(modules = ApplicationModule.class)
public interface ApplicationComponent {

    void inject (MainApplication mainApplication);

    @ApplicationContext
    Context getContext();

    Application getApplication();

}
