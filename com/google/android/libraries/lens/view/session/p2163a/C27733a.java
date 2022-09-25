package com.google.android.libraries.lens.view.session.p2163a;

import java.util.concurrent.Callable;

/* renamed from: com.google.android.libraries.lens.view.session.a.a */
/* compiled from: PG */
public final /* synthetic */ class C27733a implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C27736d f75717a;

    public /* synthetic */ C27733a(C27736d dVar) {
        this.f75717a = dVar;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:15|16) */
    /* JADX WARNING: Code restructure failed: missing block: B:16:?, code lost:
        throw r0;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:15:0x0036 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object call() {
        /*
            r7 = this;
            com.google.android.libraries.lens.view.session.a.d r0 = r7.f75717a
            java.io.FileInputStream r1 = new java.io.FileInputStream     // Catch:{ IOException -> 0x0037 }
            java.lang.String r0 = r0.f75722b     // Catch:{ IOException -> 0x0037 }
            r1.<init>(r0)     // Catch:{ IOException -> 0x0037 }
            com.google.protobuf.ba r0 = com.google.protobuf.C62921ba.m95368a()     // Catch:{ all -> 0x0019 }
            com.google.lens.n.a.a.b r2 = com.google.lens.p4712n.p4713a.p4714a.C62634b.f169103b     // Catch:{ all -> 0x0019 }
            com.google.protobuf.bv r0 = com.google.protobuf.C62942bv.parseFrom((com.google.protobuf.C62942bv) r2, (java.io.InputStream) r1, (com.google.protobuf.C62921ba) r0)     // Catch:{ all -> 0x0019 }
            com.google.lens.n.a.a.b r0 = (com.google.lens.p4712n.p4713a.p4714a.C62634b) r0     // Catch:{ all -> 0x0019 }
            r1.close()     // Catch:{ IOException -> 0x0037 }
            return r0
        L_0x0019:
            r0 = move-exception
            r1.close()     // Catch:{ all -> 0x001e }
            goto L_0x0036
        L_0x001e:
            r1 = move-exception
            r2 = 1
            java.lang.Class[] r3 = new java.lang.Class[r2]     // Catch:{ Exception -> 0x0036 }
            java.lang.Class<java.lang.Throwable> r4 = java.lang.Throwable.class
            r5 = 0
            r3[r5] = r4     // Catch:{ Exception -> 0x0036 }
            java.lang.Class<java.lang.Throwable> r4 = java.lang.Throwable.class
            java.lang.String r6 = "addSuppressed"
            java.lang.reflect.Method r3 = r4.getDeclaredMethod(r6, r3)     // Catch:{ Exception -> 0x0036 }
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ Exception -> 0x0036 }
            r2[r5] = r1     // Catch:{ Exception -> 0x0036 }
            r3.invoke(r0, r2)     // Catch:{ Exception -> 0x0036 }
        L_0x0036:
            throw r0     // Catch:{ IOException -> 0x0037 }
        L_0x0037:
            r0 = move-exception
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "Failed to read GetLensSnapshotRequest"
            r1.<init>(r2, r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.lens.view.session.p2163a.C27733a.call():java.lang.Object");
    }
}
