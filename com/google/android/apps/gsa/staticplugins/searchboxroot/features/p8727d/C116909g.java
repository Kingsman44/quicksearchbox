package com.google.android.apps.gsa.staticplugins.searchboxroot.features.p8727d;

import android.util.Pair;
import android.util.SparseArray;
import com.google.android.apps.gsa.search.core.google.gaia.C86051l;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.search.core.p6507ag.p6509b.C84486a;
import com.google.android.apps.gsa.search.core.p6519al.p6666cq.C85171a;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.core.preferences.C86338r;
import com.google.android.apps.gsa.searchbox.client.gsa.p6951a.C88633f;
import com.google.android.apps.gsa.searchbox.client.gsa.p6951a.C88639l;
import com.google.android.apps.gsa.searchbox.client.gsa.p6951a.C88644q;
import com.google.android.apps.gsa.searchbox.p6944c.C88614r;
import com.google.android.apps.gsa.searchbox.p6944c.C88616t;
import com.google.android.apps.gsa.searchbox.p6944c.p6945a.C88543c;
import com.google.android.apps.gsa.searchbox.p6944c.p6946b.p6947a.C88562m;
import com.google.android.apps.gsa.searchbox.p6944c.p6946b.p6947a.C88567r;
import com.google.android.apps.gsa.shared.p6990an.C89208aa;
import com.google.android.apps.gsa.shared.p6990an.p6991a.C89196a;
import com.google.android.apps.gsa.shared.p6990an.p6991a.C89200e;
import com.google.android.apps.gsa.shared.p6990an.p6991a.C89201f;
import com.google.android.apps.gsa.shared.p6990an.p6991a.C89207l;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.util.p7159c.C90931ca;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.searchbox.root.C41626a;
import com.google.common.base.C58832aw;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58724pq;
import com.google.common.p4522b.C58800sl;
import com.google.p4017at.p4060h.p4073d.p4074a.C54229ar;
import com.google.protobuf.MessageLite;
import java.util.Observer;

/* renamed from: com.google.android.apps.gsa.staticplugins.searchboxroot.features.d.g */
/* compiled from: PG */
public final class C116909g implements C88567r, C89200e, C89196a, C89207l, C89201f {

    /* renamed from: e */
    public static final /* synthetic */ int f324584e = 0;

    /* renamed from: f */
    private static final C58528ij f324585f = C58528ij.m90012L(C89208aa.SUGGEST, C89208aa.OPA, C89208aa.ALL_APPS);

    /* renamed from: a */
    public final C86338r f324586a;

    /* renamed from: b */
    public String f324587b;

    /* renamed from: c */
    C86051l f324588c;

    /* renamed from: d */
    final SparseArray f324589d = new SparseArray();

    /* renamed from: g */
    private final C86054o f324590g;

    /* renamed from: h */
    private final C88633f f324591h;

    /* renamed from: i */
    private final C21370a f324592i;

    /* renamed from: j */
    private final C88644q f324593j;

    /* renamed from: k */
    private final C86124t f324594k;

    /* renamed from: l */
    private final C85171a f324595l;

    /* renamed from: m */
    private C88562m f324596m;

    /* renamed from: n */
    private C88543c f324597n;

    /* renamed from: o */
    private final Observer f324598o = new C116902e(this);

    /* renamed from: p */
    private final C84486a f324599p;

    public C116909g(C86054o oVar, C21370a aVar, C88633f fVar, C88644q qVar, C86124t tVar, C84486a aVar2, C85171a aVar3, C86338r rVar) {
        this.f324590g = oVar;
        this.f324592i = aVar;
        this.f324591h = fVar;
        this.f324593j = qVar;
        this.f324594k = tVar;
        this.f324599p = aVar2;
        this.f324595l = aVar3;
        this.f324586a = rVar;
    }

    /* renamed from: n */
    private final synchronized void m194246n(C89208aa aaVar) {
        if (f324585f.contains(aaVar)) {
            this.f324589d.remove(aaVar.f241837f);
        }
    }

    /* renamed from: o */
    private final synchronized void m194247o(C89208aa aaVar) {
        C88639l lVar = (C88639l) this.f324589d.get(aaVar.f241837f);
        if (lVar == null) {
            this.f324593j.mo82299e(aaVar, this.f324587b, (MessageLite) null, 0, 0);
            return;
        }
        this.f324593j.mo82299e(aaVar, this.f324587b, lVar.f239627a, lVar.f239628b, lVar.f239629c);
    }

    /* renamed from: a */
    public final void mo82249a() {
        C86051l lVar = this.f324588c;
        if (lVar != null) {
            this.f324590g.mo79681o(lVar);
            this.f324588c = null;
        }
    }

    /* renamed from: b */
    public final synchronized MessageLite mo82240b(C88616t tVar) {
        C88639l lVar = (C88639l) this.f324589d.get(this.f324593j.mo82298c(tVar).f241837f);
        if (lVar == null) {
            return null;
        }
        if (lVar.f239627a != null && !tVar.f239561f.getBoolean("bs:bootstrapping")) {
            if (lVar.f239628b != 0 && this.f324592i.mo26870b() >= lVar.f239628b) {
                this.f324597n.mo82181G((this.f324592i.mo26870b() - lVar.f239628b) / 1000);
            }
            if (lVar.f239629c != 0 && this.f324592i.mo26870b() >= lVar.f239629c) {
                this.f324597n.mo82179E((this.f324592i.mo26870b() - lVar.f239629c) / 1000);
            }
        }
        return lVar.f239627a;
    }

    /* renamed from: d */
    public final /* bridge */ /* synthetic */ void mo82185d(Object obj) {
        C88614r rVar = (C88614r) obj;
        this.f324596m = rVar.f239553x;
        this.f324597n = rVar.f239530a;
        if (this.f324588c == null) {
            C116905f fVar = new C116905f(this);
            this.f324588c = fVar;
            this.f324590g.mo79675i(fVar);
        }
    }

    /* renamed from: e */
    public final void mo78004e() {
        String F = this.f324590g.mo79659F();
        synchronized (this) {
            boolean z = !C58832aw.m90831a(this.f324587b, F);
            C88644q qVar = this.f324593j;
            C58485gu guVar = C88644q.f239637a;
            int i = ((C58724pq) guVar).f156474d;
            Pair pair = null;
            for (int i2 = 0; i2 < i; i2++) {
                C89208aa aaVar = (C89208aa) guVar.get(i2);
                Pair a = qVar.mo82297a(aaVar, C54229ar.f142352d);
                if (a != null) {
                    if (pair == null) {
                        SparseArray sparseArray = new SparseArray();
                        sparseArray.put(aaVar.f241837f, (C88639l) a.second);
                        pair = new Pair((String) a.first, sparseArray);
                    } else if (((String) a.first).equals(pair.first)) {
                        ((SparseArray) pair.second).put(aaVar.f241837f, (C88639l) a.second);
                    }
                }
            }
            if (pair != null) {
                boolean a2 = C58832aw.m90831a(F, pair.first);
                boolean z2 = false;
                for (int i3 = 0; i3 < ((SparseArray) pair.second).size(); i3++) {
                    int keyAt = ((SparseArray) pair.second).keyAt(i3);
                    C88639l lVar = (C88639l) ((SparseArray) pair.second).valueAt(i3);
                    C41626a l = mo103051l(lVar);
                    if (l != null) {
                        z2 = !l.f108840e.f142366f;
                    }
                    if (!a2 || !z2) {
                        if (z || F == null) {
                            m194246n(C89208aa.m145112a(keyAt));
                        }
                    } else if (lVar.f239627a != null) {
                        this.f324589d.put(keyAt, lVar);
                    }
                }
            } else if (z || F == null) {
                mo82241j();
            }
            this.f324587b = F;
        }
    }

    /* renamed from: f */
    public final /* synthetic */ void mo82222f(C90931ca caVar) {
    }

    /* renamed from: g */
    public final /* synthetic */ void mo82223g(C22871g gVar) {
    }

    /* renamed from: h */
    public final void mo82224h() {
        this.f324591h.addObserver(this.f324598o);
    }

    /* renamed from: hF */
    public final /* synthetic */ void mo82225hF(C22871g gVar) {
    }

    /* renamed from: hG */
    public final /* synthetic */ void mo82226hG(C22871g gVar) {
    }

    /* renamed from: i */
    public final void mo82227i() {
        this.f324591h.deleteObserver(this.f324598o);
    }

    /* renamed from: j */
    public final synchronized void mo82241j() {
        C58800sl lA = f324585f.iterator();
        while (lA.hasNext()) {
            mo103052m((C89208aa) lA.next());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0086, code lost:
        return;
     */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo82242k(com.google.android.apps.gsa.searchbox.p6944c.C88616t r10, com.google.protobuf.MessageLite r11, com.google.android.libraries.searchbox.root.C41626a r12) {
        /*
            r9 = this;
            monitor-enter(r9)
            com.google.android.apps.gsa.searchbox.client.gsa.a.q r0 = r9.f324593j     // Catch:{ all -> 0x008b }
            com.google.android.apps.gsa.shared.an.aa r0 = r0.mo82298c(r10)     // Catch:{ all -> 0x008b }
            com.google.common.b.ij r1 = f324585f     // Catch:{ all -> 0x008b }
            boolean r1 = r1.contains(r0)     // Catch:{ all -> 0x008b }
            if (r1 == 0) goto L_0x0087
            boolean r1 = r12.f108838c     // Catch:{ all -> 0x008b }
            if (r1 == 0) goto L_0x0087
            com.google.at.h.d.a.at r12 = r12.f108840e     // Catch:{ all -> 0x008b }
            boolean r12 = r12.f142366f     // Catch:{ all -> 0x008b }
            if (r12 != 0) goto L_0x0087
            android.util.SparseArray r12 = r9.f324589d     // Catch:{ all -> 0x008b }
            int r1 = r0.f241837f     // Catch:{ all -> 0x008b }
            com.google.android.apps.gsa.searchbox.client.gsa.a.l r8 = new com.google.android.apps.gsa.searchbox.client.gsa.a.l     // Catch:{ all -> 0x008b }
            com.google.android.libraries.f.a r2 = r9.f324592i     // Catch:{ all -> 0x008b }
            long r4 = r2.mo26870b()     // Catch:{ all -> 0x008b }
            r6 = 0
            r2 = r8
            r3 = r11
            r2.<init>(r3, r4, r6)     // Catch:{ all -> 0x008b }
            r12.put(r1, r8)     // Catch:{ all -> 0x008b }
            r9.m194247o(r0)     // Catch:{ all -> 0x008b }
            com.google.android.apps.gsa.shared.an.aa r12 = com.google.android.apps.gsa.shared.p6990an.C89208aa.SUGGEST     // Catch:{ all -> 0x008b }
            if (r0 != r12) goto L_0x0061
            com.google.android.apps.gsa.search.core.i.t r12 = r9.f324594k     // Catch:{ all -> 0x008b }
            com.google.android.apps.gsa.shared.m.d r1 = com.google.android.apps.gsa.shared.p7066m.C90085ej.f250103G     // Catch:{ all -> 0x008b }
            boolean r12 = r12.mo79746e(r1)     // Catch:{ all -> 0x008b }
            if (r12 != 0) goto L_0x0048
            com.google.android.apps.gsa.search.core.ag.b.a r12 = r9.f324599p     // Catch:{ all -> 0x008b }
            boolean r12 = r12.mo78205l()     // Catch:{ all -> 0x008b }
            if (r12 == 0) goto L_0x0061
        L_0x0048:
            com.google.android.apps.gsa.search.core.i.t r12 = r9.f324594k     // Catch:{ all -> 0x008b }
            com.google.android.apps.gsa.shared.m.d r1 = com.google.android.apps.gsa.shared.p7066m.C90085ej.f250222bx     // Catch:{ all -> 0x008b }
            boolean r12 = r12.mo79746e(r1)     // Catch:{ all -> 0x008b }
            if (r12 == 0) goto L_0x005c
            android.os.Bundle r10 = r10.f239561f     // Catch:{ all -> 0x008b }
            java.lang.String r12 = "cs::force_fetching"
            boolean r10 = r10.getBoolean(r12)     // Catch:{ all -> 0x008b }
            if (r10 != 0) goto L_0x0061
        L_0x005c:
            com.google.android.apps.gsa.search.core.al.cq.a r10 = r9.f324595l     // Catch:{ all -> 0x008b }
            r10.mo78773n()     // Catch:{ all -> 0x008b }
        L_0x0061:
            com.google.android.apps.gsa.search.core.i.t r10 = r9.f324594k     // Catch:{ all -> 0x008b }
            com.google.android.apps.gsa.shared.m.d r12 = com.google.android.apps.gsa.shared.p7066m.C89972ak.f246528C     // Catch:{ all -> 0x008b }
            boolean r10 = r10.mo79746e(r12)     // Catch:{ all -> 0x008b }
            if (r10 == 0) goto L_0x0085
            com.google.android.apps.gsa.shared.an.aa r10 = com.google.android.apps.gsa.shared.p6990an.C89208aa.SUGGEST     // Catch:{ all -> 0x008b }
            if (r0 != r10) goto L_0x0085
            r10 = r11
            com.google.at.h.d.a.ar r10 = (com.google.p4017at.p4060h.p4073d.p4074a.C54229ar) r10     // Catch:{ all -> 0x008b }
            com.google.protobuf.cq r10 = r10.f142355b     // Catch:{ all -> 0x008b }
            boolean r10 = r10.isEmpty()     // Catch:{ all -> 0x008b }
            if (r10 != 0) goto L_0x0085
            com.google.android.apps.gsa.search.core.al.cq.a r10 = r9.f324595l     // Catch:{ all -> 0x008b }
            com.google.at.h.d.a.ar r11 = (com.google.p4017at.p4060h.p4073d.p4074a.C54229ar) r11     // Catch:{ all -> 0x008b }
            com.google.protobuf.cq r11 = r11.f142355b     // Catch:{ all -> 0x008b }
            r10.mo78777s(r11)     // Catch:{ all -> 0x008b }
            monitor-exit(r9)
            return
        L_0x0085:
            monitor-exit(r9)
            return
        L_0x0087:
            com.google.common.f.aa r10 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x008b }
            monitor-exit(r9)
            return
        L_0x008b:
            r10 = move-exception
            monitor-exit(r9)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.searchboxroot.features.p8727d.C116909g.mo82242k(com.google.android.apps.gsa.searchbox.c.t, com.google.protobuf.MessageLite, com.google.android.libraries.searchbox.root.a):void");
    }

    /* renamed from: l */
    public final C41626a mo103051l(C88639l lVar) {
        MessageLite messageLite = lVar.f239627a;
        if (!(messageLite instanceof C54229ar)) {
            return null;
        }
        new C88616t(Query.f252741b.mo84242E(), 1, "web", (Query) null, this.f324592i);
        return this.f324596m.mo82232a((C54229ar) messageLite, true);
    }

    /* renamed from: m */
    public final synchronized void mo103052m(C89208aa aaVar) {
        m194246n(aaVar);
        m194247o(aaVar);
    }
}
