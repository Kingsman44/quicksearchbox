package com.google.android.gms.measurement.internal;

import p5304e.p5305a.p5306a.p5390n.p5405h.p5406a.C68893aw;

/* renamed from: com.google.android.gms.measurement.internal.hb */
/* compiled from: PG */
final class C145411hb implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C145224ad f393120a;

    /* renamed from: b */
    final /* synthetic */ long f393121b;

    /* renamed from: c */
    final /* synthetic */ int f393122c;

    /* renamed from: d */
    final /* synthetic */ long f393123d;

    /* renamed from: e */
    final /* synthetic */ boolean f393124e;

    /* renamed from: f */
    final /* synthetic */ C145224ad f393125f;

    /* renamed from: g */
    final /* synthetic */ C145416hg f393126g;

    public C145411hb(C145416hg hgVar, C145224ad adVar, long j, int i, long j2, boolean z, C145224ad adVar2) {
        this.f393126g = hgVar;
        this.f393120a = adVar;
        this.f393121b = j;
        this.f393122c = i;
        this.f393123d = j2;
        this.f393124e = z;
        this.f393125f = adVar2;
    }

    public final void run() {
        this.f393126g.mo121084A(this.f393120a);
        this.f393126g.mo121104r(this.f393121b, false);
        this.f393126g.mo121111y(this.f393120a, this.f393122c, this.f393123d, true, this.f393124e);
        if (C68893aw.m99823c() && this.f393126g.f393011w.f392937g.mo120776m((String) null, C145313dl.f392729ai)) {
            this.f393126g.mo121105s(this.f393120a, this.f393125f);
        }
    }
}
