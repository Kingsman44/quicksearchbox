package com.google.android.libraries.storage.p3315b;

/* renamed from: com.google.android.libraries.storage.b.x */
/* compiled from: PG */
public final /* synthetic */ class C42869x implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C42823ai f112172a;

    public /* synthetic */ C42869x(C42823ai aiVar) {
        this.f112172a = aiVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0017, code lost:
        if (r2.cancel(true) != false) goto L_0x0022;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:?, code lost:
        ((android.database.sqlite.SQLiteDatabase) com.google.common.util.concurrent.C60856cj.m92909r(r2)).close();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r4 = this;
            com.google.android.libraries.storage.b.ai r0 = r4.f112172a
            java.lang.Object r1 = r0.f112094k
            monitor-enter(r1)
            com.google.common.util.concurrent.cx r2 = r0.f112096m     // Catch:{ all -> 0x0046 }
            int r3 = r0.f112097n     // Catch:{ all -> 0x0046 }
            if (r3 != 0) goto L_0x0044
            if (r2 != 0) goto L_0x000e
            goto L_0x0044
        L_0x000e:
            r3 = 0
            r0.f112096m = r3     // Catch:{ all -> 0x0046 }
            monitor-exit(r1)     // Catch:{ all -> 0x0046 }
            r1 = 1
            boolean r1 = r2.cancel(r1)
            if (r1 != 0) goto L_0x0022
            java.lang.Object r1 = com.google.common.util.concurrent.C60856cj.m92909r(r2)     // Catch:{ ExecutionException -> 0x0022 }
            android.database.sqlite.SQLiteDatabase r1 = (android.database.sqlite.SQLiteDatabase) r1     // Catch:{ ExecutionException -> 0x0022 }
            r1.close()     // Catch:{ ExecutionException -> 0x0022 }
        L_0x0022:
            android.content.Context r1 = r0.f112085b
            r1.unregisterComponentCallbacks(r0)
            java.util.Set r0 = r0.f112093j
            java.util.Iterator r0 = r0.iterator()
        L_0x002d:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0043
            java.lang.Object r1 = r0.next()
            java.lang.ref.WeakReference r1 = (java.lang.ref.WeakReference) r1
            java.lang.Object r1 = r1.get()
            if (r1 != 0) goto L_0x002d
            r0.remove()
            goto L_0x002d
        L_0x0043:
            return
        L_0x0044:
            monitor-exit(r1)     // Catch:{ all -> 0x0046 }
            return
        L_0x0046:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0046 }
            goto L_0x004a
        L_0x0049:
            throw r0
        L_0x004a:
            goto L_0x0049
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.storage.p3315b.C42869x.run():void");
    }
}
