//
// DO NOT EDIT THIS FILE, IT HAS BEEN GENERATED USING AndroidAnnotations 3.2.
//


package com.appassit.activitys;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import com.appassit.R.id;
import com.appassit.R.layout;
import com.appassit.widget.ArcProgress;
import com.appassit.widget.PagerSlidingTabStrip;
import com.appassit.widget.RippleView;
import com.appassit.widget.battery.BatteryChangeView;
import org.androidannotations.api.SdkVersionHelper;
import org.androidannotations.api.builder.ActivityIntentBuilder;
import org.androidannotations.api.view.HasViews;
import org.androidannotations.api.view.OnViewChangedListener;
import org.androidannotations.api.view.OnViewChangedNotifier;

public final class MainAppActivity_
    extends MainAppActivity
    implements HasViews, OnViewChangedListener
{

    private final OnViewChangedNotifier onViewChangedNotifier_ = new OnViewChangedNotifier();

    @Override
    public void onCreate(Bundle savedInstanceState) {
        OnViewChangedNotifier previousNotifier = OnViewChangedNotifier.replaceNotifier(onViewChangedNotifier_);
        init_(savedInstanceState);
        super.onCreate(savedInstanceState);
        OnViewChangedNotifier.replaceNotifier(previousNotifier);
        setContentView(layout.activity_main_app);
    }

    private void init_(Bundle savedInstanceState) {
        OnViewChangedNotifier.registerOnViewChangedListener(this);
    }

    @Override
    public void setContentView(int layoutResID) {
        super.setContentView(layoutResID);
        onViewChangedNotifier_.notifyViewChanged(this);
    }

    @Override
    public void setContentView(View view, LayoutParams params) {
        super.setContentView(view, params);
        onViewChangedNotifier_.notifyViewChanged(this);
    }

    @Override
    public void setContentView(View view) {
        super.setContentView(view);
        onViewChangedNotifier_.notifyViewChanged(this);
    }

    public static MainAppActivity_.IntentBuilder_ intent(Context context) {
        return new MainAppActivity_.IntentBuilder_(context);
    }

    public static MainAppActivity_.IntentBuilder_ intent(android.app.Fragment fragment) {
        return new MainAppActivity_.IntentBuilder_(fragment);
    }

    public static MainAppActivity_.IntentBuilder_ intent(android.support.v4.app.Fragment supportFragment) {
        return new MainAppActivity_.IntentBuilder_(supportFragment);
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (((SdkVersionHelper.getSdkInt()< 5)&&(keyCode == KeyEvent.KEYCODE_BACK))&&(event.getRepeatCount() == 0)) {
            onBackPressed();
        }
        return super.onKeyDown(keyCode, event);
    }

    @Override
    public void onViewChanged(HasViews hasViews) {
        mDrawerLayout = ((DrawerLayout) hasViews.findViewById(id.drawerLayout));
        mLinearDrawerLayout = ((LinearLayout) hasViews.findViewById(id.linearDrawer));
        mTabs = ((PagerSlidingTabStrip) hasViews.findViewById(id.tabs));
        rootBattryView = ((BatteryChangeView) hasViews.findViewById(id.root_BatteryView));
        exitRipView = ((RippleView) hasViews.findViewById(id.exitRipView));
        locationText = ((TextView) hasViews.findViewById(id.locationText));
        mWeatherListView = ((ListView) hasViews.findViewById(id.lv_weather));
        mViewPager = ((ViewPager) hasViews.findViewById(id.pager));
        memory_progress = ((ArcProgress) hasViews.findViewById(id.memory_progress));
        contentFrame = ((FrameLayout) hasViews.findViewById(id.contentFrame));
        locationBtn = ((ImageView) hasViews.findViewById(id.locationBtn));
        if (memory_progress!= null) {
            memory_progress.setOnClickListener(new OnClickListener() {


                @Override
                public void onClick(View view) {
                    MainAppActivity_.this.clearMemory();
                }

            }
            );
        }
        if (exitRipView!= null) {
            exitRipView.setOnClickListener(new OnClickListener() {


                @Override
                public void onClick(View view) {
                    MainAppActivity_.this.exitApp();
                }

            }
            );
        }
        if (locationBtn!= null) {
            locationBtn.setOnClickListener(new OnClickListener() {


                @Override
                public void onClick(View view) {
                    MainAppActivity_.this.locationRefresh();
                }

            }
            );
        }
        initActivity();
    }

    public static class IntentBuilder_
        extends ActivityIntentBuilder<MainAppActivity_.IntentBuilder_>
    {

        private android.app.Fragment fragment_;
        private android.support.v4.app.Fragment fragmentSupport_;

        public IntentBuilder_(Context context) {
            super(context, MainAppActivity_.class);
        }

        public IntentBuilder_(android.app.Fragment fragment) {
            super(fragment.getActivity(), MainAppActivity_.class);
            fragment_ = fragment;
        }

        public IntentBuilder_(android.support.v4.app.Fragment fragment) {
            super(fragment.getActivity(), MainAppActivity_.class);
            fragmentSupport_ = fragment;
        }

        @Override
        public void startForResult(int requestCode) {
            if (fragmentSupport_!= null) {
                fragmentSupport_.startActivityForResult(intent, requestCode);
            } else {
                if (fragment_!= null) {
                    fragment_.startActivityForResult(intent, requestCode);
                } else {
                    super.startForResult(requestCode);
                }
            }
        }

    }

}
