package com.google.android.apps.gsa.staticplugins.opa.util;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.util.DisplayMetrics;
import android.view.Display;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.util.bo */
/* compiled from: PG */
public final class C113799bo {

    /* renamed from: a */
    public final Context f315169a;

    /* renamed from: b */
    public final C86124t f315170b;

    public C113799bo(Context context, C86124t tVar) {
        this.f315169a = context;
        this.f315170b = tVar;
    }

    /* renamed from: a */
    public static DisplayMetrics m188384a(Context context) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        Display b = m188385b(context);
        if (b != null) {
            b.getMetrics(displayMetrics);
        }
        return displayMetrics;
    }

    /* renamed from: b */
    public static Display m188385b(Context context) {
        DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
        if (displayManager != null) {
            return displayManager.getDisplay(0);
        }
        return null;
    }
}
