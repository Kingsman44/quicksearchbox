package com.google.android.gms.measurement.internal;

import p5304e.p5305a.p5306a.p5390n.p5405h.p5406a.C68893aw;

/* renamed from: com.google.android.gms.measurement.internal.hc */
/* compiled from: PG */
final class C145412hc implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C145224ad f393127a;

    /* renamed from: b */
    final /* synthetic */ int f393128b;

    /* renamed from: c */
    final /* synthetic */ long f393129c;

    /* renamed from: d */
    final /* synthetic */ boolean f393130d;

    /* renamed from: e */
    final /* synthetic */ C145224ad f393131e;

    /* renamed from: f */
    final /* synthetic */ C145416hg f393132f;

    public C145412hc(C145416hg hgVar, C145224ad adVar, int i, long j, boolean z, C145224ad adVar2) {
        this.f393132f = hgVar;
        this.f393127a = adVar;
        this.f393128b = i;
        this.f393129c = j;
        this.f393130d = z;
        this.f393131e = adVar2;
    }

    public final void run() {
        this.f393132f.mo121084A(this.f393127a);
        this.f393132f.mo121111y(this.f393127a, this.f393128b, this.f393129c, false, this.f393130d);
        if (C68893aw.m99823c() && this.f393132f.f393011w.f392937g.mo120776m((String) null, C145313dl.f392729ai)) {
            this.f393132f.mo121105s(this.f393127a, this.f393131e);
        }
    }
}
