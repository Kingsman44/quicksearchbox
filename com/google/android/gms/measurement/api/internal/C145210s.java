package com.google.android.gms.measurement.api.internal;

import com.google.android.gms.common.internal.C143919bh;

/* renamed from: com.google.android.gms.measurement.api.internal.s */
/* compiled from: PG */
public final class C145210s extends C145183ad {

    /* renamed from: a */
    final /* synthetic */ String f392477a;

    /* renamed from: b */
    final /* synthetic */ C145192am f392478b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C145210s(C145192am amVar, String str) {
        super(amVar, true);
        this.f392478b = amVar;
        this.f392477a = str;
    }

    /* renamed from: a */
    public final void mo120691a() {
        C145195d dVar = this.f392478b.f392457f;
        C143919bh.m233958a(dVar);
        dVar.endAdUnitExposure(this.f392477a, this.f392431g);
    }
}
