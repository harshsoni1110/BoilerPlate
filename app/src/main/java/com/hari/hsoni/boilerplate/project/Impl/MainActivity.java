package com.hari.hsoni.boilerplate.project.Impl;

import android.os.Bundle;
import android.support.annotation.Nullable;

import com.hari.hsoni.boilerplate.R;
import com.hari.hsoni.boilerplate.project.base.BaseActivity;
import com.hari.hsoni.boilerplate.project.about.AboutFragment;


/**
 * Created by HSoni on 12/4/2017.
 */

public class MainActivity extends BaseActivity implements IMainView {

    private int container;
    MainPresenter<IMainView> mPresenter;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_poc);
        mPresenter = new MainPresenter<IMainView>();
        container = R.id.lytHost;
        loadAbout();
    }

    @Override
    public void loadAbout() {
        AboutFragment aboutFragment = AboutFragment.getInstance();
        addFragment(container, aboutFragment);
        mPresenter.aboutProcess();
    }
}
