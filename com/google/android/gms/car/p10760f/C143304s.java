package com.google.android.gms.car.p10760f;

import android.content.res.Configuration;
import com.google.android.gms.car.p10764h.C143316a;

/* renamed from: com.google.android.gms.car.f.s */
/* compiled from: PG */
public final /* synthetic */ class C143304s implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C143305t f388531a;

    /* renamed from: b */
    public final /* synthetic */ Configuration f388532b;

    /* renamed from: c */
    public final /* synthetic */ Runnable f388533c;

    public /* synthetic */ C143304s(C143305t tVar, Configuration configuration, Runnable runnable) {
        this.f388531a = tVar;
        this.f388532b = configuration;
        this.f388533c = runnable;
    }

    public final void run() {
        C143305t tVar = this.f388531a;
        Configuration configuration = this.f388532b;
        Runnable runnable = this.f388533c;
        if (C143316a.m232515e("CAR.PROJECTION.CAHI", 4)) {
            C143316a.m232514d(4, "CAR.PROJECTION.CAHI", (Throwable) null, "Presentation config updated for DrawingSpec %s -- %s", tVar.f388535b.f388437E, configuration);
        }
        C143268bb bbVar = tVar.f388535b;
        if (bbVar.f388439G && bbVar.f388437E.mo117900a(configuration)) {
            C143268bb bbVar2 = tVar.f388535b;
            bbVar2.f388439G = false;
            bbVar2.mo118313m(runnable);
        }
    }
}
