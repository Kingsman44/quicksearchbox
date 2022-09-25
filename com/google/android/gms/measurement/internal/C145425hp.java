package com.google.android.gms.measurement.internal;

import android.os.Bundle;

/* renamed from: com.google.android.gms.measurement.internal.hp */
/* compiled from: PG */
final class C145425hp implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C145423hn f393173a;

    /* renamed from: b */
    final /* synthetic */ C145423hn f393174b;

    /* renamed from: c */
    final /* synthetic */ long f393175c;

    /* renamed from: d */
    final /* synthetic */ boolean f393176d;

    /* renamed from: e */
    final /* synthetic */ C145430hu f393177e;

    public C145425hp(C145430hu huVar, C145423hn hnVar, C145423hn hnVar2, long j, boolean z) {
        this.f393177e = huVar;
        this.f393173a = hnVar;
        this.f393174b = hnVar2;
        this.f393175c = j;
        this.f393176d = z;
    }

    public final void run() {
        this.f393177e.mo121124k(this.f393173a, this.f393174b, this.f393175c, this.f393176d, (Bundle) null);
    }
}
