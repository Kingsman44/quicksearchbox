package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.go */
/* compiled from: PG */
final class C145397go implements Runnable {

    /* renamed from: a */
    final /* synthetic */ String f393085a;

    /* renamed from: b */
    final /* synthetic */ String f393086b;

    /* renamed from: c */
    final /* synthetic */ Object f393087c;

    /* renamed from: d */
    final /* synthetic */ long f393088d;

    /* renamed from: e */
    final /* synthetic */ C145416hg f393089e;

    public C145397go(C145416hg hgVar, String str, String str2, Object obj, long j) {
        this.f393089e = hgVar;
        this.f393085a = str;
        this.f393086b = str2;
        this.f393087c = obj;
        this.f393088d = j;
    }

    public final void run() {
        this.f393089e.mo121087D(this.f393085a, this.f393086b, this.f393087c, this.f393088d);
    }
}
