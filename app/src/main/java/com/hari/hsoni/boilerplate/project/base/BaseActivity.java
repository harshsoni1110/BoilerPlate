package com.hari.hsoni.boilerplate.project.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.annotation.StringRes;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;

/**
 * Created by HSoni on 12/4/2017.
 */

public class BaseActivity extends FragmentActivity implements FragmentStackInterface, IBaseMvpView {
    FragmentManager fragmentManager;
    FragmentTransaction fragmentTransaction;
    protected BaseFragment mActiveFragment;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        fragmentManager = getSupportFragmentManager();
    }

    @Override
    public void addFragment(int container, BaseFragment fragment) {
        fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(container, fragment);
        fragmentTransaction.commit();
    }

    @Override
    public void replaceFragment(int container, BaseFragment fragment) {
        fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(container, fragment);
        fragmentTransaction.commit();
    }

    @Override
    public void addFragmentToStack (int container, BaseFragment fragment){
        fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(container, fragment);
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();
    }

    @Override
    public void replaceFragmentToStack(int container, BaseFragment fragment) {
        fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(container, fragment);
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();
    }

    @Override
    public void justGoBack() {
        fragmentManager.popBackStack();
    }

    @Override
    public void justGoBackNow() {
        fragmentManager.popBackStackImmediate();
    }

    @Override
    public void onBackPressed() {
        if (mActiveFragment != null && !mActiveFragment.onBackPressed())
            if (canGoBack()) {
                justGoBack();
                return;
            }
        super.onBackPressed();
    }

    @Override
    public void setActiveFragment(BaseFragment mActiveFragment) {
        this.mActiveFragment = mActiveFragment;
    }

    public boolean canGoBack (){
        return fragmentManager.getBackStackEntryCount() > 0;
    }

    @Override
    public void onError(@StringRes int resId) {

    }

    @Override
    public void onError(String errorMsg) {

    }
}
