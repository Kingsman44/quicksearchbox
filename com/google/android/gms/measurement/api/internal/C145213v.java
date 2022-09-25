package com.google.android.gms.measurement.api.internal;

import android.os.Bundle;
import com.google.android.gms.common.internal.C143919bh;

/* renamed from: com.google.android.gms.measurement.api.internal.v */
/* compiled from: PG */
public final class C145213v extends C145183ad {

    /* renamed from: a */
    final /* synthetic */ C145179a f392483a;

    /* renamed from: b */
    final /* synthetic */ C145192am f392484b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C145213v(C145192am amVar, C145179a aVar) {
        super(amVar, true);
        this.f392484b = amVar;
        this.f392483a = aVar;
    }

    /* renamed from: a */
    public final void mo120691a() {
        C145195d dVar = this.f392484b.f392457f;
        C143919bh.m233958a(dVar);
        dVar.generateEventId(this.f392483a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo120692b() {
        this.f392483a.mo120689c((Bundle) null);
    }
}
