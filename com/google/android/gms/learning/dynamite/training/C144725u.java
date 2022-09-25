package com.google.android.gms.learning.dynamite.training;

/* renamed from: com.google.android.gms.learning.dynamite.training.u */
/* compiled from: PG */
final class C144725u implements C144692bh {

    /* renamed from: a */
    final /* synthetic */ InAppTrainerCancellerImpl f391519a;

    /* renamed from: b */
    private final int f391520b;

    public C144725u(InAppTrainerCancellerImpl inAppTrainerCancellerImpl, int i) {
        this.f391519a = inAppTrainerCancellerImpl;
        this.f391520b = i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:46:?, code lost:
        throw r0;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:45:0x00df */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.common.util.concurrent.C60870cx mo120144a() {
        /*
            r13 = this;
            int r0 = r13.f391520b     // Catch:{ all -> 0x00e0 }
            r1 = 3
            r2 = 1
            if (r0 == 0) goto L_0x001f
            if (r0 == r2) goto L_0x001f
            r3 = 2
            if (r0 == r3) goto L_0x001f
            if (r0 == r1) goto L_0x001f
            com.google.android.gms.common.api.Status r0 = new com.google.android.gms.common.api.Status     // Catch:{ all -> 0x00e0 }
            java.lang.String r7 = "Unknown InAppTrainerType!"
            r5 = 1
            r6 = 10
            r8 = 0
            r9 = 0
            r4 = r0
            r4.<init>(r5, r6, r7, r8, r9)     // Catch:{ all -> 0x00e0 }
            com.google.common.util.concurrent.cx r0 = com.google.common.util.concurrent.C60856cj.m92900i(r0)     // Catch:{ all -> 0x00e0 }
            return r0
        L_0x001f:
            com.google.android.gms.learning.dynamite.training.InAppTrainerCancellerImpl r0 = r13.f391519a     // Catch:{ all -> 0x00e0 }
            android.content.Context r0 = r0.f391375a     // Catch:{ all -> 0x00e0 }
            android.content.Context r0 = r0.getApplicationContext()     // Catch:{ all -> 0x00e0 }
            com.google.android.libraries.micore.learning.base.c r3 = com.google.android.libraries.micore.learning.base.C29711c.m54796b(r0)     // Catch:{ all -> 0x00e0 }
            java.lang.Class<com.google.android.gms.learning.n> r4 = com.google.android.gms.learning.C144827n.class
            java.lang.Object r4 = r3.mo34852c(r4)     // Catch:{ all -> 0x00c1 }
            com.google.android.gms.learning.n r4 = (com.google.android.gms.learning.C144827n) r4     // Catch:{ all -> 0x00c1 }
            java.lang.Class<com.google.android.gms.learning.b> r5 = com.google.android.gms.learning.C144573b.class
            java.lang.Object r5 = r3.mo34852c(r5)     // Catch:{ all -> 0x00c1 }
            com.google.android.gms.learning.b r5 = (com.google.android.gms.learning.C144573b) r5     // Catch:{ all -> 0x00c1 }
            com.google.android.gms.learning.dynamite.training.InAppTrainerCancellerImpl r6 = r13.f391519a     // Catch:{ all -> 0x00c1 }
            boolean r6 = r6.mo120110a(r4, r5)     // Catch:{ all -> 0x00c1 }
            if (r6 == 0) goto L_0x005a
            com.google.android.gms.common.api.Status r0 = new com.google.android.gms.common.api.Status     // Catch:{ all -> 0x00c1 }
            java.lang.String r10 = "InAppTraining API not enabled!"
            r8 = 1
            r9 = 17
            r11 = 0
            r12 = 0
            r7 = r0
            r7.<init>(r8, r9, r10, r11, r12)     // Catch:{ all -> 0x00c1 }
            com.google.common.util.concurrent.cx r0 = com.google.common.util.concurrent.C60856cj.m92900i(r0)     // Catch:{ all -> 0x00c1 }
            if (r3 == 0) goto L_0x0059
            r3.close()     // Catch:{ all -> 0x00e0 }
        L_0x0059:
            return r0
        L_0x005a:
            r6 = 1159(0x487, float:1.624E-42)
            r4.mo120056h(r6)     // Catch:{ all -> 0x00c1 }
            boolean r4 = r5.mo120013au()     // Catch:{ all -> 0x00c1 }
            if (r4 == 0) goto L_0x006a
            com.google.android.libraries.micore.learning.base.c r4 = com.google.android.libraries.micore.learning.base.C29711c.m54796b(r0)     // Catch:{ all -> 0x00c1 }
            goto L_0x006b
        L_0x006a:
            r4 = 0
        L_0x006b:
            java.lang.Class<com.google.android.gms.learning.d.ad> r6 = com.google.android.gms.learning.p10823d.C144588ad.class
            java.lang.Object r6 = r3.mo34852c(r6)     // Catch:{ all -> 0x00c1 }
            com.google.android.gms.learning.d.ad r6 = (com.google.android.gms.learning.p10823d.C144588ad) r6     // Catch:{ all -> 0x00c1 }
            int r7 = r13.f391520b     // Catch:{ all -> 0x00c1 }
            if (r7 == 0) goto L_0x0081
            if (r7 == r2) goto L_0x007f
            if (r7 == r1) goto L_0x007d
            r1 = 1
            goto L_0x0082
        L_0x007d:
            r1 = 6
            goto L_0x0082
        L_0x007f:
            r1 = 5
            goto L_0x0082
        L_0x0081:
            r1 = 4
        L_0x0082:
            com.google.common.util.concurrent.cx r7 = r6.mo120067h(r7)     // Catch:{ all -> 0x00c1 }
            com.google.common.util.concurrent.bs r7 = com.google.common.util.concurrent.C60838bs.m92859i(r7)     // Catch:{ all -> 0x00c1 }
            com.google.android.gms.learning.dynamite.training.q r8 = new com.google.android.gms.learning.dynamite.training.q     // Catch:{ all -> 0x00c1 }
            r8.<init>(r6, r1)     // Catch:{ all -> 0x00c1 }
            com.google.common.util.concurrent.bg r9 = com.google.common.util.concurrent.C60826bg.f164896a     // Catch:{ all -> 0x00c1 }
            com.google.common.util.concurrent.cx r7 = com.google.common.util.concurrent.C60922j.m93044g(r7, r8, r9)     // Catch:{ all -> 0x00c1 }
            java.lang.Class<java.io.IOException> r8 = java.io.IOException.class
            com.google.android.gms.learning.dynamite.training.r r9 = new com.google.android.gms.learning.dynamite.training.r     // Catch:{ all -> 0x00c1 }
            r9.<init>(r6, r1)     // Catch:{ all -> 0x00c1 }
            com.google.common.util.concurrent.bg r10 = com.google.common.util.concurrent.C60826bg.f164896a     // Catch:{ all -> 0x00c1 }
            com.google.common.util.concurrent.cx r7 = com.google.common.util.concurrent.C60846c.m92878g(r7, r8, r9, r10)     // Catch:{ all -> 0x00c1 }
            java.lang.Class<java.lang.RuntimeException> r8 = java.lang.RuntimeException.class
            com.google.android.gms.learning.dynamite.training.s r9 = new com.google.android.gms.learning.dynamite.training.s     // Catch:{ all -> 0x00c1 }
            r9.<init>(r6, r1, r5, r0)     // Catch:{ all -> 0x00c1 }
            com.google.common.util.concurrent.bg r0 = com.google.common.util.concurrent.C60826bg.f164896a     // Catch:{ all -> 0x00c1 }
            com.google.common.util.concurrent.cx r0 = com.google.common.util.concurrent.C60846c.m92878g(r7, r8, r9, r0)     // Catch:{ all -> 0x00c1 }
            com.google.android.gms.learning.dynamite.training.t r1 = new com.google.android.gms.learning.dynamite.training.t     // Catch:{ all -> 0x00c1 }
            r1.<init>(r4)     // Catch:{ all -> 0x00c1 }
            com.google.android.gms.learning.dynamite.training.InAppTrainerCancellerImpl r4 = r13.f391519a     // Catch:{ all -> 0x00c1 }
            java.util.concurrent.Executor r4 = r4.f391376b     // Catch:{ all -> 0x00c1 }
            r0.mo4106b(r1, r4)     // Catch:{ all -> 0x00c1 }
            if (r3 == 0) goto L_0x00c0
            r3.close()     // Catch:{ all -> 0x00e0 }
        L_0x00c0:
            return r0
        L_0x00c1:
            r0 = move-exception
            if (r3 == 0) goto L_0x00df
            r3.close()     // Catch:{ all -> 0x00c8 }
            goto L_0x00df
        L_0x00c8:
            r1 = move-exception
            java.lang.Class[] r3 = new java.lang.Class[r2]     // Catch:{ Exception -> 0x00df }
            java.lang.Class<java.lang.Throwable> r4 = java.lang.Throwable.class
            r5 = 0
            r3[r5] = r4     // Catch:{ Exception -> 0x00df }
            java.lang.Class<java.lang.Throwable> r4 = java.lang.Throwable.class
            java.lang.String r6 = "addSuppressed"
            java.lang.reflect.Method r3 = r4.getDeclaredMethod(r6, r3)     // Catch:{ Exception -> 0x00df }
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ Exception -> 0x00df }
            r2[r5] = r1     // Catch:{ Exception -> 0x00df }
            r3.invoke(r0, r2)     // Catch:{ Exception -> 0x00df }
        L_0x00df:
            throw r0     // Catch:{ all -> 0x00e0 }
        L_0x00e0:
            r0 = move-exception
            com.google.android.gms.learning.dynamite.training.InAppTrainerCancellerImpl r1 = r13.f391519a
            android.content.Context r1 = r1.f391375a
            android.content.Context r1 = r1.getApplicationContext()
            com.google.android.gms.common.util.C144005e.m234184a(r1, r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.learning.dynamite.training.C144725u.mo120144a():com.google.common.util.concurrent.cx");
    }
}
