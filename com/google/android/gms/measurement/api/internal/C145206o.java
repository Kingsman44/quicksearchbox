package com.google.android.gms.measurement.api.internal;

import android.os.Bundle;
import com.google.android.gms.common.internal.C143919bh;

/* renamed from: com.google.android.gms.measurement.api.internal.o */
/* compiled from: PG */
public final class C145206o extends C145183ad {

    /* renamed from: a */
    final /* synthetic */ String f392464a;

    /* renamed from: b */
    final /* synthetic */ String f392465b;

    /* renamed from: c */
    final /* synthetic */ C145179a f392466c;

    /* renamed from: d */
    final /* synthetic */ C145192am f392467d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C145206o(C145192am amVar, String str, String str2, C145179a aVar) {
        super(amVar, true);
        this.f392467d = amVar;
        this.f392464a = str;
        this.f392465b = str2;
        this.f392466c = aVar;
    }

    /* renamed from: a */
    public final void mo120691a() {
        C145195d dVar = this.f392467d.f392457f;
        C143919bh.m233958a(dVar);
        dVar.getConditionalUserProperties(this.f392464a, this.f392465b, this.f392466c);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo120692b() {
        this.f392466c.mo120689c((Bundle) null);
    }
}
