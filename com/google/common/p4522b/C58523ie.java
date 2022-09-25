package com.google.common.p4522b;

import com.google.common.base.C58838bb;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.common.b.ie */
/* compiled from: PG */
public final class C58523ie {

    /* renamed from: a */
    public final List f156170a = new ArrayList();

    /* renamed from: a */
    public final C58525ig mo55481a() {
        C58569jx jxVar;
        C58406dw dwVar;
        C58406dw dwVar2;
        C58480gp gpVar = new C58480gp(this.f156170a.size());
        Collections.sort(this.f156170a, C58714pg.m90501d());
        Iterator it = this.f156170a.iterator();
        if (it instanceof C58569jx) {
            jxVar = (C58569jx) it;
        } else {
            jxVar = new C58569jx(it);
        }
        while (jxVar.hasNext()) {
            C58714pg pgVar = (C58714pg) jxVar.next();
            while (jxVar.hasNext()) {
                if (!jxVar.f156240b) {
                    jxVar.f156241c = jxVar.f156239a.next();
                    jxVar.f156240b = true;
                }
                C58714pg pgVar2 = (C58714pg) jxVar.f156241c;
                if (!pgVar.mo55823n(pgVar2)) {
                    break;
                }
                C58838bb.m90879n(pgVar.mo55819i(pgVar2).mo55824o(), "Overlapping ranges not permitted but found %s overlapping %s", pgVar, pgVar2);
                C58714pg pgVar3 = (C58714pg) jxVar.next();
                int a = pgVar.f156456b.compareTo(pgVar3.f156456b);
                int a2 = pgVar.f156457c.compareTo(pgVar3.f156457c);
                if (a > 0 || a2 < 0) {
                    if (a < 0 || a2 > 0) {
                        if (a <= 0) {
                            dwVar = pgVar.f156456b;
                        } else {
                            dwVar = pgVar3.f156456b;
                        }
                        if (a2 >= 0) {
                            dwVar2 = pgVar.f156457c;
                        } else {
                            dwVar2 = pgVar3.f156457c;
                        }
                        pgVar3 = new C58714pg(dwVar, dwVar2);
                    }
                    pgVar = pgVar3;
                }
            }
            gpVar.mo55395g(pgVar);
        }
        C58485gu f = gpVar.mo55394f();
        if (f.isEmpty()) {
            return C58525ig.f156172a;
        }
        if (((C58724pq) f).f156474d != 1 || !((C58714pg) C58557jl.m90133n(f)).equals(C58714pg.f156455a)) {
            return new C58525ig(f);
        }
        return C58525ig.f156173b;
    }

    /* renamed from: b */
    public final void mo55482b(C58714pg pgVar) {
        C58838bb.m90873h(!pgVar.mo55824o(), "range must not be empty, but was %s", pgVar);
        this.f156170a.add(pgVar);
    }
}
