package com.google.android.gms.measurement.internal;

import java.util.ArrayList;

/* renamed from: com.google.android.gms.measurement.internal.iy */
/* compiled from: PG */
final class C145461iy implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C145488jy f393294a;

    /* renamed from: b */
    final /* synthetic */ Runnable f393295b;

    public C145461iy(C145488jy jyVar, Runnable runnable) {
        this.f393294a = jyVar;
        this.f393295b = runnable;
    }

    public final void run() {
        this.f393294a.mo121217m();
        C145488jy jyVar = this.f393294a;
        Runnable runnable = this.f393295b;
        jyVar.mo120966as().mo120904g();
        if (jyVar.f393366n == null) {
            jyVar.f393366n = new ArrayList();
        }
        jyVar.f393366n.add(runnable);
        this.f393294a.mo121204E();
    }
}
