package com.google.apps.tiktok.contrib.work.p3631b;

import androidx.work.C4405bb;
import com.google.apps.tiktok.tracing.C47770dh;
import com.google.common.p4526f.C59071e;
import java.util.Map;

/* renamed from: com.google.apps.tiktok.contrib.work.b.z */
/* compiled from: PG */
public final class C46568z extends C4405bb {

    /* renamed from: a */
    private static final C59071e f121744a = C59071e.m91332i("com.google.apps.tiktok.contrib.work.b.z");

    /* renamed from: b */
    private final Map f121745b;

    /* renamed from: c */
    private final C47770dh f121746c;

    public C46568z(Map map, C47770dh dhVar) {
        this.f121745b = map;
        this.f121746c = dhVar;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:39|40) */
    /* JADX WARNING: Code restructure failed: missing block: B:40:?, code lost:
        throw r7;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:39:0x00ba */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final androidx.work.C4378ab mo9346a(android.content.Context r7, java.lang.String r8, androidx.work.WorkerParameters r9) {
        /*
            r6 = this;
            r0 = 0
            com.google.apps.tiktok.tracing.dh r1 = r6.f121746c     // Catch:{ RuntimeException -> 0x00bb }
            java.lang.String r2 = "WorkerFactory.createWorker()"
            com.google.apps.tiktok.tracing.bx r1 = r1.mo51616f(r2)     // Catch:{ RuntimeException -> 0x00bb }
            r2 = 1
            java.lang.Class<com.google.apps.tiktok.contrib.work.TikTokListenableWorker> r3 = com.google.apps.tiktok.contrib.work.TikTokListenableWorker.class
            java.lang.String r3 = r3.getName()     // Catch:{ all -> 0x009c }
            boolean r3 = r8.equals(r3)     // Catch:{ all -> 0x009c }
            if (r3 == 0) goto L_0x0074
            java.util.Set r8 = r9.f13990c     // Catch:{ all -> 0x009c }
            com.google.common.b.ij r8 = com.google.apps.tiktok.contrib.work.p3631b.C46542ba.m82975a(r8)     // Catch:{ all -> 0x009c }
            int r3 = r8.size()     // Catch:{ all -> 0x009c }
            if (r3 == r2) goto L_0x004d
            com.google.frameworks.client.a.a.b r7 = new com.google.frameworks.client.a.a.b     // Catch:{ all -> 0x009c }
            com.google.frameworks.client.a.a.a r9 = com.google.frameworks.client.p4624a.p4625a.C61284a.NO_USER_DATA     // Catch:{ all -> 0x009c }
            int r8 = r8.size()     // Catch:{ all -> 0x009c }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x009c }
            r7.<init>(r9, r8)     // Catch:{ all -> 0x009c }
            com.google.common.f.e r8 = f121744a     // Catch:{ all -> 0x009c }
            com.google.common.f.x r8 = r8.mo56225c()     // Catch:{ all -> 0x009c }
            com.google.common.f.c r8 = (com.google.common.p4526f.C59052c) r8     // Catch:{ all -> 0x009c }
            r9 = 54736(0xd5d0, float:7.6701E-41)
            com.google.common.f.x r8 = r8.mo56372aa(r9)     // Catch:{ all -> 0x009c }
            com.google.common.f.c r8 = (com.google.common.p4526f.C59052c) r8     // Catch:{ all -> 0x009c }
            java.lang.String r9 = "A TikTok worker was created, but it has %s count tags instead of 1, so it was skipped"
            r8.mo56389s(r9, r7)     // Catch:{ all -> 0x009c }
            if (r1 == 0) goto L_0x004c
            r1.close()     // Catch:{ RuntimeException -> 0x00bb }
        L_0x004c:
            return r0
        L_0x004d:
            java.lang.Object r8 = com.google.common.p4522b.C58557jl.m90133n(r8)     // Catch:{ all -> 0x009c }
            java.lang.String r8 = (java.lang.String) r8     // Catch:{ all -> 0x009c }
            java.util.Map r3 = r6.f121745b     // Catch:{ all -> 0x009c }
            java.lang.Object r3 = r3.get(r8)     // Catch:{ all -> 0x009c }
            g.a.a r3 = (p5460g.p5461a.C69464a) r3     // Catch:{ all -> 0x009c }
            if (r3 != 0) goto L_0x0087
            com.google.common.f.e r4 = f121744a     // Catch:{ all -> 0x009c }
            com.google.common.f.x r4 = r4.mo56225c()     // Catch:{ all -> 0x009c }
            com.google.common.f.c r4 = (com.google.common.p4526f.C59052c) r4     // Catch:{ all -> 0x009c }
            r5 = 54735(0xd5cf, float:7.67E-41)
            com.google.common.f.x r4 = r4.mo56372aa(r5)     // Catch:{ all -> 0x009c }
            com.google.common.f.c r4 = (com.google.common.p4526f.C59052c) r4     // Catch:{ all -> 0x009c }
            java.lang.String r5 = "A worker with the `permanentTag` %s does not exist in this version of the application. This suggests that an app upgrade removed this worker and now work scheduled before the upgrade can't run. If this is surprising, refer to go/tiktok/dev/androidx/work#deprecating, then reach out to #tiktok on YAQS, or g/tiktok-users if the situation is still unclear."
            r4.mo56389s(r5, r8)     // Catch:{ all -> 0x009c }
            goto L_0x0087
        L_0x0074:
            java.util.Map r3 = r6.f121745b     // Catch:{ all -> 0x009c }
            java.lang.Object r3 = r3.get(r8)     // Catch:{ all -> 0x009c }
            g.a.a r3 = (p5460g.p5461a.C69464a) r3     // Catch:{ all -> 0x009c }
            if (r3 == 0) goto L_0x0087
            java.util.Set r4 = r9.f13990c     // Catch:{ all -> 0x009c }
            java.lang.String r8 = com.google.apps.tiktok.contrib.work.p3631b.C46542ba.m82976b(r8)     // Catch:{ all -> 0x009c }
            r4.add(r8)     // Catch:{ all -> 0x009c }
        L_0x0087:
            if (r3 != 0) goto L_0x008f
            if (r1 == 0) goto L_0x008e
            r1.close()     // Catch:{ RuntimeException -> 0x00bb }
        L_0x008e:
            return r0
        L_0x008f:
            com.google.apps.tiktok.contrib.work.TikTokListenableWorker r8 = new com.google.apps.tiktok.contrib.work.TikTokListenableWorker     // Catch:{ all -> 0x009c }
            com.google.apps.tiktok.tracing.dh r4 = r6.f121746c     // Catch:{ all -> 0x009c }
            r8.<init>(r7, r4, r3, r9)     // Catch:{ all -> 0x009c }
            if (r1 == 0) goto L_0x009b
            r1.close()     // Catch:{ RuntimeException -> 0x00bb }
        L_0x009b:
            return r8
        L_0x009c:
            r7 = move-exception
            if (r1 == 0) goto L_0x00ba
            r1.close()     // Catch:{ all -> 0x00a3 }
            goto L_0x00ba
        L_0x00a3:
            r8 = move-exception
            java.lang.Class[] r9 = new java.lang.Class[r2]     // Catch:{ Exception -> 0x00ba }
            java.lang.Class<java.lang.Throwable> r1 = java.lang.Throwable.class
            r3 = 0
            r9[r3] = r1     // Catch:{ Exception -> 0x00ba }
            java.lang.Class<java.lang.Throwable> r1 = java.lang.Throwable.class
            java.lang.String r4 = "addSuppressed"
            java.lang.reflect.Method r9 = r1.getDeclaredMethod(r4, r9)     // Catch:{ Exception -> 0x00ba }
            java.lang.Object[] r1 = new java.lang.Object[r2]     // Catch:{ Exception -> 0x00ba }
            r1[r3] = r8     // Catch:{ Exception -> 0x00ba }
            r9.invoke(r7, r1)     // Catch:{ Exception -> 0x00ba }
        L_0x00ba:
            throw r7     // Catch:{ RuntimeException -> 0x00bb }
        L_0x00bb:
            r7 = move-exception
            com.google.common.f.e r8 = f121744a
            com.google.common.f.x r8 = r8.mo56226d()
            java.lang.String r9 = "TikTokWorkerFactory failed to instantiate a TikTokWorker"
            r1 = 54734(0xd5ce, float:7.6699E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r8).mo56382g(r7)).mo56372aa(r1)).mo56386p(r9)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.apps.tiktok.contrib.work.p3631b.C46568z.mo9346a(android.content.Context, java.lang.String, androidx.work.WorkerParameters):androidx.work.ab");
    }
}
