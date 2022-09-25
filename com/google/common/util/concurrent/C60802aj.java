package com.google.common.util.concurrent;

import java.io.Closeable;
import java.util.IdentityHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;

/* renamed from: com.google.common.util.concurrent.aj */
/* compiled from: PG */
public final class C60802aj extends IdentityHashMap implements Closeable {

    /* renamed from: a */
    public final C60812at f164859a = new C60812at(this);

    /* renamed from: b */
    private volatile boolean f164860b;

    /* renamed from: c */
    private volatile CountDownLatch f164861c;

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final C60870cx mo57260a(C60804al alVar, Object obj) {
        C60802aj ajVar = new C60802aj();
        try {
            return C60856cj.m92900i(alVar.mo20085a(ajVar.f164859a, obj));
        } finally {
            mo57261b(ajVar, C60826bg.f164896a);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0010, code lost:
        r0 = entrySet().iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001c, code lost:
        if (r0.hasNext() == false) goto L_0x0034;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x001e, code lost:
        r1 = (java.util.Map.Entry) r0.next();
        com.google.common.util.concurrent.C60817ay.m92817l((java.io.Closeable) r1.getKey(), (java.util.concurrent.Executor) r1.getValue());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0034, code lost:
        clear();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0037, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void close() {
        /*
            r3 = this;
            boolean r0 = r3.f164860b
            if (r0 == 0) goto L_0x0005
            return
        L_0x0005:
            monitor-enter(r3)
            boolean r0 = r3.f164860b     // Catch:{ all -> 0x0038 }
            if (r0 == 0) goto L_0x000c
            monitor-exit(r3)     // Catch:{ all -> 0x0038 }
            return
        L_0x000c:
            r0 = 1
            r3.f164860b = r0     // Catch:{ all -> 0x0038 }
            monitor-exit(r3)     // Catch:{ all -> 0x0038 }
            java.util.Set r0 = r3.entrySet()
            java.util.Iterator r0 = r0.iterator()
        L_0x0018:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0034
            java.lang.Object r1 = r0.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()
            java.io.Closeable r2 = (java.io.Closeable) r2
            java.lang.Object r1 = r1.getValue()
            java.util.concurrent.Executor r1 = (java.util.concurrent.Executor) r1
            com.google.common.util.concurrent.C60817ay.m92817l(r2, r1)
            goto L_0x0018
        L_0x0034:
            r3.clear()
            return
        L_0x0038:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0038 }
            goto L_0x003c
        L_0x003b:
            throw r0
        L_0x003c:
            goto L_0x003b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.util.concurrent.C60802aj.close():void");
    }

    /* renamed from: b */
    public final void mo57261b(Closeable closeable, Executor executor) {
        executor.getClass();
        if (closeable != null) {
            synchronized (this) {
                if (!this.f164860b) {
                    put(closeable, executor);
                } else {
                    C60817ay.m92817l(closeable, executor);
                }
            }
        }
    }
}
