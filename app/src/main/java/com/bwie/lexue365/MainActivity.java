package com.bwie.lexue365;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;
import java.util.List;

import adapter.ViewPagerAdapter;

public class MainActivity extends AppCompatActivity {

    private ViewPager viewPager;
    private List<View> list;
    private Button jump;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        viewPager = (ViewPager) findViewById(R.id.vp);
        list = new ArrayList<View>();
        LayoutInflater inflater = getLayoutInflater().from(MainActivity.this);
        View view1 = inflater.inflate(R.layout.welcom1 ,null);
        View view2 = inflater.inflate(R.layout.welcom2,null);
        View view3 = inflater.inflate(R.layout.welcom3 ,null);
        list.add(view1);
        list.add(view2);
        list.add(view3);
        viewPager.setAdapter(new ViewPagerAdapter(list));
        jump = (Button)view3.findViewById(R.id.jump);

        jump.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this ,ShouYeActivity.class);
                startActivity(intent);
            }
        });
    }
}
