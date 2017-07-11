package com.example.suno.boostcamp1;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import com.example.suno.boostcamp1.fragment.NewsfeedFragment;
import com.example.suno.boostcamp1.fragment.DefaultFragment;

/**
 * Created by suno on 2017. 7. 4..
 */

public class PagerAdapter extends FragmentStatePagerAdapter {
    private int tabCount;

    public PagerAdapter(FragmentManager fm, int tabCount) {
        super(fm);
        this.tabCount = tabCount;
    }

    @Override
    public Fragment getItem(int position) {
        switch(position){
            case 0:
                return new NewsfeedFragment();
            //TODO PagerAdapter에서 default가 null을 전달 할 경우, NullPointException으로 인한 잠재적 이슈
            default:
                return new DefaultFragment();
        }
    }

    @Override
    public int getCount() {
        return tabCount;
    }
}
