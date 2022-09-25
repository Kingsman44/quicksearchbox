package com.google.common.p4520a;

import java.lang.ref.ReferenceQueue;

/* renamed from: com.google.common.a.bf */
/* compiled from: PG */
final class C58226bf extends C58224bd {

    /* renamed from: a */
    volatile long f155718a = Long.MAX_VALUE;

    /* renamed from: b */
    C58241bu f155719b = C58234bn.m89127d();

    /* renamed from: c */
    C58241bu f155720c = C58234bn.m89127d();

    public C58226bf(ReferenceQueue referenceQueue, Object obj, int i, C58241bu buVar) {
        super(referenceQueue, obj, i, buVar);
    }

    /* renamed from: c */
    public final long mo54719c() {
        return this.f155718a;
    }

    /* renamed from: g */
    public final C58241bu mo54723g() {
        return this.f155719b;
    }

    /* renamed from: i */
    public final C58241bu mo54725i() {
        return this.f155720c;
    }

    /* renamed from: m */
    public final void mo54729m(C58241bu buVar) {
        this.f155719b = buVar;
    }

    /* renamed from: o */
    public final void mo54731o(C58241bu buVar) {
        this.f155720c = buVar;
    }

    /* renamed from: q */
    public final void mo54733q(long j) {
        this.f155718a = j;
    }
}
