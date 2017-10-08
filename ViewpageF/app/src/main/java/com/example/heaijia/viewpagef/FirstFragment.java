package com.example.heaijia.viewpagef;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.heaijia.viewpagef.R;

/**
 * Created by heaijia on 2017/10/8.
 */

public class FirstFragment extends android.support.v4.app.Fragment{

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        View v = inflater.inflate(R.layout.layout_first, container,false);
        return v;
    }

}
