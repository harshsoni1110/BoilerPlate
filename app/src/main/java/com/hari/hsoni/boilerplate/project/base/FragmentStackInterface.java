package com.hari.hsoni.boilerplate.project.base;

/**
 * Created by HSoni on 12/4/2017.
 */

public interface FragmentStackInterface {
    public void justGoBack();
    public void justGoBackNow();
    public void addFragment(int container, BaseFragment fragment);
    public void replaceFragment(int container, BaseFragment fragment);
    public void addFragmentToStack(int container, BaseFragment fragment);
    public void replaceFragmentToStack(int container, BaseFragment fragment);
    public void setActiveFragment(BaseFragment fragment);
}
