package com.google.android.apps.gsa.staticplugins.opa.ambient.p8207b.p8208a.p8209a;

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

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ambient.b.a.a.z */
/* compiled from: PG */
public final /* synthetic */ class C106485z implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C106447am f296976a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f296977b;

    /* renamed from: c */
    public final /* synthetic */ C60870cx f296978c;

    public /* synthetic */ C106485z(C106447am amVar, C60870cx cxVar, C60870cx cxVar2) {
        this.f296976a = amVar;
        this.f296977b = cxVar;
        this.f296978c = cxVar2;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        C106447am amVar = this.f296976a;
        C60870cx cxVar = this.f296977b;
        C60870cx cxVar2 = this.f296978c;
        C58485gu guVar = (C58485gu) C60856cj.m92909r(cxVar);
        C58485gu guVar2 = (C58485gu) C60856cj.m92909r(cxVar2);
        if (guVar.size() >= 2) {
            C58485gu guVar3 = (C58485gu) Collection.EL.stream(guVar).sorted(Comparator.EL.reversed(Comparator.CC.comparing(C106473n.f296961a))).map(C106474o.f296962a).collect(C58370cn.f155946a);
            amVar.f296917i.mo109919aq(Duration.between((Instant) guVar3.get(1), (Instant) guVar3.get(0)));
        }
        return C47638k.m84750a((C58485gu) Collection.EL.stream(guVar2).map(new C106461b(amVar, guVar)).collect(C58370cn.f155946a)).mo51520a(C106472m.f296960a, amVar.f296919k);
    }
}
