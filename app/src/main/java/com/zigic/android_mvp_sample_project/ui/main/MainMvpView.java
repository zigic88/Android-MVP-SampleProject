package com.zigic.android_mvp_sample_project.ui.main;

import com.zigic.android_mvp_sample_project.ui.base.MvpView;

/**
 * Created by zigic on 08/09/17.
 */

public interface MainMvpView extends MvpView {

    void showData(String data);

    void showError(String error);
}