package com.hari.hsoni.boilerplate.project.about;

import com.hari.hsoni.boilerplate.project.base.IBaseMvpPresenter;
import com.hari.hsoni.boilerplate.project.base.IBaseMvpView;

/**
 * Created by HSoni on 1/4/2018.
 */

public interface IAboutPresenter <V extends IBaseMvpView> extends IBaseMvpPresenter<V> {
    void processForAbout ();
}
