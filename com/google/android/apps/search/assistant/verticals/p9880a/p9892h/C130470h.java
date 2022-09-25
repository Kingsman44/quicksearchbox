package com.google.android.apps.search.assistant.verticals.p9880a.p9892h;

import com.google.android.apps.search.assistant.verticals.p9880a.p9892h.p9894b.C130422a;
import com.google.android.apps.search.assistant.verticals.p9880a.p9892h.p9894b.C130423b;
import com.google.android.apps.search.assistant.verticals.p9880a.p9892h.p9894b.C130424c;
import com.google.assistant.p3825an.p3830c.p3831a.C49271aq;
import com.google.assistant.p3825an.p3830c.p3831a.C49301bt;
import com.google.common.base.C58817ah;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58800sl;
import p3186j$.util.Collection;

/* renamed from: com.google.android.apps.search.assistant.verticals.a.h.h */
/* compiled from: PG */
public final /* synthetic */ class C130470h implements C58817ah {

    /* renamed from: a */
    public static final /* synthetic */ C130470h f357436a = new C130470h();

    private /* synthetic */ C130470h() {
    }

    public final Object apply(Object obj) {
        C58480gp e = C58485gu.m89837e();
        C58800sl lA = ((C58495hd) obj).values().iterator();
        while (lA.hasNext()) {
            C49301bt btVar = (C49301bt) lA.next();
            C49271aq aqVar = btVar.f127428d;
            if (aqVar == null) {
                aqVar = C49271aq.f127363b;
            }
            e.mo55396h((Iterable) Collection.EL.stream(aqVar.f127365a).filter(C130422a.f357383a).filter(C130423b.f357384a).map(new C130424c(btVar)).collect(C58370cn.f155946a));
        }
        return e.mo55394f();
    }
}
