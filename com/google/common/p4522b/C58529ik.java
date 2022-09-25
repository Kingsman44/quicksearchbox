package com.google.common.p4522b;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.common.b.ik */
/* compiled from: PG */
public final class C58529ik extends C58506ho {
    /* renamed from: a */
    public final C58532in mo55493a() {
        Set<Map.Entry> entrySet = this.f156147a.entrySet();
        if (entrySet.isEmpty()) {
            return C58423em.f156034a;
        }
        C58490gz gzVar = new C58490gz(entrySet.size());
        int i = 0;
        for (Map.Entry entry : entrySet) {
            Object key = entry.getKey();
            C58528ij F = C58528ij.m90006F((Collection) entry.getValue());
            if (!F.isEmpty()) {
                gzVar.mo55429h(key, F);
                i += F.size();
            }
        }
        return new C58532in(gzVar.mo55427f(true), i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo55494b(C58506ho hoVar) {
        super.mo55455i(hoVar);
    }

    /* renamed from: c */
    public final void mo55495c(Object obj, Object obj2) {
        super.mo55456j(obj, obj2);
    }

    /* renamed from: d */
    public final void mo55496d(C58671nr nrVar) {
        for (Map.Entry entry : nrVar.mo54950C().entrySet()) {
            super.mo55458l(entry.getKey(), (Iterable) entry.getValue());
        }
    }

    /* renamed from: e */
    public final void mo55497e(Object obj, Iterable iterable) {
        super.mo55458l(obj, iterable);
    }

    /* renamed from: h */
    public final Collection mo55454h() {
        return new C58386dc();
    }
}
