package com.google.android.apps.gsa.staticplugins.p7686co.p7687a;

import android.location.Location;
import com.google.android.apps.gsa.sidekick.main.trigger.TriggerConditionEvaluator;
import com.google.android.libraries.gsa.p1876k.C22862b;

/* renamed from: com.google.android.apps.gsa.staticplugins.co.a.k */
/* compiled from: PG */
public final /* synthetic */ class C98129k implements C22862b {

    /* renamed from: a */
    public final /* synthetic */ C98064as f274029a;

    /* renamed from: b */
    public final /* synthetic */ Location f274030b;

    /* renamed from: c */
    public final /* synthetic */ long f274031c;

    /* renamed from: d */
    public final /* synthetic */ TriggerConditionEvaluator.APriori f274032d;

    public /* synthetic */ C98129k(C98064as asVar, Location location, long j, TriggerConditionEvaluator.APriori aPriori) {
        this.f274029a = asVar;
        this.f274030b = location;
        this.f274031c = j;
        this.f274032d = aPriori;
    }

    /* JADX WARNING: type inference failed for: r2v12, types: [com.google.protobuf.bv] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo17947a() {
        /*
            r13 = this;
            com.google.android.apps.gsa.staticplugins.co.a.as r0 = r13.f274029a
            android.location.Location r2 = r13.f274030b
            long r3 = r13.f274031c
            com.google.android.apps.gsa.sidekick.main.trigger.TriggerConditionEvaluator$APriori r5 = r13.f274032d
            com.google.android.apps.gsa.shared.util.debug.a.b.g r1 = r0.f273820p
            java.lang.String r6 = "evaluateTriggerConditionsAndReschedule"
            com.google.android.apps.gsa.shared.util.debug.a.b.e r7 = com.google.android.apps.gsa.shared.util.debug.p7163a.p7165b.C90996e.f254198a
            r1.mo85270f(r6, r7)
            java.lang.Object r8 = r0.f273819o
            monitor-enter(r8)
            com.google.android.apps.gsa.sidekick.main.entry.ay r1 = r0.f273822r     // Catch:{ all -> 0x0117 }
            com.google.common.util.concurrent.cx r1 = r1.mo85612a()     // Catch:{ all -> 0x0117 }
            java.lang.Object r1 = com.google.common.util.concurrent.C60856cj.m92910s(r1)     // Catch:{ all -> 0x0117 }
            com.google.common.base.ax r1 = (com.google.common.base.C58833ax) r1     // Catch:{ all -> 0x0117 }
            java.lang.Object r1 = r1.mo56111f()     // Catch:{ all -> 0x0117 }
            r9 = r1
            com.google.ai.b.ii r9 = (com.google.p375ai.p378b.C7744ii) r9     // Catch:{ all -> 0x0117 }
            r10 = 0
            r11 = 0
            if (r9 == 0) goto L_0x006d
            com.google.android.apps.gsa.proactive.b.c r7 = r0.f273815k     // Catch:{ all -> 0x0117 }
            com.google.android.apps.gsa.sidekick.main.entry.az r12 = new com.google.android.apps.gsa.sidekick.main.entry.az     // Catch:{ all -> 0x0117 }
            r6 = 1
            r1 = r12
            r1.<init>(r2, r3, r5, r6, r7)     // Catch:{ all -> 0x0117 }
            com.google.ai.b.ii r1 = r12.mo86653j(r9)     // Catch:{ all -> 0x0117 }
            java.util.Set r2 = r12.f254867c     // Catch:{ all -> 0x0117 }
            g.a.a r3 = r0.f273818n     // Catch:{ all -> 0x0117 }
            java.lang.Object r3 = r3.mo17428b()     // Catch:{ all -> 0x0117 }
            com.google.android.apps.gsa.sidekick.main.entry.al r3 = (com.google.android.apps.gsa.sidekick.main.entry.C91307al) r3     // Catch:{ all -> 0x0117 }
            boolean r4 = r2.isEmpty()     // Catch:{ all -> 0x0117 }
            if (r4 != 0) goto L_0x0053
            com.google.android.apps.gsa.sidekick.main.entry.av r4 = new com.google.android.apps.gsa.sidekick.main.entry.av     // Catch:{ all -> 0x0117 }
            r4.<init>(r3, r2, r11)     // Catch:{ all -> 0x0117 }
            com.google.ai.b.ii r1 = r4.mo86654k(r1)     // Catch:{ all -> 0x0117 }
            r2 = 1
            goto L_0x0054
        L_0x0053:
            r2 = 0
        L_0x0054:
            com.google.android.apps.gsa.staticplugins.co.a.an r1 = r0.mo90919n(r12, r1)     // Catch:{ all -> 0x0117 }
            boolean r4 = r1.mo90912b()     // Catch:{ all -> 0x0117 }
            com.google.ai.b.ii r1 = r1.mo90911a()     // Catch:{ all -> 0x0117 }
            r0.mo90927v(r1)     // Catch:{ all -> 0x0117 }
            com.google.android.apps.gsa.sidekick.main.entry.as r1 = r0.f273806b     // Catch:{ all -> 0x0117 }
            com.google.common.util.concurrent.cx r1 = r1.mo85607b(r3)     // Catch:{ all -> 0x0117 }
            com.google.common.util.concurrent.C60856cj.m92910s(r1)     // Catch:{ all -> 0x0117 }
            goto L_0x0070
        L_0x006d:
            r12 = r10
            r2 = 0
            r4 = 0
        L_0x0070:
            monitor-exit(r8)     // Catch:{ all -> 0x0117 }
            if (r2 != 0) goto L_0x0079
            if (r4 == 0) goto L_0x0076
            goto L_0x0079
        L_0x0076:
            com.google.common.util.concurrent.cx r1 = com.google.android.apps.gsa.p8883x.C118826c.f331423b
            goto L_0x007f
        L_0x0079:
            com.google.android.apps.gsa.sidekick.main.entry.bb r1 = r0.f273823s
            com.google.common.util.concurrent.cx r1 = r1.mo85626l()
        L_0x007f:
            if (r12 == 0) goto L_0x0116
            com.google.android.apps.gsa.sidekick.main.trigger.TriggerConditionEvaluator r2 = r12.f254866b
            com.google.android.apps.gsa.sidekick.main.trigger.c r2 = r2.f255551a
            java.util.List r2 = r2.f255566f
            boolean r3 = r2.isEmpty()
            if (r3 != 0) goto L_0x00ec
            java.lang.Object r2 = r2.get(r11)
            com.google.ai.b.yg r2 = (com.google.p375ai.p378b.C8174yg) r2
            com.google.ai.b.yg r3 = com.google.p375ai.p378b.C8174yg.f28719i
            com.google.protobuf.bn r3 = r3.createBuilder()
            com.google.ai.b.yd r3 = (com.google.p375ai.p378b.C8171yd) r3
            com.google.protobuf.cj r4 = new com.google.protobuf.cj
            com.google.protobuf.ch r5 = r2.f28722b
            com.google.protobuf.ci r6 = com.google.p375ai.p378b.C8174yg.f28718c
            r4.<init>(r5, r6)
            r3.copyOnWrite()
            com.google.protobuf.bv r5 = r3.instance
            com.google.ai.b.yg r5 = (com.google.p375ai.p378b.C8174yg) r5
            com.google.protobuf.ch r6 = r5.f28722b
            boolean r7 = r6.mo58948c()
            if (r7 != 0) goto L_0x00b9
            com.google.protobuf.ch r6 = com.google.protobuf.C62942bv.mutableCopy((com.google.protobuf.C62961ch) r6)
            r5.f28722b = r6
        L_0x00b9:
            java.util.Iterator r4 = r4.iterator()
        L_0x00bd:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L_0x00d1
            java.lang.Object r6 = r4.next()
            com.google.ai.b.yf r6 = (com.google.p375ai.p378b.C8173yf) r6
            com.google.protobuf.ch r7 = r5.f28722b
            int r6 = r6.f28717g
            r7.mo58916g(r6)
            goto L_0x00bd
        L_0x00d1:
            com.google.protobuf.z r2 = r2.f28727h
            r3.copyOnWrite()
            com.google.protobuf.bv r4 = r3.instance
            com.google.ai.b.yg r4 = (com.google.p375ai.p378b.C8174yg) r4
            r2.getClass()
            int r5 = r4.f28721a
            r5 = r5 | 8
            r4.f28721a = r5
            r4.f28727h = r2
            com.google.protobuf.bv r2 = r3.build()
            r10 = r2
            com.google.ai.b.yg r10 = (com.google.p375ai.p378b.C8174yg) r10
        L_0x00ec:
            boolean r2 = r12.f254870f
            if (r2 == 0) goto L_0x0113
            com.google.android.apps.gsa.proactive.b.c r2 = r12.f254869e     // Catch:{ ExecutionException -> 0x00fe, InterruptedException -> 0x00fc }
            com.google.ai.b.eo r3 = com.google.p375ai.p378b.C7642eo.LEGACY_TRIGGER_CONDITION     // Catch:{ ExecutionException -> 0x00fe, InterruptedException -> 0x00fc }
            com.google.common.util.concurrent.cx r2 = r2.mo77605f(r3, r10)     // Catch:{ ExecutionException -> 0x00fe, InterruptedException -> 0x00fc }
            com.google.android.apps.gsa.shared.util.p7159c.C90877ak.m148472f(r2)     // Catch:{ ExecutionException -> 0x00fe, InterruptedException -> 0x00fc }
            goto L_0x0113
        L_0x00fc:
            r2 = move-exception
            goto L_0x00ff
        L_0x00fe:
            r2 = move-exception
        L_0x00ff:
            com.google.common.f.e r3 = com.google.android.apps.gsa.sidekick.main.entry.C91321az.f254865a
            com.google.common.f.x r3 = r3.mo56225c()
            com.google.common.f.aa r4 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r5 = "EntryTreeTriggerCondEva"
            r3.mo56378ag(r4, r5)
            java.lang.String r4 = "Failed to queue request"
            r5 = 11554(0x2d22, float:1.619E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r3).mo56382g(r2)).mo56372aa(r5)).mo56386p(r4)
        L_0x0113:
            r0.mo90926u(r12)
        L_0x0116:
            return r1
        L_0x0117:
            r0 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x0117 }
            goto L_0x011b
        L_0x011a:
            throw r0
        L_0x011b:
            goto L_0x011a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.p7686co.p7687a.C98129k.mo17947a():java.lang.Object");
    }
}
