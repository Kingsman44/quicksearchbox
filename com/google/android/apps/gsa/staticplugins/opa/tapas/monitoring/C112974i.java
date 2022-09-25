package com.google.android.apps.gsa.staticplugins.opa.tapas.monitoring;

import com.google.common.p4543n.p4550f.C59430c;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.monitoring.i */
/* compiled from: PG */
final class C112974i {

    /* renamed from: a */
    final List f313059a = new ArrayList(50);

    /* renamed from: b */
    final List f313060b = new ArrayList(50);

    /* renamed from: b */
    private final synchronized C59430c m186966b(C112978m mVar) {
        for (C112977l lVar : this.f313059a) {
            if (lVar.f313081a == mVar.f313083a) {
                return lVar.f313082b;
            }
        }
        C112977l lVar2 = new C112977l(mVar.f313083a);
        this.f313059a.add(lVar2);
        return lVar2.f313082b;
    }

    /* renamed from: c */
    private final synchronized C59430c m186967c(C112981p pVar) {
        for (C112980o oVar : this.f313060b) {
            if (oVar.f313093a == pVar.f313096a && oVar.f313094b == pVar.f313097b) {
                return oVar.f313095c;
            }
        }
        C112980o oVar2 = new C112980o(pVar.f313096a, pVar.f313097b);
        this.f313060b.add(oVar2);
        return oVar2.f313095c;
    }

    /* renamed from: d */
    private final synchronized void m186968d(C112978m mVar) {
        m186966b(mVar).mo56938c(C112982q.m186971a(mVar.f313084b));
    }

    /* renamed from: e */
    private final synchronized void m186969e(C112981p pVar) {
        m186967c(pVar).mo56938c(C112982q.m186971a(pVar.f313098c));
    }

    /* renamed from: a */
    public final synchronized void mo99800a(C112973h hVar) {
        synchronized (hVar) {
            for (C112978m d : hVar.f313056c) {
                m186968d(d);
            }
            for (C112981p e : hVar.f313057d) {
                m186969e(e);
            }
        }
    }
}
