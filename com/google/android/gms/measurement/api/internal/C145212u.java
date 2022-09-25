package com.google.android.gms.measurement.api.internal;

import android.os.Bundle;
import com.google.android.gms.common.internal.C143919bh;

/* renamed from: com.google.android.gms.measurement.api.internal.u */
/* compiled from: PG */
public final class C145212u extends C145183ad {

    /* renamed from: a */
    final /* synthetic */ C145179a f392481a;

    /* renamed from: b */
    final /* synthetic */ C145192am f392482b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C145212u(C145192am amVar, C145179a aVar) {
        super(amVar, true);
        this.f392482b = amVar;
        this.f392481a = aVar;
    }

    /* renamed from: a */
    public final void mo120691a() {
        C145195d dVar = this.f392482b.f392457f;
        C143919bh.m233958a(dVar);
        dVar.getCachedAppInstanceId(this.f392481a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo120692b() {
        this.f392481a.mo120689c((Bundle) null);
    }
}
