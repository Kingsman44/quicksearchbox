package com.google.android.libraries.performance.primes.metrics.p2409d;

import android.content.Context;
import com.google.common.base.C58881cr;

/* renamed from: com.google.android.libraries.performance.primes.metrics.d.j */
/* compiled from: PG */
public final /* synthetic */ class C31387j implements C58881cr {

    /* renamed from: a */
    public final /* synthetic */ Context f84500a;

    public /* synthetic */ C31387j(Context context) {
        this.f84500a = context;
    }

    /* renamed from: a */
    public final Object mo6453a() {
        Context context = this.f84500a;
        long j = C31384g.f84496a;
        if (j == 0) {
            synchronized (C31384g.class) {
                j = C31384g.f84496a;
                if (j == 0) {
                    float f = 60.0f;
                    float floatValue = ((Float) C31384g.m58504a(context).mo56109e(Float.valueOf(60.0f))).floatValue();
                    if (floatValue >= 1.0f) {
                        f = floatValue;
                    }
                    double d = (double) f;
                    Double.isNaN(d);
                    long ceil = (long) Math.ceil(1.0E9d / d);
                    C31384g.f84496a = ceil;
                    j = ceil;
                }
            }
        }
        return Long.valueOf(j);
    }
}
