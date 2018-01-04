package com.hari.hsoni.boilerplate.project.base;

/**
 * Created by HSoni on 1/4/2018.
 */

public interface IBaseMvpPresenter <V extends IBaseMvpView>{
    void onAttach (V mvpView);
    void onDetach ();
}
