package com.google.android.libraries.search.integrations.p3013a.p3014a;

import java.util.concurrent.Callable;

/* renamed from: com.google.android.libraries.search.integrations.a.a.g */
/* compiled from: PG */
public final /* synthetic */ class C38489g implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C38490h f101841a;

    public /* synthetic */ C38489g(C38490h hVar) {
        this.f101841a = hVar;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:23|24) */
    /* JADX WARNING: Code restructure failed: missing block: B:24:?, code lost:
        throw r3;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x006f */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:11:0x0031=Splitter:B:11:0x0031, B:23:0x006f=Splitter:B:23:0x006f} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object call() {
        /*
            r9 = this;
            com.google.android.libraries.search.integrations.a.a.h r0 = r9.f101841a
            java.lang.String r1 = "android_id"
            android.content.Context r0 = r0.f101844c     // Catch:{ SecurityException -> 0x0070 }
            android.content.ContentResolver r2 = r0.getContentResolver()     // Catch:{ SecurityException -> 0x0070 }
            android.net.Uri r3 = com.google.android.libraries.search.integrations.p3013a.p3014a.C38490h.f101843b     // Catch:{ SecurityException -> 0x0070 }
            r0 = 1
            java.lang.String[] r6 = new java.lang.String[r0]     // Catch:{ SecurityException -> 0x0070 }
            r8 = 0
            r6[r8] = r1     // Catch:{ SecurityException -> 0x0070 }
            r4 = 0
            r5 = 0
            r7 = 0
            android.database.Cursor r2 = r2.query(r3, r4, r5, r6, r7)     // Catch:{ SecurityException -> 0x0070 }
            if (r2 == 0) goto L_0x0035
            boolean r3 = r2.moveToFirst()     // Catch:{ all -> 0x0052 }
            if (r3 == 0) goto L_0x0035
            int r3 = r2.getColumnCount()     // Catch:{ all -> 0x0052 }
            r4 = 2
            if (r3 >= r4) goto L_0x0029
            goto L_0x0035
        L_0x0029:
            java.lang.String r3 = r2.getString(r0)     // Catch:{ all -> 0x0052 }
            j$.util.Optional r0 = p3186j$.util.Optional.ofNullable(r3)     // Catch:{ all -> 0x0052 }
        L_0x0031:
            r2.close()     // Catch:{ SecurityException -> 0x0070 }
            goto L_0x0083
        L_0x0035:
            com.google.common.f.e r3 = com.google.android.libraries.search.integrations.p3013a.p3014a.C38490h.f101842a     // Catch:{ all -> 0x0052 }
            com.google.common.f.x r3 = r3.mo56226d()     // Catch:{ all -> 0x0052 }
            com.google.common.f.c r3 = (com.google.common.p4526f.C59052c) r3     // Catch:{ all -> 0x0052 }
            r4 = 53113(0xcf79, float:7.4427E-41)
            com.google.common.f.x r3 = r3.mo56372aa(r4)     // Catch:{ all -> 0x0052 }
            com.google.common.f.c r3 = (com.google.common.p4526f.C59052c) r3     // Catch:{ all -> 0x0052 }
            java.lang.String r4 = "Failed to query key %s"
            r3.mo56389s(r4, r1)     // Catch:{ all -> 0x0052 }
            j$.util.Optional r0 = p3186j$.util.Optional.empty()     // Catch:{ all -> 0x0052 }
            if (r2 == 0) goto L_0x0083
            goto L_0x0031
        L_0x0052:
            r3 = move-exception
            if (r2 == 0) goto L_0x006f
            r2.close()     // Catch:{ all -> 0x0059 }
            goto L_0x006f
        L_0x0059:
            r2 = move-exception
            java.lang.Class[] r4 = new java.lang.Class[r0]     // Catch:{ Exception -> 0x006f }
            java.lang.Class<java.lang.Throwable> r5 = java.lang.Throwable.class
            r4[r8] = r5     // Catch:{ Exception -> 0x006f }
            java.lang.Class<java.lang.Throwable> r5 = java.lang.Throwable.class
            java.lang.String r6 = "addSuppressed"
            java.lang.reflect.Method r4 = r5.getDeclaredMethod(r6, r4)     // Catch:{ Exception -> 0x006f }
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch:{ Exception -> 0x006f }
            r0[r8] = r2     // Catch:{ Exception -> 0x006f }
            r4.invoke(r3, r0)     // Catch:{ Exception -> 0x006f }
        L_0x006f:
            throw r3     // Catch:{ SecurityException -> 0x0070 }
        L_0x0070:
            r0 = move-exception
            com.google.common.f.e r2 = com.google.android.libraries.search.integrations.p3013a.p3014a.C38490h.f101842a
            com.google.common.f.x r2 = r2.mo56225c()
            java.lang.String r3 = "Error querying key %s"
            r4 = 53114(0xcf7a, float:7.4429E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r2).mo56382g(r0)).mo56372aa(r4)).mo56389s(r3, r1)
            j$.util.Optional r0 = p3186j$.util.Optional.empty()
        L_0x0083:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.search.integrations.p3013a.p3014a.C38489g.call():java.lang.Object");
    }
}
