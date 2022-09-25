package com.google.apps.tiktok.experiments.phenotype;

import com.google.android.libraries.phenotype.client.p2420a.C31639g;
import com.google.apps.tiktok.inject.C47267g;

/* renamed from: com.google.apps.tiktok.experiments.phenotype.cz */
/* compiled from: PG */
public final class C46986cz implements C47267g {

    /* renamed from: a */
    final /* synthetic */ C46983cw f122513a;

    /* renamed from: b */
    final /* synthetic */ C31639g f122514b;

    public C46986cz(C46983cw cwVar, C31639g gVar) {
        this.f122513a = cwVar;
        this.f122514b = gVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00c4, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00c5, code lost:
        p5462h.p5472e.C69598b.m101013a(r2, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00c9, code lost:
        throw r1;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo35389e() {
        /*
            r10 = this;
            com.google.apps.tiktok.experiments.phenotype.cw r0 = r10.f122513a
            com.google.apps.tiktok.experiments.phenotype.cy r1 = new com.google.apps.tiktok.experiments.phenotype.cy
            com.google.android.libraries.phenotype.client.a.g r2 = r10.f122514b
            r1.<init>(r2)
            com.google.apps.tiktok.tracing.bn r2 = com.google.apps.tiktok.tracing.C47562bm.f123426a
            java.lang.String r3 = "empty()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r2, r3)
            java.lang.String r3 = "Registering packages with phenotype"
            com.google.apps.tiktok.tracing.bi r2 = com.google.apps.tiktok.tracing.C47831fm.m85007b(r3, r2)
            java.util.Map r3 = r0.f122508e     // Catch:{ all -> 0x00c2 }
            java.util.Set r3 = r3.keySet()     // Catch:{ all -> 0x00c2 }
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ all -> 0x00c2 }
            r5 = 10
            int r5 = p5462h.p5463a.C69540x.m100804k(r3, r5)     // Catch:{ all -> 0x00c2 }
            r4.<init>(r5)     // Catch:{ all -> 0x00c2 }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ all -> 0x00c2 }
        L_0x002b:
            boolean r5 = r3.hasNext()     // Catch:{ all -> 0x00c2 }
            if (r5 == 0) goto L_0x00ae
            java.lang.Object r5 = r3.next()     // Catch:{ all -> 0x00c2 }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ all -> 0x00c2 }
            com.google.apps.tiktok.experiments.phenotype.am r6 = r0.f122510g     // Catch:{ all -> 0x00c2 }
            java.lang.String r5 = r6.mo50923a(r5)     // Catch:{ all -> 0x00c2 }
            dagger.a r6 = r0.f122509f     // Catch:{ all -> 0x00c2 }
            java.lang.Object r6 = r6.mo27525b()     // Catch:{ all -> 0x00c2 }
            java.util.Map r6 = (java.util.Map) r6     // Catch:{ all -> 0x00c2 }
            java.lang.Object r6 = r6.get(r5)     // Catch:{ all -> 0x00c2 }
            com.google.common.util.concurrent.r r6 = (com.google.common.util.concurrent.C60930r) r6     // Catch:{ all -> 0x00c2 }
            dagger.a r7 = r0.f122505b     // Catch:{ all -> 0x00c2 }
            java.lang.Object r7 = r7.mo27525b()     // Catch:{ all -> 0x00c2 }
            java.util.Map r7 = (java.util.Map) r7     // Catch:{ all -> 0x00c2 }
            java.lang.Object r7 = r7.get(r5)     // Catch:{ all -> 0x00c2 }
            com.google.ac.d.e r7 = (com.google.p343ac.p357d.C6663e) r7     // Catch:{ all -> 0x00c2 }
            if (r7 == 0) goto L_0x0086
            if (r6 != 0) goto L_0x0086
            dagger.a r8 = r0.f122504a     // Catch:{ all -> 0x00c2 }
            java.lang.Object r8 = r8.mo27525b()     // Catch:{ all -> 0x00c2 }
            java.lang.String r9 = "supportsDeclarative.get()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r8, r9)     // Catch:{ all -> 0x00c2 }
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch:{ all -> 0x00c2 }
            boolean r8 = r8.booleanValue()     // Catch:{ all -> 0x00c2 }
            if (r8 == 0) goto L_0x0086
            com.google.protobuf.cq r8 = r7.f19910h     // Catch:{ all -> 0x00c2 }
            java.lang.String r9 = "info.logSourceNameList"
            p5462h.p5473f.p5475b.C69664n.m101060f(r8, r9)     // Catch:{ all -> 0x00c2 }
            com.google.common.b.ij r8 = com.google.common.p4522b.C58479go.m89814f(r8)     // Catch:{ all -> 0x00c2 }
            java.util.Set r9 = r0.f122507d     // Catch:{ all -> 0x00c2 }
            boolean r8 = r8.containsAll(r9)     // Catch:{ all -> 0x00c2 }
            if (r8 == 0) goto L_0x0086
            com.google.common.util.concurrent.cx r6 = com.google.common.util.concurrent.C60866ct.f164955a     // Catch:{ all -> 0x00c2 }
            goto L_0x008a
        L_0x0086:
            com.google.common.util.concurrent.cx r6 = r0.mo50961a(r6, r1, r5, r7)     // Catch:{ all -> 0x00c2 }
        L_0x008a:
            com.google.apps.tiktok.experiments.phenotype.cs r7 = new com.google.apps.tiktok.experiments.phenotype.cs     // Catch:{ all -> 0x00c2 }
            r7.<init>(r0, r5)     // Catch:{ all -> 0x00c2 }
            com.google.apps.tiktok.experiments.phenotype.cv r8 = new com.google.apps.tiktok.experiments.phenotype.cv     // Catch:{ all -> 0x00c2 }
            r8.<init>(r7)     // Catch:{ all -> 0x00c2 }
            com.google.common.util.concurrent.s r7 = com.google.apps.tiktok.tracing.C47810es.m84966f(r8)     // Catch:{ all -> 0x00c2 }
            com.google.common.util.concurrent.bg r8 = com.google.common.util.concurrent.C60826bg.f164896a     // Catch:{ all -> 0x00c2 }
            com.google.common.util.concurrent.cx r6 = com.google.common.util.concurrent.C60922j.m93045h(r6, r7, r8)     // Catch:{ all -> 0x00c2 }
            java.lang.String r7 = "Failed to register for %s"
            r8 = 1
            java.lang.Object[] r8 = new java.lang.Object[r8]     // Catch:{ all -> 0x00c2 }
            r9 = 0
            r8[r9] = r5     // Catch:{ all -> 0x00c2 }
            com.google.apps.tiktok.concurrent.C46459k.m82829b(r6, r7, r8)     // Catch:{ all -> 0x00c2 }
            r4.add(r6)     // Catch:{ all -> 0x00c2 }
            goto L_0x002b
        L_0x00ae:
            com.google.apps.tiktok.tracing.contrib.b.j r0 = com.google.apps.tiktok.tracing.contrib.p3700b.C47638k.m84750a(r4)     // Catch:{ all -> 0x00c2 }
            com.google.apps.tiktok.experiments.phenotype.ct r1 = com.google.apps.tiktok.experiments.phenotype.C46980ct.f122497a     // Catch:{ all -> 0x00c2 }
            com.google.common.util.concurrent.bg r3 = com.google.common.util.concurrent.C60826bg.f164896a     // Catch:{ all -> 0x00c2 }
            com.google.common.util.concurrent.cx r0 = r0.mo51520a(r1, r3)     // Catch:{ all -> 0x00c2 }
            r2.mo51417a(r0)     // Catch:{ all -> 0x00c2 }
            r0 = 0
            p5462h.p5472e.C69598b.m101013a(r2, r0)
            return
        L_0x00c2:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x00c4 }
        L_0x00c4:
            r1 = move-exception
            p5462h.p5472e.C69598b.m101013a(r2, r0)
            goto L_0x00ca
        L_0x00c9:
            throw r1
        L_0x00ca:
            goto L_0x00c9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.apps.tiktok.experiments.phenotype.C46986cz.mo35389e():void");
    }
}
