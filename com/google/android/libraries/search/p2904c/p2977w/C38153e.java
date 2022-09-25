package com.google.android.libraries.search.p2904c.p2977w;

import android.content.Context;
import android.media.AudioManager;
import com.google.android.libraries.search.p2904c.C37403bh;
import com.google.android.libraries.search.p2904c.C37457cf;
import com.google.android.libraries.search.p2904c.C37458cg;
import com.google.android.libraries.search.p2904c.C37462ck;
import com.google.android.libraries.search.p2904c.C37465cn;
import com.google.android.libraries.search.p2904c.C37467cp;
import com.google.android.libraries.search.p2904c.C37476cy;
import com.google.android.libraries.search.p2904c.C37496dc;
import com.google.android.libraries.search.p2904c.C37504dk;
import com.google.android.libraries.search.p2904c.C37638gq;
import com.google.android.libraries.search.p2904c.C37639gr;
import com.google.android.libraries.search.p2904c.C37655hb;
import com.google.android.libraries.search.p2904c.C37678hy;
import com.google.android.libraries.search.p2904c.C37679hz;
import com.google.android.libraries.search.p2904c.p2908b.C37384h;
import com.google.android.libraries.search.p2904c.p2908b.p2909a.C37369f;
import com.google.android.libraries.search.p2904c.p2931i.p2932a.C37689h;
import com.google.android.libraries.search.p2904c.p2931i.p2932a.C37690i;
import com.google.android.libraries.search.p2904c.p2931i.p2932a.C37695n;
import com.google.android.libraries.search.p2904c.p2942m.C37895i;
import com.google.android.libraries.search.p2904c.p2942m.p2943a.C37846as;
import com.google.android.libraries.search.p2904c.p2942m.p2949f.C37889a;
import com.google.android.libraries.search.p2904c.p2942m.p2949f.p2950a.C37890a;
import com.google.android.libraries.search.p2904c.p2964r.C37966b;
import com.google.android.libraries.search.p2904c.p2977w.p2978a.C38129g;
import com.google.android.libraries.search.p2904c.p2977w.p2978a.C38130h;
import com.google.android.libraries.search.p2904c.p2977w.p2978a.C38131i;
import com.google.android.libraries.search.p2904c.p2977w.p2978a.C38132j;
import com.google.android.libraries.search.p2904c.p2977w.p2978a.C38134l;
import com.google.android.libraries.search.p2904c.p2985y.p2986a.C38281b;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.base.C58838bb;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60836bq;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60888db;
import java.util.List;
import java.util.concurrent.Executor;
import kotlinx.coroutines.C71422aw;

/* renamed from: com.google.android.libraries.search.c.w.e */
/* compiled from: PG */
public final class C38153e {

    /* renamed from: c */
    private static final C59071e f101094c = C59071e.m91332i("com.google.android.libraries.search.c.w.e");

    /* renamed from: a */
    public final C37889a f101095a;

    /* renamed from: b */
    public final C37966b f101096b;

    /* renamed from: d */
    private final Executor f101097d;

    /* renamed from: e */
    private final C60836bq f101098e;

    /* renamed from: f */
    private final C38130h f101099f;

    /* renamed from: g */
    private final C38132j f101100g;

    /* renamed from: h */
    private final C38281b f101101h;

    /* renamed from: i */
    private final C37690i f101102i;

    /* renamed from: j */
    private C38154f f101103j = new C38134l(C58836b.f156633a);

    public C38153e(Executor executor, C60836bq bqVar, C38130h hVar, C37889a aVar, C38132j jVar, C38281b bVar, C37966b bVar2, C37690i iVar) {
        this.f101097d = executor;
        this.f101098e = bqVar;
        this.f101099f = hVar;
        this.f101095a = aVar;
        this.f101100g = jVar;
        this.f101101h = bVar;
        this.f101096b = bVar2;
        this.f101102i = iVar;
    }

    /* renamed from: e */
    private final synchronized C60870cx m67350e() {
        return this.f101098e.mo57305b(C47810es.m84965e(new C38152d(this, this.f101103j)), this.f101097d);
    }

    /* renamed from: f */
    private final synchronized C60870cx m67351f(C37462ck ckVar, C38154f fVar, int i) {
        C58833ax axVar;
        C37496dc dcVar;
        C37467cp cpVar = ckVar.f99445b;
        if (cpVar == null) {
            cpVar = C37467cp.f99458c;
        }
        if (cpVar.f99460a == 5) {
            C37467cp cpVar2 = ckVar.f99445b;
            if (cpVar2 == null) {
                cpVar2 = C37467cp.f99458c;
            }
            if (cpVar2.f99460a == 5) {
                dcVar = (C37496dc) cpVar2.f99461b;
            } else {
                dcVar = C37496dc.f99549c;
            }
            C37655hb hbVar = dcVar.f99552b;
            if (hbVar == null) {
                hbVar = C37655hb.f100025d;
            }
            axVar = C58833ax.m90834k(hbVar);
        } else {
            axVar = C58836b.f156633a;
        }
        C58833ax axVar2 = axVar;
        C37467cp cpVar3 = ckVar.f99445b;
        if ((cpVar3 == null ? C37467cp.f99458c : cpVar3).f99460a == 5) {
            cpVar3 = fVar.mo41068d().mo41096a();
        } else if (cpVar3 == null) {
            cpVar3 = C37467cp.f99458c;
        }
        C58838bb.m90883r(C37465cn.m66491a(cpVar3.f99460a) != C37465cn.HANDOVER_ROUTE);
        if (cpVar3.f99460a == 1 && fVar.mo41068d().mo41096a().f99460a == 2) {
            C46459k.m82829b(this.f101098e.mo57305b(C47810es.m84965e(new C38151c(fVar)), this.f101097d), "Disconnecting the AudioRoute failed", new Object[0]);
        }
        mo41289c(C37476cy.DISCONNECT_REASON_CLIENT_REQUESTED_ROUTE_UPDATE);
        switch (C37465cn.m66491a(cpVar3.f99460a).ordinal()) {
            case 0:
                C37690i iVar = this.f101102i;
                C37695n nVar = (C37695n) iVar.f100102a.mo17428b();
                nVar.getClass();
                Executor executor = (Executor) iVar.f100103b.mo17428b();
                executor.getClass();
                C60888db dbVar = (C60888db) iVar.f100104c.mo17428b();
                dbVar.getClass();
                Context context = (Context) iVar.f100105d.mo17428b();
                context.getClass();
                AudioManager audioManager = (AudioManager) iVar.f100106e.mo17428b();
                audioManager.getClass();
                Executor executor2 = (Executor) iVar.f100107f.mo17428b();
                executor2.getClass();
                this.f101103j = new C37689h(nVar, executor, dbVar, context, audioManager, executor2);
                break;
            case 1:
            case 2:
            case 6:
                this.f101103j = new C38134l(axVar2);
                break;
            case 3:
                C38130h hVar = this.f101099f;
                C37384h hVar2 = C37384h.BISTO;
                cpVar3.getClass();
                hVar2.getClass();
                C37890a aVar = (C37890a) hVar.f101027a.mo17428b();
                aVar.getClass();
                C37369f fVar2 = (C37369f) hVar.f101028b.mo17428b();
                fVar2.getClass();
                C37369f fVar3 = (C37369f) hVar.f101029c.mo17428b();
                fVar3.getClass();
                C71422aw awVar = (C71422aw) hVar.f101030d.mo17428b();
                awVar.getClass();
                this.f101103j = new C38129g(cpVar3, hVar2, axVar2, aVar, fVar2, fVar3, awVar);
                break;
            case 4:
                return C60856cj.m92900i(C37846as.m66800f(C37504dk.FAILED_ROUTING_DUE_TO_HANDOVER_ROUTE_NOT_MAPPED));
            case 5:
                this.f101103j = this.f101099f.mo41280a(cpVar3, C37384h.SODA);
                break;
        }
        C59104x b = f101094c.mo56224b();
        b.mo56378ag(C58975e.f156826a, "ALT.ARCRoutingMgr");
        ((C59052c) ((C59052c) b).mo56372aa(52965)).mo56395y("#audio# connect client(token(%d)) to route(%s)", i, C37465cn.m66491a(cpVar3.f99460a).name());
        return m67350e();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x005a, code lost:
        return r2;
     */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final synchronized boolean m67352g(com.google.android.libraries.search.p2904c.p2908b.C37384h r6, java.util.List r7) {
        /*
            r5 = this;
            monitor-enter(r5)
            com.google.android.libraries.search.c.w.f r0 = r5.f101103j     // Catch:{ all -> 0x005b }
            com.google.android.libraries.search.c.m.c r0 = r0.mo41068d()     // Catch:{ all -> 0x005b }
            com.google.android.libraries.search.c.b.h r1 = com.google.android.libraries.search.p2904c.p2908b.C37384h.BISTO     // Catch:{ all -> 0x005b }
            boolean r1 = r6.equals(r1)     // Catch:{ all -> 0x005b }
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x001c
            com.google.android.libraries.search.c.cp r1 = r0.mo41096a()     // Catch:{ all -> 0x005b }
            int r1 = r1.f99460a     // Catch:{ all -> 0x005b }
            r4 = 4
            if (r1 != r4) goto L_0x001c
            r1 = 1
            goto L_0x001d
        L_0x001c:
            r1 = 0
        L_0x001d:
            com.google.android.libraries.search.c.b.h r4 = com.google.android.libraries.search.p2904c.p2908b.C37384h.SODA     // Catch:{ all -> 0x005b }
            boolean r6 = r6.equals(r4)     // Catch:{ all -> 0x005b }
            if (r6 == 0) goto L_0x0030
            com.google.android.libraries.search.c.cp r6 = r0.mo41096a()     // Catch:{ all -> 0x005b }
            int r6 = r6.f99460a     // Catch:{ all -> 0x005b }
            r4 = 6
            if (r6 != r4) goto L_0x0030
            r6 = 1
            goto L_0x0031
        L_0x0030:
            r6 = 0
        L_0x0031:
            com.google.common.base.ax r0 = r0.mo41097c()     // Catch:{ all -> 0x005b }
            p3186j$.util.Objects.requireNonNull(r7)     // Catch:{ all -> 0x005b }
            com.google.android.libraries.search.c.w.b r4 = new com.google.android.libraries.search.c.w.b     // Catch:{ all -> 0x005b }
            r4.<init>(r7)     // Catch:{ all -> 0x005b }
            com.google.common.base.ax r7 = r0.mo56106b(r4)     // Catch:{ all -> 0x005b }
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)     // Catch:{ all -> 0x005b }
            java.lang.Object r7 = r7.mo56109e(r0)     // Catch:{ all -> 0x005b }
            java.lang.Boolean r7 = (java.lang.Boolean) r7     // Catch:{ all -> 0x005b }
            boolean r7 = r7.booleanValue()     // Catch:{ all -> 0x005b }
            if (r7 == 0) goto L_0x0058
            if (r1 != 0) goto L_0x0059
            if (r6 != 0) goto L_0x0056
            goto L_0x0058
        L_0x0056:
            monitor-exit(r5)
            return r2
        L_0x0058:
            r2 = 0
        L_0x0059:
            monitor-exit(r5)
            return r2
        L_0x005b:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.search.p2904c.p2977w.C38153e.m67352g(com.google.android.libraries.search.c.b.h, java.util.List):boolean");
    }

    /* renamed from: a */
    public final synchronized C37403bh mo41287a(C37462ck ckVar, int i, C38154f fVar) {
        C38131i iVar;
        C60870cx f = m67351f(ckVar, fVar, i);
        C37457cf cfVar = (C37457cf) C37458cg.f99433d.createBuilder();
        C37638gq gqVar = (C37638gq) C37639gr.f100004c.createBuilder();
        gqVar.copyOnWrite();
        C37639gr grVar = (C37639gr) gqVar.instance;
        grVar.f100006a |= 1;
        grVar.f100007b = i;
        cfVar.copyOnWrite();
        C37458cg cgVar = (C37458cg) cfVar.instance;
        C37639gr grVar2 = (C37639gr) gqVar.build();
        grVar2.getClass();
        cgVar.f99436b = grVar2;
        cgVar.f99435a |= 1;
        C37678hy hyVar = (C37678hy) C37679hz.f100067c.createBuilder();
        int a = this.f101095a.mo41132a();
        hyVar.copyOnWrite();
        C37679hz hzVar = (C37679hz) hyVar.instance;
        hzVar.f100069a |= 1;
        hzVar.f100070b = a;
        cfVar.copyOnWrite();
        C37458cg cgVar2 = (C37458cg) cfVar.instance;
        C37679hz hzVar2 = (C37679hz) hyVar.build();
        hzVar2.getClass();
        cgVar2.f99437c = hzVar2;
        cgVar2.f99435a |= 2;
        C37458cg cgVar3 = (C37458cg) cfVar.build();
        C38132j jVar = this.f101100g;
        C60870cx e = this.f101103j.mo41068d().mo41099e();
        cgVar3.getClass();
        e.getClass();
        C37895i iVar2 = (C37895i) jVar.f101035a.mo17428b();
        iVar2.getClass();
        iVar = new C38131i(cgVar3, e, iVar2);
        this.f101101h.mo41350d(f, iVar, i);
        return iVar;
    }

    /* renamed from: b */
    public final synchronized C38154f mo41288b() {
        return this.f101103j;
    }

    /* renamed from: c */
    public final synchronized void mo41289c(C37476cy cyVar) {
        C59104x b = f101094c.mo56224b();
        b.mo56378ag(C58975e.f156826a, "ALT.ARCRoutingMgr");
        ((C59052c) ((C59052c) b).mo56372aa(52966)).mo56354G("#audio# disconnect(reason(%s)) audio route(%s)", cyVar.name(), C37465cn.m66491a(this.f101103j.mo41068d().mo41096a().f99460a).name());
        C46459k.m82829b(this.f101098e.mo57305b(C47810es.m84965e(new C38122a(this.f101103j, cyVar)), this.f101097d), "Disconnecting the AudioRoute failed", new Object[0]);
    }

    /* renamed from: d */
    public final synchronized void mo41290d(C37384h hVar, List list) {
        if (m67352g(hVar, list)) {
            mo41289c(C37476cy.DISCONNECT_REASON_AUDIO_ADAPTER_UNREGISTERED);
        }
    }
}
