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
                NewsfeedFragment newsfeedFragment = new NewsfeedFragment();
                return newsfeedFragment;
            case 1:
                FriendsFragment friendsFragment = new FriendsFragment();
                return friendsFragment;
            case 2:
                NewIssueFragment newIssueFragment = new NewIssueFragment();
                return newIssueFragment;
            case 3:
                EtcListFragment etcListFragment = new EtcListFragment();
                return etcListFragment;

            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return tabCount;
    }
}
