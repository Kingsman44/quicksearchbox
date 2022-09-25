package androidx.camera.core.p069a.p070a.p071a;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.Executor;

/* renamed from: androidx.camera.core.a.a.a.m */
/* compiled from: PG */
public final class C1250m implements Executor {

    /* renamed from: a */
    final Deque f3645a = new ArrayDeque();

    /* renamed from: b */
    long f3646b = 0;

    /* renamed from: c */
    int f3647c = 1;

    /* renamed from: d */
    private final Executor f3648d;

    /* renamed from: e */
    private final C1249l f3649e = new C1249l(this);

    public C1250m(Executor executor) {
        executor.getClass();
        this.f3648d = executor;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:?, code lost:
        r7.f3648d.execute(r7.f3649e);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0028, code lost:
        if (r7.f3647c == 2) goto L_0x002b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002a, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002b, code lost:
        r0 = r7.f3645a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002d, code lost:
        monitor-enter(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0032, code lost:
        if (r7.f3646b != r3) goto L_0x003a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0036, code lost:
        if (r7.f3647c != 2) goto L_0x003a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0038, code lost:
        r7.f3647c = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x003a, code lost:
        monitor-exit(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x003b, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x003f, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0044, code lost:
        monitor-enter(r7.f3645a);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:?, code lost:
        r3 = r7.f3647c;
        r4 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0055, code lost:
        r4 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0058, code lost:
        if ((r0 instanceof java.util.concurrent.RejectedExecutionException) == false) goto L_0x005e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x005d, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x005e, code lost:
        throw r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void execute(java.lang.Runnable r8) {
        /*
            r7 = this;
            r8.getClass()
            java.util.Deque r0 = r7.f3645a
            monitor-enter(r0)
            int r1 = r7.f3647c     // Catch:{ all -> 0x0069 }
            r2 = 4
            if (r1 == r2) goto L_0x0062
            r2 = 3
            if (r1 != r2) goto L_0x000f
            goto L_0x0062
        L_0x000f:
            long r3 = r7.f3646b     // Catch:{ all -> 0x0069 }
            androidx.camera.core.a.a.a.k r1 = new androidx.camera.core.a.a.a.k     // Catch:{ all -> 0x0069 }
            r1.<init>(r8)     // Catch:{ all -> 0x0069 }
            java.util.Deque r8 = r7.f3645a     // Catch:{ all -> 0x0069 }
            r8.add(r1)     // Catch:{ all -> 0x0069 }
            r8 = 2
            r7.f3647c = r8     // Catch:{ all -> 0x0069 }
            monitor-exit(r0)     // Catch:{ all -> 0x0069 }
            java.util.concurrent.Executor r0 = r7.f3648d     // Catch:{ RuntimeException -> 0x0041, Error -> 0x003f }
            androidx.camera.core.a.a.a.l r5 = r7.f3649e     // Catch:{ RuntimeException -> 0x0041, Error -> 0x003f }
            r0.execute(r5)     // Catch:{ RuntimeException -> 0x0041, Error -> 0x003f }
            int r0 = r7.f3647c
            if (r0 == r8) goto L_0x002b
            return
        L_0x002b:
            java.util.Deque r0 = r7.f3645a
            monitor-enter(r0)
            long r5 = r7.f3646b     // Catch:{ all -> 0x003c }
            int r1 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r1 != 0) goto L_0x003a
            int r1 = r7.f3647c     // Catch:{ all -> 0x003c }
            if (r1 != r8) goto L_0x003a
            r7.f3647c = r2     // Catch:{ all -> 0x003c }
        L_0x003a:
            monitor-exit(r0)     // Catch:{ all -> 0x003c }
            return
        L_0x003c:
            r8 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x003c }
            throw r8
        L_0x003f:
            r0 = move-exception
            goto L_0x0042
        L_0x0041:
            r0 = move-exception
        L_0x0042:
            java.util.Deque r2 = r7.f3645a
            monitor-enter(r2)
            int r3 = r7.f3647c     // Catch:{ all -> 0x005f }
            r4 = 0
            r5 = 1
            if (r3 == r5) goto L_0x004d
            if (r3 != r8) goto L_0x0056
        L_0x004d:
            java.util.Deque r8 = r7.f3645a     // Catch:{ all -> 0x005f }
            boolean r8 = r8.removeLastOccurrence(r1)     // Catch:{ all -> 0x005f }
            if (r8 == 0) goto L_0x0056
            r4 = 1
        L_0x0056:
            boolean r8 = r0 instanceof java.util.concurrent.RejectedExecutionException     // Catch:{ all -> 0x005f }
            if (r8 == 0) goto L_0x005e
            if (r4 != 0) goto L_0x005e
            monitor-exit(r2)     // Catch:{ all -> 0x005f }
            return
        L_0x005e:
            throw r0     // Catch:{ all -> 0x005f }
        L_0x005f:
            r8 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x005f }
            throw r8
        L_0x0062:
            java.util.Deque r1 = r7.f3645a     // Catch:{ all -> 0x0069 }
            r1.add(r8)     // Catch:{ all -> 0x0069 }
            monitor-exit(r0)     // Catch:{ all -> 0x0069 }
            return
        L_0x0069:
            r8 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0069 }
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.camera.core.p069a.p070a.p071a.C1250m.execute(java.lang.Runnable):void");
    }
}
