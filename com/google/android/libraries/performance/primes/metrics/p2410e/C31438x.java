package com.google.android.libraries.performance.primes.metrics.p2410e;

import com.google.common.util.concurrent.C60930r;

/* renamed from: com.google.android.libraries.performance.primes.metrics.e.x */
/* compiled from: PG */
public final /* synthetic */ class C31438x implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C31409ac f84644a;

    /* renamed from: b */
    public final /* synthetic */ String f84645b;

    /* renamed from: c */
    public final /* synthetic */ String f84646c;

    /* renamed from: d */
    public final /* synthetic */ int f84647d;

    public /* synthetic */ C31438x(C31409ac acVar, int i, String str, String str2) {
        this.f84644a = acVar;
        this.f84647d = i;
        this.f84645b = str;
        this.f84646c = str2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0100  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.common.util.concurrent.C60870cx mo18058a() {
        /*
            r15 = this;
            com.google.android.libraries.performance.primes.metrics.e.ac r0 = r15.f84644a
            int r1 = r15.f84647d
            java.lang.String r2 = r15.f84645b
            java.lang.String r3 = r15.f84646c
            dagger.a r4 = r0.f84573e
            java.lang.Object r4 = r4.mo27525b()
            com.google.android.libraries.performance.primes.metrics.e.i r4 = (com.google.android.libraries.performance.primes.metrics.p2410e.C31423i) r4
            boolean r5 = com.google.android.libraries.performance.primes.metrics.p2410e.C31409ac.m58554h(r1)
            r6 = -1
            if (r5 == 0) goto L_0x0024
            int r5 = r4.mo37122h()
            r8 = 3
            if (r5 != r8) goto L_0x0022
            r8 = 1000(0x3e8, double:4.94E-321)
            goto L_0x002a
        L_0x0022:
            r8 = r6
            goto L_0x002a
        L_0x0024:
            com.google.android.libraries.performance.primes.metrics.b.m r5 = r0.f84574f
            long r8 = r5.mo37022a(r2)
        L_0x002a:
            int r5 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r5 != 0) goto L_0x0032
            com.google.common.util.concurrent.cx r0 = com.google.common.util.concurrent.C60866ct.f164955a
            goto L_0x0154
        L_0x0032:
            boolean r5 = r4.mo37120f()
            if (r5 == 0) goto L_0x0041
            java.lang.System.gc()
            java.lang.System.runFinalization()
            java.lang.System.gc()
        L_0x0041:
            com.google.common.base.ax r5 = r4.mo37116c()
            java.lang.Object r5 = r5.mo56111f()
            com.google.android.libraries.performance.primes.metrics.e.l r5 = (com.google.android.libraries.performance.primes.metrics.p2410e.C31426l) r5
            r6 = 0
            if (r5 == 0) goto L_0x0062
            j.a.i.b.a.aq r5 = r5.mo37126a()     // Catch:{ RuntimeException -> 0x0053 }
            goto L_0x0063
        L_0x0053:
            r5 = move-exception
            com.google.common.f.e r7 = com.google.android.libraries.performance.primes.metrics.p2410e.C31409ac.f84569a
            com.google.common.f.x r7 = r7.mo56225c()
            java.lang.String r10 = "Metric extension provider failed."
            r11 = 50390(0xc4d6, float:7.0611E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r7).mo56382g(r5)).mo56372aa(r11)).mo56386p(r10)
        L_0x0062:
            r5 = r6
        L_0x0063:
            boolean r4 = r4.mo37121g()
            r7 = 1
            if (r4 == 0) goto L_0x0100
            android.app.Application r4 = r0.f84570b
            android.app.ActivityManager r4 = com.google.android.libraries.performance.primes.p2399d.C31230a.m58229a(r4)
            java.util.List r4 = r4.getRunningAppProcesses()
            if (r4 != 0) goto L_0x007a
            com.google.common.util.concurrent.cx r0 = com.google.common.util.concurrent.C60866ct.f164955a
            goto L_0x0154
        L_0x007a:
            java.util.ArrayList r10 = new java.util.ArrayList
            int r11 = r4.size()
            r10.<init>(r11)
            android.app.Application r11 = r0.f84570b
            r11.getPackageName()
            java.util.Iterator r4 = r4.iterator()
        L_0x008c:
            boolean r11 = r4.hasNext()
            if (r11 == 0) goto L_0x00f0
            java.lang.Object r11 = r4.next()
            android.app.ActivityManager$RunningAppProcessInfo r11 = (android.app.ActivityManager.RunningAppProcessInfo) r11
            j.a.i.b.a.ej r12 = p5535j.p5536a.p5562i.p5568b.p5569a.C71308ej.f190415x
            com.google.protobuf.bn r12 = r12.createBuilder()
            j.a.i.b.a.ei r12 = (p5535j.p5536a.p5562i.p5568b.p5569a.C71307ei) r12
            com.google.android.libraries.performance.primes.metrics.e.ah r13 = r0.f84575g
            int r14 = r11.pid
            java.lang.String r11 = r11.processName
            j.a.i.b.a.bh r11 = r13.mo37113b(r1, r14, r11, r3)
            r12.copyOnWrite()
            com.google.protobuf.bv r13 = r12.instance
            j.a.i.b.a.ej r13 = (p5535j.p5536a.p5562i.p5568b.p5569a.C71308ej) r13
            r11.getClass()
            r13.f190420e = r11
            int r11 = r13.f190416a
            r11 = r11 | 8
            r13.f190416a = r11
            com.google.protobuf.bv r11 = r12.build()
            j.a.i.b.a.ej r11 = (p5535j.p5536a.p5562i.p5568b.p5569a.C71308ej) r11
            com.google.android.libraries.performance.primes.metrics.b.d r12 = com.google.android.libraries.performance.primes.metrics.p2404b.C31302e.m58363j()
            r13 = r12
            com.google.android.libraries.performance.primes.metrics.b.a r13 = (com.google.android.libraries.performance.primes.metrics.p2404b.C31295a) r13
            r13.f84268a = r2
            r12.mo37002c(r7)
            java.lang.Long r14 = java.lang.Long.valueOf(r8)
            r13.f84272e = r14
            r12.mo37004e(r11)
            r13.f84270c = r5
            boolean r11 = com.google.android.libraries.performance.primes.metrics.p2410e.C31409ac.m58554h(r1)
            if (r11 == 0) goto L_0x00e2
            r12.mo37003d(r7)
        L_0x00e2:
            com.google.android.libraries.performance.primes.metrics.b.m r11 = r0.f84574f
            com.google.android.libraries.performance.primes.metrics.b.e r12 = r12.mo37000a()
            com.google.common.util.concurrent.cx r11 = r11.mo37023b(r12)
            r10.add(r11)
            goto L_0x008c
        L_0x00f0:
            com.google.common.util.concurrent.cf r0 = com.google.common.util.concurrent.C60856cj.m92894c(r10)
            com.google.common.util.concurrent.v r1 = new com.google.common.util.concurrent.v
            r1.<init>(r6)
            com.google.common.util.concurrent.bg r2 = com.google.common.util.concurrent.C60826bg.f164896a
            com.google.common.util.concurrent.cx r0 = r0.mo57334a(r1, r2)
            goto L_0x0154
        L_0x0100:
            j.a.i.b.a.ej r4 = p5535j.p5536a.p5562i.p5568b.p5569a.C71308ej.f190415x
            com.google.protobuf.bn r4 = r4.createBuilder()
            j.a.i.b.a.ei r4 = (p5535j.p5536a.p5562i.p5568b.p5569a.C71307ei) r4
            com.google.android.libraries.performance.primes.metrics.e.ah r10 = r0.f84575g
            int r11 = android.os.Process.myPid()
            j.a.i.b.a.bh r3 = r10.mo37113b(r1, r11, r6, r3)
            r4.copyOnWrite()
            com.google.protobuf.bv r6 = r4.instance
            j.a.i.b.a.ej r6 = (p5535j.p5536a.p5562i.p5568b.p5569a.C71308ej) r6
            r3.getClass()
            r6.f190420e = r3
            int r3 = r6.f190416a
            r3 = r3 | 8
            r6.f190416a = r3
            com.google.protobuf.bv r3 = r4.build()
            j.a.i.b.a.ej r3 = (p5535j.p5536a.p5562i.p5568b.p5569a.C71308ej) r3
            com.google.android.libraries.performance.primes.metrics.b.d r4 = com.google.android.libraries.performance.primes.metrics.p2404b.C31302e.m58363j()
            r6 = r4
            com.google.android.libraries.performance.primes.metrics.b.a r6 = (com.google.android.libraries.performance.primes.metrics.p2404b.C31295a) r6
            r6.f84268a = r2
            r4.mo37002c(r7)
            java.lang.Long r2 = java.lang.Long.valueOf(r8)
            r6.f84272e = r2
            r4.mo37004e(r3)
            r6.f84270c = r5
            boolean r1 = com.google.android.libraries.performance.primes.metrics.p2410e.C31409ac.m58554h(r1)
            if (r1 == 0) goto L_0x014a
            r4.mo37003d(r7)
        L_0x014a:
            com.google.android.libraries.performance.primes.metrics.b.m r0 = r0.f84574f
            com.google.android.libraries.performance.primes.metrics.b.e r1 = r4.mo37000a()
            com.google.common.util.concurrent.cx r0 = r0.mo37023b(r1)
        L_0x0154:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.performance.primes.metrics.p2410e.C31438x.mo18058a():com.google.common.util.concurrent.cx");
    }
}
