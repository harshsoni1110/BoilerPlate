package com.hari.hsoni.boilerplate.base.Impl;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.hari.hsoni.boilerplate.R;
import com.hari.hsoni.boilerplate.base.BaseFragment;

/**
 * Created by HSoni on 12/4/2017.
 */

public class BaseFragmentImp2 extends BaseFragment {

    public static BaseFragmentImp2 getInstance (){
        return new BaseFragmentImp2();
    }
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.frag_impl_2, container, false);
//        int hostContainer = R.id.lytHostFrag;

        return rootView;
    }
}
