package com.example.heaijia.viewpagef; /**
 * Created by heaijia on 2017/10/8.
 */


import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.heaijia.viewpagef.R;


public class FifthFragment extends android.support.v4.app.Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        View v = inflater.inflate(R.layout.layout_fifth, container, false);
        return v;
    }
}



//    在onCreateView中使用inflate加载对应的布局文件