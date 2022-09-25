package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.gm */
/* compiled from: PG */
final class C145395gm implements Runnable {

    /* renamed from: a */
    final /* synthetic */ long f393074a;

    /* renamed from: b */
    final /* synthetic */ C145416hg f393075b;

    public C145395gm(C145416hg hgVar, long j) {
        this.f393075b = hgVar;
        this.f393074a = j;
    }

    public final void run() {
        this.f393075b.f393011w.mo120971g().f392857j.mo120916b(this.f393074a);
        this.f393075b.f393011w.mo120965ar().f392802j.mo120895b("Session timeout duration set", Long.valueOf(this.f393074a));
    }
}
