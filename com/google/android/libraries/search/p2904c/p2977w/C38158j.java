package com.google.android.libraries.search.p2904c.p2977w;

import com.google.android.libraries.search.p2904c.C37462ck;
import com.google.android.libraries.search.p2904c.C37465cn;
import com.google.android.libraries.search.p2904c.C37467cp;
import com.google.android.libraries.search.p2904c.C37476cy;
import com.google.android.libraries.search.p2904c.C37494da;
import com.google.android.libraries.search.p2904c.C37497dd;
import com.google.android.libraries.search.p2904c.C37498de;
import com.google.android.libraries.search.p2904c.C37504dk;
import com.google.android.libraries.search.p2904c.C37678hy;
import com.google.android.libraries.search.p2904c.C37679hz;
import com.google.android.libraries.search.p2904c.p2908b.C37384h;
import com.google.android.libraries.search.p2904c.p2931i.p2932a.C37689h;
import com.google.android.libraries.search.p2904c.p2942m.C37895i;
import com.google.android.libraries.search.p2904c.p2942m.p2943a.C37846as;
import com.google.android.libraries.search.p2904c.p2942m.p2949f.C37889a;
import com.google.android.libraries.search.p2904c.p2964r.C37966b;
import com.google.android.libraries.search.p2904c.p2977w.p2978a.C38130h;
import com.google.android.libraries.search.p2904c.p2977w.p2978a.C38134l;
import com.google.android.libraries.search.p2904c.p2977w.p2978a.C38136n;
import com.google.android.libraries.search.p2904c.p2977w.p2978a.C38137o;
import com.google.android.libraries.search.p2904c.p2977w.p2978a.C38138p;
import com.google.android.libraries.search.p2904c.p2985y.p2986a.C38281b;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60836bq;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.libraries.search.c.w.j */
/* compiled from: PG */
public final class C38158j {

    /* renamed from: c */
    private static final C59071e f101109c = C59071e.m91332i("com.google.android.libraries.search.c.w.j");

    /* renamed from: a */
    public final C37889a f101110a;

    /* renamed from: b */
    public final C37966b f101111b;

    /* renamed from: d */
    private final C60836bq f101112d;

    /* renamed from: e */
    private final Executor f101113e;

    /* renamed from: f */
    private final C38130h f101114f;

    /* renamed from: g */
    private final C38138p f101115g;

    /* renamed from: h */
    private final C38281b f101116h;

    /* renamed from: i */
    private C38154f f101117i = new C38134l(C58836b.f156633a);

    public C38158j(Executor executor, C60836bq bqVar, C38130h hVar, C37889a aVar, C38138p pVar, C38281b bVar, C37966b bVar2) {
        this.f101110a = aVar;
        this.f101115g = pVar;
        this.f101111b = bVar2;
        this.f101113e = executor;
        this.f101112d = bqVar;
        this.f101114f = hVar;
        this.f101116h = bVar;
    }

    /* renamed from: d */
    private final synchronized C60870cx m67362d() {
        return this.f101112d.mo57305b(C47810es.m84965e(new C38156h(this, this.f101117i)), this.f101113e);
    }

    /* renamed from: e */
    private final synchronized C60870cx m67363e(C37462ck ckVar, C58833ax axVar) {
        C37494da daVar;
        C37467cp cpVar = ckVar.f99445b;
        if (cpVar == null) {
            cpVar = C37467cp.f99458c;
        }
        if (cpVar.f99460a == 2) {
            if (axVar.mo56111f() instanceof C37689h) {
                return C60856cj.m92900i(C37846as.m66800f(C37504dk.FAILED_ROUTING_TO_BUILTIN_DUE_TO_AUDIO_REQUEST_CLIENT_CONNECTED_TO_BLUETOOTH));
            }
        }
        m67364f(C37476cy.DISCONNECT_REASON_CLIENT_REQUESTED_ROUTE_UPDATE);
        C37465cn cnVar = C37465cn.BLUETOOTH_AUDIO_ROUTE;
        switch (C37465cn.m66491a(cpVar.f99460a).ordinal()) {
            case 0:
            case 4:
            case 5:
            case 6:
                return C60856cj.m92900i(C37846as.m66800f(C37504dk.FAILED_ROUTING_DUE_TO_UNSUPPORTED_HOTWORD_ROUTE_PARAMS));
            case 1:
                this.f101117i = new C38134l(C58836b.f156633a);
                break;
            case 2:
                if (cpVar.f99460a == 3) {
                    daVar = (C37494da) cpVar.f99461b;
                } else {
                    daVar = C37494da.f99545c;
                }
                this.f101117i = new C38136n(daVar);
                break;
            case 3:
                this.f101117i = this.f101114f.mo41280a(cpVar, C37384h.BISTO);
                break;
        }
        C59104x b = f101109c.mo56224b();
        b.mo56378ag(C58975e.f156826a, "ALT.HWCRoutingMgr");
        ((C59052c) ((C59052c) b).mo56372aa(52967)).mo56389s("#audio# connect client to route(%s)", C37465cn.m66491a(cpVar.f99460a).name());
        return m67362d();
    }

    /* renamed from: f */
    private final synchronized void m67364f(C37476cy cyVar) {
        C59104x b = f101109c.mo56224b();
        b.mo56378ag(C58975e.f156826a, "ALT.HWCRoutingMgr");
        ((C59052c) ((C59052c) b).mo56372aa(52968)).mo56354G("#audio# disconnect(reason(%s)) audio route(%s)", cyVar.name(), C37465cn.m66491a(this.f101117i.mo41068d().mo41096a().f99460a).name());
        C46459k.m82829b(this.f101112d.mo57305b(C47810es.m84965e(new C38157i(this.f101117i, cyVar)), this.f101113e), "Disconnecting the AudioRoute failed", new Object[0]);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0042, code lost:
        return false;
     */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final synchronized boolean m67365g(com.google.android.libraries.search.p2904c.p2908b.C37384h r5, java.util.List r6) {
        /*
            r4 = this;
            monitor-enter(r4)
            com.google.android.libraries.search.c.w.f r0 = r4.f101117i     // Catch:{ all -> 0x0043 }
            com.google.android.libraries.search.c.m.c r0 = r0.mo41068d()     // Catch:{ all -> 0x0043 }
            com.google.android.libraries.search.c.b.h r1 = com.google.android.libraries.search.p2904c.p2908b.C37384h.BISTO     // Catch:{ all -> 0x0043 }
            boolean r5 = r5.equals(r1)     // Catch:{ all -> 0x0043 }
            r1 = 1
            r2 = 0
            if (r5 == 0) goto L_0x001c
            com.google.android.libraries.search.c.cp r5 = r0.mo41096a()     // Catch:{ all -> 0x0043 }
            int r5 = r5.f99460a     // Catch:{ all -> 0x0043 }
            r3 = 4
            if (r5 != r3) goto L_0x001c
            r5 = 1
            goto L_0x001d
        L_0x001c:
            r5 = 0
        L_0x001d:
            com.google.common.base.ax r0 = r0.mo41097c()     // Catch:{ all -> 0x0043 }
            p3186j$.util.Objects.requireNonNull(r6)     // Catch:{ all -> 0x0043 }
            com.google.android.libraries.search.c.w.g r3 = new com.google.android.libraries.search.c.w.g     // Catch:{ all -> 0x0043 }
            r3.<init>(r6)     // Catch:{ all -> 0x0043 }
            com.google.common.base.ax r6 = r0.mo56106b(r3)     // Catch:{ all -> 0x0043 }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)     // Catch:{ all -> 0x0043 }
            java.lang.Object r6 = r6.mo56109e(r0)     // Catch:{ all -> 0x0043 }
            java.lang.Boolean r6 = (java.lang.Boolean) r6     // Catch:{ all -> 0x0043 }
            boolean r6 = r6.booleanValue()     // Catch:{ all -> 0x0043 }
            if (r6 == 0) goto L_0x0041
            if (r5 == 0) goto L_0x0041
            monitor-exit(r4)
            return r1
        L_0x0041:
            monitor-exit(r4)
            return r2
        L_0x0043:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.search.p2904c.p2977w.C38158j.m67365g(com.google.android.libraries.search.c.b.h, java.util.List):boolean");
    }

    /* renamed from: a */
    public final synchronized C38154f mo41291a() {
        return this.f101117i;
    }

    /* renamed from: b */
    public final synchronized void mo41292b(C37384h hVar, List list) {
        if (m67365g(hVar, list)) {
            m67364f(C37476cy.DISCONNECT_REASON_AUDIO_ADAPTER_UNREGISTERED);
        }
    }

    /* renamed from: c */
    public final synchronized C38137o mo41293c(C37462ck ckVar, C58833ax axVar) {
        C38137o oVar;
        C60870cx e = m67363e(ckVar, axVar);
        C37497dd ddVar = (C37497dd) C37498de.f99553c.createBuilder();
        C37678hy hyVar = (C37678hy) C37679hz.f100067c.createBuilder();
        int a = this.f101110a.mo41132a();
        hyVar.copyOnWrite();
        C37679hz hzVar = (C37679hz) hyVar.instance;
        hzVar.f100069a |= 1;
        hzVar.f100070b = a;
        ddVar.copyOnWrite();
        C37498de deVar = (C37498de) ddVar.instance;
        C37679hz hzVar2 = (C37679hz) hyVar.build();
        hzVar2.getClass();
        deVar.f99556b = hzVar2;
        deVar.f99555a |= 1;
        C37498de deVar2 = (C37498de) ddVar.build();
        C38138p pVar = this.f101115g;
        C60870cx e2 = this.f101117i.mo41068d().mo41099e();
        deVar2.getClass();
        e2.getClass();
        C37895i iVar = (C37895i) pVar.f101048a.mo17428b();
        iVar.getClass();
        oVar = new C38137o(deVar2, e2, iVar);
        this.f101116h.mo41354h(e, oVar);
        return oVar;
    }
}
