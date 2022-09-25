package com.google.android.libraries.search.location.p3029a;

import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;
import p3186j$.time.Instant;

/* renamed from: com.google.android.libraries.search.location.a.y */
/* compiled from: PG */
public final /* synthetic */ class C38681y implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C38586af f102153a;

    public /* synthetic */ C38681y(C38586af afVar) {
        this.f102153a = afVar;
    }

    public final C60870cx apply(Object obj) {
        C38586af afVar = this.f102153a;
        C38635c cVar = (C38635c) obj;
        C38590aj a = C38590aj.m67896a(cVar.f102092b);
        if (a == null) {
            a = C38590aj.CONSENT_REASON_UNKNOWN;
        }
        if (!a.equals(C38590aj.CONSENT_REASON_TEMPORARILY_ALLOWED) || !C38591ak.m67898a(cVar, Instant.ofEpochMilli(afVar.f101994e.mo26870b())).isZero()) {
            return C47633f.m84733g(C60856cj.m92900i(cVar));
        }
        C38590aj ajVar = C38590aj.CONSENT_REASON_ASK_NEXT_TIME;
        C38625bq bqVar = (C38625bq) C38626br.f102069c.createBuilder();
        bqVar.copyOnWrite();
        C38626br brVar = (C38626br) bqVar.instance;
        brVar.f102072b = 3;
        brVar.f102071a |= 1;
        return C60922j.m93045h(afVar.mo41511g(ajVar, (C38626br) bqVar.build()), C47810es.m84966f(new C38663g(afVar)), afVar.f101993d);
    }
}
