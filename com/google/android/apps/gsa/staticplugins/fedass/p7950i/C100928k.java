package com.google.android.apps.gsa.staticplugins.fedass.p7950i;

import com.google.common.base.C58817ah;

/* renamed from: com.google.android.apps.gsa.staticplugins.fedass.i.k */
/* compiled from: PG */
public final /* synthetic */ class C100928k implements C58817ah {
    /* JADX WARNING: Can't wrap try/catch for region: R(2:41|42) */
    /* JADX WARNING: Code restructure failed: missing block: B:42:?, code lost:
        throw r12;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:41:0x009e */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x005a A[Catch:{ all -> 0x0081, all -> 0x0086, RuntimeException -> 0x009f }] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0069 A[Catch:{ all -> 0x0081, all -> 0x0086, RuntimeException -> 0x009f }] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0068 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object apply(java.lang.Object r12) {
        /*
            r11 = this;
            com.google.speech.m.aa r12 = (com.google.speech.p5228m.C67270aa) r12
            com.google.android.libraries.assistant.trainingcache.bindings.EkhoDebugReader r0 = new com.google.android.libraries.assistant.trainingcache.bindings.EkhoDebugReader     // Catch:{ RuntimeException -> 0x009f }
            r0.<init>()     // Catch:{ RuntimeException -> 0x009f }
            r0.mo24630c(r12)     // Catch:{ all -> 0x0081 }
            com.google.common.b.gp r12 = com.google.common.p4522b.C58485gu.m89837e()     // Catch:{ all -> 0x0081 }
            java.util.List r1 = r0.mo24628a()     // Catch:{ all -> 0x0081 }
            java.util.Iterator r1 = r1.iterator()     // Catch:{ all -> 0x0081 }
            r2 = 0
        L_0x0017:
            boolean r3 = r1.hasNext()     // Catch:{ all -> 0x0081 }
            if (r3 == 0) goto L_0x0079
            java.lang.Object r3 = r1.next()     // Catch:{ all -> 0x0081 }
            com.google.speech.m.w r3 = (com.google.speech.p5228m.C67359w) r3     // Catch:{ all -> 0x0081 }
            if (r2 != 0) goto L_0x0031
            com.google.speech.m.y r2 = r3.f183089a     // Catch:{ all -> 0x0081 }
            if (r2 != 0) goto L_0x002b
            com.google.speech.m.y r2 = com.google.speech.p5228m.C67361y.f183093c     // Catch:{ all -> 0x0081 }
        L_0x002b:
            long r4 = r2.f183096b     // Catch:{ all -> 0x0081 }
            org.c.a.t r2 = com.google.p4476cf.p4477a.C58059a.m88814a(r4)     // Catch:{ all -> 0x0081 }
        L_0x0031:
            r4 = 3
            org.c.a.n r4 = org.p5633c.p5634a.C72290n.m106812c(r4)     // Catch:{ all -> 0x0081 }
            long r8 = r4.f191964b     // Catch:{ all -> 0x0081 }
            r4 = 0
            int r6 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r6 == 0) goto L_0x0055
            org.c.a.b.ab r5 = org.p5633c.p5634a.p5636b.C72156ab.f192017E     // Catch:{ all -> 0x0081 }
            long r6 = r2.f192450a     // Catch:{ all -> 0x0081 }
            r10 = -1
            long r4 = r5.mo63344a(r6, r8, r10)     // Catch:{ all -> 0x0081 }
            long r6 = r2.f192450a     // Catch:{ all -> 0x0081 }
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 != 0) goto L_0x004f
            goto L_0x0055
        L_0x004f:
            org.c.a.t r6 = new org.c.a.t     // Catch:{ all -> 0x0081 }
            r6.<init>(r4)     // Catch:{ all -> 0x0081 }
            goto L_0x0056
        L_0x0055:
            r6 = r2
        L_0x0056:
            com.google.speech.m.y r4 = r3.f183089a     // Catch:{ all -> 0x0081 }
            if (r4 != 0) goto L_0x005c
            com.google.speech.m.y r4 = com.google.speech.p5228m.C67361y.f183093c     // Catch:{ all -> 0x0081 }
        L_0x005c:
            long r4 = r4.f183096b     // Catch:{ all -> 0x0081 }
            org.c.a.t r4 = com.google.p4476cf.p4477a.C58059a.m88814a(r4)     // Catch:{ all -> 0x0081 }
            int r4 = r6.compareTo(r4)     // Catch:{ all -> 0x0081 }
            if (r4 <= 0) goto L_0x0069
            goto L_0x0079
        L_0x0069:
            int r4 = r3.f183090b     // Catch:{ all -> 0x0081 }
            int r4 = com.google.speech.p5228m.C67278ai.m97449b(r4)     // Catch:{ all -> 0x0081 }
            if (r4 == 0) goto L_0x0017
            r5 = 6003(0x1773, float:8.412E-42)
            if (r4 != r5) goto L_0x0017
            r12.mo55395g(r3)     // Catch:{ all -> 0x0081 }
            goto L_0x0017
        L_0x0079:
            com.google.common.b.gu r12 = r12.mo55394f()     // Catch:{ all -> 0x0081 }
            r0.close()     // Catch:{ RuntimeException -> 0x009f }
            goto L_0x00b8
        L_0x0081:
            r12 = move-exception
            r0.close()     // Catch:{ all -> 0x0086 }
            goto L_0x009e
        L_0x0086:
            r0 = move-exception
            r1 = 1
            java.lang.Class[] r2 = new java.lang.Class[r1]     // Catch:{ Exception -> 0x009e }
            java.lang.Class<java.lang.Throwable> r3 = java.lang.Throwable.class
            r4 = 0
            r2[r4] = r3     // Catch:{ Exception -> 0x009e }
            java.lang.Class<java.lang.Throwable> r3 = java.lang.Throwable.class
            java.lang.String r5 = "addSuppressed"
            java.lang.reflect.Method r2 = r3.getDeclaredMethod(r5, r2)     // Catch:{ Exception -> 0x009e }
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ Exception -> 0x009e }
            r1[r4] = r0     // Catch:{ Exception -> 0x009e }
            r2.invoke(r12, r1)     // Catch:{ Exception -> 0x009e }
        L_0x009e:
            throw r12     // Catch:{ RuntimeException -> 0x009f }
        L_0x009f:
            r12 = move-exception
            com.google.common.f.e r0 = com.google.android.apps.gsa.staticplugins.fedass.p7950i.C100931n.f281969a
            com.google.common.f.x r0 = r0.mo56225c()
            com.google.common.f.aa r1 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r2 = "SheldonDumpableHelper"
            r0.mo56378ag(r1, r2)
            java.lang.String r1 = "Failed to read Sheldon Debug Dump from Ekho"
            r2 = 19682(0x4ce2, float:2.758E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56382g(r12)).mo56372aa(r2)).mo56386p(r1)
            com.google.common.b.gu r12 = com.google.common.p4522b.C58485gu.m89845m()
        L_0x00b8:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.fedass.p7950i.C100928k.apply(java.lang.Object):java.lang.Object");
    }
}
