package com.google.android.libraries.performance.primes.transmitter.clearcut;

import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.libraries.performance.primes.transmitter.clearcut.c */
/* compiled from: PG */
public final /* synthetic */ class C31597c implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C31598d f85052a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f85053b;

    /* renamed from: c */
    public final /* synthetic */ C60870cx f85054c;

    /* renamed from: d */
    public final /* synthetic */ C60870cx f85055d;

    public /* synthetic */ C31597c(C31598d dVar, C60870cx cxVar, C60870cx cxVar2, C60870cx cxVar3) {
        this.f85052a = dVar;
        this.f85053b = cxVar;
        this.f85054c = cxVar2;
        this.f85055d = cxVar3;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(13:0|1|2|(1:4)|5|6|(1:8)|9|10|11|(1:13)|14|16) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x009b */
    /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x007b */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x00a7 A[Catch:{ Exception -> 0x00bf }] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0090 A[Catch:{ Exception -> 0x009b }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object call() {
        /*
            r8 = this;
            com.google.android.libraries.performance.primes.transmitter.clearcut.d r0 = r8.f85052a
            com.google.common.util.concurrent.cx r1 = r8.f85053b
            com.google.common.util.concurrent.cx r2 = r8.f85054c
            com.google.common.util.concurrent.cx r3 = r8.f85055d
            com.google.android.libraries.performance.primes.transmitter.clearcut.b r4 = com.google.android.libraries.performance.primes.transmitter.clearcut.C31596b.f85041i
            com.google.protobuf.bn r4 = r4.createBuilder()
            com.google.android.libraries.performance.primes.transmitter.clearcut.a r4 = (com.google.android.libraries.performance.primes.transmitter.clearcut.C31595a) r4
            java.lang.String r5 = r0.f85057b
            r4.copyOnWrite()
            com.google.protobuf.bv r6 = r4.instance
            com.google.android.libraries.performance.primes.transmitter.clearcut.b r6 = (com.google.android.libraries.performance.primes.transmitter.clearcut.C31596b) r6
            int r7 = r6.f85044a
            r7 = r7 | 1
            r6.f85044a = r7
            r6.f85045b = r5
            java.lang.String r5 = r0.f85056a
            r4.copyOnWrite()
            com.google.protobuf.bv r6 = r4.instance
            com.google.android.libraries.performance.primes.transmitter.clearcut.b r6 = (com.google.android.libraries.performance.primes.transmitter.clearcut.C31596b) r6
            r5.getClass()
            int r7 = r6.f85044a
            r7 = r7 | 2
            r6.f85044a = r7
            r6.f85046c = r5
            boolean r5 = r0.f85058c
            r4.copyOnWrite()
            com.google.protobuf.bv r6 = r4.instance
            com.google.android.libraries.performance.primes.transmitter.clearcut.b r6 = (com.google.android.libraries.performance.primes.transmitter.clearcut.C31596b) r6
            int r7 = r6.f85044a
            r7 = r7 | 4
            r6.f85044a = r7
            r6.f85047d = r5
            boolean r0 = r0.f85059d
            r4.copyOnWrite()
            com.google.protobuf.bv r5 = r4.instance
            com.google.android.libraries.performance.primes.transmitter.clearcut.b r5 = (com.google.android.libraries.performance.primes.transmitter.clearcut.C31596b) r5
            int r6 = r5.f85044a
            r6 = r6 | 32
            r5.f85044a = r6
            r5.f85051h = r0
            java.lang.Object r0 = com.google.common.util.concurrent.C60856cj.m92909r(r1)     // Catch:{ Exception -> 0x007b }
            com.google.common.base.ax r0 = (com.google.common.base.C58833ax) r0     // Catch:{ Exception -> 0x007b }
            boolean r1 = r0.mo56113h()     // Catch:{ Exception -> 0x007b }
            if (r1 == 0) goto L_0x007b
            java.lang.Object r0 = r0.mo56107c()     // Catch:{ Exception -> 0x007b }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x007b }
            r4.copyOnWrite()     // Catch:{ Exception -> 0x007b }
            com.google.protobuf.bv r1 = r4.instance     // Catch:{ Exception -> 0x007b }
            com.google.android.libraries.performance.primes.transmitter.clearcut.b r1 = (com.google.android.libraries.performance.primes.transmitter.clearcut.C31596b) r1     // Catch:{ Exception -> 0x007b }
            r0.getClass()     // Catch:{ Exception -> 0x007b }
            int r5 = r1.f85044a     // Catch:{ Exception -> 0x007b }
            r5 = r5 | 16
            r1.f85044a = r5     // Catch:{ Exception -> 0x007b }
            r1.f85049f = r0     // Catch:{ Exception -> 0x007b }
        L_0x007b:
            java.lang.Object r0 = com.google.common.util.concurrent.C60856cj.m92909r(r2)     // Catch:{ Exception -> 0x009b }
            java.util.List r0 = (java.util.List) r0     // Catch:{ Exception -> 0x009b }
            r4.copyOnWrite()     // Catch:{ Exception -> 0x009b }
            com.google.protobuf.bv r1 = r4.instance     // Catch:{ Exception -> 0x009b }
            com.google.android.libraries.performance.primes.transmitter.clearcut.b r1 = (com.google.android.libraries.performance.primes.transmitter.clearcut.C31596b) r1     // Catch:{ Exception -> 0x009b }
            com.google.protobuf.ch r2 = r1.f85050g     // Catch:{ Exception -> 0x009b }
            boolean r5 = r2.mo58948c()     // Catch:{ Exception -> 0x009b }
            if (r5 != 0) goto L_0x0096
            com.google.protobuf.ch r2 = com.google.protobuf.C62942bv.mutableCopy((com.google.protobuf.C62961ch) r2)     // Catch:{ Exception -> 0x009b }
            r1.f85050g = r2     // Catch:{ Exception -> 0x009b }
        L_0x0096:
            com.google.protobuf.ch r1 = r1.f85050g     // Catch:{ Exception -> 0x009b }
            com.google.protobuf.C62947c.addAll((java.lang.Iterable) r0, (java.util.List) r1)     // Catch:{ Exception -> 0x009b }
        L_0x009b:
            java.lang.Object r0 = com.google.common.util.concurrent.C60856cj.m92909r(r3)     // Catch:{ Exception -> 0x00bf }
            com.google.common.base.ax r0 = (com.google.common.base.C58833ax) r0     // Catch:{ Exception -> 0x00bf }
            boolean r1 = r0.mo56113h()     // Catch:{ Exception -> 0x00bf }
            if (r1 == 0) goto L_0x00bf
            java.lang.Object r0 = r0.mo56107c()     // Catch:{ Exception -> 0x00bf }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ Exception -> 0x00bf }
            r4.copyOnWrite()     // Catch:{ Exception -> 0x00bf }
            com.google.protobuf.bv r1 = r4.instance     // Catch:{ Exception -> 0x00bf }
            com.google.android.libraries.performance.primes.transmitter.clearcut.b r1 = (com.google.android.libraries.performance.primes.transmitter.clearcut.C31596b) r1     // Catch:{ Exception -> 0x00bf }
            r0.getClass()     // Catch:{ Exception -> 0x00bf }
            int r2 = r1.f85044a     // Catch:{ Exception -> 0x00bf }
            r2 = r2 | 8
            r1.f85044a = r2     // Catch:{ Exception -> 0x00bf }
            r1.f85048e = r0     // Catch:{ Exception -> 0x00bf }
        L_0x00bf:
            com.google.android.libraries.performance.primes.transmitter.i r0 = com.google.android.libraries.performance.primes.transmitter.C31617i.f85086c
            com.google.protobuf.bn r0 = r0.createBuilder()
            com.google.android.libraries.performance.primes.transmitter.h r0 = (com.google.android.libraries.performance.primes.transmitter.C31616h) r0
            com.google.protobuf.bt r1 = com.google.android.libraries.performance.primes.transmitter.clearcut.C31596b.f85042j
            com.google.protobuf.bv r2 = r4.build()
            com.google.android.libraries.performance.primes.transmitter.clearcut.b r2 = (com.google.android.libraries.performance.primes.transmitter.clearcut.C31596b) r2
            r0.mo58885m(r1, r2)
            com.google.protobuf.bv r0 = r0.build()
            com.google.android.libraries.performance.primes.transmitter.i r0 = (com.google.android.libraries.performance.primes.transmitter.C31617i) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.performance.primes.transmitter.clearcut.C31597c.call():java.lang.Object");
    }
}
