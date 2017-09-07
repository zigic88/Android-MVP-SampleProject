package com.zigic.android_mvp_sample_project.di.component;

import com.zigic.android_mvp_sample_project.di.annotation.PerActivity;
import com.zigic.android_mvp_sample_project.di.module.ActivityModule;
import com.zigic.android_mvp_sample_project.ui.main.MainActivity;

import dagger.Component;

/**
 * Created by zigic on 08/09/17.
 */

@PerActivity
@Component(dependencies = ApplicationComponent.class, modules = ActivityModule.class)
public interface ActivityComponent {

    void inject(MainActivity mainActivity);
}
