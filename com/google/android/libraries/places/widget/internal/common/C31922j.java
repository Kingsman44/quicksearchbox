package com.google.android.libraries.places.widget.internal.common;

import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* renamed from: com.google.android.libraries.places.widget.internal.common.j */
/* compiled from: PG */
public final class C31922j {
    /* renamed from: a */
    public static int m59482a(int i, int i2, int i3) {
        return m59484c(i, i2, i3) ? i3 : i2;
    }

    /* renamed from: b */
    public static void m59483b(ImageView imageView, int i) {
        Drawable drawable = imageView.getDrawable();
        int rgb = Color.rgb(Color.red(i), Color.green(i), Color.blue(i));
        Drawable mutate = drawable.mutate();
        mutate.setColorFilter(rgb, PorterDuff.Mode.SRC_ATOP);
        mutate.setAlpha(Color.alpha(i));
    }

    /* renamed from: c */
    public static boolean m59484c(int i, int i2, int i3) {
        double f = m59487f(i);
        double e = m59486e(m59487f(i2), f);
        if (e <= 3.0d && e <= m59486e(m59487f(i3), f)) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    private static double m59485d(double d) {
        return d <= 0.03928d ? d / 12.92d : Math.pow((d + 0.055d) / 1.055d, 2.4d);
    }

    /* renamed from: e */
    private static double m59486e(double d, double d2) {
        double round = (double) Math.round(((Math.max(d, d2) + 0.05d) / (Math.min(d, d2) + 0.05d)) * 100.0d);
        Double.isNaN(round);
        return round / 100.0d;
    }

    /* renamed from: f */
    private static double m59487f(int i) {
        double red = (double) Color.red(i);
        Double.isNaN(red);
        double green = (double) Color.green(i);
        Double.isNaN(green);
        double d = (m59485d(red / 255.0d) * 0.2126d) + (m59485d(green / 255.0d) * 0.7152d);
        double blue = (double) Color.blue(i);
        Double.isNaN(blue);
        return d + (m59485d(blue / 255.0d) * 0.0722d);
    }
}
