package com.google.android.apps.search.googleapp.search.suggest.sources.p10459a;

import com.google.android.apps.search.googleapp.search.suggest.C138014af;
import com.google.android.apps.search.googleapp.search.suggest.C138029au;
import com.google.android.apps.search.googleapp.search.suggest.C138030av;
import com.google.android.apps.search.googleapp.search.suggest.sources.C138497b;
import com.google.common.p4522b.C58495hd;
import com.google.p395al.p417d.p418a.p421b.C8562o;
import com.google.p395al.p417d.p418a.p421b.C8564q;
import com.google.p4017at.p4060h.p4073d.p4074a.C54228aq;
import com.google.p4017at.p4060h.p4073d.p4074a.C54240d;

/* renamed from: com.google.android.apps.search.googleapp.search.suggest.sources.a.az */
/* compiled from: PG */
public final /* synthetic */ class C138404az implements C138497b {

    /* renamed from: a */
    public final /* synthetic */ C58495hd f376503a;

    public /* synthetic */ C138404az(C58495hd hdVar) {
        this.f376503a = hdVar;
    }

    /* renamed from: a */
    public final C138014af mo114268a(C138030av avVar) {
        C58495hd hdVar = this.f376503a;
        C54228aq aqVar = avVar.f375543g;
        if (aqVar == null) {
            aqVar = C54228aq.f142328w;
        }
        C8564q qVar = aqVar.f142349u;
        if (qVar == null) {
            qVar = C8564q.f29673c;
        }
        C8562o a = C8562o.m23275a(qVar.f29675a);
        if (hdVar.containsKey(a)) {
            return (C138014af) hdVar.get(a);
        }
        C54228aq aqVar2 = avVar.f375543g;
        if (aqVar2 == null) {
            aqVar2 = C54228aq.f142328w;
        }
        C54240d dVar = aqVar2.f142340l;
        if (dVar == null) {
            dVar = C54240d.f142409e;
        }
        if ((dVar.f142411a & 1) != 0) {
            return C138014af.UNIVERSAL;
        }
        C138029au a2 = C138029au.m224331a(avVar.f375541d);
        if (a2 == null) {
            a2 = C138029au.QUERY;
        }
        if (a2 == C138029au.IN_CONTEXT_CONTROL) {
            return C138014af.SPYW_IN_CONTEXT_CONTROL;
        }
        C54228aq aqVar3 = avVar.f375543g;
        if (aqVar3 == null) {
            aqVar3 = C54228aq.f142328w;
        }
        if ((aqVar3.f142330a & 268435456) != 0) {
            return C138014af.XUIKIT;
        }
        return C138014af.CORE;
    }

    /* renamed from: b */
    public final /* synthetic */ boolean mo114269b() {
        return false;
    }
}
