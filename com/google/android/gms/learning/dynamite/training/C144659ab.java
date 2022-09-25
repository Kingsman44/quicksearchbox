package com.google.android.gms.learning.dynamite.training;

/* renamed from: com.google.android.gms.learning.dynamite.training.ab */
/* compiled from: PG */
public final /* synthetic */ class C144659ab implements C144692bh {

    /* renamed from: a */
    public final /* synthetic */ InAppTrainerImpl f391406a;

    public /* synthetic */ C144659ab(InAppTrainerImpl inAppTrainerImpl) {
        this.f391406a = inAppTrainerImpl;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0049, code lost:
        com.google.android.gms.learning.dynamite.C144655s.m235152a();
        r1 = com.google.android.libraries.micore.learning.base.C29711c.m54796b(r0.f391380c.getApplicationContext());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
        r2 = (com.google.android.gms.learning.C144573b) r1.mo34852c(com.google.android.gms.learning.C144573b.class);
        r3 = (com.google.android.gms.learning.C144827n) r1.mo34852c(com.google.android.gms.learning.C144827n.class);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x006a, code lost:
        if (r0.mo120113a(r3, r2) == false) goto L_0x0080;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x006c, code lost:
        r5 = new com.google.android.gms.common.api.Status(1, 17, "InAppTraining API not enabled!", (android.app.PendingIntent) null, (com.google.android.gms.common.ConnectionResult) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0079, code lost:
        if (r1 == null) goto L_0x007e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x007e, code lost:
        r1 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0086, code lost:
        if (com.google.android.gms.learning.dynamite.training.InAppTrainerImpl.m235155b(r3, r2, r0.f391381d) == false) goto L_0x0098;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0088, code lost:
        r4 = new com.google.android.gms.common.api.Status(1, 17, "In-app Personalization API is not enabled.", (android.app.PendingIntent) null, (com.google.android.gms.common.ConnectionResult) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0095, code lost:
        if (r1 == null) goto L_0x007e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0098, code lost:
        r2 = r2.mo119946G();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00a0, code lost:
        if (r2 <= 0) goto L_0x00c1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00a2, code lost:
        r4 = r0.f391381d.f391080l;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00af, code lost:
        if (((long) java.util.Arrays.copyOf(r4, r4.length).length) <= r2) goto L_0x00c1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00b1, code lost:
        r7 = new com.google.android.gms.common.api.Status(1, 10, "Context data size exceeds the limit", (android.app.PendingIntent) null, (com.google.android.gms.common.ConnectionResult) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00be, code lost:
        if (r1 == null) goto L_0x007e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00c1, code lost:
        if (r1 == null) goto L_0x00c6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:?, code lost:
        r1.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00c6, code lost:
        r1 = com.google.android.gms.common.api.Status.f389615a;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.common.util.concurrent.C60870cx mo120144a() {
        /*
            r13 = this;
            com.google.android.gms.learning.dynamite.training.InAppTrainerImpl r0 = r13.f391406a
            com.google.android.gms.learning.InAppTrainerOptions r1 = r0.f391381d     // Catch:{ all -> 0x00d9 }
            java.lang.String r1 = r1.f391073d     // Catch:{ all -> 0x00d9 }
            if (r1 == 0) goto L_0x000b
            com.google.common.b.gu r1 = com.google.android.gms.learning.dynamite.training.InAppTrainerImpl.f391377a     // Catch:{ all -> 0x00d9 }
            goto L_0x000d
        L_0x000b:
            com.google.common.b.gu r1 = com.google.android.gms.learning.dynamite.training.InAppTrainerImpl.f391378b     // Catch:{ all -> 0x00d9 }
        L_0x000d:
            r2 = 0
            com.google.common.b.sm r1 = r1.listIterator(r2)     // Catch:{ all -> 0x00d9 }
        L_0x0012:
            boolean r2 = r1.hasNext()     // Catch:{ all -> 0x00d9 }
            if (r2 == 0) goto L_0x0049
            java.lang.Object r2 = r1.next()     // Catch:{ all -> 0x00d9 }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ all -> 0x00d9 }
            android.content.Context r3 = r0.f391380c     // Catch:{ all -> 0x00d9 }
            int r3 = androidx.core.content.C1882h.m5137c(r3, r2)     // Catch:{ all -> 0x00d9 }
            if (r3 == 0) goto L_0x0012
            com.google.android.gms.common.api.Status r1 = new com.google.android.gms.common.api.Status     // Catch:{ all -> 0x00d9 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x00d9 }
            r3.<init>()     // Catch:{ all -> 0x00d9 }
            java.lang.String r4 = "Must hold "
            r3.append(r4)     // Catch:{ all -> 0x00d9 }
            r3.append(r2)     // Catch:{ all -> 0x00d9 }
            java.lang.String r2 = " permission!"
            r3.append(r2)     // Catch:{ all -> 0x00d9 }
            java.lang.String r7 = r3.toString()     // Catch:{ all -> 0x00d9 }
            r5 = 1
            r6 = 10
            r8 = 0
            r9 = 0
            r4 = r1
            r4.<init>(r5, r6, r7, r8, r9)     // Catch:{ all -> 0x00d9 }
            goto L_0x00c8
        L_0x0049:
            com.google.android.gms.learning.dynamite.C144655s.m235152a()     // Catch:{ all -> 0x00d9 }
            android.content.Context r1 = r0.f391380c     // Catch:{ all -> 0x00d9 }
            android.content.Context r1 = r1.getApplicationContext()     // Catch:{ all -> 0x00d9 }
            com.google.android.libraries.micore.learning.base.c r1 = com.google.android.libraries.micore.learning.base.C29711c.m54796b(r1)     // Catch:{ all -> 0x00d9 }
            java.lang.Class<com.google.android.gms.learning.b> r2 = com.google.android.gms.learning.C144573b.class
            java.lang.Object r2 = r1.mo34852c(r2)     // Catch:{ all -> 0x00cd }
            com.google.android.gms.learning.b r2 = (com.google.android.gms.learning.C144573b) r2     // Catch:{ all -> 0x00cd }
            java.lang.Class<com.google.android.gms.learning.n> r3 = com.google.android.gms.learning.C144827n.class
            java.lang.Object r3 = r1.mo34852c(r3)     // Catch:{ all -> 0x00cd }
            com.google.android.gms.learning.n r3 = (com.google.android.gms.learning.C144827n) r3     // Catch:{ all -> 0x00cd }
            boolean r4 = r0.mo120113a(r3, r2)     // Catch:{ all -> 0x00cd }
            if (r4 == 0) goto L_0x0080
            com.google.android.gms.common.api.Status r2 = new com.google.android.gms.common.api.Status     // Catch:{ all -> 0x00cd }
            java.lang.String r8 = "InAppTraining API not enabled!"
            r6 = 1
            r7 = 17
            r9 = 0
            r10 = 0
            r5 = r2
            r5.<init>(r6, r7, r8, r9, r10)     // Catch:{ all -> 0x00cd }
            if (r1 == 0) goto L_0x007e
        L_0x007b:
            r1.close()     // Catch:{ all -> 0x00d9 }
        L_0x007e:
            r1 = r2
            goto L_0x00c8
        L_0x0080:
            com.google.android.gms.learning.InAppTrainerOptions r4 = r0.f391381d     // Catch:{ all -> 0x00cd }
            boolean r3 = com.google.android.gms.learning.dynamite.training.InAppTrainerImpl.m235155b(r3, r2, r4)     // Catch:{ all -> 0x00cd }
            if (r3 == 0) goto L_0x0098
            com.google.android.gms.common.api.Status r2 = new com.google.android.gms.common.api.Status     // Catch:{ all -> 0x00cd }
            java.lang.String r7 = "In-app Personalization API is not enabled."
            r5 = 1
            r6 = 17
            r8 = 0
            r9 = 0
            r4 = r2
            r4.<init>(r5, r6, r7, r8, r9)     // Catch:{ all -> 0x00cd }
            if (r1 == 0) goto L_0x007e
            goto L_0x007b
        L_0x0098:
            long r2 = r2.mo119946G()     // Catch:{ all -> 0x00cd }
            r4 = 0
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 <= 0) goto L_0x00c1
            com.google.android.gms.learning.InAppTrainerOptions r4 = r0.f391381d     // Catch:{ all -> 0x00cd }
            byte[] r4 = r4.f391080l     // Catch:{ all -> 0x00cd }
            int r5 = r4.length     // Catch:{ all -> 0x00cd }
            byte[] r4 = java.util.Arrays.copyOf(r4, r5)     // Catch:{ all -> 0x00cd }
            int r4 = r4.length     // Catch:{ all -> 0x00cd }
            long r4 = (long) r4     // Catch:{ all -> 0x00cd }
            int r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r6 <= 0) goto L_0x00c1
            com.google.android.gms.common.api.Status r2 = new com.google.android.gms.common.api.Status     // Catch:{ all -> 0x00cd }
            java.lang.String r10 = "Context data size exceeds the limit"
            r8 = 1
            r9 = 10
            r11 = 0
            r12 = 0
            r7 = r2
            r7.<init>(r8, r9, r10, r11, r12)     // Catch:{ all -> 0x00cd }
            if (r1 == 0) goto L_0x007e
            goto L_0x007b
        L_0x00c1:
            if (r1 == 0) goto L_0x00c6
            r1.close()     // Catch:{ all -> 0x00d9 }
        L_0x00c6:
            com.google.android.gms.common.api.Status r1 = com.google.android.gms.common.api.Status.f389615a     // Catch:{ all -> 0x00d9 }
        L_0x00c8:
            com.google.common.util.concurrent.cx r0 = com.google.common.util.concurrent.C60856cj.m92900i(r1)
            return r0
        L_0x00cd:
            r2 = move-exception
            if (r1 == 0) goto L_0x00d8
            r1.close()     // Catch:{ all -> 0x00d4 }
            goto L_0x00d8
        L_0x00d4:
            r1 = move-exception
            com.google.android.gms.learning.dynamite.training.C144726v.m235235a(r2, r1)     // Catch:{ all -> 0x00d9 }
        L_0x00d8:
            throw r2     // Catch:{ all -> 0x00d9 }
        L_0x00d9:
            r1 = move-exception
            android.content.Context r0 = r0.f391380c
            android.content.Context r0 = r0.getApplicationContext()
            com.google.android.gms.common.util.C144005e.m234184a(r0, r1)
            goto L_0x00e5
        L_0x00e4:
            throw r1
        L_0x00e5:
            goto L_0x00e4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.learning.dynamite.training.C144659ab.mo120144a():com.google.common.util.concurrent.cx");
    }
}
