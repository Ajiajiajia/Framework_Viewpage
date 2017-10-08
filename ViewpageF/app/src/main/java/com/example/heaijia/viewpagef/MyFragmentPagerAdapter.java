package com.example.heaijia.viewpagef;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by heaijia on 2017/10/8.
 */


//上面已经创建好了每个子页面对应的fragment，接下来要做的便是将这些fragment装载到ViewPager中去
//        android.support.v4.app包为我们提供了一个特别的迭代器——FragmentPagerAdapter
//        我们重写它的getItem()和getCount()方法，分别返回第几个fragment以及fragment的数量
//        可以这么理解：此步相当于让ViewPager能够控制管理我们的fragment




public class MyFragmentPagerAdapter extends FragmentPagerAdapter {
    //存储所有的fragment
    private List<Fragment> list;

    public MyFragmentPagerAdapter(FragmentManager fm, ArrayList<Fragment> list){
        super(fm);
        this.list = list;
    }

//    返回第几个fragment
    @Override
    public Fragment getItem(int arg0) {
        // TODO Auto-generated method stub
        return list.get(arg0);
    }


//    返回fragment的数量
    @Override
    public int getCount() {
        // TODO Auto-generated method stub
        return list.size();
    }

}