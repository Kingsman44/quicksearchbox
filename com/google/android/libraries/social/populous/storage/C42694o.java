package com.google.android.libraries.social.populous.storage;

import java.util.concurrent.Callable;

/* renamed from: com.google.android.libraries.social.populous.storage.o */
/* compiled from: PG */
public final /* synthetic */ class C42694o implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C42699t f111911a;

    /* renamed from: b */
    public final /* synthetic */ long f111912b;

    public /* synthetic */ C42694o(C42699t tVar, long j) {
        this.f111911a = tVar;
        this.f111912b = j;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0055, code lost:
        if ((r4 instanceof androidx.p182p.C3925ah) == false) goto L_0x0058;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x005c, code lost:
        if (java.lang.Thread.interrupted() != false) goto L_0x005f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0064, code lost:
        throw new java.lang.InterruptedException();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0032, code lost:
        if ((r4 instanceof androidx.p182p.C3925ah) != false) goto L_0x0034;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0034, code lost:
        ((androidx.p182p.C3925ah) r4).mo8182q();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object call() {
        /*
            r8 = this;
            com.google.android.libraries.social.populous.storage.t r0 = r8.f111911a
            long r1 = r8.f111912b
            java.lang.String[] r3 = r0.f111921b
            int r4 = r3.length
            com.google.common.b.sm r3 = com.google.common.p4522b.C58570jy.m90169u(r3, r4)
            com.google.common.base.bc r4 = r0.f111920a
            com.google.common.b.sl r3 = com.google.common.p4522b.C58570jy.m90152d(r3, r4)
            com.google.android.libraries.social.populous.storage.p r4 = new com.google.android.libraries.social.populous.storage.p
            r4.<init>(r0)
            java.util.Iterator r3 = com.google.common.p4522b.C58570jy.m90161m(r3, r4)
        L_0x001a:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L_0x0070
            java.lang.Object r4 = r3.next()
            com.google.android.libraries.social.populous.storage.v r4 = (com.google.android.libraries.social.populous.storage.C42701v) r4
            com.google.android.libraries.social.populous.logging.z r5 = r0.f111923d
            com.google.android.libraries.social.populous.storage.q r6 = new com.google.android.libraries.social.populous.storage.q     // Catch:{ RuntimeException -> 0x003c }
            r6.<init>(r4, r1, r5)     // Catch:{ RuntimeException -> 0x003c }
            r4.mo45804v(r6)     // Catch:{ RuntimeException -> 0x003c }
            boolean r5 = r4 instanceof androidx.p182p.C3925ah
            if (r5 == 0) goto L_0x0058
        L_0x0034:
            androidx.p.ah r4 = (androidx.p182p.C3925ah) r4
            r4.mo8182q()
            goto L_0x0058
        L_0x003a:
            r0 = move-exception
            goto L_0x0065
        L_0x003c:
            r6 = move-exception
            com.google.android.libraries.social.populous.logging.k r7 = com.google.android.libraries.social.populous.logging.C42576k.f111734a     // Catch:{ all -> 0x003a }
            com.google.android.libraries.social.populous.logging.n r5 = r5.mo45631a(r7)     // Catch:{ all -> 0x003a }
            r7 = 13
            r5.mo45673h(r7)     // Catch:{ all -> 0x003a }
            r7 = 25
            r5.mo45674i(r7)     // Catch:{ all -> 0x003a }
            r5.mo45670e(r6)     // Catch:{ all -> 0x003a }
            r5.mo45666a()     // Catch:{ all -> 0x003a }
            boolean r5 = r4 instanceof androidx.p182p.C3925ah
            if (r5 == 0) goto L_0x0058
            goto L_0x0034
        L_0x0058:
            boolean r4 = java.lang.Thread.interrupted()
            if (r4 != 0) goto L_0x005f
            goto L_0x001a
        L_0x005f:
            java.lang.InterruptedException r0 = new java.lang.InterruptedException
            r0.<init>()
            throw r0
        L_0x0065:
            boolean r1 = r4 instanceof androidx.p182p.C3925ah
            if (r1 != 0) goto L_0x006a
            goto L_0x006f
        L_0x006a:
            androidx.p.ah r4 = (androidx.p182p.C3925ah) r4
            r4.mo8182q()
        L_0x006f:
            throw r0
        L_0x0070:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.social.populous.storage.C42694o.call():java.lang.Object");
    }
}
