package com.google.android.libraries.assistant.auto.tng.suggestions.p1256i.p1257a.p1258a;

import com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room.C16090ap;
import com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room.C16170n;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1168a.p1171b.C15777d;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1256i.p1257a.C16283a;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1263k.C16330ad;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1263k.C16335ai;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.libraries.assistant.auto.tng.suggestions.i.a.a.a */
/* compiled from: PG */
public final class C16284a implements C16283a {

    /* renamed from: a */
    private static final C59071e f47934a = C59071e.m91332i("com.google.android.libraries.assistant.auto.tng.suggestions.i.a.a.a");

    /* renamed from: a */
    public final C58485gu mo22871a(List list, C15777d dVar) {
        C58480gp e = C58485gu.m89837e();
        C58833ax axVar = C58836b.f156633a;
        int e2 = dVar.mo22544b().mo22731e();
        C16090ap g = dVar.mo22544b().mo22733g();
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            C16170n nVar = (C16170n) it.next();
            C16330ad adVar = nVar.mo22747b().f48082g;
            if (adVar == null) {
                adVar = C16330ad.f48065f;
            }
            if (adVar.f48068b != 1) {
                C16335ai aiVar = nVar.mo22747b().f48084i;
                if (aiVar == null) {
                    aiVar = C16335ai.f48090k;
                }
                if (aiVar.f48096e) {
                    C59104x b = f47934a.mo56224b();
                    b.mo56378ag(C58975e.f156826a, "SuggestionDisplayMgr");
                    C59052c cVar = (C59052c) ((C59052c) b).mo56372aa(46674);
                    C16335ai aiVar2 = nVar.mo22747b().f48084i;
                    if (aiVar2 == null) {
                        aiVar2 = C16335ai.f48090k;
                    }
                    cVar.mo56389s("Repressed suggestion with testcodes: %s", aiVar2.f48097f);
                } else if (i < e2) {
                    e.mo55395g(nVar);
                    i++;
                }
            } else if (!axVar.mo56113h() && g.equals(C16090ap.SIDE_CARD)) {
                C58976aa aaVar = C58975e.f156826a;
                axVar = C58833ax.m90834k(nVar);
            }
        }
        e.mo55396h(axVar.mo56112g());
        return e.mo55394f();
    }
}
