package com.bwie.lexue365;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.hjm.bottomtabbar.BottomTabBar;

import butterknife.BindView;
import butterknife.ButterKnife;
import fragment.Fragment1;
import fragment.Fragment2;
import fragment.Fragment3;

public class ShouYeActivity extends AppCompatActivity {

    @BindView(R.id.bottom_tab_bar)
    BottomTabBar mb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shou_ye);
        getSupportActionBar().hide();
        ButterKnife.bind(this);
        mb.init(getSupportFragmentManager())
                .setImgSize(50,50)
                .setFontSize(0)
                .setTabPadding(4,6,10)
                .setChangeColor(Color.BLUE,Color.GRAY)
                .addTabItem(null,R.drawable.show, Fragment1.class)
                .addTabItem(null,R.drawable.topic, Fragment2.class)
                .addTabItem(null,R.drawable.mine, Fragment3.class)
                .isShowDivider(false)
                .setOnTabChangeListener(new BottomTabBar.OnTabChangeListener() {
                    @Override
                    public void onTabChange(int position, String name) {

                    }
                });


    }
}
