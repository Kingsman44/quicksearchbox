package com.google.android.apps.search.googleapp.launcher.minusone.p10354b;

import android.os.Build;
import android.view.animation.PathInterpolator;
import com.google.common.base.C58890d;
import com.google.common.p4522b.C58528ij;

/* renamed from: com.google.android.apps.search.googleapp.launcher.minusone.b.a */
/* compiled from: PG */
public final class C136593a {

    /* renamed from: a */
    public static final C58528ij f371846a = C58528ij.m90013M(1L, 2L, 3L, 4L);

    /* renamed from: c */
    private static final PathInterpolator f371847c = new PathInterpolator(0.0f, 0.0f, 0.2f, 1.0f);

    /* renamed from: b */
    public final long f371848b;

    public C136593a(long j) {
        this.f371848b = j;
    }

    /* renamed from: a */
    public static boolean m221995a() {
        return C58890d.m90990e("SAMSUNG", Build.MANUFACTURER) || C58890d.m90990e("SAMSUNG", Build.BRAND);
    }

    /* renamed from: b */
    public static final float m221996b(float f) {
        if (f < 0.25f) {
            return 0.66f;
        }
        if (f > 0.75f) {
            return 1.0f;
        }
        return (f371847c.getInterpolation((f - 16.0f) / 0.5f) * 0.33999997f) + 0.66f;
    }
}
