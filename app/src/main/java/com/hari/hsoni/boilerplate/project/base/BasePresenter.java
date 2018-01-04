package com.hari.hsoni.boilerplate.project.base;

/**
 * Created by HSoni on 1/4/2018.
 */

public class BasePresenter <V extends IBaseMvpView> implements IBaseMvpPresenter <V>{
    V mvpView;
    @Override
    public void onAttach(V mvpView) {
        this.mvpView = mvpView;
    }

    @Override
    public void onDetach() {
        this.mvpView = null;
    }

    public V getMvpView (){
        return mvpView;
    }
}
