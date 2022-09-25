package com.google.android.gms.measurement.api.internal;

import android.os.Bundle;
import com.google.android.gms.common.internal.C143919bh;

/* renamed from: com.google.android.gms.measurement.api.internal.ab */
/* compiled from: PG */
public final class C145181ab extends C145183ad {

    /* renamed from: a */
    final /* synthetic */ String f392422a;

    /* renamed from: b */
    final /* synthetic */ C145179a f392423b;

    /* renamed from: c */
    final /* synthetic */ C145192am f392424c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C145181ab(C145192am amVar, String str, C145179a aVar) {
        super(amVar, true);
        this.f392424c = amVar;
        this.f392422a = str;
        this.f392423b = aVar;
    }

    /* renamed from: a */
    public final void mo120691a() {
        C145195d dVar = this.f392424c.f392457f;
        C143919bh.m233958a(dVar);
        dVar.getMaxUserProperties(this.f392422a, this.f392423b);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo120692b() {
        this.f392423b.mo120689c((Bundle) null);
    }
}
