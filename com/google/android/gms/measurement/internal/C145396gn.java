package com.google.android.gms.measurement.internal;

import android.os.Bundle;

/* renamed from: com.google.android.gms.measurement.internal.gn */
/* compiled from: PG */
final class C145396gn implements Runnable {

    /* renamed from: a */
    final /* synthetic */ String f393076a;

    /* renamed from: b */
    final /* synthetic */ String f393077b;

    /* renamed from: c */
    final /* synthetic */ long f393078c;

    /* renamed from: d */
    final /* synthetic */ Bundle f393079d;

    /* renamed from: e */
    final /* synthetic */ boolean f393080e;

    /* renamed from: f */
    final /* synthetic */ boolean f393081f;

    /* renamed from: g */
    final /* synthetic */ boolean f393082g;

    /* renamed from: h */
    final /* synthetic */ String f393083h;

    /* renamed from: i */
    final /* synthetic */ C145416hg f393084i;

    public C145396gn(C145416hg hgVar, String str, String str2, long j, Bundle bundle, boolean z, boolean z2, boolean z3, String str3) {
        this.f393084i = hgVar;
        this.f393076a = str;
        this.f393077b = str2;
        this.f393078c = j;
        this.f393079d = bundle;
        this.f393080e = z;
        this.f393081f = z2;
        this.f393082g = z3;
        this.f393083h = str3;
    }

    public final void run() {
        this.f393084i.mo121103q(this.f393076a, this.f393077b, this.f393078c, this.f393079d, this.f393080e, this.f393081f, this.f393082g, this.f393083h);
    }
}
