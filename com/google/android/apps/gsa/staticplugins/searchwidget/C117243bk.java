package com.google.android.apps.gsa.staticplugins.searchwidget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.apps.gsa.staticplugins.searchwidget.bk */
/* compiled from: PG */
public final class C117243bk {
    /* renamed from: a */
    public static int m194850a(Context context, int i, int i2, String str) {
        if (i == 2) {
            return context.getResources().getColor(R.color.searchbox_background_monochrome_light);
        }
        if (i == 3) {
            return context.getResources().getColor(R.color.searchbox_background_monochrome_dark);
        }
        if (i == 4) {
            return i2;
        }
        if (!str.isEmpty()) {
            return Color.parseColor(str);
        }
        return context.getResources().getColor(R.color.searchbox_background);
    }

    /* renamed from: b */
    public static int m194851b(Context context, int i, int i2) {
        int i3 = R.color.customized_icon_color_grey;
        if (i == 2) {
            return context.getResources().getColor(R.color.customized_icon_color_grey);
        }
        if (i == 3) {
            return context.getResources().getColor(R.color.customized_icon_color_white);
        }
        if (i != 4) {
            return 0;
        }
        int red = Color.red(i2);
        int green = Color.green(i2);
        int blue = Color.blue(i2);
        Resources resources = context.getResources();
        double d = (double) red;
        Double.isNaN(d);
        double d2 = (double) green;
        Double.isNaN(d2);
        double d3 = (double) blue;
        Double.isNaN(d3);
        if (1.0d - ((((d * 0.299d) + (d2 * 0.587d)) + (d3 * 0.114d)) / 255.0d) >= 0.5d) {
            i3 = R.color.customized_icon_color_white;
        }
        return resources.getColor(i3);
    }
}
