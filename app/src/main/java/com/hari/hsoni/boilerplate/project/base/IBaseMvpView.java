package com.hari.hsoni.boilerplate.project.base;

import android.support.annotation.StringRes;

/**
 * Created by HSoni on 1/4/2018.
 */

public interface IBaseMvpView {
    void onError (@StringRes int resId);
    void onError (String errorMsg);
}
