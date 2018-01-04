package com.hari.hsoni.boilerplate.project.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.annotation.StringRes;
import android.support.v4.app.Fragment;

/**
 * Created by HSoni on 12/4/2017.
 */

public abstract class BaseFragment extends Fragment implements IBaseMvpView{

    protected BaseActivity host;
        @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (! (getActivity() instanceof BaseActivity)) {
            throw new ClassCastException("Activity must extend BaseActivity!");
        }
        else {
          host =  (BaseActivity) getActivity();
        }
        host.setActiveFragment(this);
    }

    /**
     * Handle special go back for particular view hierarchy. e.g., collapsing expanded list on back press
     * @return
     */
    public boolean onBackPressed (){ return false; }

    @Override
    public void onError(@StringRes int resId) {
        host.onError(resId);
    }

    @Override
    public void onError(String errorMsg) {
        if (errorMsg != null)
            host.onError(errorMsg);
    }
}
