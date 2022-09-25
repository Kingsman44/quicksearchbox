package com.google.android.gms.measurement.api.internal;

import com.google.android.gms.common.internal.C143919bh;
import com.google.android.gms.p10793f.C144166k;

/* renamed from: com.google.android.gms.measurement.api.internal.z */
/* compiled from: PG */
final class C145217z extends C145183ad {

    /* renamed from: a */
    final /* synthetic */ String f392494a = "Error with data collection. Data lost.";

    /* renamed from: b */
    final /* synthetic */ Object f392495b;

    /* renamed from: c */
    final /* synthetic */ C145192am f392496c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C145217z(C145192am amVar, Object obj) {
        super(amVar, false);
        this.f392496c = amVar;
        this.f392495b = obj;
    }

    /* renamed from: a */
    public final void mo120691a() {
        C145195d dVar = this.f392496c.f392457f;
        C143919bh.m233958a(dVar);
        dVar.logHealthData(5, this.f392494a, new C144166k(this.f392495b), new C144166k((Object) null), new C144166k((Object) null));
    }
}
