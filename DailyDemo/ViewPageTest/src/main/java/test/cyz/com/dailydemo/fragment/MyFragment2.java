package test.cyz.com.dailydemo.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import test.cyz.com.dailydemo.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class MyFragment2 extends Fragment {


    public MyFragment2() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_my_fragment2, container, false);
    }

}
