package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.aj */
/* compiled from: PG */
final class C145230aj implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C145383ga f392579a;

    /* renamed from: b */
    final /* synthetic */ C145231ak f392580b;

    public C145230aj(C145231ak akVar, C145383ga gaVar) {
        this.f392580b = akVar;
        this.f392579a = gaVar;
    }

    public final void run() {
        C145508x xVar = ((C145361ff) this.f392579a).f392936f;
        if (C145508x.m236572a()) {
            this.f392579a.mo120966as().mo120960h(this);
            return;
        }
        boolean d = this.f392580b.mo120832d();
        this.f392580b.f392582a = 0;
        if (d) {
            this.f392580b.mo120830b();
        }
    }
}
