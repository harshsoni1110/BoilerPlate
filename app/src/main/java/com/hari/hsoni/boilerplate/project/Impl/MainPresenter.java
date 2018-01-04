package com.hari.hsoni.boilerplate.project.Impl;

import android.util.Log;

import com.hari.hsoni.boilerplate.project.base.BasePresenter;

/**
 * Created by HSoni on 1/8/2018.
 */

public class MainPresenter <V extends IMainView> extends BasePresenter<V> implements IMainPresenter<V> {

    private static final String TAG = MainPresenter.class.getSimpleName();
    @Override
    public void aboutProcess() {
        Log.d(TAG,"About loaded from MAIN presenter.");
    }
}

