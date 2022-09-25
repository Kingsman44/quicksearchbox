package com.google.apps.tiktok.account.api.controller;

/* renamed from: com.google.apps.tiktok.account.api.controller.ca */
/* compiled from: PG */
public final class C46017ca {
    /* JADX WARNING: Can't wrap try/catch for region: R(3:16|17|(1:19)(1:20)) */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0037, code lost:
        if (r0.isEmpty() == false) goto L_0x003a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0039, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003a, code lost:
        r0.add(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0042, code lost:
        if (r0.isEmpty() != false) goto L_0x0044;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0044, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0045, code lost:
        r0.add(r1);
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x003e */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static com.google.common.util.concurrent.C60870cx m82210a(java.util.List r4, com.google.common.base.C58839bc r5, java.util.concurrent.Executor r6) {
        /*
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r4.size()
            r0.<init>(r1)
            java.util.Iterator r4 = r4.iterator()
        L_0x000d:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L_0x005c
            java.lang.Object r1 = r4.next()
            com.google.common.util.concurrent.r r1 = (com.google.common.util.concurrent.C60930r) r1
            com.google.common.util.concurrent.cx r1 = r1.mo18058a()     // Catch:{ Exception -> 0x004d }
            boolean r2 = r1.isDone()     // Catch:{ Exception -> 0x004d }
            if (r2 == 0) goto L_0x0049
            java.lang.Object r2 = com.google.common.util.concurrent.C60856cj.m92909r(r1)     // Catch:{ ExecutionException -> 0x003e }
            boolean r3 = r1.isCancelled()     // Catch:{ ExecutionException -> 0x003e }
            if (r3 != 0) goto L_0x0033
            boolean r2 = r5.mo5941a(r2)     // Catch:{ ExecutionException -> 0x003e }
            if (r2 == 0) goto L_0x000d
        L_0x0033:
            boolean r4 = r0.isEmpty()     // Catch:{ ExecutionException -> 0x003e }
            if (r4 == 0) goto L_0x003a
            return r1
        L_0x003a:
            r0.add(r1)     // Catch:{ ExecutionException -> 0x003e }
            goto L_0x005c
        L_0x003e:
            boolean r4 = r0.isEmpty()     // Catch:{ Exception -> 0x004d }
            if (r4 == 0) goto L_0x0045
            return r1
        L_0x0045:
            r0.add(r1)     // Catch:{ Exception -> 0x004d }
            goto L_0x005c
        L_0x0049:
            r0.add(r1)     // Catch:{ Exception -> 0x004d }
            goto L_0x000d
        L_0x004d:
            r4 = move-exception
            com.google.common.util.concurrent.cx r4 = com.google.common.util.concurrent.C60856cj.m92899h(r4)
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L_0x0059
            return r4
        L_0x0059:
            r0.add(r4)
        L_0x005c:
            com.google.apps.tiktok.account.api.controller.bz r4 = new com.google.apps.tiktok.account.api.controller.bz
            r4.<init>(r0, r5, r6)
            int r5 = r4.f120866d
            r6 = -1
            if (r5 != r6) goto L_0x0068
            r5 = 1
            goto L_0x0069
        L_0x0068:
            r5 = 0
        L_0x0069:
            com.google.common.base.C58838bb.m90883r(r5)
            com.google.common.util.concurrent.cx r5 = r4.mo50156a()
            com.google.apps.tiktok.account.api.controller.by r6 = new com.google.apps.tiktok.account.api.controller.by
            r6.<init>(r4)
            java.util.concurrent.Executor r4 = r4.f120865c
            r5.mo4106b(r6, r4)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.apps.tiktok.account.api.controller.C46017ca.m82210a(java.util.List, com.google.common.base.bc, java.util.concurrent.Executor):com.google.common.util.concurrent.cx");
    }
}
