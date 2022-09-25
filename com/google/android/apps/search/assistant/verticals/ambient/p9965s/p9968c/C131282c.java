package com.google.android.apps.search.assistant.verticals.ambient.p9965s.p9968c;

import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.Callable;
import p3186j$.util.Collection;
import p3186j$.util.stream.Stream;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.s.c.c */
/* compiled from: PG */
public final /* synthetic */ class C131282c implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C60870cx f358944a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f358945b;

    public /* synthetic */ C131282c(C60870cx cxVar, C60870cx cxVar2) {
        this.f358944a = cxVar;
        this.f358945b = cxVar2;
    }

    public final Object call() {
        C60870cx cxVar = this.f358944a;
        C60870cx cxVar2 = this.f358945b;
        C58485gu guVar = (C58485gu) C60856cj.m92909r(cxVar);
        return (C58485gu) Stream.CC.concat(Collection.EL.stream(guVar), Collection.EL.stream((C58485gu) Collection.EL.stream((C58485gu) C60856cj.m92909r(cxVar2)).filter(new C131285f((C58485gu) Collection.EL.stream(guVar).map(C131284e.f358947a).collect(C58370cn.f155946a))).collect(C58370cn.f155946a))).collect(C58370cn.f155946a);
    }
}
