package com.google.p4449cd.p4452c;

import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58597ky;
import com.google.p4449cd.p4453d.C57958d;
import java.util.ArrayList;
import java.util.IdentityHashMap;
import java.util.Iterator;

/* renamed from: com.google.cd.c.j */
/* compiled from: PG */
public final class C57950j implements C57949i {

    /* renamed from: a */
    public final long f154974a;

    /* renamed from: b */
    public final C58833ax f154975b;

    /* renamed from: c */
    private final Object f154976c = new Object();

    /* renamed from: d */
    private C57942b f154977d;

    /* renamed from: e */
    private volatile C58485gu f154978e;

    public C57950j(long j, C58833ax axVar, C57942b bVar) {
        this.f154974a = j;
        this.f154975b = axVar;
        this.f154977d = bVar;
    }

    /* renamed from: a */
    public final C58485gu mo20640a() {
        C57952l lVar;
        C58485gu guVar = this.f154978e;
        if (guVar == null) {
            synchronized (this.f154976c) {
                guVar = this.f154978e;
                if (guVar == null) {
                    C58485gu<C57948h> a = C57942b.m88595a(this.f154977d);
                    IdentityHashMap identityHashMap = new IdentityHashMap(a.size() / 3);
                    for (C57948h hVar : a) {
                        C57958d dVar = hVar.f154973e;
                        if (identityHashMap.containsKey(dVar)) {
                            lVar = (C57952l) identityHashMap.get(dVar);
                        } else {
                            C57952l lVar2 = new C57952l(dVar);
                            identityHashMap.put(dVar, lVar2);
                            lVar = lVar2;
                        }
                        hVar.mo54556a(lVar);
                        Long l = hVar.f154970b;
                        if (l != null) {
                            lVar.f154984b = C58833ax.m90834k(Long.valueOf(l.longValue()));
                        }
                        lVar.f154985c = C58833ax.m90834k(Long.valueOf(hVar.f154971c.longValue()));
                        Long l2 = hVar.f154972d;
                        if (l2 != null) {
                            lVar.f154986d = C58833ax.m90834k(Long.valueOf(l2.longValue()));
                        }
                    }
                    ArrayList e = C58597ky.m90214e(identityHashMap.size());
                    Iterator it = identityHashMap.values().iterator();
                    while (it.hasNext()) {
                        C57952l lVar3 = (C57952l) it.next();
                        Iterator it2 = it;
                        C57941a aVar = r5;
                        C57941a aVar2 = new C57941a(lVar3.f154983a, lVar3.f154984b, lVar3.f154985c, lVar3.f154986d, lVar3.f154987e, lVar3.f154988f, lVar3.f154989g, lVar3.f154990h, lVar3.f154991i, lVar3.f154992j);
                        e.add(aVar);
                        it = it2;
                    }
                    guVar = C58485gu.m89842j(e);
                    this.f154978e = guVar;
                    this.f154977d = null;
                }
            }
        }
        return guVar;
    }
}
