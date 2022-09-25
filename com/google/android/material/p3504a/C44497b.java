package com.google.android.material.p3504a;

import android.animation.TimeInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import androidx.p119j.p120a.p121a.C2299a;
import androidx.p119j.p120a.p121a.C2300b;
import androidx.p119j.p120a.p121a.C2301c;

/* renamed from: com.google.android.material.a.b */
/* compiled from: PG */
public final class C44497b {

    /* renamed from: a */
    public static final TimeInterpolator f115650a = new LinearInterpolator();

    /* renamed from: b */
    public static final TimeInterpolator f115651b = new C2300b();

    /* renamed from: c */
    public static final TimeInterpolator f115652c = new C2299a();

    /* renamed from: d */
    public static final TimeInterpolator f115653d = new C2301c();

    /* renamed from: e */
    public static final TimeInterpolator f115654e = new DecelerateInterpolator();

    /* renamed from: a */
    public static float m78597a(float f, float f2, float f3) {
        return f + (f3 * (f2 - f));
    }

    /* renamed from: b */
    public static float m78598b(float f, float f2, float f3, float f4, float f5) {
        return f5 <= f3 ? f : f5 >= f4 ? f2 : f + (((f5 - f3) / (f4 - f3)) * (f2 - f));
    }

    /* renamed from: c */
    public static int m78599c(int i, int i2, float f) {
        return i + Math.round(f * ((float) (i2 - i)));
    }
}
