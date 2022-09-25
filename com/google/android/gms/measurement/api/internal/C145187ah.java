package com.google.android.gms.measurement.api.internal;

import android.app.Activity;
import com.google.android.gms.common.internal.C143919bh;
import com.google.android.gms.p10793f.C144166k;

/* renamed from: com.google.android.gms.measurement.api.internal.ah */
/* compiled from: PG */
final class C145187ah extends C145183ad {

    /* renamed from: a */
    final /* synthetic */ Activity f392441a;

    /* renamed from: b */
    final /* synthetic */ C145191al f392442b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C145187ah(C145191al alVar, Activity activity) {
        super(alVar.f392450a, true);
        this.f392442b = alVar;
        this.f392441a = activity;
    }

    /* renamed from: a */
    public final void mo120691a() {
        C145195d dVar = this.f392442b.f392450a.f392457f;
        C143919bh.m233958a(dVar);
        dVar.onActivityPaused(new C144166k(this.f392441a), this.f392431g);
    }
}
