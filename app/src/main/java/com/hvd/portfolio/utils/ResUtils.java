package com.hvd.portfolio.utils;

import android.graphics.Typeface;

import androidx.annotation.ColorInt;
import androidx.annotation.ColorRes;
import androidx.annotation.FontRes;
import androidx.core.content.ContextCompat;
import androidx.core.content.res.ResourcesCompat;

import com.hvd.portfolio.App;

public class ResUtils
{
    @ColorInt
    public static int getColor(@ColorRes int colorRes) {
        return ContextCompat.getColor(App.Companion.getInstance(), colorRes);
    }

    public static Typeface getTypeFace(@FontRes int res) {
        return ResourcesCompat.getFont(App.Companion.getInstance(), res);
    }
}
