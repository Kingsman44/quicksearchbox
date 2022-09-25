package p5488io.grpc.p5525e;

import p5488io.grpc.C70343dn;

/* renamed from: io.grpc.e.gf */
/* compiled from: PG */
final class C70525gf implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C70343dn f187918a;

    /* renamed from: b */
    final /* synthetic */ C70526gg f187919b;

    public C70525gf(C70526gg ggVar, C70343dn dnVar) {
        this.f187919b = ggVar;
        this.f187918a = dnVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0055, code lost:
        r8 = r5.f187511b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r15 = this;
            java.lang.String r0 = "Trying to load '"
            io.grpc.e.gg r1 = r15.f187919b
            io.grpc.e.gw r2 = r1.f187922c
            io.grpc.dp r3 = r2.f188015t
            io.grpc.dp r1 = r1.f187921b
            if (r3 == r1) goto L_0x000d
            return
        L_0x000d:
            io.grpc.dn r1 = r15.f187918a
            java.util.List r3 = r1.f187512a
            io.grpc.k r2 = r2.f187976K
            r4 = 2
            java.lang.Object[] r5 = new java.lang.Object[r4]
            r6 = 0
            r5[r6] = r3
            io.grpc.c r1 = r1.f187513b
            r7 = 1
            r5[r7] = r1
            java.lang.String r1 = "Resolved address: {0}, config={1}"
            r2.mo62077b(r7, r1, r5)
            io.grpc.e.gg r1 = r15.f187919b
            io.grpc.e.gw r1 = r1.f187922c
            int r2 = r1.f187990Y
            if (r2 == r4) goto L_0x003c
            io.grpc.k r1 = r1.f187976K
            java.lang.Object[] r2 = new java.lang.Object[r7]
            r2[r6] = r3
            java.lang.String r5 = "Address resolved: {0}"
            r1.mo62077b(r4, r5, r2)
            io.grpc.e.gg r1 = r15.f187919b
            io.grpc.e.gw r1 = r1.f187922c
            r1.f187990Y = r4
        L_0x003c:
            io.grpc.e.gg r1 = r15.f187919b
            io.grpc.e.gw r1 = r1.f187922c
            r2 = 0
            r1.f187991Z = r2
            io.grpc.dn r1 = r15.f187918a
            io.grpc.dk r5 = r1.f187514c
            io.grpc.c r1 = r1.f187513b
            io.grpc.b r8 = p5488io.grpc.C70246bq.f187244a
            java.util.IdentityHashMap r1 = r1.f187256b
            java.lang.Object r1 = r1.get(r8)
            io.grpc.bq r1 = (p5488io.grpc.C70246bq) r1
            if (r5 == 0) goto L_0x005c
            java.lang.Object r8 = r5.f187511b
            if (r8 == 0) goto L_0x005c
            io.grpc.e.hh r8 = (p5488io.grpc.p5525e.C70554hh) r8
            goto L_0x005d
        L_0x005c:
            r8 = r2
        L_0x005d:
            if (r5 == 0) goto L_0x0062
            io.grpc.Status r9 = r5.f187510a
            goto L_0x0063
        L_0x0062:
            r9 = r2
        L_0x0063:
            io.grpc.e.gg r10 = r15.f187919b
            io.grpc.e.gw r10 = r10.f187922c
            boolean r11 = r10.f187982Q
            if (r11 != 0) goto L_0x0096
            if (r8 == 0) goto L_0x0074
            io.grpc.k r5 = r10.f187976K
            java.lang.String r8 = "Service config from name resolver discarded by channel settings"
            r5.mo62076a(r4, r8)
        L_0x0074:
            io.grpc.e.gg r5 = r15.f187919b
            io.grpc.e.gw r5 = r5.f187922c
            io.grpc.e.hh r8 = r5.f187980O
            if (r8 != 0) goto L_0x007e
            io.grpc.e.hh r8 = p5488io.grpc.p5525e.C70542gw.f187963f
        L_0x007e:
            if (r1 == 0) goto L_0x0087
            io.grpc.k r1 = r5.f187976K
            java.lang.String r5 = "Config selector from name resolver discarded by channel settings"
            r1.mo62076a(r4, r5)
        L_0x0087:
            io.grpc.e.gg r1 = r15.f187919b
            io.grpc.e.gw r1 = r1.f187922c
            io.grpc.e.gq r1 = r1.f187978M
            io.grpc.bq r5 = r8.mo62300a()
            r1.mo62254d(r5)
            goto L_0x014a
        L_0x0096:
            if (r8 == 0) goto L_0x00bb
            if (r1 == 0) goto L_0x00b1
            io.grpc.e.gq r5 = r10.f187978M
            r5.mo62254d(r1)
            io.grpc.bq r1 = r8.mo62300a()
            if (r1 == 0) goto L_0x00f3
            io.grpc.e.gg r1 = r15.f187919b
            io.grpc.e.gw r1 = r1.f187922c
            io.grpc.k r1 = r1.f187976K
            java.lang.String r5 = "Method configs in service config will be discarded due to presence ofconfig-selector"
            r1.mo62076a(r7, r5)
            goto L_0x00f3
        L_0x00b1:
            io.grpc.e.gq r1 = r10.f187978M
            io.grpc.bq r5 = r8.mo62300a()
            r1.mo62254d(r5)
            goto L_0x00f3
        L_0x00bb:
            io.grpc.e.hh r8 = r10.f187980O
            if (r8 == 0) goto L_0x00d4
            io.grpc.e.gq r1 = r10.f187978M
            io.grpc.bq r5 = r8.mo62300a()
            r1.mo62254d(r5)
            io.grpc.e.gg r1 = r15.f187919b
            io.grpc.e.gw r1 = r1.f187922c
            io.grpc.k r1 = r1.f187976K
            java.lang.String r5 = "Received no service config, using default service config"
            r1.mo62076a(r4, r5)
            goto L_0x00f3
        L_0x00d4:
            if (r9 == 0) goto L_0x00ec
            boolean r1 = r10.f187981P
            if (r1 != 0) goto L_0x00e9
            io.grpc.k r0 = r10.f187976K
            java.lang.String r1 = "Fallback to error due to invalid first service config without default config"
            r0.mo62076a(r4, r1)
            io.grpc.e.gg r0 = r15.f187919b
            io.grpc.Status r1 = r5.f187510a
            r0.mo62049a(r1)
            return
        L_0x00e9:
            io.grpc.e.hh r8 = r10.f187979N
            goto L_0x00f3
        L_0x00ec:
            io.grpc.e.hh r8 = p5488io.grpc.p5525e.C70542gw.f187963f
            io.grpc.e.gq r1 = r10.f187978M
            r1.mo62254d(r2)
        L_0x00f3:
            io.grpc.e.gg r1 = r15.f187919b
            io.grpc.e.gw r1 = r1.f187922c
            io.grpc.e.hh r1 = r1.f187979N
            boolean r1 = r8.equals(r1)
            if (r1 != 0) goto L_0x011d
            io.grpc.e.gg r1 = r15.f187919b
            io.grpc.e.gw r1 = r1.f187922c
            io.grpc.k r1 = r1.f187976K
            java.lang.Object[] r5 = new java.lang.Object[r7]
            io.grpc.e.hh r9 = p5488io.grpc.p5525e.C70542gw.f187963f
            if (r8 != r9) goto L_0x010e
            java.lang.String r9 = " to empty"
            goto L_0x0110
        L_0x010e:
            java.lang.String r9 = ""
        L_0x0110:
            r5[r6] = r9
            java.lang.String r9 = "Service config changed{0}"
            r1.mo62077b(r4, r9, r5)
            io.grpc.e.gg r1 = r15.f187919b
            io.grpc.e.gw r1 = r1.f187922c
            r1.f187979N = r8
        L_0x011d:
            io.grpc.e.gg r1 = r15.f187919b     // Catch:{ RuntimeException -> 0x0124 }
            io.grpc.e.gw r1 = r1.f187922c     // Catch:{ RuntimeException -> 0x0124 }
            r1.f187981P = r7     // Catch:{ RuntimeException -> 0x0124 }
            goto L_0x014a
        L_0x0124:
            r1 = move-exception
            r14 = r1
            java.util.logging.Logger r9 = p5488io.grpc.p5525e.C70542gw.f187958a
            java.util.logging.Level r10 = java.util.logging.Level.WARNING
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r5 = "["
            r1.<init>(r5)
            io.grpc.e.gg r5 = r15.f187919b
            io.grpc.e.gw r5 = r5.f187922c
            io.grpc.bs r5 = r5.f188004i
            r1.append(r5)
            java.lang.String r5 = "] Unexpected exception from parsing service config"
            r1.append(r5)
            java.lang.String r11 = "io.grpc.internal.ManagedChannelImpl$NameResolverListener$1NamesResolved"
            java.lang.String r12 = "run"
            java.lang.String r13 = r1.toString()
            r9.logp(r10, r11, r12, r13, r14)
        L_0x014a:
            io.grpc.dn r1 = r15.f187918a
            io.grpc.c r1 = r1.f187513b
            io.grpc.e.gg r5 = r15.f187919b
            io.grpc.e.gd r9 = r5.f187920a
            io.grpc.e.gw r5 = r5.f187922c
            io.grpc.e.gd r5 = r5.f188016u
            if (r9 != r5) goto L_0x027b
            io.grpc.a r5 = new io.grpc.a
            r5.<init>(r1)
            io.grpc.b r1 = p5488io.grpc.C70246bq.f187244a
            io.grpc.c r9 = r5.f186946a
            java.util.IdentityHashMap r9 = r9.f187256b
            boolean r9 = r9.containsKey(r1)
            if (r9 == 0) goto L_0x017c
            java.util.IdentityHashMap r9 = new java.util.IdentityHashMap
            io.grpc.c r10 = r5.f186946a
            java.util.IdentityHashMap r10 = r10.f187256b
            r9.<init>(r10)
            r9.remove(r1)
            io.grpc.c r10 = new io.grpc.c
            r10.<init>(r9)
            r5.f186946a = r10
        L_0x017c:
            java.util.IdentityHashMap r9 = r5.f186947b
            if (r9 == 0) goto L_0x0183
            r9.remove(r1)
        L_0x0183:
            java.util.Map r1 = r8.f188077c
            if (r1 == 0) goto L_0x018f
            io.grpc.b r9 = p5488io.grpc.C70282ck.f187354a
            r5.mo61688b(r9, r1)
            r5.mo61687a()
        L_0x018f:
            io.grpc.c r1 = r5.mo61687a()
            io.grpc.e.gg r5 = r15.f187919b
            io.grpc.e.gd r5 = r5.f187920a
            io.grpc.e.p r5 = r5.f187914a
            java.lang.Object r8 = r8.f188076b
            io.grpc.cg r9 = new io.grpc.cg
            r9.<init>(r3, r1, r8)
            java.lang.Object r1 = r9.f187353c
            io.grpc.e.li r1 = (p5488io.grpc.p5525e.C70663li) r1
            if (r1 != 0) goto L_0x01f6
            io.grpc.e.u r1 = r5.f188424d     // Catch:{ t -> 0x01d0 }
            java.lang.String r3 = r1.f188427b     // Catch:{ t -> 0x01d0 }
            java.lang.String r8 = "' because using default policy, but it's unavailable"
            io.grpc.cn r1 = r1.f188426a     // Catch:{ t -> 0x01d0 }
            io.grpc.cl r1 = r1.mo61971a(r3)     // Catch:{ t -> 0x01d0 }
            if (r1 == 0) goto L_0x01bb
            io.grpc.e.li r0 = new io.grpc.e.li
            r0.<init>(r1, r2)
            r1 = r0
            goto L_0x01f6
        L_0x01bb:
            io.grpc.e.t r1 = new io.grpc.e.t     // Catch:{ t -> 0x01d0 }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ t -> 0x01d0 }
            r4.<init>(r0)     // Catch:{ t -> 0x01d0 }
            r4.append(r3)     // Catch:{ t -> 0x01d0 }
            r4.append(r8)     // Catch:{ t -> 0x01d0 }
            java.lang.String r0 = r4.toString()     // Catch:{ t -> 0x01d0 }
            r1.<init>(r0)     // Catch:{ t -> 0x01d0 }
            throw r1     // Catch:{ t -> 0x01d0 }
        L_0x01d0:
            r0 = move-exception
            io.grpc.Status r1 = p5488io.grpc.Status.f186915m
            java.lang.String r0 = r0.getMessage()
            io.grpc.Status r0 = r1.withDescription(r0)
            io.grpc.cd r1 = r5.f188421a
            io.grpc.aa r3 = p5488io.grpc.C70137aa.TRANSIENT_FAILURE
            io.grpc.e.r r4 = new io.grpc.e.r
            r4.<init>(r0)
            r1.mo61943c(r3, r4)
            io.grpc.ck r0 = r5.f188422b
            r0.mo61961c()
            r5.f188423c = r2
            io.grpc.e.s r0 = new io.grpc.e.s
            r0.<init>()
            r5.f188422b = r0
            return
        L_0x01f6:
            io.grpc.cl r0 = r5.f188423c
            if (r0 == 0) goto L_0x020a
            io.grpc.cl r2 = r1.f188387a
            java.lang.String r2 = r2.mo61964c()
            java.lang.String r0 = r0.mo61964c()
            boolean r0 = r2.equals(r0)
            if (r0 != 0) goto L_0x0250
        L_0x020a:
            io.grpc.cd r0 = r5.f188421a
            io.grpc.aa r2 = p5488io.grpc.C70137aa.CONNECTING
            io.grpc.e.q r3 = new io.grpc.e.q
            r3.<init>()
            r0.mo61943c(r2, r3)
            io.grpc.ck r0 = r5.f188422b
            r0.mo61961c()
            io.grpc.cl r0 = r1.f188387a
            r5.f188423c = r0
            io.grpc.ck r0 = r5.f188422b
            io.grpc.cl r2 = r5.f188423c
            io.grpc.cd r3 = r5.f188421a
            io.grpc.ck r2 = r2.mo61940a(r3)
            r5.f188422b = r2
            io.grpc.cd r2 = r5.f188421a
            io.grpc.e.gd r2 = (p5488io.grpc.p5525e.C70523gd) r2
            io.grpc.e.gw r2 = r2.f187915b
            io.grpc.k r2 = r2.f187976K
            java.lang.Object[] r3 = new java.lang.Object[r4]
            java.lang.Class r0 = r0.getClass()
            java.lang.String r0 = r0.getSimpleName()
            r3[r6] = r0
            io.grpc.ck r0 = r5.f188422b
            java.lang.Class r0 = r0.getClass()
            java.lang.String r0 = r0.getSimpleName()
            r3[r7] = r0
            java.lang.String r0 = "Load balancer changed from {0} to {1}"
            r2.mo62077b(r4, r0, r3)
        L_0x0250:
            java.lang.Object r0 = r1.f188388b
            if (r0 == 0) goto L_0x0265
            io.grpc.cd r1 = r5.f188421a
            io.grpc.e.gd r1 = (p5488io.grpc.p5525e.C70523gd) r1
            io.grpc.e.gw r1 = r1.f187915b
            io.grpc.k r1 = r1.f187976K
            java.lang.Object[] r2 = new java.lang.Object[r7]
            r2[r6] = r0
            java.lang.String r3 = "Load-balancing config: {0}"
            r1.mo62077b(r7, r3, r2)
        L_0x0265:
            io.grpc.ck r1 = r5.f188422b
            java.util.List r2 = r9.f187351a
            io.grpc.c r3 = r9.f187352b
            io.grpc.cg r4 = new io.grpc.cg
            r4.<init>(r2, r3, r0)
            boolean r0 = r1.mo61962d(r4)
            if (r0 != 0) goto L_0x027b
            io.grpc.e.gg r0 = r15.f187919b
            r0.mo62245c()
        L_0x027b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p5488io.grpc.p5525e.C70525gf.run():void");
    }
}
