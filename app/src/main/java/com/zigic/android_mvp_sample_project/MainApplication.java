package com.zigic.android_mvp_sample_project;

import android.app.Application;

import com.zigic.android_mvp_sample_project.di.component.ApplicationComponent;
import com.zigic.android_mvp_sample_project.di.component.DaggerApplicationComponent;
import com.zigic.android_mvp_sample_project.di.module.ApplicationModule;

/**
 * Created by zigic on 07/09/17.
 */

public class MainApplication extends Application{
    protected ApplicationComponent mApplicationComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        mApplicationComponent = DaggerApplicationComponent.builder().applicationModule(new ApplicationModule(this)).build();
        mApplicationComponent.inject(this);
    }

    public ApplicationComponent getComponent(){
        return mApplicationComponent;
    }
}
