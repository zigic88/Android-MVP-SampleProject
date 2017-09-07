package com.zigic.android_mvp_sample_project.ui.main;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import com.zigic.android_mvp_sample_project.R;
import com.zigic.android_mvp_sample_project.ui.base.BaseActivity;

import javax.inject.Inject;

public class MainActivity extends BaseActivity implements MainMvpView {

    @Inject
    MainPresenter<MainMvpView> mMainPresenter;

    TextView tvPrint;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getActivityComponent().inject(this);

        tvPrint = (TextView) findViewById(R.id.tv_print);

        mMainPresenter.attachView(this);
        if(mMainPresenter==null){
            Log.d("LOG YA", null);
        }else{
            Log.d("LOG YA", "Not null");
            mMainPresenter.getData();
        }
    }

    @Override
    public void showData(String data) {
        tvPrint.setText(data);
    }

    @Override
    public void showError(String error) {
        tvPrint.setText(error);
    }

    @Override
    protected void onDestroy() {
        mMainPresenter.detachView();
    }


}
