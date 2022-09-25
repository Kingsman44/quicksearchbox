package com.google.p4449cd.p4460h.p4461a;

import com.google.android.libraries.gsa.p1876k.C22862b;
import com.google.p4449cd.p4456g.C57974a;
import com.google.p4449cd.p4456g.C57981b;

/* renamed from: com.google.cd.h.a.ad */
/* compiled from: PG */
final class C58008ad implements C22862b {

    /* renamed from: a */
    public final C58038y f155086a;

    /* renamed from: b */
    private final C57981b f155087b;

    /* renamed from: c */
    private final C58005aa f155088c;

    /* renamed from: d */
    private final C57974a f155089d;

    public C58008ad(C57981b bVar, C57974a aVar) {
        C58038y yVar = new C58038y();
        this.f155086a = yVar;
        this.f155089d = new C58007ac(yVar);
        this.f155087b = bVar;
        this.f155088c = new C58005aa(aVar, yVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:63:0x00a1, code lost:
        if (r2 != false) goto L_0x00a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x00a3, code lost:
        r0.f155082a.mo20339gQ(true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x00a8, code lost:
        r0 = r0.f155083b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x00b7, code lost:
        throw new java.util.concurrent.CancellationException("channel is closed");
     */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0035 A[Catch:{ InterruptedException -> 0x0092, x -> 0x008d, x -> 0x008d, InterruptedException -> 0x008b, all -> 0x0097 }] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0067 A[Catch:{ InterruptedException -> 0x0092, x -> 0x008d, x -> 0x008d, InterruptedException -> 0x008b, all -> 0x0097 }] */
    /* JADX WARNING: Removed duplicated region for block: B:49:? A[ExcHandler: x (unused com.google.cd.h.a.x), PHI: r2 
      PHI: (r2v2 boolean) = (r2v1 boolean), (r2v1 boolean), (r2v1 boolean), (r2v1 boolean), (r2v1 boolean), (r2v1 boolean), (r2v1 boolean), (r2v6 boolean) binds: [B:2:0x000c, B:3:?, B:4:0x000e, B:5:?, B:6:0x0013, B:53:0x0091, B:12:0x0020, B:45:0x0083] A[DONT_GENERATE, DONT_INLINE], SYNTHETIC, Splitter:B:2:0x000c] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ java.lang.Object mo17947a() {
        /*
            r8 = this;
            com.google.cd.g.b r0 = r8.f155087b
            com.google.cd.g.a r1 = r8.f155089d
            r0.mo20440jJ(r1)
            com.google.cd.h.a.aa r0 = r8.f155088c
            r1 = 0
            r2 = 0
        L_0x000b:
            r3 = 1
            com.google.cd.h.a.y r4 = r0.f155083b     // Catch:{ x -> 0x008d, InterruptedException -> 0x008b }
            java.util.concurrent.Semaphore r5 = r4.f155161c     // Catch:{ InterruptedException -> 0x0092, x -> 0x008d }
            r5.acquire()     // Catch:{ InterruptedException -> 0x0092, x -> 0x008d }
            java.lang.Object r5 = r4.f155159a     // Catch:{ x -> 0x008d, InterruptedException -> 0x008b }
            monitor-enter(r5)     // Catch:{ x -> 0x008d, InterruptedException -> 0x008b }
            r4.mo54611b()     // Catch:{ all -> 0x008f }
            java.util.Deque r4 = r4.f155160b     // Catch:{ all -> 0x008f }
            java.lang.Object r4 = r4.removeFirst()     // Catch:{ all -> 0x008f }
            monitor-exit(r5)     // Catch:{ all -> 0x008f }
            com.google.cd.h.a.z r4 = (com.google.p4449cd.p4460h.p4461a.C58039z) r4     // Catch:{ x -> 0x008d, InterruptedException -> 0x008b }
            if (r2 != 0) goto L_0x002b
            int r2 = r4.f155168e     // Catch:{ x -> 0x008d, InterruptedException -> 0x008b }
            if (r2 != r3) goto L_0x0029
            goto L_0x002b
        L_0x0029:
            r2 = 0
            goto L_0x002c
        L_0x002b:
            r2 = 1
        L_0x002c:
            com.google.cd.g.a r5 = r0.f155082a     // Catch:{ x -> 0x008d, InterruptedException -> 0x008b }
            int r6 = r4.f155168e     // Catch:{ x -> 0x008d, InterruptedException -> 0x008b }
            int r6 = r6 + -1
            r7 = 2
            if (r6 == 0) goto L_0x0067
            if (r6 == r3) goto L_0x005d
            if (r6 == r7) goto L_0x0049
            java.lang.Throwable r6 = r4.f155167d     // Catch:{ x -> 0x008d, InterruptedException -> 0x008b }
            if (r6 == 0) goto L_0x0041
            r5.mo20340gR(r6)     // Catch:{ x -> 0x008d, InterruptedException -> 0x008b }
            goto L_0x006e
        L_0x0041:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ x -> 0x008d, InterruptedException -> 0x008b }
            java.lang.String r4 = "failure invocation should have a non-null exception"
            r1.<init>(r4)     // Catch:{ x -> 0x008d, InterruptedException -> 0x008b }
            throw r1     // Catch:{ x -> 0x008d, InterruptedException -> 0x008b }
        L_0x0049:
            java.lang.Boolean r6 = r4.f155166c     // Catch:{ x -> 0x008d, InterruptedException -> 0x008b }
            if (r6 == 0) goto L_0x0055
            boolean r6 = r6.booleanValue()     // Catch:{ x -> 0x008d, InterruptedException -> 0x008b }
            r5.mo20339gQ(r6)     // Catch:{ x -> 0x008d, InterruptedException -> 0x008b }
            goto L_0x006e
        L_0x0055:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ x -> 0x008d, InterruptedException -> 0x008b }
            java.lang.String r4 = "end invocation should have a non-null closed"
            r1.<init>(r4)     // Catch:{ x -> 0x008d, InterruptedException -> 0x008b }
            throw r1     // Catch:{ x -> 0x008d, InterruptedException -> 0x008b }
        L_0x005d:
            com.google.common.base.ax r6 = r4.f155165b     // Catch:{ x -> 0x008d, InterruptedException -> 0x008b }
            java.lang.Object r6 = r6.mo56107c()     // Catch:{ x -> 0x008d, InterruptedException -> 0x008b }
            r5.mo20337c(r6)     // Catch:{ x -> 0x008d, InterruptedException -> 0x008b }
            goto L_0x006e
        L_0x0067:
            com.google.cd.g.c r6 = r4.f155164a     // Catch:{ x -> 0x008d, InterruptedException -> 0x008b }
            if (r6 == 0) goto L_0x0083
            r5.mo20338d(r6)     // Catch:{ x -> 0x008d, InterruptedException -> 0x008b }
        L_0x006e:
            int r5 = r4.f155168e     // Catch:{ x -> 0x008d, InterruptedException -> 0x008b }
            if (r5 == r3) goto L_0x000b
            if (r5 == r7) goto L_0x000b
            java.lang.Throwable r1 = r4.f155167d     // Catch:{ x -> 0x008d, InterruptedException -> 0x008b }
            if (r1 == 0) goto L_0x0080
            java.lang.Class<java.lang.Exception> r4 = java.lang.Exception.class
            com.google.common.base.C58887cx.m90979f(r1, r4)     // Catch:{ x -> 0x008d, InterruptedException -> 0x008b }
            com.google.common.base.C58887cx.m90980g(r1)     // Catch:{ x -> 0x008d, InterruptedException -> 0x008b }
        L_0x0080:
            com.google.cd.h.a.y r0 = r0.f155083b
            goto L_0x00aa
        L_0x0083:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ x -> 0x008d, InterruptedException -> 0x008b }
            java.lang.String r4 = "start invocation should have a non-null stream"
            r1.<init>(r4)     // Catch:{ x -> 0x008d, InterruptedException -> 0x008b }
            throw r1     // Catch:{ x -> 0x008d, InterruptedException -> 0x008b }
        L_0x008b:
            r1 = move-exception
            goto L_0x0099
        L_0x008d:
            goto L_0x00a1
        L_0x008f:
            r1 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x008f }
            throw r1     // Catch:{ x -> 0x008d, InterruptedException -> 0x008b }
        L_0x0092:
            r1 = move-exception
            r4.mo54611b()     // Catch:{ x -> 0x008d, InterruptedException -> 0x008b }
            throw r1     // Catch:{ x -> 0x008d, InterruptedException -> 0x008b }
        L_0x0097:
            r1 = move-exception
            goto L_0x00b8
        L_0x0099:
            if (r2 == 0) goto L_0x00a0
            com.google.cd.g.a r2 = r0.f155082a     // Catch:{ all -> 0x0097 }
            r2.mo20340gR(r1)     // Catch:{ all -> 0x0097 }
        L_0x00a0:
            throw r1     // Catch:{ all -> 0x0097 }
        L_0x00a1:
            if (r2 == 0) goto L_0x00b0
            com.google.cd.g.a r1 = r0.f155082a     // Catch:{ all -> 0x0097 }
            r1.mo20339gQ(r3)     // Catch:{ all -> 0x0097 }
            com.google.cd.h.a.y r0 = r0.f155083b
        L_0x00aa:
            r0.mo21018g()
            com.google.android.apps.gsa.x.c r0 = com.google.android.apps.gsa.p8883x.C118826c.f331422a
            return r0
        L_0x00b0:
            java.util.concurrent.CancellationException r1 = new java.util.concurrent.CancellationException     // Catch:{ all -> 0x0097 }
            java.lang.String r2 = "channel is closed"
            r1.<init>(r2)     // Catch:{ all -> 0x0097 }
            throw r1     // Catch:{ all -> 0x0097 }
        L_0x00b8:
            com.google.cd.h.a.y r0 = r0.f155083b
            r0.mo21018g()
            goto L_0x00bf
        L_0x00be:
            throw r1
        L_0x00bf:
            goto L_0x00be
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.p4449cd.p4460h.p4461a.C58008ad.mo17947a():java.lang.Object");
    }
}
