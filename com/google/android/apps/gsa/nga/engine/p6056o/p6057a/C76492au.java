package com.google.android.apps.gsa.nga.engine.p6056o.p6057a;

import com.google.android.apps.gsa.nga.engine.p5913am.p5939u.C74965n;
import com.google.android.apps.gsa.nga.engine.p6056o.p6059c.C76591c;
import com.google.android.apps.gsa.nga.engine.p6260x.C79851ai;
import com.google.android.apps.gsa.nga.engine.understanding.C78983aj;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6283b.C80371a;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6283b.C80379i;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6283b.C80386p;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6295n.C80513b;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82837cg;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82838ch;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82840cj;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82841ck;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82843cm;
import com.google.common.base.C58838bb;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.knowledge.p4661a.p4662a.C61752n;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.a.au */
/* compiled from: PG */
public final class C76492au extends C76498b {

    /* renamed from: d */
    private static final C58974d f211692d = C58974d.m91136j();

    /* renamed from: e */
    private final C78983aj f211693e;

    /* renamed from: f */
    private final C76591c f211694f;

    public C76492au(C78983aj ajVar, C76591c cVar, C74965n nVar, C79851ai aiVar) {
        super(ajVar.mo73746a(), nVar, aiVar);
        try {
            C58838bb.m90873h(ajVar.mo73747b().isPresent(), "%s has no interpretation.", ajVar);
        } catch (IllegalArgumentException e) {
            ((C58970a) ((C58970a) ((C58970a) f211692d.mo56225c()).mo56382g(e)).mo56372aa(3586)).mo56386p("QueryUnderstandingResult has no interpretation.");
        }
        this.f211693e = ajVar;
        this.f211694f = cVar;
    }

    /* renamed from: a */
    public final C78983aj mo72214a() {
        return this.f211693e;
    }

    /* renamed from: b */
    public final C82838ch mo72215b() {
        C82837cg cgVar = (C82837cg) C82838ch.f225874h.createBuilder();
        cgVar.copyOnWrite();
        C82838ch chVar = (C82838ch) cgVar.instance;
        chVar.f225877b = 1004;
        chVar.f225876a |= 1;
        C80371a aVar = (C80371a) C80386p.f220578g.createBuilder();
        C80379i f = mo72217f();
        aVar.copyOnWrite();
        f.getClass();
        ((C80386p) aVar.instance).f220585f = f;
        cgVar.copyOnWrite();
        C82838ch chVar2 = (C82838ch) cgVar.instance;
        C80386p pVar = (C80386p) aVar.build();
        pVar.getClass();
        chVar2.f225881f = pVar;
        chVar2.f225876a |= 16;
        int g = this.f211694f.mo71711a().mo72256g();
        cgVar.copyOnWrite();
        C82838ch chVar3 = (C82838ch) cgVar.instance;
        int i = g - 1;
        if (g != 0) {
            chVar3.f225878c = i;
            chVar3.f225876a |= 2;
            C82841ck ckVar = (C82841ck) C82843cm.f225889f.createBuilder();
            C61752n nVar = ((C80513b) this.f211693e.mo73747b().get()).f221016a;
            if (nVar == null) {
                nVar = C61752n.f166808f;
            }
            ckVar.copyOnWrite();
            nVar.getClass();
            ((C82843cm) ckVar.instance).f225891a = nVar;
            ckVar.copyOnWrite();
            ((C82843cm) ckVar.instance).f225894d = C82840cj.m132412a(3);
            C82843cm cmVar = (C82843cm) ckVar.build();
            cgVar.copyOnWrite();
            C82838ch chVar4 = (C82838ch) cgVar.instance;
            cmVar.getClass();
            chVar4.f225882g = cmVar;
            chVar4.f225876a |= 32;
            this.f211694f.mo71711a().mo72253e().ifPresent(new C76491at(cgVar));
            return (C82838ch) cgVar.build();
        }
        throw null;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:20|21) */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        throw r1;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:20:0x005d */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.common.util.concurrent.C60870cx mo72216d() {
        /*
            r7 = this;
            com.google.android.apps.gsa.nga.engine.o.c.c r0 = r7.f211694f
            com.google.android.apps.gsa.nga.engine.o.c.f r0 = r0.mo71711a()
            int r0 = r0.mo72256g()
            com.google.android.apps.gsa.nga.engine.x.ai r1 = r7.f211700a     // Catch:{ Exception -> 0x005e }
            com.google.android.apps.gsa.nga.engine.am.u.n r2 = r7.f211702c     // Catch:{ Exception -> 0x005e }
            com.google.android.apps.gsa.nga.shared.v.io r2 = r2.mo71336k()     // Catch:{ Exception -> 0x005e }
            com.google.android.apps.gsa.nga.engine.x.ah r0 = r1.mo74252c(r0, r2)     // Catch:{ Exception -> 0x005e }
            com.google.android.apps.gsa.nga.engine.o.c.c r1 = r7.f211694f     // Catch:{ all -> 0x003e }
            com.google.android.apps.gsa.nga.engine.o.c.bg r2 = new com.google.android.apps.gsa.nga.engine.o.c.bg     // Catch:{ all -> 0x003e }
            com.google.android.apps.gsa.nga.engine.understanding.aj r3 = r7.f211693e     // Catch:{ all -> 0x003e }
            j$.util.Optional r3 = r3.mo73747b()     // Catch:{ all -> 0x003e }
            java.lang.Object r3 = r3.get()     // Catch:{ all -> 0x003e }
            com.google.android.apps.gsa.nga.shared.aa.n.b r3 = (com.google.android.apps.gsa.nga.shared.p6275aa.p6295n.C80513b) r3     // Catch:{ all -> 0x003e }
            com.google.knowledge.a.a.n r3 = r3.f221016a     // Catch:{ all -> 0x003e }
            if (r3 != 0) goto L_0x002c
            com.google.knowledge.a.a.n r3 = com.google.knowledge.p4661a.p4662a.C61752n.f166808f     // Catch:{ all -> 0x003e }
        L_0x002c:
            r2.<init>(r3)     // Catch:{ all -> 0x003e }
            com.google.android.apps.gsa.nga.engine.am.u.n r3 = r7.f211702c     // Catch:{ all -> 0x003e }
            com.google.common.util.concurrent.cx r1 = r1.mo71712b(r2, r3)     // Catch:{ all -> 0x003e }
            r0.mo74256c(r1)     // Catch:{ all -> 0x003e }
            if (r0 == 0) goto L_0x003d
            r0.mo74255b()     // Catch:{ Exception -> 0x005e }
        L_0x003d:
            return r1
        L_0x003e:
            r1 = move-exception
            if (r0 == 0) goto L_0x005d
            r0.mo74255b()     // Catch:{ all -> 0x0045 }
            goto L_0x005d
        L_0x0045:
            r0 = move-exception
            r2 = 1
            java.lang.Class[] r3 = new java.lang.Class[r2]     // Catch:{ Exception -> 0x005d }
            java.lang.Class<java.lang.Throwable> r4 = java.lang.Throwable.class
            r5 = 0
            r3[r5] = r4     // Catch:{ Exception -> 0x005d }
            java.lang.Class<java.lang.Throwable> r4 = java.lang.Throwable.class
            java.lang.String r6 = "addSuppressed"
            java.lang.reflect.Method r3 = r4.getDeclaredMethod(r6, r3)     // Catch:{ Exception -> 0x005d }
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ Exception -> 0x005d }
            r2[r5] = r0     // Catch:{ Exception -> 0x005d }
            r3.invoke(r1, r2)     // Catch:{ Exception -> 0x005d }
        L_0x005d:
            throw r1     // Catch:{ Exception -> 0x005e }
        L_0x005e:
            r0 = move-exception
            com.google.common.util.concurrent.cx r0 = com.google.common.util.concurrent.C60856cj.m92899h(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.nga.engine.p6056o.p6057a.C76492au.mo72216d():com.google.common.util.concurrent.cx");
    }

    /* renamed from: f */
    public final C80379i mo72217f() {
        return this.f211694f.mo71711a().mo72249a();
    }

    public final String toString() {
        return String.format("OnDeviceFulfillmentCandidate(query: %s, fulfiller: %s)", new Object[]{this.f211693e, this.f211694f.mo71711a().mo72252d().orElse(this.f211694f.getClass().getName())});
    }
}
