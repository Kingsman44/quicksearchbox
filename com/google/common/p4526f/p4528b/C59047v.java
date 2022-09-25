package com.google.common.p4526f.p4528b;

import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4534f.C59081b;
import java.util.Iterator;
import java.util.Set;

/* renamed from: com.google.common.f.b.v */
/* compiled from: PG */
public final class C59047v {

    /* renamed from: a */
    private static final C59043r f156968a = new C59045t();

    /* renamed from: b */
    private static final C59042q f156969b = new C59046u();

    /* renamed from: a */
    public static C59040o m91309a(Set set) {
        C59040o oVar = new C59040o(f156968a);
        oVar.f156964f = f156969b;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            C58976aa aaVar = (C58976aa) it.next();
            C59081b.m91349a(aaVar, "key");
            if (aaVar.f156829c) {
                C59042q qVar = C59040o.f156960b;
                C59081b.m91349a(aaVar, "key");
                C59081b.m91350b(aaVar.f156829c, "key must be repeating");
                oVar.f156961c.remove(aaVar);
                oVar.f156962d.put(aaVar, qVar);
            } else {
                C59043r rVar = C59040o.f156959a;
                C59081b.m91349a(aaVar, "key");
                oVar.f156962d.remove(aaVar);
                oVar.f156961c.put(aaVar, rVar);
            }
        }
        return oVar;
    }
}
