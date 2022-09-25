package com.google.android.apps.search.assistant.verticals.ambient.p9937n.p9940b.p9941a;

import com.google.apps.tiktok.tracing.contrib.p3700b.C47638k;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60930r;
import p3186j$.time.Duration;
import p3186j$.time.Instant;
import p3186j$.util.Collection;
import p3186j$.util.Comparator;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.n.b.a.h */
/* compiled from: PG */
public final /* synthetic */ class C131053h implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C131071z f358484a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f358485b;

    /* renamed from: c */
    public final /* synthetic */ C60870cx f358486c;

    public /* synthetic */ C131053h(C131071z zVar, C60870cx cxVar, C60870cx cxVar2) {
        this.f358484a = zVar;
        this.f358485b = cxVar;
        this.f358486c = cxVar2;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        C131071z zVar = this.f358484a;
        C60870cx cxVar = this.f358485b;
        C60870cx cxVar2 = this.f358486c;
        C58485gu guVar = (C58485gu) C60856cj.m92909r(cxVar);
        C58485gu guVar2 = (C58485gu) C60856cj.m92909r(cxVar2);
        if (guVar.size() >= 2) {
            C58485gu guVar3 = (C58485gu) Collection.EL.stream(guVar).sorted(Comparator.EL.reversed(Comparator.CC.comparing(C131067v.f358507a))).map(C131068w.f358508a).collect(C58370cn.f155946a);
            zVar.f358522k.mo109919aq(Duration.between((Instant) guVar3.get(1), (Instant) guVar3.get(0)));
        }
        return C47638k.m84750a((C58485gu) Collection.EL.stream(guVar2).map(new C131063r(zVar, guVar)).collect(C58370cn.f155946a)).mo51520a(C131064s.f358503a, zVar.f358512a);
    }
}
