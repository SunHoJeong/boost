package com.example.suno.boostcamp1;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import com.example.suno.boostcamp1.fragment.NewsfeedFragment;
import com.example.suno.boostcamp1.fragment.FriendsFragment;
import com.example.suno.boostcamp1.fragment.NewIssueFragment;
import com.example.suno.boostcamp1.fragment.EtcListFragment;

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
            case 1:
                return new FriendsFragment();
            case 2:
                return new NewIssueFragment();
            case 3:
                return new EtcListFragment();

            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return tabCount;
    }
}
