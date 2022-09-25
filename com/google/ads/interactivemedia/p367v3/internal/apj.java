package com.google.ads.interactivemedia.p367v3.internal;

import android.content.Context;
import com.google.android.gms.p10725a.p10730b.C142677d;
import java.io.IOException;
import java.util.concurrent.CountDownLatch;

/* renamed from: com.google.ads.interactivemedia.v3.internal.apj */
/* compiled from: PG */
public final class apj extends apg {
    /* access modifiers changed from: private */

    /* renamed from: d */
    public static C142677d f21351d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public static final CountDownLatch f21352e = new CountDownLatch(1);
    /* access modifiers changed from: private */

    /* renamed from: f */
    public static volatile boolean f21353f;

    /* renamed from: g */
    private final boolean f21354g = true;

    protected apj(Context context, apm apm, C6801app app) {
        super(context, apm, app);
    }

    /* renamed from: q */
    public static apj m19231q(Context context) {
        aoo aoo = new aoo();
        m19222k(context, aoo);
        synchronized (apj.class) {
            if (f21351d == null) {
                new Thread(new C6800api(context)).start();
            }
        }
        return new apj(context, aoo, new C6801app());
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo15137b(Context context) {
        super.mo15137b(context);
        try {
            if (!f21353f) {
                aph l = mo15143l();
                String a = l.mo15140a();
                if (a != null) {
                    mo15138c(28, true != l.mo15141b() ? 0 : 1);
                    mo15138c(26, 5);
                    mo15139d(24, a);
                    return;
                }
                return;
            }
            mo15139d(24, m19218g(context));
        } catch (apf | IOException unused) {
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0027, code lost:
        r1 = r0.f387158a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0029, code lost:
        if (r1 == null) goto L_0x0053;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0031, code lost:
        if (r1.matches("^[a-fA-F0-9]{8}-([a-fA-F0-9]{4}-){3}[a-fA-F0-9]{12}$") == false) goto L_0x0053;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0033, code lost:
        r1 = java.util.UUID.fromString(r1);
        r2 = new byte[16];
        r3 = java.nio.ByteBuffer.wrap(r2);
        r3.putLong(r1.getMostSignificantBits());
        r3.putLong(r1.getLeastSignificantBits());
        r1 = r6.f21328b.mo15133b(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x005a, code lost:
        return new com.google.ads.interactivemedia.p367v3.internal.aph(r1, r0.f387159b);
     */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.ads.interactivemedia.p367v3.internal.aph mo15143l() {
        /*
            r6 = this;
            r0 = 0
            r1 = 0
            java.util.concurrent.CountDownLatch r2 = f21352e     // Catch:{ InterruptedException -> 0x005e }
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ InterruptedException -> 0x005e }
            r4 = 2
            boolean r2 = r2.await(r4, r3)     // Catch:{ InterruptedException -> 0x005e }
            if (r2 != 0) goto L_0x0014
            com.google.ads.interactivemedia.v3.internal.aph r2 = new com.google.ads.interactivemedia.v3.internal.aph     // Catch:{ InterruptedException -> 0x005e }
            r2.<init>(r1, r0)     // Catch:{ InterruptedException -> 0x005e }
            return r2
        L_0x0014:
            java.lang.Class<com.google.ads.interactivemedia.v3.internal.apj> r2 = com.google.ads.interactivemedia.p367v3.internal.apj.class
            monitor-enter(r2)
            com.google.android.gms.a.b.d r3 = f21351d     // Catch:{ all -> 0x005b }
            if (r3 != 0) goto L_0x0022
            com.google.ads.interactivemedia.v3.internal.aph r3 = new com.google.ads.interactivemedia.v3.internal.aph     // Catch:{ all -> 0x005b }
            r3.<init>(r1, r0)     // Catch:{ all -> 0x005b }
            monitor-exit(r2)     // Catch:{ all -> 0x005b }
            return r3
        L_0x0022:
            com.google.android.gms.a.b.c r0 = r3.mo117457c()     // Catch:{ all -> 0x005b }
            monitor-exit(r2)     // Catch:{ all -> 0x005b }
            java.lang.String r1 = r0.f387158a
            if (r1 == 0) goto L_0x0053
            java.lang.String r2 = "^[a-fA-F0-9]{8}-([a-fA-F0-9]{4}-){3}[a-fA-F0-9]{12}$"
            boolean r2 = r1.matches(r2)
            if (r2 == 0) goto L_0x0053
            java.util.UUID r1 = java.util.UUID.fromString(r1)
            r2 = 16
            byte[] r2 = new byte[r2]
            java.nio.ByteBuffer r3 = java.nio.ByteBuffer.wrap(r2)
            long r4 = r1.getMostSignificantBits()
            r3.putLong(r4)
            long r4 = r1.getLeastSignificantBits()
            r3.putLong(r4)
            com.google.ads.interactivemedia.v3.internal.apm r1 = r6.f21328b
            java.lang.String r1 = r1.mo15133b(r2)
        L_0x0053:
            com.google.ads.interactivemedia.v3.internal.aph r2 = new com.google.ads.interactivemedia.v3.internal.aph
            boolean r0 = r0.f387159b
            r2.<init>(r1, r0)
            return r2
        L_0x005b:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x005b }
            throw r0
        L_0x005e:
            com.google.ads.interactivemedia.v3.internal.aph r2 = new com.google.ads.interactivemedia.v3.internal.aph
            r2.<init>(r1, r0)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ads.interactivemedia.p367v3.internal.apj.mo15143l():com.google.ads.interactivemedia.v3.internal.aph");
    }
}
