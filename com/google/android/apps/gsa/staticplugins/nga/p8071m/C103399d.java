package com.google.android.apps.gsa.staticplugins.nga.p8071m;

import android.net.Network;
import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.common.util.concurrent.SettableFuture;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.m.d */
/* compiled from: PG */
public final /* synthetic */ class C103399d implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C103401f f288239a;

    /* renamed from: b */
    public final /* synthetic */ Network f288240b;

    /* renamed from: c */
    public final /* synthetic */ long f288241c;

    /* renamed from: d */
    public final /* synthetic */ SettableFuture f288242d;

    public /* synthetic */ C103399d(C103401f fVar, Network network, long j, SettableFuture settableFuture) {
        this.f288239a = fVar;
        this.f288240b = network;
        this.f288241c = j;
        this.f288242d = settableFuture;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0067 A[LOOP:0: B:1:0x0010->B:16:0x0067, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x006a A[EDGE_INSN: B:45:0x006a->B:17:0x006a ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r26 = this;
            r0 = r26
            com.google.android.apps.gsa.staticplugins.nga.m.f r1 = r0.f288239a
            android.net.Network r2 = r0.f288240b
            long r3 = r0.f288241c
            com.google.common.util.concurrent.SettableFuture r5 = r0.f288242d
            com.google.common.b.gp r6 = com.google.common.p4522b.C58485gu.m89837e()
            r8 = 0
            r9 = 0
        L_0x0010:
            r10 = 10
            if (r8 >= r10) goto L_0x006a
            r10 = 73
            android.net.TrafficStats.setThreadStatsTag(r10)
            com.google.common.base.cz r10 = r1.f288244b     // Catch:{ IOException -> 0x004a }
            long r10 = r10.mo26884a()     // Catch:{ IOException -> 0x004a }
            java.lang.String r12 = "connectivitycheck.gstatic.com"
            java.net.InetAddress r12 = r2.getByName(r12)     // Catch:{ IOException -> 0x004a }
            j$.time.Duration r13 = r1.mo93778c()     // Catch:{ IOException -> 0x004a }
            r14 = 2
            j$.time.Duration r13 = r13.multipliedBy(r14)     // Catch:{ IOException -> 0x004a }
            long r13 = r13.toMillis()     // Catch:{ IOException -> 0x004a }
            int r14 = (int) r13     // Catch:{ IOException -> 0x004a }
            boolean r12 = r12.isReachable(r14)     // Catch:{ IOException -> 0x004a }
            if (r12 == 0) goto L_0x004a
            com.google.common.base.cz r12 = r1.f288244b     // Catch:{ IOException -> 0x004a }
            long r12 = r12.mo26884a()     // Catch:{ IOException -> 0x004a }
            long r12 = r12 - r10
            j$.time.Duration r10 = p3186j$.time.Duration.ofNanos(r12)     // Catch:{ IOException -> 0x004a }
            j$.util.Optional r10 = p3186j$.util.Optional.m71637of(r10)     // Catch:{ IOException -> 0x004a }
            goto L_0x004e
        L_0x004a:
            j$.util.Optional r10 = p3186j$.util.Optional.empty()
        L_0x004e:
            boolean r11 = r10.isPresent()
            if (r11 == 0) goto L_0x005e
            java.lang.Object r10 = r10.get()
            j$.time.Duration r10 = (p3186j$.time.Duration) r10
            r6.mo55395g(r10)
            goto L_0x0060
        L_0x005e:
            int r9 = r9 + 1
        L_0x0060:
            int r10 = r1.mo93777b()
            if (r9 < r10) goto L_0x0067
            goto L_0x006a
        L_0x0067:
            int r8 = r8 + 1
            goto L_0x0010
        L_0x006a:
            com.google.common.b.gu r2 = r6.mo55394f()
            j$.util.stream.Stream r6 = p3186j$.util.Collection.EL.stream(r2)
            com.google.android.apps.gsa.staticplugins.nga.m.b r8 = com.google.android.apps.gsa.staticplugins.nga.p8071m.C103397b.f288237a
            j$.util.Optional r6 = r6.min(r8)
            j$.util.stream.Stream r8 = p3186j$.util.Collection.EL.stream(r2)
            com.google.android.apps.gsa.staticplugins.nga.m.b r10 = com.google.android.apps.gsa.staticplugins.nga.p8071m.C103397b.f288237a
            j$.util.Optional r8 = r8.max(r10)
            boolean r10 = r2.isEmpty()
            if (r10 == 0) goto L_0x008d
            j$.util.Optional r10 = p3186j$.util.Optional.empty()
            goto L_0x00aa
        L_0x008d:
            j$.util.stream.Stream r10 = p3186j$.util.Collection.EL.stream(r2)
            com.google.android.apps.gsa.staticplugins.nga.m.c r11 = com.google.android.apps.gsa.staticplugins.nga.p8071m.C103398c.f288238a
            j$.util.stream.LongStream r10 = r10.mapToLong(r11)
            long r10 = r10.sum()
            r12 = r2
            com.google.common.b.pq r12 = (com.google.common.p4522b.C58724pq) r12
            int r12 = r12.f156474d
            long r12 = (long) r12
            long r10 = r10 / r12
            j$.time.Duration r10 = p3186j$.time.Duration.ofMillis(r10)
            j$.util.Optional r10 = p3186j$.util.Optional.m71637of(r10)
        L_0x00aa:
            com.google.common.f.a.d r11 = com.google.android.apps.gsa.staticplugins.nga.p8071m.C103401f.f288243a
            com.google.common.f.x r11 = r11.mo56224b()
            com.google.common.f.a.a r11 = (com.google.common.p4526f.p4527a.C58970a) r11
            r12 = 21525(0x5415, float:3.0163E-41)
            com.google.common.f.x r11 = r11.mo56372aa(r12)
            r12 = r11
            com.google.common.f.a.a r12 = (com.google.common.p4526f.p4527a.C58970a) r12
            r11 = r2
            com.google.common.b.pq r11 = (com.google.common.p4522b.C58724pq) r11
            int r11 = r11.f156474d
            java.lang.Integer r14 = java.lang.Integer.valueOf(r11)
            java.lang.Integer r15 = java.lang.Integer.valueOf(r9)
            j$.time.Duration r11 = p3186j$.time.Duration.ZERO
            java.lang.Object r6 = r6.orElse(r11)
            j$.time.Duration r6 = (p3186j$.time.Duration) r6
            long r16 = r6.toMillis()
            java.lang.Long r16 = java.lang.Long.valueOf(r16)
            j$.time.Duration r6 = p3186j$.time.Duration.ZERO
            java.lang.Object r6 = r8.orElse(r6)
            j$.time.Duration r6 = (p3186j$.time.Duration) r6
            long r17 = r6.toMillis()
            java.lang.Long r17 = java.lang.Long.valueOf(r17)
            j$.time.Duration r6 = p3186j$.time.Duration.ZERO
            java.lang.Object r6 = r10.orElse(r6)
            j$.time.Duration r6 = (p3186j$.time.Duration) r6
            long r18 = r6.toMillis()
            java.lang.Long r18 = java.lang.Long.valueOf(r18)
            boolean r6 = r2.isEmpty()
            r19 = 0
            if (r6 == 0) goto L_0x0105
            r23 = r5
            r25 = r12
            goto L_0x0170
        L_0x0105:
            j$.util.stream.Stream r2 = p3186j$.util.Collection.EL.stream(r2)
            com.google.android.apps.gsa.staticplugins.nga.m.a r6 = com.google.android.apps.gsa.staticplugins.nga.p8071m.C103396a.f288236a
            j$.util.stream.Stream r2 = r2.map(r6)
            j$.util.stream.Collector r6 = com.google.common.p4522b.C58370cn.f155946a
            java.lang.Object r2 = r2.collect(r6)
            com.google.common.b.gu r2 = (com.google.common.p4522b.C58485gu) r2
            int r6 = r2.size()
            int r8 = r2.size()
            r21 = r19
            r11 = 0
        L_0x0122:
            if (r11 >= r8) goto L_0x0133
            java.lang.Object r13 = r2.get(r11)
            java.lang.Double r13 = (java.lang.Double) r13
            double r23 = r13.doubleValue()
            double r21 = r21 + r23
            int r11 = r11 + 1
            goto L_0x0122
        L_0x0133:
            double r7 = (double) r6
            java.lang.Double.isNaN(r7)
            double r21 = r21 / r7
            int r6 = r2.size()
            r13 = 0
        L_0x013e:
            if (r13 >= r6) goto L_0x0163
            java.lang.Object r23 = r2.get(r13)
            java.lang.Double r23 = (java.lang.Double) r23
            double r23 = r23.doubleValue()
            r25 = r12
            double r11 = r23 - r21
            r23 = r5
            r24 = r6
            r5 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r5 = java.lang.Math.pow(r11, r5)
            double r19 = r19 + r5
            int r13 = r13 + 1
            r5 = r23
            r6 = r24
            r12 = r25
            goto L_0x013e
        L_0x0163:
            r23 = r5
            r25 = r12
            java.lang.Double.isNaN(r7)
            double r19 = r19 / r7
            double r19 = java.lang.Math.sqrt(r19)
        L_0x0170:
            java.lang.String r13 = "Network latency, successful count: %s, drop count: %s, [ms] min: %s, max: %s, avg: %s, sd: %.2f"
            java.lang.Double r19 = java.lang.Double.valueOf(r19)
            r12 = r25
            r12.mo56362O(r13, r14, r15, r16, r17, r18, r19)
            int r2 = r1.mo93777b()
            r5 = 1
            if (r9 >= r2) goto L_0x019a
            boolean r2 = r10.isPresent()
            if (r2 == 0) goto L_0x019a
            java.lang.Object r2 = r10.get()
            j$.time.Duration r2 = (p3186j$.time.Duration) r2
            j$.time.Duration r6 = r1.mo93778c()
            int r2 = r2.compareTo((p3186j$.time.Duration) r6)
            if (r2 >= 0) goto L_0x019a
            r7 = 1
            goto L_0x019b
        L_0x019a:
            r7 = 0
        L_0x019b:
            com.google.common.f.a.d r2 = com.google.android.apps.gsa.staticplugins.nga.p8071m.C103401f.f288243a
            com.google.common.f.x r2 = r2.mo56224b()
            com.google.common.f.a.a r2 = (com.google.common.p4526f.p4527a.C58970a) r2
            r6 = 21526(0x5416, float:3.0164E-41)
            com.google.common.f.x r2 = r2.mo56372aa(r6)
            com.google.common.f.a.a r2 = (com.google.common.p4526f.p4527a.C58970a) r2
            int r6 = r1.mo93777b()
            j$.time.Duration r1 = r1.mo93778c()
            java.lang.String r8 = "unacceptableDropPacketCount: %s, latencyThreshold: %s"
            r2.mo56395y(r8, r6, r1)
            if (r7 == 0) goto L_0x01d0
            com.google.common.f.a.d r1 = com.google.android.apps.gsa.staticplugins.nga.p8071m.C103401f.f288243a
            com.google.common.f.x r1 = r1.mo56224b()
            com.google.common.f.a.a r1 = (com.google.common.p4526f.p4527a.C58970a) r1
            r2 = 21524(0x5414, float:3.0162E-41)
            com.google.common.f.x r1 = r1.mo56372aa(r2)
            com.google.common.f.a.a r1 = (com.google.common.p4526f.p4527a.C58970a) r1
            java.lang.String r2 = "Network: %s is Good"
            r1.mo56388r(r2, r3)
            goto L_0x01e5
        L_0x01d0:
            com.google.common.f.a.d r1 = com.google.android.apps.gsa.staticplugins.nga.p8071m.C103401f.f288243a
            com.google.common.f.x r1 = r1.mo56224b()
            com.google.common.f.a.a r1 = (com.google.common.p4526f.p4527a.C58970a) r1
            r2 = 21523(0x5413, float:3.016E-41)
            com.google.common.f.x r1 = r1.mo56372aa(r2)
            com.google.common.f.a.a r1 = (com.google.common.p4526f.p4527a.C58970a) r1
            java.lang.String r2 = "Network: %s is Bad"
            r1.mo56388r(r2, r3)
        L_0x01e5:
            com.google.android.apps.gsa.nga.shared.aa.dd r1 = com.google.android.apps.gsa.nga.shared.p6275aa.C80275dd.f220288c
            com.google.protobuf.bn r1 = r1.createBuilder()
            com.google.android.apps.gsa.nga.shared.aa.bu r1 = (com.google.android.apps.gsa.nga.shared.p6275aa.C80143bu) r1
            com.google.android.apps.gsa.nga.shared.aa.ce r2 = com.google.android.apps.gsa.nga.shared.p6275aa.C80156ce.f219955d
            com.google.protobuf.bn r2 = r2.createBuilder()
            com.google.android.apps.gsa.nga.shared.aa.cd r2 = (com.google.android.apps.gsa.nga.shared.p6275aa.C80155cd) r2
            r2.copyOnWrite()
            com.google.protobuf.bv r6 = r2.instance
            com.google.android.apps.gsa.nga.shared.aa.ce r6 = (com.google.android.apps.gsa.nga.shared.p6275aa.C80156ce) r6
            int r8 = r6.f219957a
            r5 = r5 | r8
            r6.f219957a = r5
            r6.f219958b = r3
            r2.copyOnWrite()
            com.google.protobuf.bv r3 = r2.instance
            com.google.android.apps.gsa.nga.shared.aa.ce r3 = (com.google.android.apps.gsa.nga.shared.p6275aa.C80156ce) r3
            int r4 = r3.f219957a
            r4 = r4 | 2
            r3.f219957a = r4
            r3.f219959c = r7
            com.google.protobuf.bv r2 = r2.build()
            com.google.android.apps.gsa.nga.shared.aa.ce r2 = (com.google.android.apps.gsa.nga.shared.p6275aa.C80156ce) r2
            r1.copyOnWrite()
            com.google.protobuf.bv r3 = r1.instance
            com.google.android.apps.gsa.nga.shared.aa.dd r3 = (com.google.android.apps.gsa.nga.shared.p6275aa.C80275dd) r3
            r2.getClass()
            r3.f220291b = r2
            r2 = 3
            r3.f220290a = r2
            com.google.protobuf.bv r1 = r1.build()
            com.google.android.apps.gsa.nga.shared.aa.dd r1 = (com.google.android.apps.gsa.nga.shared.p6275aa.C80275dd) r1
            r2 = r23
            r2.mo57356n(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.nga.p8071m.C103399d.run():void");
    }
}
