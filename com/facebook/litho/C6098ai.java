package com.facebook.litho;

import java.util.concurrent.FutureTask;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.facebook.litho.ai */
/* compiled from: PG */
final class C6098ai {

    /* renamed from: a */
    public final C6411u f18014a;

    /* renamed from: b */
    public final C6407q f18015b;

    /* renamed from: c */
    public final int f18016c;

    /* renamed from: d */
    public final int f18017d;

    /* renamed from: e */
    public final boolean f18018e;

    /* renamed from: f */
    public final C6381hf f18019f;

    /* renamed from: g */
    public final AtomicInteger f18020g = new AtomicInteger(0);

    /* renamed from: h */
    public volatile boolean f18021h;

    /* renamed from: i */
    public final int f18022i;

    /* renamed from: j */
    public final String f18023j;

    /* renamed from: k */
    public volatile boolean f18024k = false;

    /* renamed from: l */
    final /* synthetic */ ComponentTree f18025l;

    /* renamed from: m */
    private final AtomicInteger f18026m = new AtomicInteger(-1);

    /* renamed from: n */
    private final RunnableFuture f18027n;

    /* renamed from: o */
    private volatile Object f18028o;

    /* renamed from: p */
    private volatile Object f18029p;

    public C6098ai(ComponentTree componentTree, C6411u uVar, C6407q qVar, int i, int i2, boolean z, C6381hf hfVar, int i3, String str) {
        this.f18025l = componentTree;
        this.f18014a = uVar;
        this.f18015b = qVar;
        this.f18016c = i;
        this.f18017d = i2;
        this.f18018e = z;
        this.f18019f = hfVar;
        this.f18022i = i3;
        this.f18023j = str;
        FutureTask futureTask = new FutureTask(new C6097ah(this));
        C6163ck ckVar = C6164cl.f18208a;
        this.f18027n = futureTask;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0062 A[SYNTHETIC, Splitter:B:33:0x0062] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0082 A[Catch:{ CancellationException | ExecutionException -> 0x00a7, all -> 0x00a3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0089 A[SYNTHETIC, Splitter:B:43:0x0089] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0096 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00b4 A[Catch:{ all -> 0x0071 }] */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x00b7 A[Catch:{ all -> 0x0071 }] */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x00c3  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.facebook.litho.C6187dg mo12844a(int r7) {
        /*
            r6 = this;
            java.util.concurrent.atomic.AtomicInteger r0 = r6.f18026m
            r1 = -1
            int r2 = android.os.Process.myTid()
            boolean r0 = r0.compareAndSet(r1, r2)
            if (r0 == 0) goto L_0x0012
            java.util.concurrent.RunnableFuture r0 = r6.f18027n
            r0.run()
        L_0x0012:
            java.util.concurrent.atomic.AtomicInteger r0 = r6.f18026m
            int r0 = r0.get()
            int r1 = android.os.Process.myTid()
            java.util.concurrent.RunnableFuture r2 = r6.f18027n
            boolean r2 = r2.isDone()
            r3 = 1
            r4 = 0
            if (r2 != 0) goto L_0x002a
            if (r0 == r1) goto L_0x002a
            r1 = 1
            goto L_0x002b
        L_0x002a:
            r1 = 0
        L_0x002b:
            r2 = 0
            if (r1 == 0) goto L_0x003c
            boolean r5 = com.facebook.litho.C6349gb.m17046b()
            if (r5 != 0) goto L_0x003c
            boolean r7 = com.facebook.litho.ComponentTree.m15674r(r7)
            if (r7 == 0) goto L_0x003b
            goto L_0x003c
        L_0x003b:
            return r2
        L_0x003c:
            boolean r7 = com.facebook.litho.C6349gb.m17046b()
            if (r7 == 0) goto L_0x0059
            if (r1 == 0) goto L_0x0059
            int r7 = android.os.Process.getThreadPriority(r0)     // Catch:{ RuntimeException -> 0x0058 }
            r1 = -4
            r5 = 0
        L_0x004a:
            if (r5 != 0) goto L_0x0056
            if (r1 >= r7) goto L_0x0056
            android.os.Process.setThreadPriority(r0, r1)     // Catch:{ SecurityException -> 0x0053 }
            r5 = 1
            goto L_0x004a
        L_0x0053:
            int r1 = r1 + 1
            goto L_0x004a
        L_0x0056:
            r4 = r7
            goto L_0x005a
        L_0x0058:
        L_0x0059:
            r3 = 0
        L_0x005a:
            com.facebook.litho.ComponentTree r7 = r6.f18025l
            com.google.android.libraries.elements.h.m r7 = r7.mo12725u()
            if (r7 == 0) goto L_0x0077
            com.facebook.litho.ComponentTree r1 = r6.f18025l     // Catch:{ ExecutionException -> 0x0075, CancellationException -> 0x0073 }
            com.facebook.litho.u r1 = r1.f17907j     // Catch:{ ExecutionException -> 0x0075, CancellationException -> 0x0073 }
            r5 = 21
            com.facebook.litho.fd r5 = r7.mo26269a(r1, r5)     // Catch:{ ExecutionException -> 0x0075, CancellationException -> 0x0073 }
            com.facebook.litho.fd r7 = com.facebook.litho.C6231ee.m16500a(r1, r7, r5)     // Catch:{ ExecutionException -> 0x0075, CancellationException -> 0x0073 }
            goto L_0x0078
        L_0x0071:
            r7 = move-exception
            goto L_0x00c1
        L_0x0073:
            r7 = move-exception
            goto L_0x00ac
        L_0x0075:
            r7 = move-exception
            goto L_0x00ac
        L_0x0077:
            r7 = r2
        L_0x0078:
            java.util.concurrent.RunnableFuture r1 = r6.f18027n     // Catch:{ ExecutionException -> 0x00a9, CancellationException -> 0x00a7, all -> 0x00a3 }
            java.lang.Object r1 = com.google.common.util.concurrent.C60917ed.m93034a(r1)     // Catch:{ ExecutionException -> 0x00a9, CancellationException -> 0x00a7, all -> 0x00a3 }
            com.facebook.litho.dg r1 = (com.facebook.litho.C6187dg) r1     // Catch:{ ExecutionException -> 0x00a9, CancellationException -> 0x00a7, all -> 0x00a3 }
            if (r7 == 0) goto L_0x0087
            java.lang.String r5 = "FUTURE_TASK_END"
            r7.mo13236b(r5)     // Catch:{ ExecutionException -> 0x00a9, CancellationException -> 0x00a7, all -> 0x00a3 }
        L_0x0087:
            if (r3 == 0) goto L_0x008c
            android.os.Process.setThreadPriority(r0, r4)     // Catch:{ IllegalArgumentException | SecurityException -> 0x008c }
        L_0x008c:
            if (r7 == 0) goto L_0x0094
            com.facebook.litho.C6349gb.m17046b()
            com.google.android.libraries.elements.p1729h.C21215m.m39906e(r7)
        L_0x0094:
            if (r1 != 0) goto L_0x0097
            return r2
        L_0x0097:
            monitor-enter(r6)
            boolean r7 = r6.f18024k     // Catch:{ all -> 0x00a0 }
            if (r7 == 0) goto L_0x009e
            monitor-exit(r6)     // Catch:{ all -> 0x00a0 }
            return r2
        L_0x009e:
            monitor-exit(r6)     // Catch:{ all -> 0x00a0 }
            return r1
        L_0x00a0:
            r7 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x00a0 }
            throw r7
        L_0x00a3:
            r0 = move-exception
            r2 = r7
            r7 = r0
            goto L_0x00c1
        L_0x00a7:
            r0 = move-exception
            goto L_0x00aa
        L_0x00a9:
            r0 = move-exception
        L_0x00aa:
            r2 = r7
            r7 = r0
        L_0x00ac:
            java.lang.Throwable r0 = r7.getCause()     // Catch:{ all -> 0x0071 }
            boolean r1 = r0 instanceof java.lang.RuntimeException     // Catch:{ all -> 0x0071 }
            if (r1 == 0) goto L_0x00b7
            java.lang.RuntimeException r0 = (java.lang.RuntimeException) r0     // Catch:{ all -> 0x0071 }
            throw r0     // Catch:{ all -> 0x0071 }
        L_0x00b7:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException     // Catch:{ all -> 0x0071 }
            java.lang.String r1 = r7.getMessage()     // Catch:{ all -> 0x0071 }
            r0.<init>(r1, r7)     // Catch:{ all -> 0x0071 }
            throw r0     // Catch:{ all -> 0x0071 }
        L_0x00c1:
            if (r2 == 0) goto L_0x00c9
            com.facebook.litho.C6349gb.m17046b()
            com.google.android.libraries.elements.p1729h.C21215m.m39906e(r2)
        L_0x00c9:
            goto L_0x00cb
        L_0x00ca:
            throw r7
        L_0x00cb:
            goto L_0x00ca
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.litho.C6098ai.mo12844a(int):com.facebook.litho.dg");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final synchronized void mo12845b() {
        if (!this.f18024k) {
            this.f18029p = null;
            this.f18028o = null;
            this.f18024k = true;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C6098ai aiVar = (C6098ai) obj;
        return this.f18016c == aiVar.f18016c && this.f18017d == aiVar.f18017d && this.f18014a.equals(aiVar.f18014a) && this.f18015b.f18989l == aiVar.f18015b.f18989l;
    }

    public final int hashCode() {
        return (((((this.f18014a.hashCode() * 31) + this.f18015b.f18989l) * 31) + this.f18016c) * 31) + this.f18017d;
    }
}
