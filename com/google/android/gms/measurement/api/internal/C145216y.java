package com.google.android.gms.measurement.api.internal;

import android.os.Bundle;
import com.google.android.gms.common.internal.C143919bh;

/* renamed from: com.google.android.gms.measurement.api.internal.y */
/* compiled from: PG */
public final class C145216y extends C145183ad {

    /* renamed from: a */
    final /* synthetic */ String f392489a;

    /* renamed from: b */
    final /* synthetic */ String f392490b;

    /* renamed from: c */
    final /* synthetic */ boolean f392491c;

    /* renamed from: d */
    final /* synthetic */ C145179a f392492d;

    /* renamed from: e */
    final /* synthetic */ C145192am f392493e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C145216y(C145192am amVar, String str, String str2, boolean z, C145179a aVar) {
        super(amVar, true);
        this.f392493e = amVar;
        this.f392489a = str;
        this.f392490b = str2;
        this.f392491c = z;
        this.f392492d = aVar;
    }

    /* renamed from: a */
    public final void mo120691a() {
        C145195d dVar = this.f392493e.f392457f;
        C143919bh.m233958a(dVar);
        dVar.getUserProperties(this.f392489a, this.f392490b, this.f392491c, this.f392492d);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo120692b() {
        this.f392492d.mo120689c((Bundle) null);
    }
}
