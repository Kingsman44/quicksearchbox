package com.google.android.apps.search.assistant.surfaces.dictation.service.p9476q;

import com.google.common.util.concurrent.C60930r;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.q.ci */
/* compiled from: PG */
public final /* synthetic */ class C126249ci implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C126257cq f347868a;

    /* renamed from: b */
    public final /* synthetic */ Runnable f347869b;

    public /* synthetic */ C126249ci(C126257cq cqVar, Runnable runnable) {
        this.f347868a = cqVar;
        this.f347869b = runnable;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x005e, code lost:
        p3186j$.util.Objects.requireNonNull(r0.f347892k);
        r1 = com.google.common.util.concurrent.C60866ct.f164955a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0065, code lost:
        r2 = r0.mo107481a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0069, code lost:
        if (r2 == null) goto L_0x007b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x006b, code lost:
        r1 = com.google.common.util.concurrent.C60922j.m93045h(r1, com.google.apps.tiktok.tracing.C47810es.m84966f(new com.google.android.apps.search.assistant.surfaces.dictation.service.p9476q.C126241ca(r0, r2)), r0.f347886e);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:?, code lost:
        return r1;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.common.util.concurrent.C60870cx mo18058a() {
        /*
            r12 = this;
            com.google.android.apps.search.assistant.surfaces.dictation.service.q.cq r0 = r12.f347868a
            java.lang.Runnable r1 = r12.f347869b
            r1.run()
            com.google.android.apps.gsa.nga.api.a.bj r1 = r0.f347894m
            if (r1 == 0) goto L_0x0080
            io.grpc.i.aj r1 = r0.f347893l
            if (r1 == 0) goto L_0x0080
            com.google.android.apps.search.assistant.surfaces.dictation.service.q.cr r1 = r0.f347895n
            if (r1 != 0) goto L_0x0014
            goto L_0x0080
        L_0x0014:
            java.lang.Object r1 = r0.f347888g
            monitor-enter(r1)
            com.google.android.apps.search.assistant.surfaces.dictation.service.q.cj r2 = r0.f347890i     // Catch:{ all -> 0x007d }
            com.google.android.apps.search.assistant.surfaces.dictation.service.q.cj r3 = com.google.android.apps.search.assistant.surfaces.dictation.service.p9476q.C126250cj.SHUTTING_DOWN     // Catch:{ all -> 0x007d }
            boolean r2 = r2.equals(r3)     // Catch:{ all -> 0x007d }
            if (r2 == 0) goto L_0x0025
            com.google.common.util.concurrent.cx r0 = com.google.common.util.concurrent.C60866ct.f164955a     // Catch:{ all -> 0x007d }
            monitor-exit(r1)     // Catch:{ all -> 0x007d }
            goto L_0x0082
        L_0x0025:
            com.google.android.apps.search.assistant.surfaces.dictation.service.q.bj r2 = r0.f347892k     // Catch:{ all -> 0x007d }
            if (r2 != 0) goto L_0x002b
            r2 = 1
            goto L_0x002c
        L_0x002b:
            r2 = 0
        L_0x002c:
            java.lang.String r3 = "processor already initialized"
            com.google.common.base.C58838bb.m90884s(r2, r3)     // Catch:{ all -> 0x007d }
            com.google.android.apps.search.assistant.surfaces.dictation.service.q.bi r4 = r0.f347887f     // Catch:{ all -> 0x007d }
            com.google.android.apps.search.assistant.surfaces.dictation.service.q.ar r5 = r0.f347898q     // Catch:{ all -> 0x007d }
            io.grpc.i.aj r6 = r0.f347893l     // Catch:{ all -> 0x007d }
            com.google.android.apps.search.assistant.surfaces.dictation.service.q.cr r7 = r0.f347895n     // Catch:{ all -> 0x007d }
            com.google.android.apps.gsa.nga.api.a.bj r8 = r0.f347894m     // Catch:{ all -> 0x007d }
            com.google.android.apps.search.assistant.surfaces.dictation.service.p.j r9 = r0.f347884c     // Catch:{ all -> 0x007d }
            com.google.android.apps.search.assistant.surfaces.dictation.service.e.z r10 = r0.f347897p     // Catch:{ all -> 0x007d }
            java.util.Locale r11 = r0.f347883b     // Catch:{ all -> 0x007d }
            com.google.android.apps.search.assistant.surfaces.dictation.service.q.bj r2 = r4.mo107464a(r5, r6, r7, r8, r9, r10, r11)     // Catch:{ all -> 0x007d }
            r0.f347892k = r2     // Catch:{ all -> 0x007d }
            com.google.android.apps.search.assistant.surfaces.dictation.service.q.cj r2 = r0.f347890i     // Catch:{ all -> 0x007d }
            com.google.android.apps.search.assistant.surfaces.dictation.service.q.cj r3 = com.google.android.apps.search.assistant.surfaces.dictation.service.p9476q.C126250cj.INITIALIZING     // Catch:{ all -> 0x007d }
            boolean r2 = r2.equals(r3)     // Catch:{ all -> 0x007d }
            java.lang.String r3 = "ProcessingQueue updated while: %s"
            com.google.android.apps.search.assistant.surfaces.dictation.service.q.cj r4 = r0.f347890i     // Catch:{ all -> 0x007d }
            com.google.common.base.C58838bb.m90887v(r2, r3, r4)     // Catch:{ all -> 0x007d }
            r0.mo107485e()     // Catch:{ all -> 0x007d }
            com.google.android.apps.search.assistant.surfaces.dictation.service.q.cj r2 = com.google.android.apps.search.assistant.surfaces.dictation.service.p9476q.C126250cj.RUNNING     // Catch:{ all -> 0x007d }
            r0.f347890i = r2     // Catch:{ all -> 0x007d }
            monitor-exit(r1)     // Catch:{ all -> 0x007d }
            com.google.android.apps.search.assistant.surfaces.dictation.service.q.bj r1 = r0.f347892k
            p3186j$.util.Objects.requireNonNull(r1)
            com.google.common.util.concurrent.cx r1 = com.google.common.util.concurrent.C60866ct.f164955a
        L_0x0065:
            com.google.android.apps.search.assistant.surfaces.dictation.service.q.cp r2 = r0.mo107481a()
            if (r2 == 0) goto L_0x007b
            com.google.android.apps.search.assistant.surfaces.dictation.service.q.ca r3 = new com.google.android.apps.search.assistant.surfaces.dictation.service.q.ca
            r3.<init>(r0, r2)
            com.google.common.util.concurrent.db r2 = r0.f347886e
            com.google.common.util.concurrent.s r3 = com.google.apps.tiktok.tracing.C47810es.m84966f(r3)
            com.google.common.util.concurrent.cx r1 = com.google.common.util.concurrent.C60922j.m93045h(r1, r3, r2)
            goto L_0x0065
        L_0x007b:
            r0 = r1
            goto L_0x0082
        L_0x007d:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x007d }
            throw r0
        L_0x0080:
            com.google.common.util.concurrent.cx r0 = com.google.common.util.concurrent.C60866ct.f164955a
        L_0x0082:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.surfaces.dictation.service.p9476q.C126249ci.mo18058a():com.google.common.util.concurrent.cx");
    }
}
