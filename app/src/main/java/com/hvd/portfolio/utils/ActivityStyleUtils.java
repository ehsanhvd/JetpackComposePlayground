package com.hvd.portfolio.utils;

import android.graphics.Color;
import android.os.Build;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;

import androidx.annotation.ColorRes;

import com.hvd.portfolio.R;

public class ActivityStyleUtils
{
    public static void applyTransparentStatusStyle(Window window, @ColorRes int bottomNavColor)
    {
        int sdkInt = Build.VERSION.SDK_INT;

        if (Build.VERSION_CODES.M <= sdkInt && sdkInt <= Build.VERSION_CODES.N_MR1)
        {
            int flag = 0;
            flag = View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN;
            window.getDecorView().setSystemUiVisibility(flag);
            window.setStatusBarColor(Color.TRANSPARENT);
            window.setNavigationBarColor(ResUtils.getColor(R.color.greyish)); //because soft buttons are white in this version
        }
        else if (Build.VERSION_CODES.O <= sdkInt)
        {
            int flag = 0;
            flag = View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN | View.SYSTEM_UI_FLAG_LIGHT_NAVIGATION_BAR;
            window.getDecorView().setSystemUiVisibility(flag);
            window.setStatusBarColor(Color.TRANSPARENT);
            window.setNavigationBarColor(ResUtils.getColor(bottomNavColor));
        }
        else
        {
            window.setFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS, WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
        }

    }

    public static void applyWhiteStyle(Window window)
    {
        applyWhiteStyle(window, R.color.backgroundColor);
    }

    public static void applyWhiteStyle(Window window, @ColorRes int navBarOreoColor)
    {

        int sdkInt = Build.VERSION.SDK_INT;

        if (Build.VERSION_CODES.LOLLIPOP < sdkInt && sdkInt <= Build.VERSION_CODES.LOLLIPOP_MR1)
        {
            window.setStatusBarColor(ResUtils.getColor(R.color.greyish));
            window.setNavigationBarColor(Color.BLACK);
        }
        else if (Build.VERSION_CODES.M <= sdkInt && sdkInt <= Build.VERSION_CODES.N_MR1)
        {
            int flag = View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR;
            window.getDecorView().setSystemUiVisibility(flag);

            window.setStatusBarColor(ResUtils.getColor(R.color.backgroundColor));
            window.setNavigationBarColor(ResUtils.getColor(R.color.greyish)); //because soft buttons are white in this version
        }
        else if (Build.VERSION_CODES.O <= sdkInt)
        {
            int flag = View.SYSTEM_UI_FLAG_LIGHT_NAVIGATION_BAR | View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR;
            window.getDecorView().setSystemUiVisibility(flag);

            window.setStatusBarColor(ResUtils.getColor(R.color.backgroundColor));
            window.setNavigationBarColor(ResUtils.getColor(navBarOreoColor));
        }
        else
        {
            window.setStatusBarColor(ResUtils.getColor(R.color.greyish));
            window.setNavigationBarColor(Color.BLACK);
        }
    }


    public static void applyWhiteStyleWithDarkNav(Window window, @ColorRes int navBarOreoColor)
    {

        int sdkInt = Build.VERSION.SDK_INT;

        if (Build.VERSION_CODES.LOLLIPOP < sdkInt && sdkInt <= Build.VERSION_CODES.LOLLIPOP_MR1)
        {
            window.setStatusBarColor(ResUtils.getColor(R.color.greyish));
            window.setNavigationBarColor(Color.BLACK);
        }
        else if (Build.VERSION_CODES.M <= sdkInt && sdkInt <= Build.VERSION_CODES.N_MR1)
        {
            int flag = View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR;
            window.getDecorView().setSystemUiVisibility(flag);

            window.setStatusBarColor(ResUtils.getColor(R.color.backgroundColor));
            window.setNavigationBarColor(ResUtils.getColor(navBarOreoColor)); //because soft buttons are white in this version
        }
        else if (Build.VERSION_CODES.O <= sdkInt)
        {
            int lightStatusBarFlag = View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR;
            window.getDecorView().setSystemUiVisibility(lightStatusBarFlag);
            int lightNavBarFlag = View.SYSTEM_UI_FLAG_LIGHT_NAVIGATION_BAR;
            window.getDecorView().setSystemUiVisibility(window.getDecorView().getSystemUiVisibility() & ~lightNavBarFlag);

            window.setStatusBarColor(ResUtils.getColor(R.color.backgroundColor));
            window.setNavigationBarColor(ResUtils.getColor(navBarOreoColor));
        }
    }

}
