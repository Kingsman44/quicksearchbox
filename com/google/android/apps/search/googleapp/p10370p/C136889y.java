package com.google.android.apps.search.googleapp.p10370p;

import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;
import p3186j$.time.Instant;
import p3186j$.time.temporal.ChronoUnit;

/* renamed from: com.google.android.apps.search.googleapp.p.y */
/* compiled from: PG */
public final /* synthetic */ class C136889y implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C136848ao f372570a;

    /* renamed from: b */
    public final /* synthetic */ int f372571b;

    public /* synthetic */ C136889y(C136848ao aoVar, int i) {
        this.f372570a = aoVar;
        this.f372571b = i;
    }

    public final C60870cx apply(Object obj) {
        C136848ao aoVar = this.f372570a;
        int i = this.f372571b;
        C136881q qVar = (C136881q) obj;
        long epochMilli = Instant.ofEpochMilli(aoVar.f372483i.mo26870b()).truncatedTo(ChronoUnit.DAYS).toEpochMilli();
        if (qVar.f372555b.containsKey(Long.valueOf(epochMilli))) {
            return C60856cj.m92900i(C136848ao.m222538f(qVar, i, epochMilli));
        }
        C60870cx c = aoVar.mo113412c();
        C136838ae aeVar = new C136838ae(aoVar, i, epochMilli);
        return C60922j.m93045h(c, C47810es.m84966f(aeVar), aoVar.f372480f);
    }
}
