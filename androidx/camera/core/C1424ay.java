package androidx.camera.core;

import androidx.camera.core.p069a.C1330bq;

/* renamed from: androidx.camera.core.ay */
/* compiled from: PG */
public final /* synthetic */ class C1424ay implements C1330bq {

    /* renamed from: a */
    public static final /* synthetic */ C1424ay f3980a = new C1424ay();

    private /* synthetic */ C1424ay() {
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:16|17) */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        throw r1;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x003e */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo4018a(androidx.camera.core.p069a.C1331br r8) {
        /*
            r7 = this;
            java.lang.String r0 = "ImageCapture"
            java.lang.String r1 = "Discarding ImageProxy which was inadvertently acquired: "
            int r2 = androidx.camera.core.C1470bp.f4052o
            androidx.camera.core.bs r8 = r8.mo4203f()     // Catch:{ IllegalStateException -> 0x003f }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x001f }
            r2.<init>(r1)     // Catch:{ all -> 0x001f }
            r2.append(r8)     // Catch:{ all -> 0x001f }
            java.lang.String r1 = r2.toString()     // Catch:{ all -> 0x001f }
            android.util.Log.d(r0, r1)     // Catch:{ all -> 0x001f }
            if (r8 == 0) goto L_0x001e
            r8.close()     // Catch:{ IllegalStateException -> 0x003f }
        L_0x001e:
            return
        L_0x001f:
            r1 = move-exception
            if (r8 == 0) goto L_0x003e
            r8.close()     // Catch:{ all -> 0x0026 }
            goto L_0x003e
        L_0x0026:
            r8 = move-exception
            r2 = 1
            java.lang.Class[] r3 = new java.lang.Class[r2]     // Catch:{ Exception -> 0x003e }
            java.lang.Class<java.lang.Throwable> r4 = java.lang.Throwable.class
            r5 = 0
            r3[r5] = r4     // Catch:{ Exception -> 0x003e }
            java.lang.Class<java.lang.Throwable> r4 = java.lang.Throwable.class
            java.lang.String r6 = "addSuppressed"
            java.lang.reflect.Method r3 = r4.getDeclaredMethod(r6, r3)     // Catch:{ Exception -> 0x003e }
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ Exception -> 0x003e }
            r2[r5] = r8     // Catch:{ Exception -> 0x003e }
            r3.invoke(r1, r2)     // Catch:{ Exception -> 0x003e }
        L_0x003e:
            throw r1     // Catch:{ IllegalStateException -> 0x003f }
        L_0x003f:
            r8 = move-exception
            java.lang.String r1 = "Failed to acquire latest image."
            android.util.Log.e(r0, r1, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.core.C1424ay.mo4018a(androidx.camera.core.a.br):void");
    }
}
