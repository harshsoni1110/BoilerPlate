package com.hari.hsoni.boilerplate.project.about;

import android.util.Log;

import com.hari.hsoni.boilerplate.project.base.BasePresenter;

/**
 * Created by HSoni on 1/4/2018.
 */

public class AboutPresenter <V extends IAboutView> extends BasePresenter<V> implements IAboutPresenter<V>{
    public static final String TAG = AboutFragment.class.getSimpleName();
    @Override
    public void processForAbout() {
        Log.d(TAG,"About loaded from presenter.");
    }

}
