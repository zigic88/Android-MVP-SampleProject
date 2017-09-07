package com.zigic.android_mvp_sample_project.ui.main;

import com.zigic.android_mvp_sample_project.ui.base.BasePresenter;

import javax.inject.Inject;

/**
 * Created by zigic on 08/09/17.
 */

public class MainPresenter<V extends MainMvpView> extends BasePresenter<V> implements MainMvpPresenter<V> {

    @Inject
    public MainPresenter() {
    }

    @Override
    public void getData() {
        getMvpView().showData("Hello World");
    }

}
