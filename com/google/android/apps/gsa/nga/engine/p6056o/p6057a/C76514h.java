package com.google.android.apps.gsa.nga.engine.p6056o.p6057a;

import com.google.android.apps.gsa.nga.engine.p6056o.p6061d.p6066c.C76654d;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.C80399l;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.C80401n;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.C80403p;
import com.google.assistant.p3897e.p3921j.C52081en;
import com.google.assistant.p3897e.p3921j.C52090ew;
import com.google.assistant.p3897e.p3921j.C52091ex;
import com.google.assistant.p3897e.p3921j.C52232kc;
import com.google.common.base.C58817ah;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import p3186j$.util.Collection;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.a.h */
/* compiled from: PG */
public final /* synthetic */ class C76514h implements C58817ah {

    /* renamed from: a */
    public static final /* synthetic */ C76514h f211728a = new C76514h();

    private /* synthetic */ C76514h() {
    }

    public final Object apply(Object obj) {
        C76654d dVar = (C76654d) obj;
        if (dVar.f211915a != null) {
            C58976aa aaVar = C58975e.f156826a;
            C52081en enVar = dVar.f211915a;
            if (enVar == null) {
                enVar = C52081en.f136679i;
            }
            C58485gu guVar = (C58485gu) Collection.EL.stream(enVar.f136684d).map(C76515i.f211729a).collect(C58370cn.f155946a);
            C52091ex exVar = enVar.f136685e;
            if (exVar == null) {
                exVar = C52091ex.f136710b;
            }
            C52090ew ewVar = (C52090ew) exVar.toBuilder();
            int i = 0;
            while (true) {
                if (i >= exVar.f136712a.size()) {
                    break;
                } else if (((C52232kc) exVar.f136712a.get(i)).f137065b.equals("asst.client.execution.params")) {
                    ewVar.mo53793f(i);
                    break;
                } else {
                    i++;
                }
            }
            C80399l lVar = (C80399l) C80401n.f220656k.createBuilder();
            lVar.copyOnWrite();
            ((C80401n) lVar.instance).f220664g = C80403p.m128150a(6);
            lVar.mo74313e(((C52091ex) ewVar.build()).f136712a);
            lVar.mo74314f(guVar);
            return (C80401n) lVar.build();
        }
        C59104x b = C76516j.f211730d.mo56224b();
        b.mo56378ag(C58975e.f156826a, "FluidActionsFulfillmentCandidate");
        ((C59052c) ((C59052c) b).mo56372aa(3567)).mo56386p("FluidActions failed to handle the response");
        return C80401n.f220656k;
    }
}
