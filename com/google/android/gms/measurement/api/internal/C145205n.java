package com.google.android.gms.measurement.api.internal;

import android.os.Bundle;
import com.google.android.gms.common.internal.C143919bh;

/* renamed from: com.google.android.gms.measurement.api.internal.n */
/* compiled from: PG */
public final class C145205n extends C145183ad {

    /* renamed from: a */
    final /* synthetic */ String f392460a;

    /* renamed from: b */
    final /* synthetic */ String f392461b;

    /* renamed from: c */
    final /* synthetic */ Bundle f392462c;

    /* renamed from: d */
    final /* synthetic */ C145192am f392463d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C145205n(C145192am amVar, String str, String str2, Bundle bundle) {
        super(amVar, true);
        this.f392463d = amVar;
        this.f392460a = str;
        this.f392461b = str2;
        this.f392462c = bundle;
    }

    /* renamed from: a */
    public final void mo120691a() {
        C145195d dVar = this.f392463d.f392457f;
        C143919bh.m233958a(dVar);
        dVar.clearConditionalUserProperty(this.f392460a, this.f392461b, this.f392462c);
    }
}
