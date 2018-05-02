package com.example.usuario.inteco01;

import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;


public class MyViewPagerAdapter extends FragmentPagerAdapter {

        private String[] tab;



    public MyViewPagerAdapter(FragmentManager fm) {
        super(fm);
        tab = new String[]{
                "Dia","Mes"
        };
    }

    @Override
    public Fragment getItem(int position) {
        return BusquedaFragment.newInstace(tab[position]);
    }

    @Override
    public int getCount() {
        return 2;
    }

}
