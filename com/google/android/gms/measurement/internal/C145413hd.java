package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.hd */
/* compiled from: PG */
final class C145413hd implements Runnable {

    /* renamed from: a */
    final /* synthetic */ boolean f393133a;

    /* renamed from: b */
    final /* synthetic */ C145416hg f393134b;

    public C145413hd(C145416hg hgVar, boolean z) {
        this.f393134b = hgVar;
        this.f393133a = z;
    }

    public final void run() {
        boolean r = this.f393134b.f393011w.mo120980r();
        boolean q = this.f393134b.f393011w.mo120979q();
        this.f393134b.f393011w.f392950t = Boolean.valueOf(this.f393133a);
        if (q == this.f393133a) {
            this.f393134b.f393011w.mo120965ar().f392803k.mo120895b("Default data collection state already set to", Boolean.valueOf(this.f393133a));
        }
        if (this.f393134b.f393011w.mo120980r() == r || this.f393134b.f393011w.mo120980r() != this.f393134b.f393011w.mo120979q()) {
            this.f393134b.f393011w.mo120965ar().f392800h.mo120896c("Default data collection is different than actual status", Boolean.valueOf(this.f393133a), Boolean.valueOf(r));
        }
        this.f393134b.mo121088E();
    }
}
