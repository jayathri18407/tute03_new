package com.example.androidfragments01;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
public class MainActivity extends AppCompatActivity {


        Button firstFragment, secondFragment;
        Fragment fragment;
        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
// get the reference of Button's
            firstFragment = (Button) findViewById(R.id.firstFragment);
            secondFragment = (Button) findViewById(R.id.secondFragment);

// perform setOnClickListener event on First Button
            firstFragment.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
// load First Fragment
                    loadFragment(new Fragment1());
                }
            });
// perform setOnClickListener event on Second Button
            secondFragment.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
// load Second Fragment
                    loadFragment(new Fragment2());
                }
            });

        }

        private void loadFragment(Fragment fragment) {
// create a FragmentManager
        FragmentManager fm = getFragmentManager();
// create a FragmentTransaction to begin the transaction and replace the Fragment
        FragmentTransaction fragmentTransaction = fm.beginTransaction();
// replace the FrameLayout with new Fragment
            fragmentTransaction.commit(); // save the changes
    }

    public void changeFragment(View view){     Fragment fragment;

        if (view == findViewById(R.id. firstFragment )){
            fragment = new Fragment1();
            androidx.fragment.app.FragmentManager fm = getSupportFragmentManager();
            androidx.fragment.app.FragmentTransaction ft = fm.beginTransaction();
            ft.replace(R.id. frgmntDefault ,fragment);
            ft.commit();     }

        if (view == findViewById(R.id.secondFragment )){
            fragment = new Fragment2();
            androidx.fragment.app.FragmentManager fm;
            fm = getSupportFragmentManager();
            androidx.fragment.app.FragmentTransaction ft = fm.beginTransaction();
            ft.replace(R.id. frgmntDefault ,fragment);
            ft.commit();
        }

    }
 }

