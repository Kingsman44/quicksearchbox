package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.util.C144006f;

/* renamed from: com.google.android.gms.measurement.internal.jc */
/* compiled from: PG */
final class C145466jc implements Runnable {

    /* renamed from: a */
    final /* synthetic */ long f393304a;

    /* renamed from: b */
    final /* synthetic */ C145473jj f393305b;

    public C145466jc(C145473jj jjVar, long j) {
        this.f393305b = jjVar;
        this.f393304a = j;
    }

    public final void run() {
        C145473jj jjVar = this.f393305b;
        long j = this.f393304a;
        jjVar.mo120904g();
        jjVar.mo121190e();
        jjVar.f393011w.mo120965ar().f392803k.mo120895b("Activity paused, time", Long.valueOf(j));
        C145469jf jfVar = jjVar.f393321e;
        C144006f fVar = jfVar.f393311b.f393011w.f392924A;
        jfVar.f393310a = new C145468je(jfVar, System.currentTimeMillis(), j);
        jfVar.f393311b.f393318b.postDelayed(jfVar.f393310a, 2000);
        if (jjVar.f393011w.f392937g.mo120778o()) {
            jjVar.f393320d.f393315c.mo120829a();
        }
    }
}
