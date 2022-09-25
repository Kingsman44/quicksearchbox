package com.google.android.gms.measurement.api.internal;

import android.os.Bundle;
import com.google.android.gms.common.internal.C143919bh;

/* renamed from: com.google.android.gms.measurement.api.internal.ac */
/* compiled from: PG */
final class C145182ac extends C145183ad {

    /* renamed from: a */
    final /* synthetic */ String f392425a;

    /* renamed from: b */
    final /* synthetic */ String f392426b;

    /* renamed from: c */
    final /* synthetic */ Bundle f392427c;

    /* renamed from: d */
    final /* synthetic */ boolean f392428d;

    /* renamed from: e */
    final /* synthetic */ C145192am f392429e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C145182ac(C145192am amVar, String str, String str2, Bundle bundle, boolean z) {
        super(amVar, true);
        this.f392429e = amVar;
        this.f392425a = str;
        this.f392426b = str2;
        this.f392427c = bundle;
        this.f392428d = z;
    }

    /* renamed from: a */
    public final void mo120691a() {
        long j = this.f392430f;
        C145195d dVar = this.f392429e.f392457f;
        C143919bh.m233958a(dVar);
        dVar.logEvent(this.f392425a, this.f392426b, this.f392427c, this.f392428d, true, j);
    }
}
