package com.facebook.litho;

import java.util.ArrayDeque;
import java.util.Deque;

/* renamed from: com.facebook.litho.fr */
/* compiled from: PG */
final class C6275fr implements C6193dm {

    /* renamed from: a */
    public final Deque f18530a = new ArrayDeque();

    /* renamed from: b */
    public long f18531b = 0;

    /* renamed from: c */
    public int f18532c = 1;

    /* renamed from: d */
    private final C6193dm f18533d;

    /* renamed from: e */
    private final C6274fq f18534e;

    public C6275fr(C6193dm dmVar) {
        this.f18533d = dmVar;
        this.f18534e = new C6274fq(this);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
        r6.f18533d.mo13163a(r6.f18534e, r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0028, code lost:
        if (r6.f18532c == 2) goto L_0x002b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002a, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x002b, code lost:
        r8 = r6.f18530a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x002d, code lost:
        monitor-enter(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0032, code lost:
        if (r6.f18531b != r3) goto L_0x003a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0036, code lost:
        if (r6.f18532c != 2) goto L_0x003a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0038, code lost:
        r6.f18532c = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x003a, code lost:
        monitor-exit(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x003b, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x003f, code lost:
        r8 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0044, code lost:
        monitor-enter(r6.f18530a);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:?, code lost:
        r0 = r6.f18532c;
        r3 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0055, code lost:
        r3 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0058, code lost:
        if ((r8 instanceof java.util.concurrent.RejectedExecutionException) == false) goto L_0x005e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x005d, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x005e, code lost:
        throw r8;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo13163a(java.lang.Runnable r7, java.lang.String r8) {
        /*
            r6 = this;
            if (r7 != 0) goto L_0x0003
            return
        L_0x0003:
            java.util.Deque r0 = r6.f18530a
            monitor-enter(r0)
            int r1 = r6.f18532c     // Catch:{ all -> 0x0069 }
            r2 = 4
            if (r1 == r2) goto L_0x0062
            r2 = 3
            if (r1 != r2) goto L_0x000f
            goto L_0x0062
        L_0x000f:
            long r3 = r6.f18531b     // Catch:{ all -> 0x0069 }
            com.facebook.litho.fp r1 = new com.facebook.litho.fp     // Catch:{ all -> 0x0069 }
            r1.<init>(r7)     // Catch:{ all -> 0x0069 }
            java.util.Deque r7 = r6.f18530a     // Catch:{ all -> 0x0069 }
            r7.add(r1)     // Catch:{ all -> 0x0069 }
            r7 = 2
            r6.f18532c = r7     // Catch:{ all -> 0x0069 }
            monitor-exit(r0)     // Catch:{ all -> 0x0069 }
            com.facebook.litho.dm r0 = r6.f18533d     // Catch:{ RuntimeException -> 0x0041, Error -> 0x003f }
            com.facebook.litho.fq r5 = r6.f18534e     // Catch:{ RuntimeException -> 0x0041, Error -> 0x003f }
            r0.mo13163a(r5, r8)     // Catch:{ RuntimeException -> 0x0041, Error -> 0x003f }
            int r8 = r6.f18532c
            if (r8 == r7) goto L_0x002b
            return
        L_0x002b:
            java.util.Deque r8 = r6.f18530a
            monitor-enter(r8)
            long r0 = r6.f18531b     // Catch:{ all -> 0x003c }
            int r5 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r5 != 0) goto L_0x003a
            int r0 = r6.f18532c     // Catch:{ all -> 0x003c }
            if (r0 != r7) goto L_0x003a
            r6.f18532c = r2     // Catch:{ all -> 0x003c }
        L_0x003a:
            monitor-exit(r8)     // Catch:{ all -> 0x003c }
            return
        L_0x003c:
            r7 = move-exception
            monitor-exit(r8)     // Catch:{ all -> 0x003c }
            throw r7
        L_0x003f:
            r8 = move-exception
            goto L_0x0042
        L_0x0041:
            r8 = move-exception
        L_0x0042:
            java.util.Deque r2 = r6.f18530a
            monitor-enter(r2)
            int r0 = r6.f18532c     // Catch:{ all -> 0x005f }
            r3 = 0
            r4 = 1
            if (r0 == r4) goto L_0x004d
            if (r0 != r7) goto L_0x0056
        L_0x004d:
            java.util.Deque r7 = r6.f18530a     // Catch:{ all -> 0x005f }
            boolean r7 = r7.removeLastOccurrence(r1)     // Catch:{ all -> 0x005f }
            if (r7 == 0) goto L_0x0056
            r3 = 1
        L_0x0056:
            boolean r7 = r8 instanceof java.util.concurrent.RejectedExecutionException     // Catch:{ all -> 0x005f }
            if (r7 == 0) goto L_0x005e
            if (r3 != 0) goto L_0x005e
            monitor-exit(r2)     // Catch:{ all -> 0x005f }
            return
        L_0x005e:
            throw r8     // Catch:{ all -> 0x005f }
        L_0x005f:
            r7 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x005f }
            throw r7
        L_0x0062:
            java.util.Deque r8 = r6.f18530a     // Catch:{ all -> 0x0069 }
            r8.add(r7)     // Catch:{ all -> 0x0069 }
            monitor-exit(r0)     // Catch:{ all -> 0x0069 }
            return
        L_0x0069:
            r7 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0069 }
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.litho.C6275fr.mo13163a(java.lang.Runnable, java.lang.String):void");
    }

    /* renamed from: b */
    public final void mo13164b(Runnable runnable) {
        if (!this.f18530a.isEmpty()) {
            synchronized (this.f18530a) {
                this.f18530a.remove(runnable);
            }
        }
    }

    /* renamed from: c */
    public final boolean mo13165c() {
        return false;
    }

    public final String toString() {
        int identityHashCode = System.identityHashCode(this);
        String obj = this.f18533d.toString();
        return "SequentialLithoHandler@" + identityHashCode + "{" + obj + "}";
    }
}
