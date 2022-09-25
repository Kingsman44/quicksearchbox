package org.chromium.net.impl;

/* renamed from: org.chromium.net.impl.an */
/* compiled from: PG */
final class C72454an implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C72518cx f192805a;

    /* renamed from: b */
    final /* synthetic */ int f192806b;

    /* renamed from: c */
    final /* synthetic */ long f192807c;

    /* renamed from: d */
    final /* synthetic */ int f192808d;

    public C72454an(C72518cx cxVar, int i, long j, int i2) {
        this.f192805a = cxVar;
        this.f192806b = i;
        this.f192807c = j;
        this.f192808d = i2;
    }

    public final void run() {
        C72518cx cxVar = this.f192805a;
        cxVar.f192964a.onThroughputObservation(this.f192806b, this.f192807c, this.f192808d);
    }
}
