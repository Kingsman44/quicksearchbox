package com.google.android.apps.gsa.p8885y.p8886a;

import com.google.android.apps.gsa.p8852u.C118569b;
import com.google.android.apps.gsa.p8852u.C118575h;
import com.google.android.apps.gsa.p8885y.C118827a;
import com.google.android.apps.gsa.search.core.p6494aa.C84388b;
import com.google.android.apps.gsa.search.core.p6494aa.C84392c;
import com.google.android.apps.gsa.shared.util.p7178p.C91071a;
import com.google.android.apps.gsa.shared.util.p7178p.C91072b;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4552o.C59794fv;
import dagger.C68214a;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p3186j$.util.DesugarCollections;

/* renamed from: com.google.android.apps.gsa.y.a.a */
/* compiled from: PG */
public final class C118828a implements C118827a, C91072b {

    /* renamed from: a */
    private final C68214a f331426a;

    /* renamed from: b */
    private final C21370a f331427b;

    /* renamed from: c */
    private final Map f331428c = DesugarCollections.synchronizedMap(new HashMap());

    /* renamed from: d */
    private final Deque f331429d = new ArrayDeque();

    /* renamed from: e */
    private long f331430e;

    /* renamed from: f */
    private final C118831d f331431f;

    public C118828a(C68214a aVar, C21370a aVar2, C91071a aVar3) {
        this.f331426a = aVar;
        this.f331427b = aVar2;
        this.f331430e = aVar2.mo26871c();
        if (aVar3 != null) {
            aVar3.mo85337a(this);
        }
        this.f331431f = mo77945h(C118569b.TELEMETRY_OVER_EVENT_LIMIT_COUNT, C118575h.TELEMETRY, C118575h.TELEMETRY);
    }

    /* renamed from: a */
    public final C84392c mo77938a() {
        C84388b bVar = (C84388b) C84392c.f229649e.createBuilder();
        synchronized (this.f331428c) {
            for (C118831d d : this.f331428c.values()) {
                C59794fv d2 = d.mo104022d();
                if (d2.f161579h > 0) {
                    bVar.copyOnWrite();
                    C84392c cVar = (C84392c) bVar.instance;
                    d2.getClass();
                    cVar.mo77952a();
                    cVar.f229652b.add(d2);
                }
            }
        }
        long j = this.f331430e;
        bVar.copyOnWrite();
        C84392c cVar2 = (C84392c) bVar.instance;
        cVar2.f229651a |= 1;
        cVar2.f229653c = j;
        int intValue = ((Integer) this.f331426a.mo27525b()).intValue();
        bVar.copyOnWrite();
        C84392c cVar3 = (C84392c) bVar.instance;
        cVar3.f229651a |= 2;
        cVar3.f229654d = intValue;
        this.f331430e = this.f331427b.mo26871c();
        return (C84392c) bVar.build();
    }

    /* renamed from: b */
    public final List mo77939b() {
        ArrayList arrayList = new ArrayList(this.f331428c.size());
        synchronized (this.f331428c) {
            for (C118831d c : this.f331428c.values()) {
                C59794fv c2 = c.mo104021c();
                if (c2.f161579h > 0) {
                    arrayList.add(c2);
                }
            }
        }
        return arrayList;
    }

    /* renamed from: c */
    public final synchronized C58485gu mo104014c(long j) {
        Iterator it = this.f331429d.iterator();
        boolean z = false;
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            i++;
            if (((Long) it.next()).longValue() == j) {
                z = true;
                break;
            }
        }
        if (z) {
            C58480gp e = C58485gu.m89837e();
            synchronized (this.f331428c) {
                for (C118831d b : this.f331428c.values()) {
                    C59794fv b2 = b.mo104020b(i);
                    if (b2 != null && b2.f161579h > 0) {
                        e.mo55395g(b2);
                    }
                }
            }
            return e.mo55394f();
        }
        return C58485gu.m89845m();
    }

    /* renamed from: d */
    public final synchronized void mo104015d(long j) {
        this.f331429d.addFirst(Long.valueOf(j));
        if (this.f331429d.size() * this.f331428c.size() > 3400) {
            this.f331431f.mo104025g(1);
            if (!this.f331429d.isEmpty()) {
                this.f331429d.removeLast();
                int size = this.f331429d.size();
                synchronized (this.f331428c) {
                    for (C118831d f : this.f331428c.values()) {
                        f.mo104024f(size);
                    }
                }
            }
        }
        synchronized (this.f331428c) {
            for (C118831d dVar : this.f331428c.values()) {
                dVar.f331439a.incrementAndGet();
            }
        }
    }

    /* renamed from: f */
    public final synchronized void mo76735f() {
        this.f331429d.clear();
        synchronized (this.f331428c) {
            for (C118831d e : this.f331428c.values()) {
                e.mo104023e();
            }
        }
    }

    /* renamed from: g */
    public final synchronized C118831d mo77944g(C118569b bVar, C118575h hVar) {
        return mo77945h(bVar, hVar, hVar);
    }

    /* renamed from: h */
    public final synchronized C118831d mo77945h(C118569b bVar, C118575h hVar, C118575h hVar2) {
        return mo77946i(bVar, hVar, hVar2, 0);
    }

    /* renamed from: i */
    public final synchronized C118831d mo77946i(C118569b bVar, C118575h hVar, C118575h hVar2, int i) {
        C118830c cVar = new C118830c(bVar, hVar, hVar2, i);
        if (this.f331428c.containsKey(cVar)) {
            return (C118831d) this.f331428c.get(cVar);
        }
        C118831d dVar = new C118831d(this.f331427b, cVar);
        this.f331428c.put(cVar, dVar);
        return dVar;
    }
}
