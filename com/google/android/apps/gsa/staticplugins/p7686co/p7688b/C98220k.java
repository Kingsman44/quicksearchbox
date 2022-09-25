package com.google.android.apps.gsa.staticplugins.p7686co.p7688b;

import com.google.common.base.C58817ah;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: com.google.android.apps.gsa.staticplugins.co.b.k */
/* compiled from: PG */
public final /* synthetic */ class C98220k implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ AtomicLong f274246a;

    /* renamed from: b */
    public final /* synthetic */ int f274247b;

    public /* synthetic */ C98220k(AtomicLong atomicLong, int i) {
        this.f274246a = atomicLong;
        this.f274247b = i;
    }

    public final Object apply(Object obj) {
        AtomicLong atomicLong = this.f274246a;
        int i = this.f274247b;
        Void voidR = (Void) obj;
        long j = atomicLong.get();
        C58480gp f = C58485gu.m89838f(i);
        int i2 = 0;
        while (i2 < i) {
            f.mo55395g(Long.valueOf(j));
            i2++;
            j = 1 + j;
        }
        return f.mo55394f();
    }
}
