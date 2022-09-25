package com.google.android.apps.gsa.staticplugins.opa.p8315az;

import com.google.android.apps.gsa.search.shared.service.C87673aa;
import com.google.android.apps.gsa.search.shared.service.C87682aj;
import com.google.android.apps.gsa.search.shared.service.ClientEventData;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88244um;
import com.google.android.apps.gsa.staticplugins.opa.p8189ak.p8192b.C106204a;
import com.google.android.apps.gsa.staticplugins.opa.p8189ak.p8192b.C106221b;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58800sl;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import dagger.C68214a;
import java.util.EnumMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.az.p */
/* compiled from: PG */
public final class C107705p implements C107707r {

    /* renamed from: a */
    public final C68214a f299712a;

    /* renamed from: b */
    public C107706q f299713b = C107706q.DEFAULT;

    /* renamed from: c */
    private final C107708s f299714c;

    /* renamed from: d */
    private final EnumMap f299715d = new EnumMap(C88244um.class);

    /* renamed from: e */
    private final C106221b f299716e;

    public C107705p(C68214a aVar, C106221b bVar, C107708s sVar) {
        this.f299712a = aVar;
        this.f299716e = bVar;
        this.f299714c = sVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0094, code lost:
        if (r2 == com.google.android.apps.gsa.staticplugins.opa.p8315az.C107706q.f299717a) goto L_0x008e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00a6, code lost:
        if (r2 == com.google.android.apps.gsa.staticplugins.opa.p8315az.C107706q.f299717a) goto L_0x00a0;
     */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m178801l(com.google.android.apps.gsa.staticplugins.opa.p8315az.C107706q r10) {
        /*
            r9 = this;
            r9.f299713b = r10
            dagger.a r10 = r9.f299712a
            java.lang.Object r10 = r10.mo27525b()
            com.google.android.apps.gsa.staticplugins.opa.az.n r10 = (com.google.android.apps.gsa.staticplugins.opa.p8315az.C107703n) r10
            com.google.android.apps.gsa.staticplugins.opa.az.s r0 = r9.f299714c
            com.google.common.f.aa r1 = com.google.common.p4526f.p4527a.C58975e.f156826a
            com.google.android.apps.gsa.staticplugins.opa.az.q r1 = r9.f299713b
            com.google.android.apps.gsa.staticplugins.opa.az.q r2 = com.google.android.apps.gsa.staticplugins.opa.p8315az.C107706q.DEFAULT
            if (r1 != r2) goto L_0x001a
            java.util.Set r1 = r10.f299700e
            r1.remove(r9)
            goto L_0x0052
        L_0x001a:
            java.util.Set r1 = r10.f299700e
            r1.add(r9)
            com.google.android.apps.gsa.staticplugins.opa.az.s r1 = com.google.android.apps.gsa.staticplugins.opa.p8315az.C107708s.OPA_ACTIVITY_SEARCH_SERVICE_CLIENT_USER
            if (r0 != r1) goto L_0x0052
            com.google.android.apps.gsa.staticplugins.opa.az.q r1 = r9.f299713b
            com.google.android.apps.gsa.staticplugins.opa.az.q r2 = com.google.android.apps.gsa.staticplugins.opa.p8315az.C107706q.STARTED
            if (r1 != r2) goto L_0x0052
            j$.util.Optional r1 = r10.f299705j
            boolean r1 = r1.isPresent()
            if (r1 == 0) goto L_0x0052
            j$.util.Optional r1 = r10.f299705j     // Catch:{ Exception -> 0x003d }
            java.lang.Object r1 = r1.get()     // Catch:{ Exception -> 0x003d }
            java.util.concurrent.Callable r1 = (java.util.concurrent.Callable) r1     // Catch:{ Exception -> 0x003d }
            r1.call()     // Catch:{ Exception -> 0x003d }
            goto L_0x0052
        L_0x003d:
            r1 = move-exception
            com.google.common.f.e r2 = com.google.android.apps.gsa.staticplugins.opa.p8315az.C107703n.f299696a
            com.google.common.f.x r2 = r2.mo56225c()
            com.google.common.f.aa r3 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r4 = "OSSClientManager"
            r2.mo56378ag(r3, r4)
            java.lang.String r3 = "callbackOnOpaActivitySearchServiceClientUserStart"
            r4 = 26074(0x65da, float:3.6537E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r2).mo56382g(r1)).mo56372aa(r4)).mo56386p(r3)
        L_0x0052:
            boolean r1 = r10.f299701f
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L_0x00bd
            com.google.android.apps.gsa.staticplugins.opa.az.q r1 = r10.mo96223b()
            com.google.android.apps.gsa.staticplugins.opa.az.q r4 = r10.f299707l
            if (r4 != r1) goto L_0x0062
            goto L_0x00fc
        L_0x0062:
            com.google.android.apps.gsa.staticplugins.opa.ak.b.b r4 = r10.f299703h
            com.google.android.apps.gsa.staticplugins.opa.ak.b.a r5 = com.google.android.apps.gsa.staticplugins.opa.p8189ak.p8192b.C106204a.UPDATE
            j$.util.Optional r6 = p3186j$.util.Optional.m71637of(r1)
            j$.util.Optional r7 = p3186j$.util.Optional.empty()
            r8 = 0
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r8)
            j$.util.Optional r8 = p3186j$.util.Optional.m71637of(r8)
            r4.mo95449g(r5, r6, r7, r8)
            int r4 = r1.ordinal()
            if (r4 == 0) goto L_0x00a9
            if (r4 == r3) goto L_0x0097
            if (r4 == r2) goto L_0x0085
            goto L_0x00ba
        L_0x0085:
            com.google.android.apps.gsa.staticplugins.opa.az.q r2 = r10.f299707l
            com.google.android.apps.gsa.staticplugins.opa.az.q r3 = com.google.android.apps.gsa.staticplugins.opa.p8315az.C107706q.STARTED
            if (r2 != r3) goto L_0x0092
            r10.mo96227f()
        L_0x008e:
            r10.mo96225d()
            goto L_0x00ba
        L_0x0092:
            com.google.android.apps.gsa.staticplugins.opa.az.q r3 = com.google.android.apps.gsa.staticplugins.opa.p8315az.C107706q.CONNECTED
            if (r2 != r3) goto L_0x00ba
            goto L_0x008e
        L_0x0097:
            com.google.android.apps.gsa.staticplugins.opa.az.q r2 = r10.f299707l
            com.google.android.apps.gsa.staticplugins.opa.az.q r3 = com.google.android.apps.gsa.staticplugins.opa.p8315az.C107706q.DEFAULT
            if (r2 != r3) goto L_0x00a4
            r10.mo96224c()
        L_0x00a0:
            r10.mo96226e()
            goto L_0x00ba
        L_0x00a4:
            com.google.android.apps.gsa.staticplugins.opa.az.q r3 = com.google.android.apps.gsa.staticplugins.opa.p8315az.C107706q.CONNECTED
            if (r2 != r3) goto L_0x00ba
            goto L_0x00a0
        L_0x00a9:
            com.google.android.apps.gsa.staticplugins.opa.az.q r2 = r10.f299707l
            com.google.android.apps.gsa.staticplugins.opa.az.q r3 = com.google.android.apps.gsa.staticplugins.opa.p8315az.C107706q.DEFAULT
            if (r2 != r3) goto L_0x00b3
            r10.mo96224c()
            goto L_0x00ba
        L_0x00b3:
            com.google.android.apps.gsa.staticplugins.opa.az.q r3 = com.google.android.apps.gsa.staticplugins.opa.p8315az.C107706q.STARTED
            if (r2 != r3) goto L_0x00ba
            r10.mo96227f()
        L_0x00ba:
            r10.f299707l = r1
            goto L_0x00fc
        L_0x00bd:
            com.google.android.apps.gsa.staticplugins.opa.az.q r1 = r10.mo96223b()
            com.google.android.apps.gsa.staticplugins.opa.ak.b.b r4 = r10.f299703h
            com.google.android.apps.gsa.staticplugins.opa.ak.b.a r5 = com.google.android.apps.gsa.staticplugins.opa.p8189ak.p8192b.C106204a.UPDATE
            j$.util.Optional r6 = p3186j$.util.Optional.m71637of(r1)
            j$.util.Optional r7 = p3186j$.util.Optional.empty()
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r3)
            j$.util.Optional r8 = p3186j$.util.Optional.m71637of(r8)
            r4.mo95449g(r5, r6, r7, r8)
            int r1 = r1.ordinal()
            if (r1 == 0) goto L_0x00f1
            if (r1 == r3) goto L_0x00ea
            if (r1 == r2) goto L_0x00e3
            goto L_0x00fc
        L_0x00e3:
            r10.mo96227f()
            r10.mo96225d()
            goto L_0x00fc
        L_0x00ea:
            r10.mo96224c()
            r10.mo96226e()
            goto L_0x00fc
        L_0x00f1:
            com.google.android.apps.gsa.search.shared.service.aa r1 = r10.f299706k
            if (r1 != 0) goto L_0x00f9
            r10.mo96224c()
            goto L_0x00fc
        L_0x00f9:
            r10.mo96227f()
        L_0x00fc:
            com.google.android.apps.gsa.staticplugins.opa.az.q r1 = r9.f299713b
            com.google.android.apps.gsa.staticplugins.opa.az.q r2 = com.google.android.apps.gsa.staticplugins.opa.p8315az.C107706q.DEFAULT
            if (r1 != r2) goto L_0x010d
            com.google.android.apps.gsa.staticplugins.opa.az.s r1 = com.google.android.apps.gsa.staticplugins.opa.p8315az.C107708s.OPA_ACTIVITY_SEARCH_SERVICE_CLIENT_USER
            if (r0 != r1) goto L_0x010d
            com.google.android.apps.gsa.staticplugins.opa.v.x r10 = r10.f299699d
            com.google.android.apps.gsa.staticplugins.opa.v.w r0 = com.google.android.apps.gsa.staticplugins.opa.p8595v.C113919w.OPA_SSC_USER_DISCONNECT
            r10.mo100773b(r0)
        L_0x010d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.opa.p8315az.C107705p.m178801l(com.google.android.apps.gsa.staticplugins.opa.az.q):void");
    }

    /* renamed from: a */
    public final C107706q mo96228a() {
        return this.f299713b;
    }

    /* renamed from: b */
    public final C107708s mo96229b() {
        return this.f299714c;
    }

    /* renamed from: c */
    public final void mo96230c() {
        C58976aa aaVar = C58975e.f156826a;
        this.f299716e.mo95450h(C106204a.CONNECT, this.f299714c, this.f299713b);
        if (this.f299713b != C107706q.STARTED) {
            m178801l(C107706q.CONNECTED);
        }
    }

    /* renamed from: d */
    public final void mo96231d() {
        C58976aa aaVar = C58975e.f156826a;
        this.f299716e.mo95450h(C106204a.DISCONNECT, this.f299714c, this.f299713b);
        if (this.f299713b != C107706q.DEFAULT) {
            for (Map.Entry entry : this.f299715d.entrySet()) {
                C88244um umVar = (C88244um) entry.getKey();
                C58800sl lA = ((C58528ij) entry.getValue()).iterator();
                while (lA.hasNext()) {
                    mo96234g((C87682aj) lA.next(), umVar);
                }
            }
            m178801l(C107706q.DEFAULT);
        }
    }

    /* renamed from: e */
    public final void mo96232e(ClientEventData clientEventData) {
        C58976aa aaVar = C58975e.f156826a;
        C87673aa aaVar2 = ((C107703n) this.f299712a.mo27525b()).f299706k;
        if (aaVar2 == null) {
            C59104x c = C107703n.f299696a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "OSSClientManager");
            ((C59052c) ((C59052c) c).mo56372aa(26066)).mo56386p("sendGenericClientEvent, Search Service Client is not connected");
            return;
        }
        aaVar2.mo81937i(clientEventData);
    }

    /* renamed from: f */
    public final void mo96233f(C87682aj ajVar, C88244um... umVarArr) {
        for (C88244um umVar : umVarArr) {
            Set set = (Set) this.f299715d.get(umVar);
            if (set != null) {
                HashSet hashSet = new HashSet(set);
                hashSet.add(ajVar);
                this.f299715d.put(umVar, C58528ij.m90006F(hashSet));
            } else {
                HashSet hashSet2 = new HashSet();
                hashSet2.add(ajVar);
                this.f299715d.put(umVar, C58528ij.m90006F(hashSet2));
            }
        }
        C58976aa aaVar = C58975e.f156826a;
        C87673aa aaVar2 = ((C107703n) this.f299712a.mo27525b()).f299706k;
        if (aaVar2 == null) {
            C59104x c = C107703n.f299696a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "OSSClientManager");
            ((C59052c) ((C59052c) c).mo56372aa(26063)).mo56386p("registerServiceEventCallback, Search Service Client is not connected");
            return;
        }
        aaVar2.mo81940l(ajVar, umVarArr);
    }

    /* renamed from: g */
    public final void mo96234g(C87682aj ajVar, C88244um... umVarArr) {
        for (C88244um umVar : umVarArr) {
            Set set = (Set) this.f299715d.get(umVar);
            if (set != null) {
                HashSet hashSet = new HashSet(set);
                hashSet.remove(ajVar);
                this.f299715d.put(umVar, C58528ij.m90006F(hashSet));
                if (hashSet.isEmpty()) {
                    this.f299715d.remove(umVar);
                }
            }
        }
        C58976aa aaVar = C58975e.f156826a;
        C87673aa aaVar2 = ((C107703n) this.f299712a.mo27525b()).f299706k;
        if (aaVar2 != null) {
            aaVar2.mo81941m(ajVar, umVarArr);
        }
    }

    /* renamed from: h */
    public final void mo96235h() {
        C58976aa aaVar = C58975e.f156826a;
        this.f299716e.mo95450h(C106204a.START, this.f299714c, this.f299713b);
        m178801l(C107706q.STARTED);
    }

    /* renamed from: i */
    public final void mo96236i() {
        C58976aa aaVar = C58975e.f156826a;
        this.f299716e.mo95450h(C106204a.STOP, this.f299714c, this.f299713b);
        if (this.f299713b == C107706q.STARTED) {
            m178801l(C107706q.CONNECTED);
        }
    }

    /* renamed from: j */
    public final boolean mo96237j() {
        if (this.f299713b != C107706q.CONNECTED && this.f299713b != C107706q.STARTED) {
            return false;
        }
        C58976aa aaVar = C58975e.f156826a;
        C87673aa aaVar2 = ((C107703n) this.f299712a.mo27525b()).f299706k;
        return aaVar2 != null && aaVar2.mo81951w();
    }

    /* renamed from: k */
    public final boolean mo96238k() {
        if (this.f299713b != C107706q.STARTED) {
            return false;
        }
        C58976aa aaVar = C58975e.f156826a;
        C87673aa aaVar2 = ((C107703n) this.f299712a.mo27525b()).f299706k;
        return aaVar2 != null && aaVar2.mo81953y();
    }
}
