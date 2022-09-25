package com.google.android.gms.measurement.api.internal;

import android.app.Activity;
import com.google.android.gms.common.internal.C143919bh;
import com.google.android.gms.p10793f.C144166k;

/* renamed from: com.google.android.gms.measurement.api.internal.ag */
/* compiled from: PG */
final class C145186ag extends C145183ad {

    /* renamed from: a */
    final /* synthetic */ Activity f392439a;

    /* renamed from: b */
    final /* synthetic */ C145191al f392440b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C145186ag(C145191al alVar, Activity activity) {
        super(alVar.f392450a, true);
        this.f392440b = alVar;
        this.f392439a = activity;
    }

    /* renamed from: a */
    public final void mo120691a() {
        C145195d dVar = this.f392440b.f392450a.f392457f;
        C143919bh.m233958a(dVar);
        dVar.onActivityResumed(new C144166k(this.f392439a), this.f392431g);
    }
}
