package com.google.android.apps.search.assistant.verticals.ambient.p9896a.p9898b;

import com.google.android.apps.search.assistant.verticals.ambient.p9953q.p9957d.p9958a.C131197d;
import com.google.common.base.C58817ah;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import java.util.HashMap;
import p3186j$.util.Collection;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.a.b.f */
/* compiled from: PG */
public final /* synthetic */ class C130486f implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C130487g f357467a;

    /* renamed from: b */
    public final /* synthetic */ C58485gu f357468b;

    public /* synthetic */ C130486f(C130487g gVar, C58485gu guVar) {
        this.f357467a = gVar;
        this.f357468b = guVar;
    }

    public final Object apply(Object obj) {
        C130487g gVar = this.f357467a;
        C58485gu guVar = this.f357468b;
        HashMap hashMap = new HashMap();
        Collection.EL.stream(((C131197d) obj).f358809a).filter(C130482b.f357458a).forEach(new C130483c(hashMap));
        if (hashMap.isEmpty()) {
            return guVar;
        }
        return (C58485gu) Collection.EL.stream(guVar).filter(new C130484d(gVar, hashMap)).collect(C58370cn.f155946a);
    }
}
