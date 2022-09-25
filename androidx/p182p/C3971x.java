package androidx.p182p;

/* renamed from: androidx.p.x */
/* compiled from: PG */
public final class C3971x implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C3972y f12676a;

    public C3971x(C3972y yVar) {
        this.f12676a = yVar;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v0, resolved type: h.a.ao} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v3, resolved type: h.a.ao} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v4, resolved type: h.a.a.q} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v6, resolved type: h.a.ao} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v7, resolved type: h.a.ao} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v8, resolved type: h.a.ao} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v9, resolved type: h.a.ao} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v10, resolved type: h.a.ao} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v11, resolved type: h.a.ao} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v12, resolved type: h.a.ao} */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00e3, code lost:
        if (r0 != null) goto L_0x00e5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00e5, code lost:
        r0.mo8224d();
        r5 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00eb, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:?, code lost:
        p5462h.p5472e.C69598b.m101013a(r3, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00ef, code lost:
        throw r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0108, code lost:
        if (r0 == null) goto L_0x011f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x011c, code lost:
        if (r0 == null) goto L_0x011f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x0123, code lost:
        if (r5.isEmpty() != false) goto L_0x0148;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x0125, code lost:
        r0 = r8.f12676a;
        r2 = r0.f12683f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0129, code lost:
        monitor-enter(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:?, code lost:
        r0 = r0.f12683f.iterator();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0134, code lost:
        if (r0.hasNext() != false) goto L_0x0138;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0136, code lost:
        monitor-exit(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0137, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:?, code lost:
        r0 = (androidx.p182p.C3970w) ((java.util.Map.Entry) r0.next()).getValue();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0144, code lost:
        throw null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x0148, code lost:
        return;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r8 = this;
            androidx.p.y r0 = r8.f12676a
            androidx.p.ah r0 = r0.f12678a
            java.util.concurrent.locks.Lock r0 = r0.mo8173Q()
            r0.lock()
            r1 = 0
            androidx.p.y r2 = r8.f12676a     // Catch:{ IllegalStateException -> 0x010b, SQLiteException -> 0x00f7 }
            androidx.p.ah r3 = r2.f12678a     // Catch:{ IllegalStateException -> 0x010b, SQLiteException -> 0x00f7 }
            boolean r3 = r3.mo8190y()     // Catch:{ IllegalStateException -> 0x010b, SQLiteException -> 0x00f7 }
            if (r3 != 0) goto L_0x0017
            goto L_0x002f
        L_0x0017:
            boolean r3 = r2.f12681d     // Catch:{ IllegalStateException -> 0x010b, SQLiteException -> 0x00f7 }
            if (r3 != 0) goto L_0x0024
            androidx.p.ah r3 = r2.f12678a     // Catch:{ IllegalStateException -> 0x010b, SQLiteException -> 0x00f7 }
            androidx.q.a.i r3 = r3.mo8167K()     // Catch:{ IllegalStateException -> 0x010b, SQLiteException -> 0x00f7 }
            r3.mo8208a()     // Catch:{ IllegalStateException -> 0x010b, SQLiteException -> 0x00f7 }
        L_0x0024:
            boolean r2 = r2.f12681d     // Catch:{ IllegalStateException -> 0x010b, SQLiteException -> 0x00f7 }
            if (r2 != 0) goto L_0x003c
            java.lang.String r2 = "ROOM"
            java.lang.String r3 = "database is not initialized even though it is open"
            android.util.Log.e(r2, r3)     // Catch:{ IllegalStateException -> 0x010b, SQLiteException -> 0x00f7 }
        L_0x002f:
            r0.unlock()
            androidx.p.y r0 = r8.f12676a
            androidx.p.c r0 = r0.f12679b
            if (r0 == 0) goto L_0x003b
            r0.mo8224d()
        L_0x003b:
            return
        L_0x003c:
            androidx.p.y r2 = r8.f12676a     // Catch:{ IllegalStateException -> 0x010b, SQLiteException -> 0x00f7 }
            java.util.concurrent.atomic.AtomicBoolean r2 = r2.f12680c     // Catch:{ IllegalStateException -> 0x010b, SQLiteException -> 0x00f7 }
            r3 = 1
            r4 = 0
            boolean r2 = r2.compareAndSet(r3, r4)     // Catch:{ IllegalStateException -> 0x010b, SQLiteException -> 0x00f7 }
            if (r2 != 0) goto L_0x0055
            r0.unlock()
            androidx.p.y r0 = r8.f12676a
            androidx.p.c r0 = r0.f12679b
            if (r0 == 0) goto L_0x0054
            r0.mo8224d()
        L_0x0054:
            return
        L_0x0055:
            androidx.p.y r2 = r8.f12676a     // Catch:{ IllegalStateException -> 0x010b, SQLiteException -> 0x00f7 }
            androidx.p.ah r2 = r2.f12678a     // Catch:{ IllegalStateException -> 0x010b, SQLiteException -> 0x00f7 }
            boolean r2 = r2.mo8189x()     // Catch:{ IllegalStateException -> 0x010b, SQLiteException -> 0x00f7 }
            if (r2 == 0) goto L_0x006c
            r0.unlock()
            androidx.p.y r0 = r8.f12676a
            androidx.p.c r0 = r0.f12679b
            if (r0 == 0) goto L_0x006b
            r0.mo8224d()
        L_0x006b:
            return
        L_0x006c:
            androidx.p.y r2 = r8.f12676a     // Catch:{ IllegalStateException -> 0x010b, SQLiteException -> 0x00f7 }
            androidx.p.ah r2 = r2.f12678a     // Catch:{ IllegalStateException -> 0x010b, SQLiteException -> 0x00f7 }
            androidx.q.a.i r2 = r2.mo8167K()     // Catch:{ IllegalStateException -> 0x010b, SQLiteException -> 0x00f7 }
            androidx.q.a.d r2 = r2.mo8208a()     // Catch:{ IllegalStateException -> 0x010b, SQLiteException -> 0x00f7 }
            java.lang.String r3 = "database.openHelper.writableDatabase"
            p5462h.p5473f.p5475b.C69664n.m101060f(r2, r3)     // Catch:{ IllegalStateException -> 0x010b, SQLiteException -> 0x00f7 }
            r2.mo8247f()     // Catch:{ IllegalStateException -> 0x010b, SQLiteException -> 0x00f7 }
            androidx.p.y r3 = r8.f12676a     // Catch:{ all -> 0x00f0 }
            h.a.a.q r5 = new h.a.a.q     // Catch:{ all -> 0x00f0 }
            r5.<init>()     // Catch:{ all -> 0x00f0 }
            androidx.p.ah r3 = r3.f12678a     // Catch:{ all -> 0x00f0 }
            androidx.q.a.b r6 = new androidx.q.a.b     // Catch:{ all -> 0x00f0 }
            java.lang.String r7 = "SELECT * FROM room_table_modification_log WHERE invalidated = 1;"
            r6.<init>(r7, r1)     // Catch:{ all -> 0x00f0 }
            android.database.Cursor r3 = r3.mo8166J(r6, r1)     // Catch:{ all -> 0x00f0 }
        L_0x0094:
            boolean r6 = r3.moveToNext()     // Catch:{ all -> 0x00e9 }
            if (r6 == 0) goto L_0x00a6
            int r6 = r3.getInt(r4)     // Catch:{ all -> 0x00e9 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)     // Catch:{ all -> 0x00e9 }
            r5.add(r6)     // Catch:{ all -> 0x00e9 }
            goto L_0x0094
        L_0x00a6:
            p5462h.p5472e.C69598b.m101013a(r3, r1)     // Catch:{ all -> 0x00f0 }
            h.a.a.k r3 = r5.f185913a     // Catch:{ all -> 0x00f0 }
            r3.mo61117j()     // Catch:{ all -> 0x00f0 }
            h.a.a.k r3 = r5.f185913a     // Catch:{ all -> 0x00f0 }
            boolean r3 = r3.isEmpty()     // Catch:{ all -> 0x00f0 }
            if (r3 != 0) goto L_0x00d6
            androidx.p.y r3 = r8.f12676a     // Catch:{ all -> 0x00f0 }
            androidx.q.a.l r3 = r3.f12682e     // Catch:{ all -> 0x00f0 }
            if (r3 == 0) goto L_0x00ce
            androidx.p.y r3 = r8.f12676a     // Catch:{ all -> 0x00f0 }
            androidx.q.a.l r3 = r3.f12682e     // Catch:{ all -> 0x00f0 }
            if (r3 == 0) goto L_0x00c6
            r3.mo8256a()     // Catch:{ all -> 0x00f0 }
            goto L_0x00d6
        L_0x00c6:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x00f0 }
            java.lang.String r4 = "Required value was null."
            r3.<init>(r4)     // Catch:{ all -> 0x00f0 }
            throw r3     // Catch:{ all -> 0x00f0 }
        L_0x00ce:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException     // Catch:{ all -> 0x00f0 }
            java.lang.String r4 = "Required value was null."
            r3.<init>(r4)     // Catch:{ all -> 0x00f0 }
            throw r3     // Catch:{ all -> 0x00f0 }
        L_0x00d6:
            r2.mo8250i()     // Catch:{ all -> 0x00f0 }
            r2.mo8248g()     // Catch:{ IllegalStateException -> 0x010b, SQLiteException -> 0x00f7 }
            r0.unlock()
            androidx.p.y r0 = r8.f12676a
            androidx.p.c r0 = r0.f12679b
            if (r0 == 0) goto L_0x011f
        L_0x00e5:
            r0.mo8224d()
            goto L_0x011f
        L_0x00e9:
            r4 = move-exception
            throw r4     // Catch:{ all -> 0x00eb }
        L_0x00eb:
            r5 = move-exception
            p5462h.p5472e.C69598b.m101013a(r3, r4)     // Catch:{ all -> 0x00f0 }
            throw r5     // Catch:{ all -> 0x00f0 }
        L_0x00f0:
            r3 = move-exception
            r2.mo8248g()     // Catch:{ IllegalStateException -> 0x010b, SQLiteException -> 0x00f7 }
            throw r3     // Catch:{ IllegalStateException -> 0x010b, SQLiteException -> 0x00f7 }
        L_0x00f5:
            r1 = move-exception
            goto L_0x0149
        L_0x00f7:
            r2 = move-exception
            java.lang.String r3 = "ROOM"
            java.lang.String r4 = "Cannot run invalidation tracker. Is the db closed?"
            android.util.Log.e(r3, r4, r2)     // Catch:{ all -> 0x00f5 }
            h.a.ao r5 = p5462h.p5463a.C69498ao.f185920a     // Catch:{ all -> 0x00f5 }
            r0.unlock()
            androidx.p.y r0 = r8.f12676a
            androidx.p.c r0 = r0.f12679b
            if (r0 == 0) goto L_0x011f
            goto L_0x00e5
        L_0x010b:
            r2 = move-exception
            java.lang.String r3 = "ROOM"
            java.lang.String r4 = "Cannot run invalidation tracker. Is the db closed?"
            android.util.Log.e(r3, r4, r2)     // Catch:{ all -> 0x00f5 }
            h.a.ao r5 = p5462h.p5463a.C69498ao.f185920a     // Catch:{ all -> 0x00f5 }
            r0.unlock()
            androidx.p.y r0 = r8.f12676a
            androidx.p.c r0 = r0.f12679b
            if (r0 == 0) goto L_0x011f
            goto L_0x00e5
        L_0x011f:
            boolean r0 = r5.isEmpty()
            if (r0 != 0) goto L_0x0148
            androidx.p.y r0 = r8.f12676a
            androidx.b.a.b.h r2 = r0.f12683f
            monitor-enter(r2)
            androidx.b.a.b.h r0 = r0.f12683f     // Catch:{ all -> 0x0145 }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x0145 }
            boolean r3 = r0.hasNext()     // Catch:{ all -> 0x0145 }
            if (r3 != 0) goto L_0x0138
            monitor-exit(r2)
            return
        L_0x0138:
            java.lang.Object r0 = r0.next()     // Catch:{ all -> 0x0145 }
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch:{ all -> 0x0145 }
            java.lang.Object r0 = r0.getValue()     // Catch:{ all -> 0x0145 }
            androidx.p.w r0 = (androidx.p182p.C3970w) r0     // Catch:{ all -> 0x0145 }
            throw r1     // Catch:{ all -> 0x0145 }
        L_0x0145:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
        L_0x0148:
            return
        L_0x0149:
            r0.unlock()
            androidx.p.y r0 = r8.f12676a
            androidx.p.c r0 = r0.f12679b
            if (r0 == 0) goto L_0x0155
            r0.mo8224d()
        L_0x0155:
            goto L_0x0157
        L_0x0156:
            throw r1
        L_0x0157:
            goto L_0x0156
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.p182p.C3971x.run():void");
    }
}
