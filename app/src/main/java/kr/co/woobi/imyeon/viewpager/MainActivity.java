package kr.co.woobi.imyeon.viewpager;

import android.graphics.Color;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TabLayout tabLayout = findViewById(R.id.tab);
        ViewPager viewPager = findViewById(R.id.pager);
        MyAdapter myAdapter = new MyAdapter(getSupportFragmentManager());
        viewPager.setAdapter(myAdapter);
    }

    public static class MyAdapter extends FragmentPagerAdapter {

        public MyAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int i) {
            switch (i){
                case 0:
                    return MyFragment.newInstance(Color.RED);
                case 1:
                    return MyFragment.newInstance(Color.BLUE);
                case 2:
                    return MyFragment.newInstance(Color.YELLOW);
                case 3:
                    return MyFragment.newInstance(Color.CYAN);
                case 4:
                    return MyFragment.newInstance(Color.MAGENTA);
            }
            return null;
        }

        @Override
        public int getCount() {
            return 5;
        }
    }
}