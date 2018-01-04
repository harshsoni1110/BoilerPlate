package com.hari.hsoni.boilerplate.project.Impl;

import com.hari.hsoni.boilerplate.project.base.IBaseMvpPresenter;
import com.hari.hsoni.boilerplate.project.base.IBaseMvpView;

/**
 * Created by HSoni on 1/8/2018.
 */

public interface IMainPresenter <V extends IBaseMvpView> extends IBaseMvpPresenter<V> {
    void aboutProcess ();
}
