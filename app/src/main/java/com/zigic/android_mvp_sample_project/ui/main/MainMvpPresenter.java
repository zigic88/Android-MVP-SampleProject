package com.zigic.android_mvp_sample_project.ui.main;

import com.zigic.android_mvp_sample_project.ui.base.MvpPresenter;

/**
 * Created by zigic on 08/09/17.
 */

public interface MainMvpPresenter<V extends MainMvpView> extends MvpPresenter<V> {
    void getData();
}
