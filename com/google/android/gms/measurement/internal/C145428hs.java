package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.hs */
/* compiled from: PG */
final class C145428hs implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C145423hn f393181a;

    /* renamed from: b */
    final /* synthetic */ long f393182b;

    /* renamed from: c */
    final /* synthetic */ C145430hu f393183c;

    public C145428hs(C145430hu huVar, C145423hn hnVar, long j) {
        this.f393183c = huVar;
        this.f393181a = hnVar;
        this.f393182b = j;
    }

    public final void run() {
        this.f393183c.mo121126m(this.f393181a, false, this.f393182b);
        C145430hu huVar = this.f393183c;
        huVar.f393187d = null;
        huVar.f393011w.mo120975m().mo121162r((C145423hn) null);
    }
}
