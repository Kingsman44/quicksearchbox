package com.google.android.apps.search.assistant.platform.pcp.featuredata.p9333c;

import com.google.android.apps.search.assistant.platform.pcp.p9325b.C123615ah;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import p3186j$.time.Instant;

/* renamed from: com.google.android.apps.search.assistant.platform.pcp.featuredata.c.j */
/* compiled from: PG */
public final /* synthetic */ class C123865j implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C123878w f342150a;

    /* renamed from: b */
    public final /* synthetic */ C123615ah f342151b;

    public /* synthetic */ C123865j(C123878w wVar, C123615ah ahVar) {
        this.f342150a = wVar;
        this.f342151b = ahVar;
    }

    public final C60870cx apply(Object obj) {
        C123878w wVar = this.f342150a;
        C123615ah ahVar = this.f342151b;
        Long l = (Long) obj;
        Instant a = wVar.f342184f.mo57444a();
        Instant ofEpochMilli = Instant.ofEpochMilli(l.longValue());
        Instant minus = a.minus(wVar.f342185g);
        if (l.longValue() != 0 && ofEpochMilli.isAfter(minus)) {
            return wVar.f342179a.mo106139b(ofEpochMilli, a.plus(wVar.f342183e));
        }
        C46459k.m82829b(ahVar.mo106073c(a), "Failed to update calendar recon start time on PCP.", new Object[0]);
        return wVar.f342179a.mo106139b(a, a.plus(wVar.f342183e));
    }
}
