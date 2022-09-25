package com.google.android.apps.gsa.staticplugins.bisto.p7514p;

import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.common.p4541l.C59331n;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.p.a */
/* compiled from: PG */
public final /* synthetic */ class C95829a implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C95830b f268344a;

    /* renamed from: b */
    public final /* synthetic */ boolean f268345b;

    /* renamed from: c */
    public final /* synthetic */ C59331n f268346c;

    public /* synthetic */ C95829a(C95830b bVar, boolean z, C59331n nVar) {
        this.f268344a = bVar;
        this.f268345b = z;
        this.f268346c = nVar;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:23|24) */
    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        throw r0;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0062 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r8 = this;
            com.google.android.apps.gsa.staticplugins.bisto.p.b r0 = r8.f268344a
            boolean r1 = r8.f268345b
            com.google.common.l.n r2 = r8.f268346c
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x0063 }
            java.util.concurrent.atomic.AtomicInteger r4 = r0.f268348b     // Catch:{ IOException -> 0x0063 }
            int r4 = r4.get()     // Catch:{ IOException -> 0x0063 }
            java.util.concurrent.atomic.AtomicInteger r5 = r0.f268348b     // Catch:{ IOException -> 0x0063 }
            int r6 = r4 + 1
            int r6 = r6 % 10000
            r5.set(r6)     // Catch:{ IOException -> 0x0063 }
            r5 = 1
            java.io.File r6 = r0.mo89799a(r4, r5)     // Catch:{ IOException -> 0x0063 }
            boolean r7 = r6.exists()     // Catch:{ IOException -> 0x0063 }
            if (r7 == 0) goto L_0x0025
            r6.delete()     // Catch:{ IOException -> 0x0063 }
        L_0x0025:
            r7 = 0
            java.io.File r0 = r0.mo89799a(r4, r7)     // Catch:{ IOException -> 0x0063 }
            boolean r4 = r0.exists()     // Catch:{ IOException -> 0x0063 }
            if (r4 == 0) goto L_0x0033
            r0.delete()     // Catch:{ IOException -> 0x0063 }
        L_0x0033:
            if (r5 != r1) goto L_0x0036
            goto L_0x0037
        L_0x0036:
            r6 = r0
        L_0x0037:
            r3.<init>(r6)     // Catch:{ IOException -> 0x0063 }
            java.io.ByteArrayOutputStream r0 = r2.f157521b     // Catch:{ all -> 0x0047 }
            byte[] r0 = r0.toByteArray()     // Catch:{ all -> 0x0047 }
            r3.write(r0)     // Catch:{ all -> 0x0047 }
            r3.close()     // Catch:{ IOException -> 0x0063 }
            return
        L_0x0047:
            r0 = move-exception
            r3.close()     // Catch:{ all -> 0x004c }
            goto L_0x0062
        L_0x004c:
            r1 = move-exception
            java.lang.Class[] r2 = new java.lang.Class[r5]     // Catch:{ Exception -> 0x0062 }
            java.lang.Class<java.lang.Throwable> r3 = java.lang.Throwable.class
            r2[r7] = r3     // Catch:{ Exception -> 0x0062 }
            java.lang.Class<java.lang.Throwable> r3 = java.lang.Throwable.class
            java.lang.String r4 = "addSuppressed"
            java.lang.reflect.Method r2 = r3.getDeclaredMethod(r4, r2)     // Catch:{ Exception -> 0x0062 }
            java.lang.Object[] r3 = new java.lang.Object[r5]     // Catch:{ Exception -> 0x0062 }
            r3[r7] = r1     // Catch:{ Exception -> 0x0062 }
            r2.invoke(r0, r3)     // Catch:{ Exception -> 0x0062 }
        L_0x0062:
            throw r0     // Catch:{ IOException -> 0x0063 }
        L_0x0063:
            r0 = move-exception
            com.google.common.f.e r1 = com.google.android.apps.gsa.staticplugins.bisto.p7514p.C95830b.f268347a
            com.google.common.f.x r1 = r1.mo56226d()
            com.google.common.f.aa r2 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r3 = "BistoHWDetector"
            r1.mo56378ag(r2, r3)
            java.lang.String r2 = "failed to write"
            r3 = 15464(0x3c68, float:2.167E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r1).mo56382g(r0)).mo56372aa(r3)).mo56386p(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.bisto.p7514p.C95829a.run():void");
    }
}
