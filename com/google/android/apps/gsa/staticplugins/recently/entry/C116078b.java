package com.google.android.apps.gsa.staticplugins.recently.entry;

import android.content.res.Resources;
import android.util.DisplayMetrics;

/* renamed from: com.google.android.apps.gsa.staticplugins.recently.entry.b */
/* compiled from: PG */
public final class C116078b {
    /* renamed from: a */
    public static int m192458a(int i, Resources resources) {
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        int i2 = displayMetrics.widthPixels;
        int dimensionPixelSize = (displayMetrics.heightPixels - resources.getDimensionPixelSize(resources.getIdentifier("status_bar_height", "dimen", "android"))) - ((int) (displayMetrics.density * 56.0f));
        return i2 > dimensionPixelSize ? i : (i * dimensionPixelSize) / i2;
    }
}
