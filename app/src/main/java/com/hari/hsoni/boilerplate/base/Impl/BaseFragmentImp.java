package com.hari.hsoni.boilerplate.base.Impl;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.hari.hsoni.boilerplate.R;
import com.hari.hsoni.boilerplate.base.BaseFragment;

/**
 * Created by HSoni on 12/4/2017.
 */

public class BaseFragmentImp extends BaseFragment {

    public static BaseFragmentImp getInstance (){
        return new BaseFragmentImp();
    }
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_poc, container, false);
/*
        Button replace = (Button)rootView.findViewById(R.id.btnreplace);
        final int hostContainer = R.id.lytHostFrag;

        replace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                host.replaceFragmentToStack(hostContainer, BaseFragmentImp2.getInstance());
            viewPager.setCurrentItem(1);
            }
        });
*/
        return rootView;
    }

   @Override
    public void onAttachFragment(Fragment childFragment) {
        super.onAttachFragment(childFragment);
    }
}
