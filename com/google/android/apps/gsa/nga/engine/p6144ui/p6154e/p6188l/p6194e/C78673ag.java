package com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6188l.p6194e;

import com.google.android.libraries.gsa.p1876k.C22862b;
import com.google.common.p4522b.C58495hd;

/* renamed from: com.google.android.apps.gsa.nga.engine.ui.e.l.e.ag */
/* compiled from: PG */
public final /* synthetic */ class C78673ag implements C22862b {

    /* renamed from: a */
    public final /* synthetic */ C78674ah f216587a;

    /* renamed from: b */
    public final /* synthetic */ C58495hd f216588b;

    public /* synthetic */ C78673ag(C78674ah ahVar, C58495hd hdVar) {
        this.f216587a = ahVar;
        this.f216588b = hdVar;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:21|22) */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        throw r0;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:21:0x0085 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo17947a() {
        /*
            r7 = this;
            com.google.android.apps.gsa.nga.engine.ui.e.l.e.ah r0 = r7.f216587a
            com.google.common.b.hd r1 = r7.f216588b
            com.google.common.f.e r2 = com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6188l.p6194e.C78674ah.f216589a
            com.google.common.f.x r2 = r2.mo56224b()
            java.lang.String r3 = "Loading Tactile resources from URIs"
            r4 = 5279(0x149f, float:7.397E-42)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r2).mo56372aa(r4)).mo56386p(r3)
            java.lang.String r2 = "on_device_tactile_config"
            java.lang.Object r1 = r1.get(r2)
            android.net.Uri r1 = (android.net.Uri) r1
            if (r1 == 0) goto L_0x0091
            com.google.android.libraries.storage.a.k r2 = r0.f216591c     // Catch:{ IOException -> 0x0088, IllegalArgumentException -> 0x0086 }
            com.google.android.libraries.storage.a.f.n r3 = new com.google.android.libraries.storage.a.f.n     // Catch:{ IOException -> 0x0088, IllegalArgumentException -> 0x0086 }
            r3.<init>()     // Catch:{ IOException -> 0x0088, IllegalArgumentException -> 0x0086 }
            java.lang.Object r1 = r2.mo45889c(r1, r3)     // Catch:{ IOException -> 0x0088, IllegalArgumentException -> 0x0086 }
            java.io.InputStream r1 = (java.io.InputStream) r1     // Catch:{ IOException -> 0x0088, IllegalArgumentException -> 0x0086 }
            com.google.android.apps.gsa.nga.engine.ui.e.l.e.e r0 = r0.f216592d     // Catch:{ all -> 0x0066 }
            com.google.android.apps.gsa.nga.engine.ui.e.l.e.d r2 = com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6188l.p6194e.C78677d.f216596b     // Catch:{ all -> 0x0066 }
            com.google.protobuf.eb r2 = r2.getParserForType()     // Catch:{ all -> 0x0066 }
            java.lang.Object r2 = r2.mo59009h(r1)     // Catch:{ all -> 0x0066 }
            com.google.android.apps.gsa.nga.engine.ui.e.l.e.d r2 = (com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6188l.p6194e.C78677d) r2     // Catch:{ all -> 0x0066 }
            java.util.concurrent.atomic.AtomicReference r3 = r0.f216600a     // Catch:{ all -> 0x0066 }
            r3.set(r2)     // Catch:{ all -> 0x0066 }
            com.google.android.apps.gsa.nga.engine.ui.e.l.e.g r2 = r2.f216598a     // Catch:{ all -> 0x0066 }
            if (r2 != 0) goto L_0x0041
            com.google.android.apps.gsa.nga.engine.ui.e.l.e.g r2 = com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6188l.p6194e.C78680g.f216602b     // Catch:{ all -> 0x0066 }
        L_0x0041:
            com.google.protobuf.cq r2 = r2.f216604a     // Catch:{ all -> 0x0066 }
            com.google.common.b.ij r2 = com.google.common.p4522b.C58528ij.m90006F(r2)     // Catch:{ all -> 0x0066 }
            r0.f216601b = r2     // Catch:{ all -> 0x0066 }
            com.google.common.f.e r0 = com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6188l.p6194e.C78674ah.f216589a     // Catch:{ all -> 0x0066 }
            com.google.common.f.x r0 = r0.mo56224b()     // Catch:{ all -> 0x0066 }
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0     // Catch:{ all -> 0x0066 }
            r2 = 5280(0x14a0, float:7.399E-42)
            com.google.common.f.x r0 = r0.mo56372aa(r2)     // Catch:{ all -> 0x0066 }
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0     // Catch:{ all -> 0x0066 }
            java.lang.String r2 = "Tactile resources successfully loaded"
            r0.mo56386p(r2)     // Catch:{ all -> 0x0066 }
            com.google.android.apps.gsa.x.c r0 = com.google.android.apps.gsa.p8883x.C118826c.f331422a     // Catch:{ all -> 0x0066 }
            if (r1 == 0) goto L_0x0065
            r1.close()     // Catch:{ IOException -> 0x0088, IllegalArgumentException -> 0x0086 }
        L_0x0065:
            return r0
        L_0x0066:
            r0 = move-exception
            if (r1 == 0) goto L_0x0085
            r1.close()     // Catch:{ all -> 0x006d }
            goto L_0x0085
        L_0x006d:
            r1 = move-exception
            r2 = 1
            java.lang.Class[] r3 = new java.lang.Class[r2]     // Catch:{ Exception -> 0x0085 }
            java.lang.Class<java.lang.Throwable> r4 = java.lang.Throwable.class
            r5 = 0
            r3[r5] = r4     // Catch:{ Exception -> 0x0085 }
            java.lang.Class<java.lang.Throwable> r4 = java.lang.Throwable.class
            java.lang.String r6 = "addSuppressed"
            java.lang.reflect.Method r3 = r4.getDeclaredMethod(r6, r3)     // Catch:{ Exception -> 0x0085 }
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ Exception -> 0x0085 }
            r2[r5] = r1     // Catch:{ Exception -> 0x0085 }
            r3.invoke(r0, r2)     // Catch:{ Exception -> 0x0085 }
        L_0x0085:
            throw r0     // Catch:{ IOException -> 0x0088, IllegalArgumentException -> 0x0086 }
        L_0x0086:
            r0 = move-exception
            goto L_0x0089
        L_0x0088:
            r0 = move-exception
        L_0x0089:
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r2 = "Failed to load Tactile on-device data."
            r1.<init>(r2, r0)
            throw r1
        L_0x0091:
            java.io.FileNotFoundException r0 = new java.io.FileNotFoundException
            java.lang.String r1 = "Could not find file with id: on_device_tactile_config"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6188l.p6194e.C78673ag.mo17947a():java.lang.Object");
    }
}
