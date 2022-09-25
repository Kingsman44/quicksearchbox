package com.google.android.apps.gsa.staticplugins.p7864du.p7866b;

import com.google.android.libraries.gsa.p1876k.C22869e;

/* renamed from: com.google.android.apps.gsa.staticplugins.du.b.y */
/* compiled from: PG */
public final /* synthetic */ class C100199y implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C100125ad f280229a;

    public /* synthetic */ C100199y(C100125ad adVar) {
        this.f280229a = adVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0043, code lost:
        r2 = r0.f279969e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0088, code lost:
        if (r3 == false) goto L_0x004b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x008a, code lost:
        r2 = r0.f279969e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r10 = this;
            com.google.android.apps.gsa.staticplugins.du.b.ad r0 = r10.f280229a
            r1 = 0
            java.lang.Object r2 = r0.f279970f     // Catch:{ all -> 0x0094 }
            monitor-enter(r2)     // Catch:{ all -> 0x0094 }
            java.util.concurrent.atomic.AtomicInteger r3 = r0.f279976l     // Catch:{ all -> 0x008d }
            int r3 = r3.get()     // Catch:{ all -> 0x008d }
            com.google.android.apps.gsa.staticplugins.du.b.az r4 = r0.f279983s     // Catch:{ all -> 0x008d }
            int r4 = r4.mo91776a()     // Catch:{ all -> 0x008d }
            com.google.common.f.aa r5 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x008d }
            if (r3 != 0) goto L_0x0086
            if (r4 != 0) goto L_0x0086
            r3 = 1
            com.google.android.apps.gsa.staticplugins.du.b.p r4 = r0.f279971g     // Catch:{ all -> 0x0084 }
            com.google.android.apps.gsa.staticplugins.du.b.f r4 = r4.f280217e     // Catch:{ all -> 0x0084 }
            java.io.File[] r4 = r4.mo91743b()     // Catch:{ all -> 0x0084 }
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ all -> 0x0084 }
            r5.<init>()     // Catch:{ all -> 0x0084 }
            int r6 = r4.length     // Catch:{ all -> 0x0084 }
            r7 = 0
        L_0x0028:
            if (r7 >= r6) goto L_0x003c
            r8 = r4[r7]     // Catch:{ all -> 0x0084 }
            com.google.android.apps.gsa.staticplugins.du.b.g r9 = r0.f279979o     // Catch:{ all -> 0x0084 }
            java.io.File[] r8 = r9.mo91787e(r8)     // Catch:{ all -> 0x0084 }
            java.util.List r8 = java.util.Arrays.asList(r8)     // Catch:{ all -> 0x0084 }
            r5.addAll(r8)     // Catch:{ all -> 0x0084 }
            int r7 = r7 + 1
            goto L_0x0028
        L_0x003c:
            boolean r4 = r5.isEmpty()     // Catch:{ all -> 0x0084 }
            if (r4 == 0) goto L_0x0051
            monitor-exit(r2)     // Catch:{ all -> 0x0084 }
            com.google.android.libraries.f.a r2 = r0.f279969e
        L_0x0045:
            long r2 = r2.mo26871c()
            r0.f279980p = r2
        L_0x004b:
            java.util.concurrent.atomic.AtomicBoolean r0 = r0.f279978n
            r0.set(r1)
            return
        L_0x0051:
            com.google.android.apps.gsa.staticplugins.du.b.l r4 = r0.f279981q     // Catch:{ all -> 0x0084 }
            android.database.sqlite.SQLiteDatabase r4 = r4.getReadableDatabase()     // Catch:{ all -> 0x0084 }
            java.lang.String r6 = "SELECT DISTINCT blob_path FROM blob_table WHERE blob_path IS NOT NULL"
            java.lang.String[] r7 = new java.lang.String[r1]     // Catch:{ all -> 0x0084 }
            android.database.Cursor r4 = r4.rawQuery(r6, r7)     // Catch:{ all -> 0x0084 }
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch:{ all -> 0x007f }
            int r7 = r4.getCount()     // Catch:{ all -> 0x007f }
            r6.<init>(r7)     // Catch:{ all -> 0x007f }
        L_0x0068:
            boolean r7 = r4.moveToNext()     // Catch:{ all -> 0x007f }
            if (r7 == 0) goto L_0x0076
            java.lang.String r7 = r4.getString(r1)     // Catch:{ all -> 0x007f }
            r6.add(r7)     // Catch:{ all -> 0x007f }
            goto L_0x0068
        L_0x0076:
            com.google.android.apps.gsa.staticplugins.du.b.g r7 = r0.f279979o     // Catch:{ all -> 0x007f }
            r7.mo91785c(r5, r6)     // Catch:{ all -> 0x007f }
            r4.close()     // Catch:{ all -> 0x0084 }
            goto L_0x0087
        L_0x007f:
            r5 = move-exception
            r4.close()     // Catch:{ all -> 0x0084 }
            throw r5     // Catch:{ all -> 0x0084 }
        L_0x0084:
            r4 = move-exception
            goto L_0x0090
        L_0x0086:
            r3 = 0
        L_0x0087:
            monitor-exit(r2)     // Catch:{ all -> 0x0084 }
            if (r3 == 0) goto L_0x004b
            com.google.android.libraries.f.a r2 = r0.f279969e
            goto L_0x0045
        L_0x008d:
            r3 = move-exception
            r4 = r3
            r3 = 0
        L_0x0090:
            monitor-exit(r2)     // Catch:{ all -> 0x0084 }
            throw r4     // Catch:{ all -> 0x0092 }
        L_0x0092:
            r2 = move-exception
            goto L_0x0096
        L_0x0094:
            r2 = move-exception
            r3 = 0
        L_0x0096:
            if (r3 == 0) goto L_0x00a0
            com.google.android.libraries.f.a r3 = r0.f279969e
            long r3 = r3.mo26871c()
            r0.f279980p = r3
        L_0x00a0:
            java.util.concurrent.atomic.AtomicBoolean r0 = r0.f279978n
            r0.set(r1)
            goto L_0x00a7
        L_0x00a6:
            throw r2
        L_0x00a7:
            goto L_0x00a6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.p7864du.p7866b.C100199y.run():void");
    }
}
