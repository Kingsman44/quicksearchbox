package com.google.android.gms.measurement.api.internal;

import android.app.Activity;
import com.google.android.gms.common.internal.C143919bh;
import com.google.android.gms.p10793f.C144166k;

/* renamed from: com.google.android.gms.measurement.api.internal.aj */
/* compiled from: PG */
final class C145189aj extends C145183ad {

    /* renamed from: a */
    final /* synthetic */ Activity f392445a;

    /* renamed from: b */
    final /* synthetic */ C145179a f392446b;

    /* renamed from: c */
    final /* synthetic */ C145191al f392447c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C145189aj(C145191al alVar, Activity activity, C145179a aVar) {
        super(alVar.f392450a, true);
        this.f392447c = alVar;
        this.f392445a = activity;
        this.f392446b = aVar;
    }

    /* renamed from: a */
    public final void mo120691a() {
        C145195d dVar = this.f392447c.f392450a.f392457f;
        C143919bh.m233958a(dVar);
        dVar.onActivitySaveInstanceState(new C144166k(this.f392445a), this.f392446b, this.f392431g);
    }
}
