package com.google.android.gms.measurement.api.internal;

import com.google.android.gms.common.internal.C143919bh;

/* renamed from: com.google.android.gms.measurement.api.internal.r */
/* compiled from: PG */
public final class C145209r extends C145183ad {

    /* renamed from: a */
    final /* synthetic */ String f392475a;

    /* renamed from: b */
    final /* synthetic */ C145192am f392476b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C145209r(C145192am amVar, String str) {
        super(amVar, true);
        this.f392476b = amVar;
        this.f392475a = str;
    }

    /* renamed from: a */
    public final void mo120691a() {
        C145195d dVar = this.f392476b.f392457f;
        C143919bh.m233958a(dVar);
        dVar.beginAdUnitExposure(this.f392475a, this.f392431g);
    }
}
