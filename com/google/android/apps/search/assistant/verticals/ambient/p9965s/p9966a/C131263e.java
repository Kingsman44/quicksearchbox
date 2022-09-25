package com.google.android.apps.search.assistant.verticals.ambient.p9965s.p9966a;

import com.google.common.base.C58817ah;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import p3186j$.util.Collection;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.s.a.e */
/* compiled from: PG */
public final /* synthetic */ class C131263e implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C131264f f358912a;

    public /* synthetic */ C131263e(C131264f fVar) {
        this.f358912a = fVar;
    }

    public final Object apply(Object obj) {
        C131264f fVar = this.f358912a;
        C58485gu guVar = (C58485gu) obj;
        fVar.f358914b.mo109900aI(3, guVar.size());
        return (C58485gu) Collection.EL.stream(guVar).filter(new C131259a(fVar)).map(C131260b.f358909a).collect(C58370cn.f155946a);
    }
}
