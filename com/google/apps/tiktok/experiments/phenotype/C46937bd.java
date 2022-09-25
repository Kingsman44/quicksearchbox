package com.google.apps.tiktok.experiments.phenotype;

import com.google.android.libraries.phenotype.client.p2420a.C31639g;
import com.google.common.base.C58833ax;
import java.util.Map;
import java.util.concurrent.ScheduledExecutorService;
import p5460g.p5461a.C69464a;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.apps.tiktok.experiments.phenotype.bd */
/* compiled from: PG */
public final class C46937bd {

    /* renamed from: a */
    public final C58833ax f122423a;

    /* renamed from: b */
    public final C46917ak f122424b;

    /* renamed from: c */
    public final C46917ak f122425c;

    /* renamed from: d */
    public final Map f122426d;

    /* renamed from: e */
    private final C69464a f122427e;

    /* renamed from: f */
    private final ScheduledExecutorService f122428f;

    /* renamed from: g */
    private final C31639g f122429g;

    public C46937bd(C58833ax axVar, C69464a aVar, ScheduledExecutorService scheduledExecutorService, C46917ak akVar, C46917ak akVar2, Map map, C31639g gVar) {
        C69664n.m101061g(aVar, "enableTimeout");
        C69664n.m101061g(scheduledExecutorService, "executor");
        C69664n.m101061g(akVar, "uiDeviceState");
        C69664n.m101061g(akVar2, "deviceState");
        C69664n.m101061g(map, "packages");
        C69664n.m101061g(gVar, "phenotypeApi");
        this.f122423a = axVar;
        this.f122427e = aVar;
        this.f122428f = scheduledExecutorService;
        this.f122424b = akVar;
        this.f122425c = akVar2;
        this.f122426d = map;
        this.f122429g = gVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x007a, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        p5462h.p5472e.C69598b.m101013a(r1, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x007e, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0081, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0082, code lost:
        p5462h.p5472e.C69598b.m101013a(r0, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0085, code lost:
        throw r1;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.common.util.concurrent.C60870cx mo50926a(java.lang.String r8) {
        /*
            r7 = this;
            com.google.apps.tiktok.tracing.bn r0 = com.google.apps.tiktok.tracing.C47562bm.f123426a
            java.lang.String r1 = "empty()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r0, r1)
            java.lang.String r2 = "Fetching experiments for device"
            com.google.apps.tiktok.tracing.bi r0 = com.google.apps.tiktok.tracing.C47831fm.m85007b(r2, r0)
            java.lang.String r2 = "PhenotypeApi.getConfigurationSnapshot"
            com.google.apps.tiktok.tracing.bn r3 = com.google.apps.tiktok.tracing.C47562bm.f123426a     // Catch:{ all -> 0x007f }
            p5462h.p5473f.p5475b.C69664n.m101060f(r3, r1)     // Catch:{ all -> 0x007f }
            com.google.apps.tiktok.tracing.bi r1 = com.google.apps.tiktok.tracing.C47831fm.m85007b(r2, r3)     // Catch:{ all -> 0x007f }
            com.google.android.libraries.phenotype.client.a.g r2 = r7.f122429g     // Catch:{ all -> 0x0078 }
            java.lang.String r3 = ""
            com.google.common.util.concurrent.cx r2 = r2.mo37292f(r8, r3)     // Catch:{ all -> 0x0078 }
            g.a.a r3 = r7.f122427e     // Catch:{ all -> 0x0078 }
            dagger.a.g r3 = (dagger.p5294a.C68221g) r3     // Catch:{ all -> 0x0078 }
            java.lang.Object r3 = r3.f184583a     // Catch:{ all -> 0x0078 }
            com.google.common.base.ax r3 = (com.google.common.base.C58833ax) r3     // Catch:{ all -> 0x0078 }
            r4 = 1
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)     // Catch:{ all -> 0x0078 }
            java.lang.Object r3 = r3.mo56109e(r4)     // Catch:{ all -> 0x0078 }
            java.lang.String r4 = "enableTimeout.get().or(true)"
            p5462h.p5473f.p5475b.C69664n.m101060f(r3, r4)     // Catch:{ all -> 0x0078 }
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch:{ all -> 0x0078 }
            boolean r3 = r3.booleanValue()     // Catch:{ all -> 0x0078 }
            if (r3 == 0) goto L_0x0056
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ all -> 0x0078 }
            java.util.concurrent.ScheduledExecutorService r4 = r7.f122428f     // Catch:{ all -> 0x0078 }
            r5 = 25
            com.google.common.util.concurrent.cx r2 = com.google.common.util.concurrent.C60856cj.m92908q(r2, r5, r3, r4)     // Catch:{ all -> 0x0078 }
            java.lang.Class<java.util.concurrent.TimeoutException> r3 = java.util.concurrent.TimeoutException.class
            com.google.apps.tiktok.experiments.phenotype.bc r4 = com.google.apps.tiktok.experiments.phenotype.C46936bc.f122422a     // Catch:{ all -> 0x0078 }
            java.util.concurrent.ScheduledExecutorService r5 = r7.f122428f     // Catch:{ all -> 0x0078 }
            com.google.common.base.ah r4 = com.google.apps.tiktok.tracing.C47810es.m84963c(r4)     // Catch:{ all -> 0x0078 }
            com.google.common.util.concurrent.cx r2 = com.google.common.util.concurrent.C60846c.m92878g(r2, r3, r4, r5)     // Catch:{ all -> 0x0078 }
        L_0x0056:
            r1.mo51417a(r2)     // Catch:{ all -> 0x0078 }
            r3 = 0
            p5462h.p5472e.C69598b.m101013a(r1, r3)     // Catch:{ all -> 0x007f }
            java.lang.String r1 = "beginSpan(name, extras).…oFuture(block.invoke()) }"
            p5462h.p5473f.p5475b.C69664n.m101060f(r2, r1)     // Catch:{ all -> 0x007f }
            com.google.apps.tiktok.experiments.phenotype.bb r1 = new com.google.apps.tiktok.experiments.phenotype.bb     // Catch:{ all -> 0x007f }
            r1.<init>(r7, r8)     // Catch:{ all -> 0x007f }
            com.google.common.util.concurrent.s r8 = com.google.apps.tiktok.tracing.C47810es.m84966f(r1)     // Catch:{ all -> 0x007f }
            com.google.common.util.concurrent.bg r1 = com.google.common.util.concurrent.C60826bg.f164896a     // Catch:{ all -> 0x007f }
            com.google.common.util.concurrent.cx r8 = com.google.common.util.concurrent.C60922j.m93045h(r2, r8, r1)     // Catch:{ all -> 0x007f }
            r0.mo51417a(r8)     // Catch:{ all -> 0x007f }
            p5462h.p5472e.C69598b.m101013a(r0, r3)
            return r8
        L_0x0078:
            r8 = move-exception
            throw r8     // Catch:{ all -> 0x007a }
        L_0x007a:
            r2 = move-exception
            p5462h.p5472e.C69598b.m101013a(r1, r8)     // Catch:{ all -> 0x007f }
            throw r2     // Catch:{ all -> 0x007f }
        L_0x007f:
            r8 = move-exception
            throw r8     // Catch:{ all -> 0x0081 }
        L_0x0081:
            r1 = move-exception
            p5462h.p5472e.C69598b.m101013a(r0, r8)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.apps.tiktok.experiments.phenotype.C46937bd.mo50926a(java.lang.String):com.google.common.util.concurrent.cx");
    }
}
