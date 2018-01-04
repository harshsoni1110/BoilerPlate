package com.hari.hsoni.boilerplate.base.Impl;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.hari.hsoni.boilerplate.R;
import com.hari.hsoni.boilerplate.base.BaseFragment;


/**
 * Created by HSoni on 12/4/2017.
 */

public class BaseFragmentImp1 extends BaseFragment {

    public static BaseFragmentImp1 getInstance (){
        return new BaseFragmentImp1();
    }
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.frag_impl_1, container, false);
        int hostContainer = R.id.lytHostFrag;
        Button btnFrag = (Button)rootView.findViewById(R.id.btnFragment1);
        btnFrag.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                parent.nextPage();
            }
        });

        return rootView;
    }
}
