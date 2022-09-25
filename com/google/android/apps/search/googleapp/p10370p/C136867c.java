package com.google.android.apps.search.googleapp.p10370p;

import com.google.apps.tiktok.p3663j.C47352j;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;

/* renamed from: com.google.android.apps.search.googleapp.p.c */
/* compiled from: PG */
public final class C136867c implements C47352j {

    /* renamed from: a */
    final C136848ao f372525a;

    /* renamed from: b */
    private final boolean f372526b;

    public C136867c(boolean z, C136848ao aoVar) {
        this.f372525a = aoVar;
        this.f372526b = z;
    }

    /* renamed from: b */
    public final C60870cx mo19293b() {
        if (!this.f372526b) {
            return C60866ct.f164955a;
        }
        C136848ao aoVar = this.f372525a;
        ((C59052c) ((C59052c) C136848ao.f372475a.mo56224b()).mo56372aa(40689)).mo56386p("#logGrowthTrackingUsageInfo");
        C60870cx d = aoVar.f372479e.mo46042d();
        C136845al alVar = new C136845al(aoVar);
        return C60922j.m93045h(d, C47810es.m84966f(alVar), aoVar.f372482h);
    }
}
