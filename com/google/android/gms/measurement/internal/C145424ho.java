package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import java.util.List;

/* renamed from: com.google.android.gms.measurement.internal.ho */
/* compiled from: PG */
final class C145424ho implements Runnable {

    /* renamed from: a */
    final /* synthetic */ Bundle f393168a;

    /* renamed from: b */
    final /* synthetic */ C145423hn f393169b;

    /* renamed from: c */
    final /* synthetic */ C145423hn f393170c;

    /* renamed from: d */
    final /* synthetic */ long f393171d;

    /* renamed from: e */
    final /* synthetic */ C145430hu f393172e;

    public C145424ho(C145430hu huVar, Bundle bundle, C145423hn hnVar, C145423hn hnVar2, long j) {
        this.f393172e = huVar;
        this.f393168a = bundle;
        this.f393169b = hnVar;
        this.f393170c = hnVar2;
        this.f393171d = j;
    }

    public final void run() {
        C145430hu huVar = this.f393172e;
        Bundle bundle = this.f393168a;
        C145423hn hnVar = this.f393169b;
        C145423hn hnVar2 = this.f393170c;
        long j = this.f393171d;
        bundle.remove("screen_name");
        bundle.remove("screen_class");
        huVar.mo121124k(hnVar, hnVar2, j, true, huVar.f393011w.mo120977o().mo121289v((String) null, "screen_view", bundle, (List) null, false));
    }
}
