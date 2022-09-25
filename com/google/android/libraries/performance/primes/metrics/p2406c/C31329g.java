package com.google.android.libraries.performance.primes.metrics.p2406c;

import java.io.File;
import p5535j.p5536a.p5562i.p5568b.p5569a.C71199ai;

/* renamed from: com.google.android.libraries.performance.primes.metrics.c.g */
/* compiled from: PG */
final class C31329g implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C31331i f84346a;

    /* renamed from: b */
    private final File f84347b;

    /* renamed from: c */
    private final C71199ai f84348c;

    /* renamed from: d */
    private final Float f84349d;

    /* renamed from: e */
    private final long f84350e;

    /* renamed from: f */
    private final long f84351f;

    public C31329g(C31331i iVar, File file, C71199ai aiVar, Float f, long j, long j2) {
        this.f84346a = iVar;
        this.f84347b = file;
        this.f84348c = aiVar;
        this.f84349d = f;
        this.f84350e = j;
        this.f84351f = j2;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:37|38) */
    /* JADX WARNING: Code restructure failed: missing block: B:38:?, code lost:
        throw r7;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:37:0x013f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r13 = this;
            com.google.android.libraries.performance.primes.metrics.c.i r0 = r13.f84346a
            java.util.concurrent.atomic.AtomicBoolean r0 = r0.f84355b
            r1 = 0
            r0.set(r1)
            android.os.Debug.stopMethodTracing()
            com.google.android.libraries.performance.primes.metrics.c.i r0 = r13.f84346a
            com.google.android.libraries.f.a r0 = r0.f84360g
            long r2 = r0.mo26870b()
            long r4 = r13.f84350e
            com.google.android.libraries.performance.primes.metrics.c.i r0 = r13.f84346a
            dagger.a r0 = r0.f84358e
            java.lang.Object r0 = r0.mo27525b()
            com.google.android.libraries.performance.primes.metrics.c.b r0 = (com.google.android.libraries.performance.primes.metrics.p2406c.C31324b) r0
            int r0 = r0.mo37032f()
            long r6 = (long) r0
            long r4 = r4 + r6
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 < 0) goto L_0x0048
            com.google.android.libraries.performance.primes.metrics.c.i r0 = r13.f84346a
            r0.mo37041d(r1)
            com.google.common.f.e r0 = com.google.android.libraries.performance.primes.metrics.p2406c.C31331i.f84354a
            com.google.common.f.x r0 = r0.mo56226d()
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0
            r1 = 50369(0xc4c1, float:7.0582E-41)
            com.google.common.f.x r0 = r0.mo56372aa(r1)
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0
            long r4 = r13.f84350e
            long r2 = r2 - r4
            java.lang.String r1 = "Missed sample window by %d ms"
            r0.mo56388r(r1, r2)
            return
        L_0x0048:
            com.google.android.libraries.performance.primes.metrics.c.i r0 = r13.f84346a
            android.app.Application r4 = r0.f84356c
            r5 = 0
            android.content.IntentFilter r0 = r0.f84359f
            android.content.Intent r0 = r4.registerReceiver(r5, r0)
            j.a.i.b.a.ai r4 = r13.f84348c
            com.google.protobuf.bn r4 = r4.toBuilder()
            j.a.i.b.a.ah r4 = (p5535j.p5536a.p5562i.p5568b.p5569a.C71198ah) r4
            com.google.android.libraries.performance.primes.metrics.c.i r5 = r13.f84346a
            j.a.i.b.a.ak r5 = r5.mo37040b(r0)
            r4.copyOnWrite()
            com.google.protobuf.bv r6 = r4.instance
            j.a.i.b.a.ai r6 = (p5535j.p5536a.p5562i.p5568b.p5569a.C71199ai) r6
            r5.getClass()
            r6.f190040c = r5
            int r5 = r6.f190038a
            r5 = r5 | 2
            r6.f190038a = r5
            java.lang.Float r5 = r13.f84349d
            float r5 = r5.floatValue()
            float r0 = com.google.android.libraries.performance.primes.metrics.p2406c.C31331i.m58412e(r0)
            r4.copyOnWrite()
            com.google.protobuf.bv r6 = r4.instance
            j.a.i.b.a.ai r6 = (p5535j.p5536a.p5562i.p5568b.p5569a.C71199ai) r6
            int r7 = r6.f190038a
            r7 = r7 | 4
            r6.f190038a = r7
            float r5 = r5 - r0
            r6.f190041d = r5
            com.google.protobuf.bv r0 = r4.build()
            j.a.i.b.a.ai r0 = (p5535j.p5536a.p5562i.p5568b.p5569a.C71199ai) r0
            j.a.i.b.a.ag r4 = p5535j.p5536a.p5562i.p5568b.p5569a.C71197ag.f190026i
            com.google.protobuf.bn r4 = r4.createBuilder()
            j.a.i.b.a.af r4 = (p5535j.p5536a.p5562i.p5568b.p5569a.C71196af) r4
            r4.copyOnWrite()
            com.google.protobuf.bv r5 = r4.instance
            j.a.i.b.a.ag r5 = (p5535j.p5536a.p5562i.p5568b.p5569a.C71197ag) r5
            r0.getClass()
            r5.f190030c = r0
            int r0 = r5.f190028a
            r0 = r0 | 2
            r5.f190028a = r0
            java.io.File r0 = r13.f84347b
            r5 = -1
            if (r0 == 0) goto L_0x0174
            boolean r0 = r0.exists()
            if (r0 != 0) goto L_0x00ba
            goto L_0x0174
        L_0x00ba:
            java.io.File r0 = r13.f84347b
            long r6 = r0.length()
            r8 = 0
            int r0 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r0 <= 0) goto L_0x0182
            com.google.android.libraries.performance.primes.metrics.c.i r0 = r13.f84346a
            dagger.a r0 = r0.f84358e
            java.lang.Object r0 = r0.mo27525b()
            com.google.android.libraries.performance.primes.metrics.c.b r0 = (com.google.android.libraries.performance.primes.metrics.p2406c.C31324b) r0
            int r0 = r0.mo37029d()
            long r8 = (long) r0
            int r0 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r0 >= 0) goto L_0x0182
            java.io.FileInputStream r0 = new java.io.FileInputStream     // Catch:{ IOException -> 0x0154 }
            java.io.File r8 = r13.f84347b     // Catch:{ IOException -> 0x0154 }
            r0.<init>(r8)     // Catch:{ IOException -> 0x0154 }
            int r7 = (int) r6
            com.google.protobuf.y r6 = com.google.protobuf.C63088z.m96151w(r7)     // Catch:{ all -> 0x014a }
            r7 = 1024(0x400, float:1.435E-42)
            byte[] r7 = new byte[r7]     // Catch:{ all -> 0x0140 }
            java.util.zip.DeflaterInputStream r8 = new java.util.zip.DeflaterInputStream     // Catch:{ all -> 0x0140 }
            java.util.zip.Deflater r9 = new java.util.zip.Deflater     // Catch:{ all -> 0x0140 }
            r10 = 9
            r9.<init>(r10)     // Catch:{ all -> 0x0140 }
            r8.<init>(r0, r9)     // Catch:{ all -> 0x0140 }
        L_0x00f5:
            r9 = 1
            int r10 = r8.read(r7)     // Catch:{ all -> 0x0124 }
            if (r10 == r5) goto L_0x0100
            r6.write(r7, r1, r10)     // Catch:{ all -> 0x0124 }
            goto L_0x00f5
        L_0x0100:
            r8.close()     // Catch:{ all -> 0x0140 }
            com.google.protobuf.z r7 = r6.mo59165b()     // Catch:{ all -> 0x0140 }
            r4.copyOnWrite()     // Catch:{ all -> 0x0140 }
            com.google.protobuf.bv r8 = r4.instance     // Catch:{ all -> 0x0140 }
            j.a.i.b.a.ag r8 = (p5535j.p5536a.p5562i.p5568b.p5569a.C71197ag) r8     // Catch:{ all -> 0x0140 }
            r7.getClass()     // Catch:{ all -> 0x0140 }
            int r10 = r8.f190028a     // Catch:{ all -> 0x0140 }
            r9 = r9 | r10
            r8.f190028a = r9     // Catch:{ all -> 0x0140 }
            r8.f190029b = r7     // Catch:{ all -> 0x0140 }
            java.io.File r7 = r13.f84347b     // Catch:{ all -> 0x0140 }
            com.google.android.libraries.performance.primes.metrics.p2406c.C31331i.m58411c(r7)     // Catch:{ all -> 0x0140 }
            r6.close()     // Catch:{ all -> 0x014a }
            r0.close()     // Catch:{ IOException -> 0x0154 }
            goto L_0x0182
        L_0x0124:
            r7 = move-exception
            r8.close()     // Catch:{ all -> 0x0129 }
            goto L_0x013f
        L_0x0129:
            r8 = move-exception
            java.lang.Class[] r10 = new java.lang.Class[r9]     // Catch:{ Exception -> 0x013f }
            java.lang.Class<java.lang.Throwable> r11 = java.lang.Throwable.class
            r10[r1] = r11     // Catch:{ Exception -> 0x013f }
            java.lang.Class<java.lang.Throwable> r11 = java.lang.Throwable.class
            java.lang.String r12 = "addSuppressed"
            java.lang.reflect.Method r10 = r11.getDeclaredMethod(r12, r10)     // Catch:{ Exception -> 0x013f }
            java.lang.Object[] r9 = new java.lang.Object[r9]     // Catch:{ Exception -> 0x013f }
            r9[r1] = r8     // Catch:{ Exception -> 0x013f }
            r10.invoke(r7, r9)     // Catch:{ Exception -> 0x013f }
        L_0x013f:
            throw r7     // Catch:{ all -> 0x0140 }
        L_0x0140:
            r7 = move-exception
            r6.close()     // Catch:{ all -> 0x0145 }
            goto L_0x0149
        L_0x0145:
            r6 = move-exception
            com.google.android.libraries.performance.primes.metrics.p2406c.C31328f.m58410a(r7, r6)     // Catch:{ all -> 0x014a }
        L_0x0149:
            throw r7     // Catch:{ all -> 0x014a }
        L_0x014a:
            r6 = move-exception
            r0.close()     // Catch:{ all -> 0x014f }
            goto L_0x0153
        L_0x014f:
            r0 = move-exception
            com.google.android.libraries.performance.primes.metrics.p2406c.C31328f.m58410a(r6, r0)     // Catch:{ IOException -> 0x0154 }
        L_0x0153:
            throw r6     // Catch:{ IOException -> 0x0154 }
        L_0x0154:
            r0 = move-exception
            com.google.common.f.e r6 = com.google.android.libraries.performance.primes.metrics.p2406c.C31331i.f84354a
            com.google.common.f.x r6 = r6.mo56225c()
            com.google.common.f.c r6 = (com.google.common.p4526f.C59052c) r6
            com.google.common.f.x r0 = r6.mo56382g(r0)
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0
            r6 = 50368(0xc4c0, float:7.058E-41)
            com.google.common.f.x r0 = r0.mo56372aa(r6)
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0
            java.lang.String r6 = "Unable to read file %s"
            java.io.File r7 = r13.f84347b
            r0.mo56389s(r6, r7)
            goto L_0x0182
        L_0x0174:
            com.google.common.f.e r0 = com.google.android.libraries.performance.primes.metrics.p2406c.C31331i.f84354a
            com.google.common.f.x r0 = r0.mo56225c()
            java.lang.String r6 = "Missing trace file"
            r7 = 50367(0xc4bf, float:7.0579E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r7)).mo56386p(r6)
        L_0x0182:
            com.google.android.libraries.performance.primes.metrics.c.i r0 = r13.f84346a
            dagger.a r0 = r0.f84358e
            java.lang.Object r0 = r0.mo27525b()
            com.google.android.libraries.performance.primes.metrics.c.b r0 = (com.google.android.libraries.performance.primes.metrics.p2406c.C31324b) r0
            double r6 = r0.mo37028c()
            r4.copyOnWrite()
            com.google.protobuf.bv r0 = r4.instance
            j.a.i.b.a.ag r0 = (p5535j.p5536a.p5562i.p5568b.p5569a.C71197ag) r0
            int r8 = r0.f190028a
            r8 = r8 | 4
            r0.f190028a = r8
            r0.f190031d = r6
            com.google.android.libraries.performance.primes.metrics.c.i r0 = r13.f84346a
            dagger.a r0 = r0.f84358e
            java.lang.Object r0 = r0.mo27525b()
            com.google.android.libraries.performance.primes.metrics.c.b r0 = (com.google.android.libraries.performance.primes.metrics.p2406c.C31324b) r0
            int r0 = r0.mo37033g()
            r4.copyOnWrite()
            com.google.protobuf.bv r6 = r4.instance
            j.a.i.b.a.ag r6 = (p5535j.p5536a.p5562i.p5568b.p5569a.C71197ag) r6
            int r7 = r6.f190028a
            r7 = r7 | 32
            r6.f190028a = r7
            r6.f190034g = r0
            long r6 = r13.f84351f
            long r2 = r2 - r6
            r6 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r0 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r0 >= 0) goto L_0x01d7
            r4.copyOnWrite()
            com.google.protobuf.bv r0 = r4.instance
            j.a.i.b.a.ag r0 = (p5535j.p5536a.p5562i.p5568b.p5569a.C71197ag) r0
            int r5 = r0.f190028a
            r5 = r5 | 16
            r0.f190028a = r5
            int r3 = (int) r2
            r0.f190033f = r3
            goto L_0x01e6
        L_0x01d7:
            r4.copyOnWrite()
            com.google.protobuf.bv r0 = r4.instance
            j.a.i.b.a.ag r0 = (p5535j.p5536a.p5562i.p5568b.p5569a.C71197ag) r0
            int r2 = r0.f190028a
            r2 = r2 | 16
            r0.f190028a = r2
            r0.f190033f = r5
        L_0x01e6:
            com.google.android.libraries.performance.primes.metrics.c.i r0 = r13.f84346a
            dagger.a r0 = r0.f84358e
            java.lang.Object r0 = r0.mo27525b()
            com.google.android.libraries.performance.primes.metrics.c.b r0 = (com.google.android.libraries.performance.primes.metrics.p2406c.C31324b) r0
            int r0 = r0.mo37030e()
            r4.copyOnWrite()
            com.google.protobuf.bv r2 = r4.instance
            j.a.i.b.a.ag r2 = (p5535j.p5536a.p5562i.p5568b.p5569a.C71197ag) r2
            int r3 = r2.f190028a
            r3 = r3 | 8
            r2.f190028a = r3
            r2.f190032e = r0
            com.google.android.libraries.performance.primes.metrics.c.i r0 = r13.f84346a
            dagger.a r0 = r0.f84358e
            java.lang.Object r0 = r0.mo27525b()
            com.google.android.libraries.performance.primes.metrics.c.b r0 = (com.google.android.libraries.performance.primes.metrics.p2406c.C31324b) r0
            int r0 = r0.mo37029d()
            r4.copyOnWrite()
            com.google.protobuf.bv r2 = r4.instance
            j.a.i.b.a.ag r2 = (p5535j.p5536a.p5562i.p5568b.p5569a.C71197ag) r2
            int r3 = r2.f190028a
            r3 = r3 | 64
            r2.f190028a = r3
            r2.f190035h = r0
            com.google.protobuf.z r0 = r2.f190029b
            int r0 = r0.mo59031d()
            if (r0 <= 0) goto L_0x0260
            j.a.i.b.a.ej r0 = p5535j.p5536a.p5562i.p5568b.p5569a.C71308ej.f190415x
            com.google.protobuf.bn r0 = r0.createBuilder()
            j.a.i.b.a.ei r0 = (p5535j.p5536a.p5562i.p5568b.p5569a.C71307ei) r0
            r0.copyOnWrite()
            com.google.protobuf.bv r2 = r0.instance
            j.a.i.b.a.ej r2 = (p5535j.p5536a.p5562i.p5568b.p5569a.C71308ej) r2
            com.google.protobuf.bv r3 = r4.build()
            j.a.i.b.a.ag r3 = (p5535j.p5536a.p5562i.p5568b.p5569a.C71197ag) r3
            r3.getClass()
            r2.f190428m = r3
            int r3 = r2.f190416a
            r3 = r3 | 16384(0x4000, float:2.2959E-41)
            r2.f190416a = r3
            com.google.protobuf.bv r0 = r0.build()
            j.a.i.b.a.ej r0 = (p5535j.p5536a.p5562i.p5568b.p5569a.C71308ej) r0
            com.google.android.libraries.performance.primes.metrics.c.i r2 = r13.f84346a
            com.google.android.libraries.performance.primes.metrics.b.m r2 = r2.f84361h
            com.google.android.libraries.performance.primes.metrics.b.d r3 = com.google.android.libraries.performance.primes.metrics.p2404b.C31302e.m58363j()
            r3.mo37004e(r0)
            com.google.android.libraries.performance.primes.metrics.b.e r0 = r3.mo37000a()
            r2.mo37023b(r0)
        L_0x0260:
            com.google.android.libraries.performance.primes.metrics.c.i r0 = r13.f84346a
            r0.mo37041d(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.performance.primes.metrics.p2406c.C31329g.run():void");
    }
}
