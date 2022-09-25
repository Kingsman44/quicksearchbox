package com.google.android.apps.gsa.staticplugins.opa.valyrian.p8601ui;

import android.view.animation.Interpolator;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.valyrian.ui.ba */
/* compiled from: PG */
public final /* synthetic */ class C114123ba implements Interpolator {

    /* renamed from: a */
    public static final /* synthetic */ C114123ba f316322a = new C114123ba();

    private /* synthetic */ C114123ba() {
    }

    public final float getInterpolation(float f) {
        float f2 = f - 4.0f;
        int[] iArr = ValyrianViewPager.f316121a;
        return (f2 * f2 * f2 * f2 * f2) + 1.0f;
    }
}
