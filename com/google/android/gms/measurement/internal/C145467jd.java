package com.google.android.gms.measurement.internal;

import android.os.Bundle;

/* renamed from: com.google.android.gms.measurement.internal.jd */
/* compiled from: PG */
public final /* synthetic */ class C145467jd implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C145468je f393306a;

    public /* synthetic */ C145467jd(C145468je jeVar) {
        this.f393306a = jeVar;
    }

    public final void run() {
        C145468je jeVar = this.f393306a;
        C145469jf jfVar = jeVar.f393309c;
        long j = jeVar.f393307a;
        long j2 = jeVar.f393308b;
        jfVar.f393311b.mo120904g();
        jfVar.f393311b.f393011w.mo120965ar().f392802j.mo120894a("Application going to the background");
        jfVar.f393311b.f393011w.mo120971g().f392863p.mo120912b(true);
        Bundle bundle = new Bundle();
        if (!jfVar.f393311b.f393011w.f392937g.mo120778o()) {
            jfVar.f393311b.f393320d.f393315c.mo120829a();
            jfVar.f393311b.f393320d.mo121186a(false, false, j2);
        }
        jfVar.f393311b.f393011w.mo120972j().mo121102p("auto", "_ab", j, bundle);
    }
}
