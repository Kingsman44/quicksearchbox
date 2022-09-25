package com.google.android.gms.analytics.internal;

import com.google.android.gms.analytics.C142764q;

/* renamed from: com.google.android.gms.analytics.internal.n */
/* compiled from: PG */
final class C142744n implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C142746p f387357a;

    /* renamed from: b */
    final /* synthetic */ C142719ap f387358b;

    public C142744n(C142746p pVar, C142719ap apVar) {
        this.f387357a = pVar;
        this.f387358b = apVar;
    }

    public final void run() {
        if (!this.f387357a.f387362b.mo117559f()) {
            this.f387357a.f387362b.mo117536i(3, "Connected to service after a timeout", (Object) null, (Object) null, (Object) null);
            C142747q qVar = this.f387357a.f387362b;
            C142719ap apVar = this.f387358b;
            C142764q.m231686b();
            qVar.f387365b = apVar;
            qVar.mo117558e();
            C142735e d = qVar.f387328e.mo117544d();
            C142740j jVar = d.f387328e;
            C142764q.m231686b();
            d.f387327a.mo117589g();
        }
    }
}
