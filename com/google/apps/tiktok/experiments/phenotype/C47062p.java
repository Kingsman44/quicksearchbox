package com.google.apps.tiktok.experiments.phenotype;

import com.google.apps.tiktok.p3643g.C47102r;
import java.util.Map;
import java.util.Set;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.apps.tiktok.experiments.phenotype.p */
/* compiled from: PG */
public final class C47062p implements C47102r {

    /* renamed from: a */
    private final C47065s f122653a;

    /* renamed from: b */
    private final Set f122654b;

    public C47062p(Map map, C47065s sVar) {
        C69664n.m101061g(map, "packages");
        C69664n.m101061g(sVar, "configurationUpdater");
        this.f122653a = sVar;
        this.f122654b = map.keySet();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0052, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0053, code lost:
        p5462h.p5472e.C69598b.m101013a(r6, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0056, code lost:
        throw r0;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.common.util.concurrent.C60870cx mo20087b(android.content.Intent r5, int r6) {
        /*
            r4 = this;
            java.lang.String r6 = "intent"
            p5462h.p5473f.p5475b.C69664n.m101061g(r5, r6)
            java.lang.String r6 = "com.google.android.gms.phenotype.PACKAGE_NAME"
            java.lang.String r5 = r5.getStringExtra(r6)
            com.google.apps.tiktok.tracing.bn r6 = com.google.apps.tiktok.tracing.C47562bm.f123426a
            java.lang.String r0 = "empty()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r6, r0)
            java.lang.String r0 = "Updating experiments"
            com.google.apps.tiktok.tracing.bi r6 = com.google.apps.tiktok.tracing.C47831fm.m85007b(r0, r6)
            if (r5 != 0) goto L_0x0021
            com.google.apps.tiktok.experiments.phenotype.s r0 = r4.f122653a     // Catch:{ all -> 0x0050 }
            com.google.common.util.concurrent.cx r0 = r0.mo50998e()     // Catch:{ all -> 0x0050 }
            goto L_0x0032
        L_0x0021:
            java.util.Set r0 = r4.f122654b     // Catch:{ all -> 0x0050 }
            boolean r0 = r0.contains(r5)     // Catch:{ all -> 0x0050 }
            if (r0 == 0) goto L_0x0030
            com.google.apps.tiktok.experiments.phenotype.s r0 = r4.f122653a     // Catch:{ all -> 0x0050 }
            com.google.common.util.concurrent.cx r0 = r0.mo50996c(r5)     // Catch:{ all -> 0x0050 }
            goto L_0x0032
        L_0x0030:
            com.google.common.util.concurrent.cx r0 = com.google.common.util.concurrent.C60866ct.f164955a     // Catch:{ all -> 0x0050 }
        L_0x0032:
            java.lang.String r1 = "Failed updating experiments for package %s"
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ all -> 0x0050 }
            r3 = 0
            r2[r3] = r5     // Catch:{ all -> 0x0050 }
            com.google.apps.tiktok.concurrent.C46459k.m82829b(r0, r1, r2)     // Catch:{ all -> 0x0050 }
            java.lang.Class<java.lang.Exception> r5 = java.lang.Exception.class
            com.google.apps.tiktok.experiments.phenotype.o r1 = com.google.apps.tiktok.experiments.phenotype.C47061o.f122652a     // Catch:{ all -> 0x0050 }
            com.google.common.util.concurrent.bg r2 = com.google.common.util.concurrent.C60826bg.f164896a     // Catch:{ all -> 0x0050 }
            com.google.common.base.ah r1 = com.google.apps.tiktok.tracing.C47810es.m84963c(r1)     // Catch:{ all -> 0x0050 }
            com.google.common.util.concurrent.cx r5 = com.google.common.util.concurrent.C60846c.m92878g(r0, r5, r1, r2)     // Catch:{ all -> 0x0050 }
            r0 = 0
            p5462h.p5472e.C69598b.m101013a(r6, r0)
            return r5
        L_0x0050:
            r5 = move-exception
            throw r5     // Catch:{ all -> 0x0052 }
        L_0x0052:
            r0 = move-exception
            p5462h.p5472e.C69598b.m101013a(r6, r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.apps.tiktok.experiments.phenotype.C47062p.mo20087b(android.content.Intent, int):com.google.common.util.concurrent.cx");
    }
}
