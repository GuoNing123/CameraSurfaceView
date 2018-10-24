package com.example.guo.testyejianmode;

import android.app.Application;
import android.content.res.Configuration;
import android.support.v7.app.AppCompatDelegate;
import android.view.View;

public class myApplication extends Application{
    @Override
    public void onCreate() {
        super.onCreate();
        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);


    }
//    private void setNightMode() {
//        //  获取当前模式
//        int currentNightMode = getResources().getConfiguration().uiMode & Configuration.UI_MODE_NIGHT_MASK;
//        //  将是否为夜间模式保存到SharedPreferences
//        UserInfoTools.setNightMode(this, currentNightMode == Configuration.UI_MODE_NIGHT_NO);
//        //  切换模式
//        getDelegate().setDefaultNightMode(currentNightMode == Configuration.UI_MODE_NIGHT_NO ?
//                AppCompatDelegate.MODE_NIGHT_YES : AppCompatDelegate.MODE_NIGHT_NO);
//        UserInfoTools.setChangeNightMode(this,true);
//        //  重启Activity
//        recreate();
//    }


}
