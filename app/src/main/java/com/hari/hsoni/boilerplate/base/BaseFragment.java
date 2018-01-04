package com.hari.hsoni.boilerplate.base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;

/**
 * Created by HSoni on 12/4/2017.
 */

public abstract class BaseFragment extends Fragment {

    protected BaseActivityPOC host;
        @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (! (getActivity() instanceof BaseActivityPOC)) {
            throw new ClassCastException("Activity must extend BaseActivity!");
        }
        else {
          host =  (BaseActivityPOC) getActivity();
        }
        host.setActiveFragment(this);
    }

    /**
     * Handle special go back for particular view hierarchy. e.g., collapsing expanded list on back press
     * @return
     */
    public boolean onBackPressed (){ return false; }

}
