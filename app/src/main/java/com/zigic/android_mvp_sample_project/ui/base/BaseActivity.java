package com.zigic.android_mvp_sample_project.ui.base;

import android.annotation.TargetApi;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.zigic.android_mvp_sample_project.MainApplication;
import com.zigic.android_mvp_sample_project.di.component.ActivityComponent;
import com.zigic.android_mvp_sample_project.di.component.DaggerActivityComponent;
import com.zigic.android_mvp_sample_project.di.module.ActivityModule;

/**
 * Created by zigic on 08/09/17.
 */

public abstract class BaseActivity extends AppCompatActivity implements  MvpView{
    private ActivityComponent mActivityComponent;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mActivityComponent = DaggerActivityComponent.builder()
                .activityModule(new ActivityModule(this))
                .applicationComponent(((MainApplication) getApplication()).getComponent())
                .build();
    }

    public ActivityComponent getActivityComponent(){
        return mActivityComponent;
    }

    @TargetApi(Build.VERSION_CODES.M)
    public void requestPermissionsSafely(String[] permissions, int requestcode){
        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.M){
            requestPermissions(permissions,requestcode);
        }
    }

    @TargetApi(Build.VERSION_CODES.M)
    public boolean hasPermission(String permission){
        return Build.VERSION.SDK_INT<Build.VERSION_CODES.M || checkSelfPermission(permission) == PackageManager.PERMISSION_GRANTED;
    }

    @Override
    public void showLoading() {

    }

    @Override
    public void hideLoading() {

    }
}
