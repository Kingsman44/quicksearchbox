package com.google.android.libraries.social.populous;

import com.google.android.libraries.social.populous.p3296e.C42549n;
import com.google.common.base.C58889cz;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.libraries.social.populous.ae */
/* compiled from: PG */
public final class C42151ae {

    /* renamed from: a */
    public final Object f110397a = new Object();

    /* renamed from: b */
    public final long f110398b;

    /* renamed from: c */
    public final long f110399c;

    /* renamed from: d */
    public final C58889cz f110400d;

    /* renamed from: e */
    public C58480gp f110401e;

    /* renamed from: f */
    public long f110402f;

    /* renamed from: g */
    public C42549n f110403g;

    /* renamed from: h */
    public int f110404h;

    public C42151ae(C58889cz czVar, long j, long j2, TimeUnit timeUnit) {
        this.f110400d = czVar;
        this.f110398b = timeUnit.toNanos(j);
        this.f110399c = timeUnit.toNanos(j2);
        mo44850a();
    }

    /* renamed from: a */
    public final void mo44850a() {
        synchronized (this.f110397a) {
            this.f110403g = null;
            this.f110404h = 1;
            C58485gu.m89845m();
            this.f110402f = 0;
        }
    }
}
