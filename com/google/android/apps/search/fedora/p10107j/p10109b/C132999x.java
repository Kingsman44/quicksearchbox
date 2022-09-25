package com.google.android.apps.search.fedora.p10107j.p10109b;

import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.apps.search.fedora.j.b.x */
/* compiled from: PG */
public final /* synthetic */ class C132999x implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C133001z f362705a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f362706b;

    /* renamed from: c */
    public final /* synthetic */ C60870cx f362707c;

    public /* synthetic */ C132999x(C133001z zVar, C60870cx cxVar, C60870cx cxVar2) {
        this.f362705a = zVar;
        this.f362706b = cxVar;
        this.f362707c = cxVar2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:40:0x010e, code lost:
        if (r5 == null) goto L_0x0131;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x012f, code lost:
        if (r5 == null) goto L_0x0131;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object call() {
        /*
            r25 = this;
            r1 = r25
            com.google.android.apps.search.fedora.j.b.z r0 = r1.f362705a
            com.google.common.util.concurrent.cx r2 = r1.f362706b
            com.google.common.util.concurrent.cx r3 = r1.f362707c
            java.lang.Object r2 = com.google.common.util.concurrent.C60856cj.m92909r(r2)
            j$.util.Optional r2 = (p3186j$.util.Optional) r2
            java.lang.Object r3 = com.google.common.util.concurrent.C60856cj.m92909r(r3)
            com.google.speech.c.a.b r3 = (com.google.speech.p5199c.p5200a.C66457b) r3
            boolean r4 = r2.isEmpty()
            if (r4 == 0) goto L_0x001d
        L_0x001a:
            r0 = 0
            goto L_0x020f
        L_0x001d:
            com.google.android.apps.search.fedora.c.e r4 = r0.f362717i
            java.lang.Object r2 = r2.get()
            com.google.speech.m.aa r2 = (com.google.speech.p5228m.C67270aa) r2
            com.google.common.f.e r6 = com.google.android.apps.search.fedora.p10094c.C132730e.f362155a
            com.google.common.f.x r6 = r6.mo56224b()
            com.google.common.f.aa r7 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r8 = "FedoraEkhoMaintenance"
            r6.mo56378ag(r7, r8)
            java.lang.String r7 = "getCacheMetrics"
            r8 = 39805(0x9b7d, float:5.5779E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r6).mo56372aa(r8)).mo56386p(r7)
            boolean r6 = com.google.android.apps.search.fedora.p10094c.C132730e.m215744a(r2)
            if (r6 != 0) goto L_0x0042
            r2 = 0
            goto L_0x005f
        L_0x0042:
            com.google.android.apps.search.fedora.c.c r6 = r4.f362157c
            android.content.Context r6 = r6.f362154a
            com.google.android.apps.search.fedora.p10094c.C132727b.m215742a(r6)
            com.google.android.libraries.assistant.trainingcache.bindings.IRealtimeLogger r6 = r4.f362156b
            com.google.android.libraries.assistant.trainingcache.bindings.EkhoRealtimeLogging.nativeSetRealtimeLogger(r6)
            com.google.android.apps.search.fedora.c.h r4 = r4.f362158d
            com.google.android.libraries.assistant.trainingcache.bindings.EkhoMaintenance r4 = new com.google.android.libraries.assistant.trainingcache.bindings.EkhoMaintenance
            r4.<init>()
            r4.mo24637c(r2)     // Catch:{ all -> 0x0210 }
            com.google.speech.m.m r2 = r4.mo24635a()     // Catch:{ all -> 0x0210 }
            r4.close()
        L_0x005f:
            if (r2 == 0) goto L_0x001a
            com.google.speech.c.a.v r4 = com.google.speech.p5199c.p5200a.C66477v.f180755j
            com.google.protobuf.bn r4 = r4.createBuilder()
            com.google.speech.c.a.n r4 = (com.google.speech.p5199c.p5200a.C66469n) r4
            com.google.protobuf.cq r6 = r2.f183063b
            int r6 = r6.size()
            r9 = 1
            if (r6 <= 0) goto L_0x013d
            com.google.protobuf.cq r6 = r2.f183063b
            java.util.Iterator r6 = r6.iterator()
            r12 = 0
            r14 = 0
            r16 = 0
            r18 = 0
            r20 = 0
        L_0x0082:
            boolean r22 = r6.hasNext()
            if (r22 == 0) goto L_0x013a
            java.lang.Object r22 = r6.next()
            r5 = r22
            com.google.speech.m.ak r5 = (com.google.speech.p5228m.C67280ak) r5
            com.google.speech.c.a.u r22 = com.google.speech.p5199c.p5200a.C66476u.f180749e
            com.google.protobuf.bn r22 = r22.createBuilder()
            r10 = r22
            com.google.speech.c.a.t r10 = (com.google.speech.p5199c.p5200a.C66475t) r10
            int r11 = r5.f182884a
            int r11 = com.google.speech.p5228m.C67278ai.m97449b(r11)
            if (r11 != 0) goto L_0x00a3
            r11 = 1
        L_0x00a3:
            r10.copyOnWrite()
            com.google.protobuf.bv r7 = r10.instance
            com.google.speech.c.a.u r7 = (com.google.speech.p5199c.p5200a.C66476u) r7
            int r11 = r11 + -1
            r7.f180752b = r11
            int r8 = r7.f180751a
            r8 = r8 | r9
            r7.f180751a = r8
            com.google.speech.m.ag r7 = r5.f182885b
            if (r7 != 0) goto L_0x00b9
            com.google.speech.m.ag r7 = com.google.speech.p5228m.C67276ag.f182875c
        L_0x00b9:
            long r7 = r7.f182877a
            r10.copyOnWrite()
            com.google.protobuf.bv r11 = r10.instance
            com.google.speech.c.a.u r11 = (com.google.speech.p5199c.p5200a.C66476u) r11
            int r9 = r11.f180751a
            r9 = r9 | 2
            r11.f180751a = r9
            r11.f180753c = r7
            com.google.speech.m.ag r7 = r5.f182885b
            if (r7 != 0) goto L_0x00d0
            com.google.speech.m.ag r7 = com.google.speech.p5228m.C67276ag.f182875c
        L_0x00d0:
            long r7 = r7.f182878b
            r10.copyOnWrite()
            com.google.protobuf.bv r9 = r10.instance
            com.google.speech.c.a.u r9 = (com.google.speech.p5199c.p5200a.C66476u) r9
            int r11 = r9.f180751a
            r11 = r11 | 4
            r9.f180751a = r11
            r23 = 1024(0x400, double:5.06E-321)
            long r7 = r7 / r23
            r9.f180754d = r7
            r4.mo59633a(r10)
            int r7 = r5.f182884a
            int r7 = com.google.speech.p5228m.C67278ai.m97449b(r7)
            if (r7 != 0) goto L_0x00f1
            r7 = 1
        L_0x00f1:
            int r7 = r7 + -1
            r8 = 1
            if (r7 == r8) goto L_0x0125
            r8 = 1000(0x3e8, float:1.401E-42)
            if (r7 == r8) goto L_0x0111
            r8 = 1004(0x3ec, float:1.407E-42)
            if (r7 == r8) goto L_0x0111
            r8 = 1005(0x3ed, float:1.408E-42)
            if (r7 == r8) goto L_0x0111
            com.google.speech.m.ag r5 = r5.f182885b
            if (r5 != 0) goto L_0x0109
            com.google.speech.m.ag r7 = com.google.speech.p5228m.C67276ag.f182875c
            goto L_0x010a
        L_0x0109:
            r7 = r5
        L_0x010a:
            long r7 = r7.f182877a
            long r18 = r18 + r7
            if (r5 != 0) goto L_0x0133
            goto L_0x0131
        L_0x0111:
            com.google.speech.m.ag r5 = r5.f182885b
            if (r5 != 0) goto L_0x0118
            com.google.speech.m.ag r7 = com.google.speech.p5228m.C67276ag.f182875c
            goto L_0x0119
        L_0x0118:
            r7 = r5
        L_0x0119:
            long r7 = r7.f182877a
            long r14 = r14 + r7
            if (r5 != 0) goto L_0x0120
            com.google.speech.m.ag r5 = com.google.speech.p5228m.C67276ag.f182875c
        L_0x0120:
            long r7 = r5.f182878b
            long r16 = r16 + r7
            goto L_0x0137
        L_0x0125:
            com.google.speech.m.ag r5 = r5.f182885b
            if (r5 != 0) goto L_0x012c
            com.google.speech.m.ag r7 = com.google.speech.p5228m.C67276ag.f182875c
            goto L_0x012d
        L_0x012c:
            r7 = r5
        L_0x012d:
            long r12 = r7.f182877a
            if (r5 != 0) goto L_0x0133
        L_0x0131:
            com.google.speech.m.ag r5 = com.google.speech.p5228m.C67276ag.f182875c
        L_0x0133:
            long r7 = r5.f182878b
            long r20 = r20 + r7
        L_0x0137:
            r9 = 1
            goto L_0x0082
        L_0x013a:
            r5 = r18
            goto L_0x0147
        L_0x013d:
            r5 = 0
            r12 = 0
            r14 = 0
            r16 = 0
            r20 = 0
        L_0x0147:
            r4.copyOnWrite()
            com.google.protobuf.bv r7 = r4.instance
            com.google.speech.c.a.v r7 = (com.google.speech.p5199c.p5200a.C66477v) r7
            r3.getClass()
            r7.f180758b = r3
            int r3 = r7.f180757a
            r8 = 1
            r3 = r3 | r8
            r7.f180757a = r3
            int r2 = r2.f183062a
            r4.copyOnWrite()
            com.google.protobuf.bv r3 = r4.instance
            com.google.speech.c.a.v r3 = (com.google.speech.p5199c.p5200a.C66477v) r3
            int r7 = r3.f180757a
            r7 = r7 | 512(0x200, float:7.175E-43)
            r3.f180757a = r7
            r3.f180764h = r2
            r4.copyOnWrite()
            com.google.protobuf.bv r2 = r4.instance
            com.google.speech.c.a.v r2 = (com.google.speech.p5199c.p5200a.C66477v) r2
            int r3 = r2.f180757a
            r3 = r3 | 8
            r2.f180757a = r3
            int r3 = (int) r12
            r2.f180761e = r3
            r4.copyOnWrite()
            com.google.protobuf.bv r2 = r4.instance
            com.google.speech.c.a.v r2 = (com.google.speech.p5199c.p5200a.C66477v) r2
            int r3 = r2.f180757a
            r3 = r3 | 32
            r2.f180757a = r3
            int r3 = (int) r14
            r2.f180762f = r3
            r4.copyOnWrite()
            com.google.protobuf.bv r2 = r4.instance
            com.google.speech.c.a.v r2 = (com.google.speech.p5199c.p5200a.C66477v) r2
            int r3 = r2.f180757a
            r3 = r3 | 64
            r2.f180757a = r3
            r7 = 1024(0x400, double:5.06E-321)
            long r9 = r16 / r7
            r2.f180763g = r9
            r4.copyOnWrite()
            com.google.protobuf.bv r2 = r4.instance
            com.google.speech.c.a.v r2 = (com.google.speech.p5199c.p5200a.C66477v) r2
            int r3 = r2.f180757a
            r3 = r3 | 4
            r2.f180757a = r3
            r2.f180760d = r5
            r4.copyOnWrite()
            com.google.protobuf.bv r2 = r4.instance
            com.google.speech.c.a.v r2 = (com.google.speech.p5199c.p5200a.C66477v) r2
            int r3 = r2.f180757a
            r3 = r3 | 2
            r2.f180757a = r3
            r5 = 1024(0x400, double:5.06E-321)
            long r5 = r20 / r5
            r2.f180759c = r5
            com.google.protobuf.bv r2 = r4.build()
            com.google.speech.c.a.v r2 = (com.google.speech.p5199c.p5200a.C66477v) r2
            com.google.speech.c.a.b r3 = r2.f180758b
            if (r3 != 0) goto L_0x01cb
            com.google.speech.c.a.b r3 = com.google.speech.p5199c.p5200a.C66457b.f180706c
        L_0x01cb:
            boolean r3 = r3.f180709b
            if (r3 == 0) goto L_0x01e5
            com.google.speech.c.a.f r3 = com.google.speech.p5199c.p5200a.C66461f.f180719g
            com.google.protobuf.bn r3 = r3.createBuilder()
            com.google.speech.c.a.e r3 = (com.google.speech.p5199c.p5200a.C66460e) r3
            r3.mo59632a(r2)
            com.google.protobuf.bv r3 = r3.build()
            com.google.speech.c.a.f r3 = (com.google.speech.p5199c.p5200a.C66461f) r3
            com.google.android.apps.search.fedora.metrics.j r4 = r0.f362718j
            r4.mo110968f(r3)
        L_0x01e5:
            long r3 = r2.f180760d
            r5 = 0
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 > 0) goto L_0x01f1
            int r3 = r2.f180762f
            if (r3 <= 0) goto L_0x001a
        L_0x01f1:
            com.google.android.apps.search.fedora.metrics.j r3 = r0.f362718j
            java.lang.String r4 = "Ekho.NumAudioRecords"
            int r5 = r2.f180762f
            r3.mo110965c(r4, r5)
            com.google.android.apps.search.fedora.metrics.j r3 = r0.f362718j
            long r4 = r2.f180760d
            int r5 = (int) r4
            java.lang.String r4 = "Ekho.NumNonAudioRecords"
            r3.mo110965c(r4, r5)
            com.google.android.apps.search.fedora.metrics.j r0 = r0.f362718j
            java.lang.String r3 = "Ekho.NumSessions"
            int r2 = r2.f180761e
            r0.mo110965c(r3, r2)
            goto L_0x001a
        L_0x020f:
            return r0
        L_0x0210:
            r0 = move-exception
            r2 = r0
            r4.close()     // Catch:{ all -> 0x0216 }
            goto L_0x021b
        L_0x0216:
            r0 = move-exception
            r3 = r0
            com.google.android.apps.search.fedora.p10094c.C132729d.m215743a(r2, r3)
        L_0x021b:
            goto L_0x021d
        L_0x021c:
            throw r2
        L_0x021d:
            goto L_0x021c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.fedora.p10107j.p10109b.C132999x.call():java.lang.Object");
    }
}
