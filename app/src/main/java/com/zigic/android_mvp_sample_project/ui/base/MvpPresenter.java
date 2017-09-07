package com.zigic.android_mvp_sample_project.ui.base;

/**
 * Created by zigic on 08/09/17.
 */

public interface MvpPresenter<V extends MvpView> {
    void attachView(V mvpView);

    void detachView();

}
