package com.google.android.apps.gsa.nga.engine.p6026f.p6027a;

import com.google.android.libraries.gsa.p1876k.C22862b;
import com.google.common.p4522b.C58495hd;

/* renamed from: com.google.android.apps.gsa.nga.engine.f.a.m */
/* compiled from: PG */
public final /* synthetic */ class C75994m implements C22862b {

    /* renamed from: a */
    public final /* synthetic */ C75995n f210815a;

    /* renamed from: b */
    public final /* synthetic */ C58495hd f210816b;

    public /* synthetic */ C75994m(C75995n nVar, C58495hd hdVar) {
        this.f210815a = nVar;
        this.f210816b = hdVar;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:20|21) */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        throw r0;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:20:0x005f */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo17947a() {
        /*
            r7 = this;
            com.google.android.apps.gsa.nga.engine.f.a.n r0 = r7.f210815a
            com.google.common.b.hd r1 = r7.f210816b
            com.google.common.b.ij r2 = r1.keySet()
            com.google.common.b.sl r2 = r2.iterator()
        L_0x000c:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L_0x0069
            java.lang.Object r3 = r2.next()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r4 = r1.get(r3)
            android.net.Uri r4 = (android.net.Uri) r4
            if (r4 == 0) goto L_0x000c
            com.google.android.libraries.storage.a.k r5 = r0.f210818b     // Catch:{ IOException -> 0x0060 }
            com.google.android.libraries.storage.a.f.n r6 = new com.google.android.libraries.storage.a.f.n     // Catch:{ IOException -> 0x0060 }
            r6.<init>()     // Catch:{ IOException -> 0x0060 }
            java.lang.Object r4 = r5.mo45889c(r4, r6)     // Catch:{ IOException -> 0x0060 }
            java.io.InputStream r4 = (java.io.InputStream) r4     // Catch:{ IOException -> 0x0060 }
            com.google.android.apps.gsa.nga.engine.f.b.j r5 = com.google.android.apps.gsa.nga.engine.p6026f.p6028b.C76015j.f210850c     // Catch:{ all -> 0x0040 }
            com.google.protobuf.bv r5 = com.google.protobuf.C62942bv.parseFrom((com.google.protobuf.C62942bv) r5, (java.io.InputStream) r4)     // Catch:{ all -> 0x0040 }
            com.google.android.apps.gsa.nga.engine.f.b.j r5 = (com.google.android.apps.gsa.nga.engine.p6026f.p6028b.C76015j) r5     // Catch:{ all -> 0x0040 }
            com.google.android.apps.gsa.nga.engine.f.a.x r6 = r0.f210817a     // Catch:{ all -> 0x0040 }
            r6.mo72006e(r3, r5)     // Catch:{ all -> 0x0040 }
            if (r4 == 0) goto L_0x000c
            r4.close()     // Catch:{ IOException -> 0x0060 }
            goto L_0x000c
        L_0x0040:
            r0 = move-exception
            if (r4 == 0) goto L_0x005f
            r4.close()     // Catch:{ all -> 0x0047 }
            goto L_0x005f
        L_0x0047:
            r1 = move-exception
            r2 = 1
            java.lang.Class[] r3 = new java.lang.Class[r2]     // Catch:{ Exception -> 0x005f }
            java.lang.Class<java.lang.Throwable> r4 = java.lang.Throwable.class
            r5 = 0
            r3[r5] = r4     // Catch:{ Exception -> 0x005f }
            java.lang.Class<java.lang.Throwable> r4 = java.lang.Throwable.class
            java.lang.String r6 = "addSuppressed"
            java.lang.reflect.Method r3 = r4.getDeclaredMethod(r6, r3)     // Catch:{ Exception -> 0x005f }
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ Exception -> 0x005f }
            r2[r5] = r1     // Catch:{ Exception -> 0x005f }
            r3.invoke(r0, r2)     // Catch:{ Exception -> 0x005f }
        L_0x005f:
            throw r0     // Catch:{ IOException -> 0x0060 }
        L_0x0060:
            r0 = move-exception
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "Failed to load AppActions data."
            r1.<init>(r2, r0)
            throw r1
        L_0x0069:
            com.google.android.apps.gsa.x.c r0 = com.google.android.apps.gsa.p8883x.C118826c.f331422a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.nga.engine.p6026f.p6027a.C75994m.mo17947a():java.lang.Object");
    }
}
