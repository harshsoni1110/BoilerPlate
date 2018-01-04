package com.hari.hsoni.boilerplate.project.about;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.hari.hsoni.boilerplate.project.base.BaseFragment;

/**
 * Created by HSoni on 1/4/2018.
 */

public class AboutFragment extends BaseFragment implements IAboutView{
    public static final String TAG = AboutFragment.class.getSimpleName();
    AboutPresenter<IAboutView> mPresenter;

    public static AboutFragment getInstance (){
        return new AboutFragment();
    }
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mPresenter = new AboutPresenter<IAboutView>();
    }

    @Nullable


    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        mPresenter.onAttach(AboutFragment.this);
        loadAbout();
        return super.onCreateView(inflater, container, savedInstanceState);

    }

    @Override
    public void onDestroyView() {
        mPresenter.onDetach();
        super.onDestroyView();
    }

    @Override
    public void loadAbout() {
        mPresenter.processForAbout();
        Log.d(TAG,"About loaded from View.");
    }
}
