package com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.p6386j;

import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Point;
import android.util.DisplayMetrics;
import android.view.Display;

/* renamed from: com.google.android.apps.gsa.nga.shared.ui.assistlayer.j.b */
/* compiled from: PG */
public abstract class C81809b {

    /* renamed from: a */
    public static final C81809b f223743a;

    static {
        C81815h hVar = new C81815h();
        hVar.mo75326e(false);
        hVar.mo75329h(0);
        hVar.mo75328g(0);
        hVar.mo75327f(0);
        hVar.mo75331j(0);
        hVar.mo75330i(0);
        hVar.mo75332k(0);
        hVar.mo75323b(0);
        hVar.mo75325d(0.0f);
        hVar.mo75324c(0);
        f223743a = hVar.mo75322a();
    }

    /* renamed from: j */
    public static C81809b m129993j(Display display, Resources resources, Configuration configuration) {
        int i;
        int i2;
        int i3;
        Point point = new Point();
        boolean z = false;
        if (display != null) {
            DisplayMetrics displayMetrics = new DisplayMetrics();
            display.getRealMetrics(displayMetrics);
            i3 = display.getRotation();
            display.getRealSize(point);
            if (i3 == 0 || i3 == 2) {
                i2 = displayMetrics.heightPixels;
            } else {
                i2 = displayMetrics.widthPixels;
            }
            i = (i3 == 0 || i3 == 2) ? displayMetrics.widthPixels : displayMetrics.heightPixels;
        } else {
            i = 0;
            i3 = 0;
            i2 = 0;
        }
        C81815h hVar = new C81815h();
        hVar.mo75329h(i3);
        hVar.mo75327f(point.y);
        hVar.mo75328g(point.x);
        hVar.mo75330i(i2);
        hVar.mo75331j(i);
        int identifier = resources.getIdentifier("rounded_corner_radius_top", "dimen", "android");
        int dimensionPixelSize = identifier > 0 ? resources.getDimensionPixelSize(identifier) : 0;
        if (dimensionPixelSize == 0) {
            dimensionPixelSize = m129994l(resources);
        }
        hVar.mo75332k(dimensionPixelSize);
        int identifier2 = resources.getIdentifier("rounded_corner_radius_bottom", "dimen", "android");
        int dimensionPixelSize2 = identifier2 > 0 ? resources.getDimensionPixelSize(identifier2) : 0;
        if (dimensionPixelSize2 == 0) {
            dimensionPixelSize2 = m129994l(resources);
        }
        hVar.mo75323b(dimensionPixelSize2);
        if ((configuration.uiMode & 48) == 32) {
            z = true;
        }
        hVar.mo75326e(z);
        hVar.mo75325d(configuration.fontScale);
        hVar.mo75324c(configuration.densityDpi);
        return hVar.mo75322a();
    }

    /* renamed from: l */
    private static int m129994l(Resources resources) {
        int identifier = resources.getIdentifier("rounded_corner_radius", "dimen", "android");
        if (identifier > 0) {
            return resources.getDimensionPixelSize(identifier);
        }
        return 0;
    }

    /* renamed from: a */
    public abstract float mo75333a();

    /* renamed from: b */
    public abstract int mo75334b();

    /* renamed from: c */
    public abstract int mo75335c();

    /* renamed from: d */
    public abstract int mo75336d();

    /* renamed from: e */
    public abstract int mo75337e();

    /* renamed from: f */
    public abstract int mo75338f();

    /* renamed from: g */
    public abstract int mo75339g();

    /* renamed from: h */
    public abstract int mo75340h();

    /* renamed from: i */
    public abstract int mo75341i();

    /* renamed from: k */
    public abstract boolean mo75342k();
}
