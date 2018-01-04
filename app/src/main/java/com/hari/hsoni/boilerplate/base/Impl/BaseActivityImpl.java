package com.hari.hsoni.boilerplate.base.Impl;

import android.os.Bundle;
import android.support.annotation.Nullable;

import com.hari.hsoni.boilerplate.R;
import com.hari.hsoni.boilerplate.base.BaseActivityPOC;
import com.hari.hsoni.boilerplate.base.FragmentStackInterface;


/**
 * Created by HSoni on 12/4/2017.
 */

public class BaseActivityImpl extends BaseActivityPOC implements FragmentStackInterface {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_poc);
        int container = R.id.lytHost;
        BaseFragmentImp baseFragmentImp = BaseFragmentImp.getInstance();
        addFragment(container, baseFragmentImp);
    }
}
