package com.google.ads.interactivemedia.p367v3.internal;

import android.view.View;

/* renamed from: com.google.ads.interactivemedia.v3.internal.ek */
/* compiled from: PG */
public final /* synthetic */ class C6904ek {
    /* renamed from: a */
    public static C6822bj m20300a(float f, float f2, long j, float f3) {
        return new C6822bj(0.97f, 1.03f, 500, 5.0E-8f);
    }

    /* renamed from: b */
    public static float m20301b(View view) {
        return view.getZ();
    }

    /* renamed from: c */
    public static String m20302c(View view) {
        if (!view.isAttachedToWindow()) {
            return "notAttached";
        }
        int visibility = view.getVisibility();
        if (visibility != 0) {
            return visibility != 4 ? visibility != 8 ? "viewNotVisible" : "viewGone" : "viewInvisible";
        }
        if (view.getAlpha() == 0.0f) {
            return "viewAlphaZero";
        }
        return null;
    }
}
